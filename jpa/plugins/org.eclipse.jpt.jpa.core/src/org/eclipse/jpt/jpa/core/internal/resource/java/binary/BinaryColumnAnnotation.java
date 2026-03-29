/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.resource.java.binary;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceModel;
import org.eclipse.jpt.jpa.core.resource.java.ColumnAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.JPA;

/**
 * <code>javax.persistence.Column</code>
 */
public final class BinaryColumnAnnotation
	extends BinaryCompleteColumnAnnotation
	implements ColumnAnnotation
{

	private final String annotationName;

	public BinaryColumnAnnotation(JavaResourceModel parent, IAnnotation jdtAnnotation) {
		this(parent, jdtAnnotation, ANNOTATION_NAME);
	}

	public BinaryColumnAnnotation(JavaResourceModel parent, IAnnotation jdtAnnotation, String annotationName) {
		super(parent, jdtAnnotation);
		this.annotationName = annotationName;
	}

	public String getAnnotationName() {
		return this.annotationName;
	}

	// ********** BinaryNamedColumnAnnotation implementation **********

	@Override
	protected String getNameElementName() {
		return JPA.COLUMN__NAME;
	}

	@Override
	protected String getColumnDefinitionElementName() {
		return JPA.COLUMN__COLUMN_DEFINITION;
	}

	// ********** BinaryBaseColumnAnnotation implementation **********

	@Override
	protected String getTableElementName() {
		return JPA.COLUMN__TABLE;
	}

	@Override
	protected String getUniqueElementName() {
		return JPA.COLUMN__UNIQUE;
	}

	@Override
	protected String getNullableElementName() {
		return JPA.COLUMN__NULLABLE;
	}

	@Override
	protected String getInsertableElementName() {
		return JPA.COLUMN__INSERTABLE;
	}

	@Override
	protected String getUpdatableElementName() {
		return JPA.COLUMN__UPDATABLE;
	}
	
	
	// ********** BinaryCompleteColumnAnnotation implementation **********
	
	@Override
	protected String getLengthElementName() {
		return JPA.COLUMN__LENGTH;
	}
	
	@Override
	protected String getPrecisionElementName() {
		return JPA.COLUMN__PRECISION;
	}
	
	@Override
	protected String getScaleElementName() {
		return JPA.COLUMN__SCALE;
	}
}
