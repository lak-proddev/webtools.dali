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
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.common.utility.internal.ObjectTools;
import org.eclipse.jpt.jpa.core.internal.context.java.AbstractJavaContextModel;
import org.eclipse.jpt.jpa.core.jpa3_0.ParameterMode3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.StoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaNamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaStoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.StoredProcedureParameterAnnotation3_0;

/**
 * Java stored procedure parameter
 */
public class GenericJavaStoredProcedureParameter3_0
	extends AbstractJavaContextModel<JavaNamedStoredProcedureQuery3_0>
	implements JavaStoredProcedureParameter3_0
{
	protected final StoredProcedureParameterAnnotation3_0 parameterAnnotation;

	protected String name;
	
	protected ParameterMode3_0 specifiedMode;
	protected ParameterMode3_0 defaultMode;
	
	protected String typeName;
	protected String fullyQualifiedTypeName;


	public GenericJavaStoredProcedureParameter3_0(JavaNamedStoredProcedureQuery3_0 parent, StoredProcedureParameterAnnotation3_0 parameterAnnotation) {
		super(parent);
		this.parameterAnnotation = parameterAnnotation;
		this.name = parameterAnnotation.getName();
		this.specifiedMode = this.buildSpecifiedMode();
		this.typeName = parameterAnnotation.getTypeName();
	}


	// ********** synchronize/update **********

	@Override
	public void synchronizeWithResourceModel(IProgressMonitor monitor) {
		super.synchronizeWithResourceModel(monitor);
		this.setName_(this.parameterAnnotation.getName());
		this.setSpecifiedMode_(this.buildSpecifiedMode());
		this.setTypeName_(this.parameterAnnotation.getTypeName());
	}

	@Override
	public void update(IProgressMonitor monitor) {
		super.update(monitor);
		this.setDefaultMode(this.buildDefaultMode());
		this.setFullyQualifiedTypeName(this.buildFullyQualifiedTypeName());
	}

	// ********* name **************

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.parameterAnnotation.setName(name);
		this.setName_(name);
	}

	protected void setName_(String name) {
		String old = this.name;
		this.name = name;
		this.firePropertyChanged(NAME_PROPERTY, old, name);
	}


	// ********** mode **********

	public ParameterMode3_0 getMode() {
		return (this.specifiedMode != null) ? this.specifiedMode : this.defaultMode;
	}

	public ParameterMode3_0 getSpecifiedMode() {
		return this.specifiedMode;
	}

	public void setSpecifiedMode(ParameterMode3_0 mode) {
		this.parameterAnnotation.setMode(ParameterMode3_0.toJavaResourceModel(mode));
		this.setSpecifiedMode_(mode);
	}

	protected void setSpecifiedMode_(ParameterMode3_0 mode) {
		ParameterMode3_0 old = this.specifiedMode;
		this.specifiedMode = mode;
		this.firePropertyChanged(SPECIFIED_MODE_PROPERTY, old, mode);
	}

	protected ParameterMode3_0 buildSpecifiedMode() {
		return 	ParameterMode3_0.fromJavaResourceModel(this.parameterAnnotation.getMode());
	}

	public ParameterMode3_0 getDefaultMode() {
		return this.defaultMode;
	}

	protected void setDefaultMode(ParameterMode3_0 mode) {
		ParameterMode3_0 old = this.defaultMode;
		this.defaultMode = mode;
		this.firePropertyChanged(DEFAULT_MODE_PROPERTY, old, mode);
	}

	protected ParameterMode3_0 buildDefaultMode() {
		return ParameterMode3_0.IN;
	}


	// ********** type **********

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.parameterAnnotation.setTypeName(typeName);
		this.setTypeName_(typeName);
	}

	protected void setTypeName_(String typeName) {
		String old = this.typeName;
		this.typeName = typeName;
		this.firePropertyChanged(TYPE_NAME_PROPERTY, old, typeName);
	}

	public String getFullyQualifiedTypeName() {
		return this.fullyQualifiedTypeName;
	}

	protected void setFullyQualifiedTypeName(String typeName) {
		String old = this.fullyQualifiedTypeName;
		this.fullyQualifiedTypeName = typeName;
		this.firePropertyChanged(FULLY_QUALIFIED_TYPE_NAME_PROPERTY, old, typeName);
	}

	protected String buildFullyQualifiedTypeName() {
		return this.parameterAnnotation.getFullyQualifiedTypeName();
	}

	public char getTypeEnclosingTypeSeparator() {
		return '.';
	}


	// ********** validation **********

	public TextRange getValidationTextRange() {
		TextRange textRange = this.parameterAnnotation.getTextRange();
		return (textRange != null) ? textRange : this.getQuery().getValidationTextRange();
	}

	public boolean isEquivalentTo(StoredProcedureParameter3_0 parameter) {
		return ObjectTools.equals(this.name, parameter.getName()) &&
				ObjectTools.equals(this.specifiedMode, parameter.getMode()) &&
				ObjectTools.equals(this.typeName, parameter.getTypeName()) ;
	}


	// ********** misc **********

	protected JavaNamedStoredProcedureQuery3_0 getQuery() {
		return this.parent;
	}

	public StoredProcedureParameterAnnotation3_0 getStoredProcedureParameter3_0Annotation() {
		return this.parameterAnnotation;
	}
}
