/*******************************************************************************
 * Copyright (c) 2008, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.jpt.core.context.JoinColumn;
import org.eclipse.jpt.core.context.java.JavaManyToOneMapping;
import org.eclipse.jpt.core.context.orm.OrmTypeMapping;
import org.eclipse.jpt.core.resource.orm.CascadeType;
import org.eclipse.jpt.core.resource.orm.FetchType;
import org.eclipse.jpt.core.resource.orm.OrmPackage;
import org.eclipse.jpt.core.resource.orm.XmlJoinColumn;
import org.eclipse.jpt.core.resource.orm.XmlJoinTable;
import org.eclipse.jpt.core.resource.orm.XmlManyToOne;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.utility.internal.CollectionTools;

/**
 * VirtualManyToOne is an implementation of ManyToOne used when there is 
 * no tag in the orm.xml and an underlying javaManyToOneMapping exists.
 */
public class VirtualXmlManyToOne 
	extends XmlManyToOne
{
	protected OrmTypeMapping ormTypeMapping;
	
	protected final JavaManyToOneMapping javaAttributeMapping;

	protected final VirtualXmlAttributeMapping virtualXmlAttributeMapping;

	protected final VirtualCascadeType virtualCascadeType;
	
	
	public VirtualXmlManyToOne(
		OrmTypeMapping ormTypeMapping, JavaManyToOneMapping javaManyToOneMapping) {
		super();
		this.ormTypeMapping = ormTypeMapping;
		this.javaAttributeMapping = javaManyToOneMapping;
		this.virtualXmlAttributeMapping = new VirtualXmlAttributeMapping(ormTypeMapping, javaManyToOneMapping);
		this.virtualCascadeType = 
			new VirtualCascadeType(javaManyToOneMapping.getCascade(), this.isOrmMetadataComplete());
	}
	
	protected boolean isOrmMetadataComplete() {
		return this.ormTypeMapping.isMetadataComplete();
	}
	
	@Override
	public String getMappingKey() {
		return this.virtualXmlAttributeMapping.getMappingKey();
	}
	
	@Override
	public String getName() {
		return this.virtualXmlAttributeMapping.getName();
	}

	@Override
	public void setName(String newName) {
		this.virtualXmlAttributeMapping.setName(newName);
	}
	
	@Override
	public TextRange getNameTextRange() {
		return this.virtualXmlAttributeMapping.getNameTextRange();
	}

	@Override
	public FetchType getFetch() {
		if (this.isOrmMetadataComplete()) {
			return org.eclipse.jpt.core.context.FetchType.toOrmResourceModel(this.javaAttributeMapping.getDefaultFetch());
		}
		return org.eclipse.jpt.core.context.FetchType.toOrmResourceModel(this.javaAttributeMapping.getFetch());
	}

	@Override
	public void setFetch(FetchType newFetch) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}

	@Override
	public Boolean getOptional() {
		if (this.isOrmMetadataComplete()) {
			return Boolean.valueOf(this.javaAttributeMapping.isDefaultOptional());
		}
		return Boolean.valueOf(this.javaAttributeMapping.isOptional());
	}

	@Override
	public void setOptional(Boolean newOptional) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public EList<XmlJoinColumn> getJoinColumns() {
		EList<XmlJoinColumn> joinColumns = new EObjectContainmentEList<XmlJoinColumn>(XmlJoinColumn.class, this, OrmPackage.XML_MANY_TO_ONE__JOIN_COLUMNS);
		if (isOrmMetadataComplete()) {
			return joinColumns;
		}
		for (JoinColumn joinColumn : 
			CollectionTools.iterable(
				this.javaAttributeMapping.getRelationshipReference().
					getJoinColumnJoiningStrategy().specifiedJoinColumns())) {
			XmlJoinColumn xmlJoinColumn = new VirtualXmlJoinColumn(joinColumn, isOrmMetadataComplete());
			joinColumns.add(xmlJoinColumn);
		}
		return joinColumns;
	}

	@Override
	public CascadeType getCascade() {
		return this.virtualCascadeType;
	}
	
	@Override
	public void setCascade(CascadeType value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public XmlJoinTable getJoinTable() {
		//TODO we don't yet support JoinTable in the context model for many-to-one mappings
		return null;//this.virtualJoinTable;
	}

	@Override
	public void setJoinTable(XmlJoinTable value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public String getTargetEntity() {
		if (this.isOrmMetadataComplete()) {
			return this.javaAttributeMapping.getDefaultTargetEntity();
		}
		return this.javaAttributeMapping.getTargetEntity();
	}

	@Override
	public void setTargetEntity(String value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public TextRange getTargetEntityTextRange() {
		return null;
	}
}
