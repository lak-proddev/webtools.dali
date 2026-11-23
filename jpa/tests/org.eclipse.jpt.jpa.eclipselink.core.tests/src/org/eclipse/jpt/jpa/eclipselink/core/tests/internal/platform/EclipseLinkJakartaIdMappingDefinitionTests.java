/*******************************************************************************
 * Copyright (c) 2026 Lakshminarayana Nekkanti and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Lakshminarayana Nekkanti - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.tests.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;
import org.eclipse.jpt.common.core.resource.java.Annotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAttribute;
import org.eclipse.jpt.jpa.core.MappingKeys;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMappingDefinition;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedPersistentAttribute;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.JakartaJavaAttributeMappingDefinitionAdapter;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.java.EclipseLinkJavaIdMappingDefinition2_2;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.java.EclipseLinkJavaIdMappingDefinition3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.java.EclipseLinkJavaOneToOneMappingDefinition2_0;

/**
 * Tests for {@link EclipseLinkJavaIdMappingDefinition3_0}, which keeps
 * EclipseLink's "default derived id" rule for <code>jakarta.persistence.Id</code>,
 * and for the Jakarta annotation name translation it relies on.
 * <p>
 * The persistent attribute is a minimal dynamic proxy, so no JPA project or
 * persistence jar is needed.
 */
