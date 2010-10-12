/*******************************************************************************
 * Copyright (c) 2009, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.core.internal.resource.java.binary.BinaryDiscriminatorValueAnnotation;
import org.eclipse.jpt.core.internal.resource.java.source.SourceDiscriminatorValueAnnotation;
import org.eclipse.jpt.core.resource.java.Annotation;
import org.eclipse.jpt.core.resource.java.AnnotationDefinition;
import org.eclipse.jpt.core.resource.java.DiscriminatorValueAnnotation;
import org.eclipse.jpt.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.core.utility.jdt.Type;

/**
 * javax.persistence.DiscriminatorValue
 */
public final class DiscriminatorValueAnnotationDefinition
	implements AnnotationDefinition
{
	// singleton
	private static final AnnotationDefinition INSTANCE = new DiscriminatorValueAnnotationDefinition();

	/**
	 * Return the singleton.
	 */
	public static AnnotationDefinition instance() {
		return INSTANCE;
	}

	/**
	 * Ensure single instance.
	 */
	private DiscriminatorValueAnnotationDefinition() {
		super();
	}

	public Annotation buildAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement annotatedElement) {
		return new SourceDiscriminatorValueAnnotation((JavaResourcePersistentType) parent, (Type) annotatedElement);
	}

	public Annotation buildNullAnnotation(JavaResourceAnnotatedElement parent) {
		return new NullDiscriminatorValueAnnotation((JavaResourcePersistentType) parent);
	}

	public Annotation buildAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		return new BinaryDiscriminatorValueAnnotation((JavaResourcePersistentType) parent, jdtAnnotation);
	}

	public String getAnnotationName() {
		return DiscriminatorValueAnnotation.ANNOTATION_NAME;
	}

}
