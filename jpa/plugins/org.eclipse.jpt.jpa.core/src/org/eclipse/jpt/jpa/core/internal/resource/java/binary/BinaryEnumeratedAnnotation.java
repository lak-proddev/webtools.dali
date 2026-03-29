/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.resource.java.binary;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.jpa.core.resource.java.EnumeratedAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.JPA;

/**
 * <code>javax.persistence.Enumerated</code>
 */
public final class BinaryEnumeratedAnnotation
	extends BinaryBaseEnumeratedAnnotation
	implements EnumeratedAnnotation
{
	private final String annotationName;

	public BinaryEnumeratedAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		this(parent, jdtAnnotation, ANNOTATION_NAME);
	}

	public BinaryEnumeratedAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation, String annotationName) {
		super(parent, jdtAnnotation);
		this.annotationName = annotationName;
	}

	public String getAnnotationName() {
		return this.annotationName;
	}
	
	@Override
	protected String getValueElementName() {
		return JPA.ENUMERATED__VALUE;
	}
}
