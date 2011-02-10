/*******************************************************************************
 * Copyright (c) 2007, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa1.context.orm;

import java.util.List;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.jpa.core.context.ReadOnlyOverride;
import org.eclipse.jpt.jpa.core.context.orm.OrmOverride;
import org.eclipse.jpt.jpa.core.context.orm.OrmOverrideContainer;
import org.eclipse.jpt.jpa.core.context.orm.OrmVirtualOverride;
import org.eclipse.jpt.jpa.core.internal.context.JptValidator;
import org.eclipse.jpt.jpa.core.internal.context.OverrideTextRangeResolver;
import org.eclipse.jpt.jpa.core.internal.context.orm.AbstractOrmXmlContextNode;
import org.eclipse.jpt.jpa.core.internal.context.orm.OrmOverrideTextRangeResolver;
import org.eclipse.jpt.jpa.core.resource.orm.XmlOverride;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

/**
 * Specified <code>orm.xml</code> override
 */
public abstract class AbstractOrmOverride<C extends OrmOverrideContainer, X extends XmlOverride>
	extends AbstractOrmXmlContextNode
	implements OrmOverride
{
	protected final X xmlOverride;

	protected String name;


	protected AbstractOrmOverride(C parent, X xmlOverride) {
		super(parent);
		this.xmlOverride = xmlOverride;
		this.name = xmlOverride.getName();
	}


	// ********** synchronize/update **********

	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		this.setName_(this.xmlOverride.getName());
	}


	// ********** name **********

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.setName_(name);
		this.xmlOverride.setName(name);
	}

	protected void setName_(String name) {
		String old = this.name;
		this.name = name;
		this.firePropertyChanged(NAME_PROPERTY, old, name);
	}


	// ********** specified/virtual **********

	public boolean isVirtual() {
		return false;
	}

	public OrmVirtualOverride convertToVirtual() {
		return this.getContainer().convertOverrideToVirtual(this);
	}


	// ********** misc **********

	@Override
	@SuppressWarnings("unchecked")
	public C getParent() {
		return (C) super.getParent();
	}

	public C getContainer() {
		return this.getParent();
	}

	public X getXmlOverride() {
		return this.xmlOverride;
	}

	protected void initializeFrom(ReadOnlyOverride oldOverride) {
		this.setName(oldOverride.getName());
	}

	protected void initializeFromVirtual(ReadOnlyOverride virtualOverride) {
		this.setName(virtualOverride.getName());
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append(this.name);
	}


	// ********** validation **********

	@Override
	public void validate(List<IMessage> messages, IReporter reporter) {
		super.validate(messages, reporter);
		this.buildValidator().validate(messages, reporter);
	}

	protected JptValidator buildValidator() {
		return this.getContainer().buildValidator(this, this.buildTextRangeResolver());
	}

	protected OverrideTextRangeResolver buildTextRangeResolver() {
		return new OrmOverrideTextRangeResolver(this);
	}

	public TextRange getValidationTextRange() {
		TextRange textRange = this.xmlOverride.getValidationTextRange();
		return (textRange != null) ? textRange : this.getParent().getValidationTextRange();
	}

	public TextRange getNameTextRange() {
		TextRange textRange = this.xmlOverride.getNameTextRange();
		return (textRange != null) ? textRange : this.getValidationTextRange();
	}
}