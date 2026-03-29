/*******************************************************************************
 * Copyright (c) 2009, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.resource.java.binary;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.common.core.internal.resource.java.binary.BinaryAnnotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.jpa.core.resource.java.VersionAnnotation;

/**
 * javax.persistence.Version
 */
public final class BinaryVersionAnnotation
	extends BinaryAnnotation
	implements VersionAnnotation
{

	private final String annotationName;

	public BinaryVersionAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		this(parent, jdtAnnotation, ANNOTATION_NAME);
	}

	public BinaryVersionAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation, String annotationName) {
		super(parent, jdtAnnotation);
		this.annotationName = annotationName;
	}

	public String getAnnotationName() {
		return this.annotationName;
	}

}
