/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0, which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.core.internal.ITextRange;
import org.eclipse.jpt.core.internal.context.base.IColumnMapping;
import org.eclipse.jpt.core.internal.context.base.IVersionMapping;
import org.eclipse.jpt.core.internal.context.base.TemporalType;
import org.eclipse.jpt.core.internal.resource.orm.AttributeMapping;
import org.eclipse.jpt.core.internal.resource.orm.OrmFactory;
import org.eclipse.jpt.core.internal.resource.orm.TypeMapping;
import org.eclipse.jpt.core.internal.resource.orm.Version;
import org.eclipse.jpt.core.internal.resource.orm.VersionImpl;
import org.eclipse.jpt.db.internal.Table;


public class XmlVersionMapping extends XmlAttributeMapping<Version>
	implements IVersionMapping, IXmlColumnMapping
{
	protected final XmlColumn column;

	protected TemporalType temporal;
	
	protected XmlVersionMapping(XmlPersistentAttribute parent) {
		super(parent);
		this.column = new XmlColumn(this, this);
	}

	@Override
	public int xmlSequence() {
		return 2;
	}

	public String getKey() {
		return IMappingKeys.VERSION_ATTRIBUTE_MAPPING_KEY;
	}
	@Override
	protected void initializeOn(XmlAttributeMapping<? extends AttributeMapping> newMapping) {
		newMapping.initializeFromXmlVersionMapping(this);
	}

	public XmlColumn getColumn() {
		return this.column;
	}

	public TemporalType getTemporal() {
		return this.temporal;
	}

	public void setTemporal(TemporalType newTemporal) {
		TemporalType oldTemporal = this.temporal;
		this.temporal = newTemporal;
		this.attributeMapping().setTemporal(TemporalType.toOrmResourceModel(newTemporal));
		firePropertyChanged(IColumnMapping.TEMPORAL_PROPERTY, oldTemporal, newTemporal);
	}
	
	protected void setTemporal_(TemporalType newTemporal) {
		TemporalType oldTemporal = this.temporal;
		this.temporal = newTemporal;
		firePropertyChanged(IColumnMapping.TEMPORAL_PROPERTY, oldTemporal, newTemporal);
	}

	@Override
	public Version addToResourceModel(TypeMapping typeMapping) {
		VersionImpl version = OrmFactory.eINSTANCE.createVersionImpl();
		typeMapping.getAttributes().getVersions().add(version);
		return version;
	}
	
	@Override
	public void removeFromResourceModel(TypeMapping typeMapping) {
		typeMapping.getAttributes().getVersions().remove(this.attributeMapping());
		if (typeMapping.getAttributes().isAllFeaturesUnset()) {
			typeMapping.setAttributes(null);
		}
	}

	public String defaultColumnName() {		
		return attributeName();
	}

	public String defaultTableName() {
		return typeMapping().getTableName();
	}

	public Table dbTable(String tableName) {
		return typeMapping().dbTable(tableName);
	}

	public ITextRange validationTextRange(CompilationUnit astRoot) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void initialize(Version version) {
		super.initialize(version);
		this.temporal = this.specifiedTemporal(version);
		this.column.initialize(version);
	}
	
	@Override
	public void update(Version version) {
		super.update(version);
		this.setTemporal_(this.specifiedTemporal(version));
		this.column.update(version);
	}
	
	protected TemporalType specifiedTemporal(Version version) {
		return TemporalType.fromOrmResourceModel(version.getTemporal());
	}

}