@SuppressWarnings("nls")
public class EclipseLinkJakartaIdMappingDefinitionTests
	extends TestCase
{
	private static final String JAKARTA_ID = "jakarta.persistence.Id";
	private static final String JAVAX_ID = "javax.persistence.Id";

	public EclipseLinkJakartaIdMappingDefinitionTests(String name) {
		super(name);
	}

	private static JavaAttributeMappingDefinition jakartaId() {
		return EclipseLinkJavaIdMappingDefinition3_0.instance();
	}

	private static JavaAttributeMappingDefinition javaxId() {
		return EclipseLinkJavaIdMappingDefinition2_2.instance();
	}

	private static String defaultOneToOneKey() {
		return EclipseLinkJavaOneToOneMappingDefinition2_0.instance().getKey();
	}


	// ********** definition **********

	public void testAnnotationNameAndKey() {
		assertEquals(JAKARTA_ID, jakartaId().getAnnotationName());
		assertEquals(MappingKeys.ID_ATTRIBUTE_MAPPING_KEY, jakartaId().getKey());
		assertEquals(javaxId().getKey(), jakartaId().getKey());
	}

	public void testSupportingAnnotationNames() {
		List<String> expected = new ArrayList<String>();
		for (String name : javaxId().getSupportingAnnotationNames()) {
			expected.add(JakartaJavaAttributeMappingDefinitionAdapter.toJakarta(name));
		}
		List<String> actual = list(jakartaId().getSupportingAnnotationNames());
		assertEquals(expected, actual);
		assertTrue(actual.contains("jakarta.persistence.Column"));
		assertTrue(actual.contains("jakarta.persistence.GeneratedValue"));
		for (String name : actual) {
			assertFalse(name, name.startsWith("javax.persistence."));
		}
	}


	// ********** isSpecified **********

	public void testJakartaIdIsSpecified() {
		assertTrue(jakartaId().isSpecified(attribute(JAKARTA_ID, MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY)));
	}

	/**
	 * An Id on an attribute that EclipseLink maps by default as a 1:1 is a
	 * derived id, not a specified Id mapping.
	 */
	public void testJakartaIdOnDefaultOneToOneIsNotSpecified() {
		assertFalse(jakartaId().isSpecified(attribute(JAKARTA_ID, defaultOneToOneKey())));
	}

	public void testJavaxIdIsNotSpecifiedOnJakartaPlatform() {
		assertFalse(jakartaId().isSpecified(attribute(JAVAX_ID, MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY)));
	}

	public void testNoIdIsNotSpecified() {
		assertFalse(jakartaId().isSpecified(attribute(null, MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY)));
	}

	/**
	 * The EclipseLink 2.x definition, whose derived id check was made
	 * static and shared, must behave as before.
	 */
	public void testJavaxIdDefinitionUnchanged() {
		assertTrue(javaxId().isSpecified(attribute(JAVAX_ID, MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY)));
		assertFalse(javaxId().isSpecified(attribute(JAVAX_ID, defaultOneToOneKey())));
		assertFalse(javaxId().isSpecified(attribute(JAKARTA_ID, MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY)));
	}


	// ********** toJakarta **********

	public void testToJakartaName() {
		assertEquals("jakarta.persistence.Id", JakartaJavaAttributeMappingDefinitionAdapter.toJakarta("javax.persistence.Id"));
		assertEquals("org.eclipse.persistence.annotations.Cache", JakartaJavaAttributeMappingDefinitionAdapter.toJakarta("org.eclipse.persistence.annotations.Cache"));
		assertEquals("jakarta.persistence.Id", JakartaJavaAttributeMappingDefinitionAdapter.toJakarta("jakarta.persistence.Id"));
		assertNull(JakartaJavaAttributeMappingDefinitionAdapter.toJakarta((String) null));
	}

	public void testToJakartaNames() {
		Iterable<String> names = JakartaJavaAttributeMappingDefinitionAdapter.toJakarta(
				Arrays.asList("javax.persistence.Column", "org.eclipse.persistence.annotations.Mutable"));
		assertEquals(Arrays.asList("jakarta.persistence.Column", "org.eclipse.persistence.annotations.Mutable"), list(names));
	}

	/**
	 * The names are translated once: later changes to the source do not show
	 * through, and the result cannot be modified.
	 */
	public void testToJakartaNamesIsReadOnlySnapshot() {
		List<String> source = new ArrayList<String>(Arrays.asList("javax.persistence.Column"));
		Iterable<String> names = JakartaJavaAttributeMappingDefinitionAdapter.toJakarta(source);
		source.add("javax.persistence.Temporal");
		assertEquals(Arrays.asList("jakarta.persistence.Column"), list(names));

		Iterator<String> iterator = names.iterator();
		iterator.next();
		try {
			iterator.remove();
			fail("expected UnsupportedOperationException");
		} catch (UnsupportedOperationException ex) {
			// expected
		}
	}


	// ********** proxies **********

	/**
	 * Build an attribute that carries only the specified annotation (if any)
	 * and has the specified default mapping key.
	 */
	private static JavaSpecifiedPersistentAttribute attribute(final String annotationName, final String defaultMappingKey) {
		final Annotation annotation = proxy(Annotation.class, new Handler("annotation " + annotationName));
		final JavaResourceAttribute resourceAttribute = proxy(JavaResourceAttribute.class, new Handler("resource attribute") {
			@Override
			protected Object invoke_(Method method, Object[] args) {
				if (method.getName().equals("getAnnotation") && (args != null) && (args.length == 1)) {
					return args[0].equals(annotationName) ? annotation : null;
				}
				return super.invoke_(method, args);
			}
		});
		return proxy(JavaSpecifiedPersistentAttribute.class, new Handler("persistent attribute") {
			@Override
			protected Object invoke_(Method method, Object[] args) {
				if (method.getName().equals("getResourceAttribute")) {
					return resourceAttribute;
				}
				if (method.getName().equals("getDefaultMappingKey")) {
					return defaultMappingKey;
				}
				return super.invoke_(method, args);
			}
		});
	}

	private static <T> T proxy(Class<T> interfaze, InvocationHandler handler) {
		return interfaze.cast(Proxy.newProxyInstance(interfaze.getClassLoader(), new Class<?>[] {interfaze}, handler));
	}

	/**
	 * Answers the {@link Object} methods and fails on anything the test did
	 * not expect to be called.
	 */
	private static class Handler
		implements InvocationHandler
	{
		private final String description;

		Handler(String description) {
			this.description = description;
		}

		public Object invoke(Object proxy, Method method, Object[] args) {
			if (method.getDeclaringClass() == Object.class) {
				if (method.getName().equals("equals")) {
					return Boolean.valueOf(proxy == args[0]);
				}
				if (method.getName().equals("hashCode")) {
					return Integer.valueOf(System.identityHashCode(proxy));
				}
				return this.description;
			}
			return this.invoke_(method, args);
		}

		protected Object invoke_(Method method, @SuppressWarnings("unused") Object[] args) {
			throw new UnsupportedOperationException(this.description + ": " + method);
		}
	}

	private static <E> List<E> list(Iterable<? extends E> iterable) {
		ArrayList<E> list = new ArrayList<E>();
		for (E element : iterable) {
			list.add(element);
		}
		return list;
	}
}
