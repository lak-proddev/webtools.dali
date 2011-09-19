/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal.v2_3.resource.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.common.core.internal.resource.java.NullAnnotation;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.jpa.eclipselink.core.v2_3.resource.java.EclipseLinkMultitenantAnnotation;
import org.eclipse.jpt.jpa.eclipselink.core.v2_3.resource.java.MultitenantType;

/**
 * <code>org.eclipse.persistence.annotations.Multitenant</code>
 */
public final class NullEclipseLinkMultitenantAnnotation
	extends NullAnnotation<EclipseLinkMultitenantAnnotation>
	implements EclipseLinkMultitenantAnnotation
{
	protected NullEclipseLinkMultitenantAnnotation(JavaResourceAnnotatedElement parent) {
		super(parent);
	}

	public String getAnnotationName() {
		return ANNOTATION_NAME;
	}

	public boolean isSpecified() {
		return false;
	}

	// ***** type
	public MultitenantType getValue() {
		return null;
	}

	public void setValue(MultitenantType value) {
		if (value != null) {
			this.addAnnotation().setValue(value);
		}
	}

	public TextRange getValueTextRange(CompilationUnit astRoot) {
		return null;
	}

	// ***** include criteria
	public Boolean getIncludeCriteria() {
		return null;
	}

	public void setIncludeCriteria(Boolean includeCriteria) {
		if (includeCriteria != null) {
			this.addAnnotation().setIncludeCriteria(includeCriteria);
		}
	}

	public TextRange getIncludeCriteriaTextRange(CompilationUnit astRoot) {
		return null;
	}

}