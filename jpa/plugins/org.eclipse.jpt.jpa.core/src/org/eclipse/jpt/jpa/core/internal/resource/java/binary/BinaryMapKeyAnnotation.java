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
import org.eclipse.jpt.common.core.internal.resource.java.binary.BinaryAnnotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.jpa.core.resource.java.JPA;
import org.eclipse.jpt.jpa.core.resource.java.MapKeyAnnotation;

/**
 * <code>javax.persistence.MapKey</code>
 */
public final class BinaryMapKeyAnnotation
	extends BinaryAnnotation
	implements MapKeyAnnotation
{
	private String name;

	private final String annotationName;

	public BinaryMapKeyAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		this(parent, jdtAnnotation, ANNOTATION_NAME);
	}

	public BinaryMapKeyAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation, String annotationName) {
		super(parent, jdtAnnotation);
		this.annotationName = annotationName;
		this.name = this.buildName();
	}

	public String getAnnotationName() {
		return this.annotationName;
	}

	@Override
	public void update() {
		super.update();
		this.setName_(this.buildName());
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append(this.name);
	}

	// ********** MapKeyAnnotation implementation **********

	// ***** name
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		throw new UnsupportedOperationException();
	}

	private void setName_(String name) {
		String old = this.name;
		this.name = name;
		this.firePropertyChanged(NAME_PROPERTY, old, name);
	}

	private String buildName() {
		return (String) this.getJdtMemberValue(JPA.MAP_KEY__NAME);
	}

	public TextRange getNameTextRange() {
		throw new UnsupportedOperationException();
	}

	public boolean nameTouches(int pos) {
		throw new UnsupportedOperationException();
	}
}
