/*******************************************************************************
 * Copyright (c) 2013, 2015 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.internal.context.java.AbstractJavaManagedType;
import org.eclipse.jpt.jpa.core.jpa3_0.context.ConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ConverterAnnotation3_0;

public class GenericJavaConverterType3_0 extends AbstractJavaManagedType<JpaContextModel>
		implements JavaConverterType3_0 {

	protected boolean autoApply;

	protected Boolean specifiedAutoApply;

	public GenericJavaConverterType3_0(JpaContextModel parent, JavaResourceType resourceType) {
		super(parent, resourceType);
		this.specifiedAutoApply = this.buildSpecifiedAutoApply();
		this.autoApply = this.buildAutoApply();
	}

	@Override
	public void synchronizeWithResourceModel(IProgressMonitor monitor) {
		super.synchronizeWithResourceModel(monitor);
		this.setSpecifiedAutoApply_(this.buildSpecifiedAutoApply());
		this.setAutoApply(this.buildAutoApply());
	}

	@Override
	public void update(IProgressMonitor monitor) {
		super.update(monitor);
	}

	// ********** auto apply **********

	public boolean isAutoApply() {
		return this.autoApply;
	}

	protected void setAutoApply(boolean autoApply) {
		boolean old = this.autoApply;
		this.autoApply = autoApply;
		firePropertyChanged(AUTO_APPLY_PROPERTY, old, autoApply);
	}

	protected boolean buildAutoApply() {
		return this.specifiedAutoApply == null ? this.isDefaultAutoApply() : this.specifiedAutoApply.booleanValue();
	}

	public boolean isDefaultAutoApply() {
		return DEFAULT_AUTO_APPLY;
	}

	public Boolean getSpecifiedAutoApply() {
		return this.specifiedAutoApply;
	}

	public void setSpecifiedAutoApply(Boolean autoApply) {
		this.getConverterAnnotation().setAutoApply(autoApply);
		this.setSpecifiedAutoApply_(autoApply);
	}

	protected void setSpecifiedAutoApply_(Boolean autoApply) {
		Boolean old = this.specifiedAutoApply;
		this.specifiedAutoApply = autoApply;
		this.firePropertyChanged(SPECIFIED_AUTO_APPLY_PROPERTY, old, autoApply);
	}

	protected Boolean buildSpecifiedAutoApply() {
		ConverterAnnotation3_0 converterAnnotation = this.getConverterAnnotation();
		return converterAnnotation != null ? converterAnnotation.getAutoApply() : null;
	}

	// ********** converter annotation **********

	protected ConverterAnnotation3_0 getConverterAnnotation() {
		return (ConverterAnnotation3_0) this.resourceType.getAnnotation(ConverterAnnotation3_0.ANNOTATION_NAME);
	}

	// ********** ManagedType implementation **********

	public Class<ConverterType3_0> getManagedTypeType() {
		return ConverterType3_0.class;
	}
}