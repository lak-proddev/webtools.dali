/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.content.java.mappings;

import org.eclipse.jpt.core.internal.IJpaFactory;
import org.eclipse.jpt.core.internal.content.java.IJavaAttributeMapping;
import org.eclipse.jpt.core.internal.content.java.IJavaAttributeMappingProvider;
import org.eclipse.jpt.core.internal.jdtutility.Attribute;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationAdapter;

/**
 * This mapping provider implementation is used to create a JavaNullAttributeMapping.
 * A JavaNullAttributeMapping should be used when no "mapping" annotation
 * exists on a Java attribute *and* no default mapping applies.
 */
public class JavaNullAttributeMappingProvider
	implements IJavaAttributeMappingProvider
{

	// singleton
	private static final JavaNullAttributeMappingProvider INSTANCE = new JavaNullAttributeMappingProvider();

	/**
	 * Return the singleton.
	 */
	public static IJavaAttributeMappingProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private JavaNullAttributeMappingProvider() {
		super();
	}

	public String key() {
		return null;
	}

	//Do not use the IJpaFactory for building this mapping, see constructor for JavaPersistentAttribute
	//where we do no have access to the factory during constrution.  This is not a mapping that
	//needs to be extensible, but it is easier to have a mappingProvider for it so we don't have 
	//to handle null provider separately
	public IJavaAttributeMapping buildMapping(Attribute attribute, IJpaFactory factory) {
		return JpaJavaMappingsFactory.eINSTANCE.createJavaNullAttributeMapping(attribute);
	}

	public DeclarationAnnotationAdapter declarationAnnotationAdapter() {
		return JavaNullAttributeMapping.DECLARATION_ANNOTATION_ADAPTER;
	}

}
