/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java;

import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.common.utility.internal.iterable.IterableTools;
import org.eclipse.jpt.jpa.core.JpaFactory;
import org.eclipse.jpt.jpa.core.JpaProject;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.context.java.JavaManagedTypeDefinition;
import org.eclipse.jpt.jpa.core.jpa3_0.JpaFactory3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.ConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ConverterAnnotation3_0;

public class JavaConverterTypeDefinition3_0
	implements JavaManagedTypeDefinition
{
	// singleton
	private static final JavaManagedTypeDefinition INSTANCE = new JavaConverterTypeDefinition3_0();

	/**
	 * Return the singleton.
	 */
	public static JavaManagedTypeDefinition instance() {
		return INSTANCE;
	}

	/**
	 * Enforce singleton usage
	 */
	private JavaConverterTypeDefinition3_0() {
		super();
	}

	public Class<ConverterType3_0> getManagedTypeType() {
		return ConverterType3_0.class;
	}

	public Iterable<String> getAnnotationNames(JpaProject jpaProject) {
		return IterableTools.singletonIterable(ConverterAnnotation3_0.ANNOTATION_NAME);
	}

	public JavaConverterType3_0 buildContextManagedType(JpaContextModel parent, JavaResourceType jrt, JpaFactory factory) {
		return ((JpaFactory3_0) factory).buildJavaConverterType(parent, jrt);
	}
}
