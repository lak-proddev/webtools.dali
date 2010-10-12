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
import org.eclipse.jpt.core.internal.resource.java.binary.BinaryJoinColumnsAnnotation;
import org.eclipse.jpt.core.internal.resource.java.source.SourceJoinColumnsAnnotation;
import org.eclipse.jpt.core.resource.java.Annotation;
import org.eclipse.jpt.core.resource.java.AnnotationDefinition;
import org.eclipse.jpt.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentMember;
import org.eclipse.jpt.core.resource.java.JoinColumnsAnnotation;
import org.eclipse.jpt.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.core.utility.jdt.Member;

/**
 * javax.persistence.JoinColumns
 */
public final class JoinColumnsAnnotationDefinition
	implements AnnotationDefinition
{
	// singleton
	private static final AnnotationDefinition INSTANCE = new JoinColumnsAnnotationDefinition();

	/**
	 * Return the singleton.
	 */
	public static AnnotationDefinition instance() {
		return INSTANCE;
	}

	/**
	 * Ensure single instance.
	 */
	private JoinColumnsAnnotationDefinition() {
		super();
	}

	public JoinColumnsAnnotation buildAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement annotatedElement) {
		return new SourceJoinColumnsAnnotation((JavaResourcePersistentMember) parent, (Member) annotatedElement);
	}

	public JoinColumnsAnnotation buildNullAnnotation(JavaResourceAnnotatedElement parent) {
		throw new UnsupportedOperationException();
	}

	public Annotation buildAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		return new BinaryJoinColumnsAnnotation(parent, jdtAnnotation);
	}

	public String getAnnotationName() {
		return JoinColumnsAnnotation.ANNOTATION_NAME;
	}

}
