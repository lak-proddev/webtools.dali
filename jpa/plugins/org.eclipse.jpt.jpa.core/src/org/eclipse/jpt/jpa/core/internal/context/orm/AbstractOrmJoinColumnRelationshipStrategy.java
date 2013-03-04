/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.context.orm;

import java.util.List;
import org.eclipse.jpt.common.utility.internal.iterable.EmptyIterable;
import org.eclipse.jpt.common.utility.internal.iterable.EmptyListIterable;
import org.eclipse.jpt.common.utility.internal.iterable.IterableTools;
import org.eclipse.jpt.common.utility.internal.iterable.SingleElementListIterable;
import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.jpa.core.context.SpecifiedJoinColumn;
import org.eclipse.jpt.jpa.core.context.JoinColumn;
import org.eclipse.jpt.jpa.core.context.JoinColumnRelationshipStrategy;
import org.eclipse.jpt.jpa.core.context.RelationshipMapping;
import org.eclipse.jpt.jpa.core.context.TypeMapping;
import org.eclipse.jpt.jpa.core.context.orm.OrmSpecifiedJoinColumn;
import org.eclipse.jpt.jpa.core.context.orm.OrmJoinColumnRelationship;
import org.eclipse.jpt.jpa.core.context.orm.OrmSpecifiedJoinColumnRelationshipStrategy;
import org.eclipse.jpt.jpa.core.resource.orm.OrmFactory;
import org.eclipse.jpt.jpa.core.resource.orm.XmlJoinColumn;
import org.eclipse.jpt.jpa.core.resource.orm.XmlJoinColumnContainer;
import org.eclipse.jpt.jpa.db.Table;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public abstract class AbstractOrmJoinColumnRelationshipStrategy<P extends OrmJoinColumnRelationship>
	extends AbstractOrmXmlContextModel<P>
	implements OrmSpecifiedJoinColumnRelationshipStrategy
{
	protected final ContextListContainer<OrmSpecifiedJoinColumn, XmlJoinColumn> specifiedJoinColumnContainer;
	protected final JoinColumn.ParentAdapter joinColumnParentAdapter;

	protected OrmSpecifiedJoinColumn defaultJoinColumn;


	protected AbstractOrmJoinColumnRelationshipStrategy(P parent) {
		super(parent);
		this.joinColumnParentAdapter = this.buildJoinColumnParentAdapter();
		this.specifiedJoinColumnContainer = this.buildSpecifiedJoinColumnContainer();
	}


	// ********** synchronize/update **********

	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		this.syncSpecifiedJoinColumns();
	}

	@Override
	public void update() {
		super.update();
		this.updateModels(getSpecifiedJoinColumns());
		this.updateDefaultJoinColumn();
	}


	// ********** XML join column container **********

	protected XmlJoinColumnContainer getXmlJoinColumnContainer() {
		return this.getRelationship().getXmlContainer();
	}


	// ********** join columns **********

	public ListIterable<OrmSpecifiedJoinColumn> getJoinColumns() {
		return this.hasSpecifiedJoinColumns() ? this.getSpecifiedJoinColumns() : this.getDefaultJoinColumns();
	}

	public int getJoinColumnsSize() {
		return this.hasSpecifiedJoinColumns() ? this.getSpecifiedJoinColumnsSize() : this.getDefaultJoinColumnsSize();
	}


	// ********** specified join columns **********

	public ListIterable<OrmSpecifiedJoinColumn> getSpecifiedJoinColumns() {
		return this.specifiedJoinColumnContainer.getContextElements();
	}

	public int getSpecifiedJoinColumnsSize() {
		return this.specifiedJoinColumnContainer.getContextElementsSize();
	}

	public boolean hasSpecifiedJoinColumns() {
		return this.getSpecifiedJoinColumnsSize() != 0;
	}

	public OrmSpecifiedJoinColumn getSpecifiedJoinColumn(int index) {
		return this.specifiedJoinColumnContainer.getContextElement(index);
	}

	public OrmSpecifiedJoinColumn addSpecifiedJoinColumn() {
		return this.addSpecifiedJoinColumn(this.getSpecifiedJoinColumnsSize());
	}

	public OrmSpecifiedJoinColumn addSpecifiedJoinColumn(int index) {
		XmlJoinColumn xmlJoinColumn = this.buildXmlJoinColumn();
		OrmSpecifiedJoinColumn joinColumn = this.specifiedJoinColumnContainer.addContextElement(index, xmlJoinColumn);
		this.getXmlJoinColumnContainer().getJoinColumns().add(index, xmlJoinColumn);
		return joinColumn;
	}

	protected XmlJoinColumn buildXmlJoinColumn() {
		return OrmFactory.eINSTANCE.createXmlJoinColumn();
	}

	public void removeSpecifiedJoinColumn(SpecifiedJoinColumn joinColumn) {
		this.removeSpecifiedJoinColumn(this.specifiedJoinColumnContainer.indexOfContextElement((OrmSpecifiedJoinColumn) joinColumn));
	}

	public void removeSpecifiedJoinColumn(int index) {
		this.specifiedJoinColumnContainer.removeContextElement(index);
		this.getXmlJoinColumnContainer().getJoinColumns().remove(index);
	}

	public void convertDefaultJoinColumnsToSpecified() {
		if (this.defaultJoinColumn == null) {
			throw new IllegalStateException("default  join column is null"); //$NON-NLS-1$
		}
		String columnName = this.defaultJoinColumn.getDefaultName();
		String referencedColumnName = this.defaultJoinColumn.getDefaultReferencedColumnName();

		SpecifiedJoinColumn joinColumn = this.addSpecifiedJoinColumn(0);
		joinColumn.setSpecifiedName(columnName);
		joinColumn.setSpecifiedReferencedColumnName(referencedColumnName);
	}

	public void clearSpecifiedJoinColumns() {
		this.specifiedJoinColumnContainer.clearContextList();
		this.getXmlJoinColumnContainer().getJoinColumns().clear();
	}

	public void moveSpecifiedJoinColumn(int targetIndex, int sourceIndex) {
		this.specifiedJoinColumnContainer.moveContextElement(targetIndex, sourceIndex);
		this.getXmlJoinColumnContainer().getJoinColumns().move(targetIndex, sourceIndex);
	}

	protected void syncSpecifiedJoinColumns() {
		this.specifiedJoinColumnContainer.synchronizeWithResourceModel();
	}

	protected ListIterable<XmlJoinColumn> getXmlJoinColumns() {
		// clone to reduce chance of concurrency problems
		return IterableTools.cloneLive(this.getXmlJoinColumnContainer().getJoinColumns());
	}

	protected ContextListContainer<OrmSpecifiedJoinColumn, XmlJoinColumn> buildSpecifiedJoinColumnContainer() {
		SpecifiedJoinColumnContainer container = new SpecifiedJoinColumnContainer();
		container.initialize();
		return container;
	}

	/**
	 * specified join column container
	 */
	protected class SpecifiedJoinColumnContainer
		extends ContextListContainer<OrmSpecifiedJoinColumn, XmlJoinColumn>
	{
		@Override
		protected String getContextElementsPropertyName() {
			return SPECIFIED_JOIN_COLUMNS_LIST;
		}
		@Override
		protected OrmSpecifiedJoinColumn buildContextElement(XmlJoinColumn resourceElement) {
			return AbstractOrmJoinColumnRelationshipStrategy.this.buildJoinColumn(resourceElement);
		}
		@Override
		protected ListIterable<XmlJoinColumn> getResourceElements() {
			return AbstractOrmJoinColumnRelationshipStrategy.this.getXmlJoinColumns();
		}
		@Override
		protected XmlJoinColumn getResourceElement(OrmSpecifiedJoinColumn contextElement) {
			return contextElement.getXmlColumn();
		}
	}

	protected abstract JoinColumn.ParentAdapter buildJoinColumnParentAdapter();


	// ********** default join column **********

	public OrmSpecifiedJoinColumn getDefaultJoinColumn() {
		return this.defaultJoinColumn;
	}

	protected void setDefaultJoinColumn(OrmSpecifiedJoinColumn joinColumn) {
		OrmSpecifiedJoinColumn old = this.defaultJoinColumn;
		this.defaultJoinColumn = joinColumn;
		this.firePropertyChanged(DEFAULT_JOIN_COLUMN_PROPERTY, old, joinColumn);
	}

	protected ListIterable<OrmSpecifiedJoinColumn> getDefaultJoinColumns() {
		return (this.defaultJoinColumn != null) ?
				new SingleElementListIterable<OrmSpecifiedJoinColumn>(this.defaultJoinColumn) :
				EmptyListIterable.<OrmSpecifiedJoinColumn>instance();
	}

	protected int getDefaultJoinColumnsSize() {
		return (this.defaultJoinColumn == null) ? 0 : 1;
	}

	protected void updateDefaultJoinColumn() {
		if (this.buildsDefaultJoinColumn()) {
			if (this.defaultJoinColumn == null) {
				this.setDefaultJoinColumn(this.buildJoinColumn(null));
			} else {
				this.defaultJoinColumn.update();
			}
		} else {
			this.setDefaultJoinColumn(null);
		}
	}

	protected boolean buildsDefaultJoinColumn() {
		return ! this.hasSpecifiedJoinColumns() &&
				this.getRelationship().mayHaveDefaultJoinColumn();
	}


	// ********** misc **********

	public OrmJoinColumnRelationship getRelationship() {
		return this.parent;
	}

	protected OrmSpecifiedJoinColumn buildJoinColumn(XmlJoinColumn xmlJoinColumn) {
		return this.getContextModelFactory().buildOrmJoinColumn(this.joinColumnParentAdapter, xmlJoinColumn);
	}

	public void initializeFrom(JoinColumnRelationshipStrategy oldStrategy) {
		for (JoinColumn joinColumn : oldStrategy.getSpecifiedJoinColumns()) {
			this.addSpecifiedJoinColumn().initializeFrom(joinColumn);
		}
	}

	public void initializeFromVirtual(JoinColumnRelationshipStrategy virtualStrategy) {
		for (JoinColumn joinColumn : virtualStrategy.getJoinColumns()) {
			this.addSpecifiedJoinColumn().initializeFromVirtual(joinColumn);
		}
	}

	protected RelationshipMapping getRelationshipMapping() {
		return this.getRelationship().getMapping();
	}

	public String getTableName() {
		TypeMapping typeMapping = this.getRelationshipSource();
		return (typeMapping == null) ? null : typeMapping.getPrimaryTableName();
	}

	public Table resolveDbTable(String tableName) {
		TypeMapping typeMapping = this.getRelationshipSource();
		return (typeMapping == null) ? null : typeMapping.resolveDbTable(tableName);
	}

	public boolean tableNameIsInvalid(String tableName) {
		TypeMapping typeMapping = this.getRelationshipSource();
		return (typeMapping != null) && typeMapping.tableNameIsInvalid(tableName);
	}

	// subclasses like this to be public
	public Table getReferencedColumnDbTable() {
		TypeMapping relationshipTarget = this.getRelationshipTarget();
		return (relationshipTarget == null) ? null : relationshipTarget.getPrimaryDbTable();
	}
	
	protected Iterable<String> getCandidateTableNames() {
		TypeMapping typeMapping = this.getRelationshipSource();
		return (typeMapping != null) ? typeMapping.getAllAssociatedTableNames() : EmptyIterable.<String>instance();
	}

	public void addStrategy() {
		if (this.getSpecifiedJoinColumnsSize() == 0) {
			this.addSpecifiedJoinColumn();
		}
	}

	public void removeStrategy() {
		for (int i = this.getSpecifiedJoinColumnsSize(); i-- > 0; ) {
			this.removeSpecifiedJoinColumn(i);
		}
	}


	// ********** validation **********

	@Override
	public void validate(List<IMessage> messages, IReporter reporter) {
		super.validate(messages, reporter);
		for (OrmSpecifiedJoinColumn joinColumn : this.getJoinColumns()) {
			joinColumn.validate(messages, reporter);
		}
	}

	// ********** completion proposals **********

	@Override
	public Iterable<String> getCompletionProposals(int pos) {
		Iterable<String> result = super.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		for (OrmSpecifiedJoinColumn joinColumn : this.getJoinColumns()) {
			result = joinColumn.getCompletionProposals(pos);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}
