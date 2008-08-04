/*******************************************************************************
 * Copyright (c) 2006, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import java.util.Iterator;
import java.util.List;
import org.eclipse.jpt.core.JpaStructureNode;
import org.eclipse.jpt.core.context.AccessType;
import org.eclipse.jpt.core.context.PersistentAttribute;
import org.eclipse.jpt.core.context.java.JavaPersistentType;
import org.eclipse.jpt.core.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.context.orm.OrmPersistentType;
import org.eclipse.jpt.core.context.orm.OrmTypeMapping;
import org.eclipse.jpt.core.context.orm.PersistenceUnitMetadata;
import org.eclipse.jpt.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.core.internal.validation.JpaValidationMessages;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.db.Schema;
import org.eclipse.jpt.db.Table;
import org.eclipse.jpt.utility.internal.StringTools;
import org.eclipse.jpt.utility.internal.iterators.EmptyIterator;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;


public abstract class AbstractOrmTypeMapping<T extends AbstractXmlTypeMapping> extends AbstractOrmJpaContextNode implements OrmTypeMapping
{

	protected String class_;
	
	public AccessType defaultAccess;

	protected AccessType specifiedAccess;

	public boolean defaultMetadataComplete;

	protected Boolean specifiedMetadataComplete;

	protected JavaPersistentType javaPersistentType;

	protected T typeMapping;
	
	protected AbstractOrmTypeMapping(OrmPersistentType parent) {
		super(parent);
	}

	public boolean isMapped() {
		return true;
	}

	public String getTableName() {
		return null;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass(String newClass) {
		String oldClass = this.class_;
		this.class_ = newClass;
		this.getTypeMappingResource().setClassName(newClass);
		firePropertyChanged(CLASS_PROPERTY, oldClass, newClass);
		getPersistentType().classChanged(oldClass, newClass);
	}
	
	public AccessType getDefaultAccess() {
		return this.defaultAccess;
	}

	protected void setDefaultAccess(AccessType newDefaultAccess) {
		AccessType oldDefaultAccess = this.defaultAccess;
		this.defaultAccess = newDefaultAccess;
		firePropertyChanged(DEFAULT_ACCESS_PROPERTY, oldDefaultAccess, newDefaultAccess);
	}

	public AccessType getSpecifiedAccess() {
		return this.specifiedAccess;
	}

	public void setSpecifiedAccess(AccessType newSpecifiedAccess) {
		AccessType oldSpecifiedAccess = this.specifiedAccess;
		this.specifiedAccess = newSpecifiedAccess;
		this.getTypeMappingResource().setAccess(AccessType.toXmlResourceModel(newSpecifiedAccess));
		firePropertyChanged(SPECIFIED_ACCESS_PROPERTY, oldSpecifiedAccess, newSpecifiedAccess);
	}

	public AccessType getAccess() {
		return (this.getSpecifiedAccess() == null) ? this.getDefaultAccess() : this.getSpecifiedAccess();
	}

	public boolean isMetadataComplete() {
		if (isDefaultMetadataComplete()) {
			//entity-mappings/persistence-unit-metadata/xml-mapping-metadata-complete is specified, then it overrides
			//anything set here
			return true;
		}
		return (this.getSpecifiedMetadataComplete() == null) ? this.isDefaultMetadataComplete() : this.getSpecifiedMetadataComplete().booleanValue();
	}

	public boolean isDefaultMetadataComplete() {
		return this.defaultMetadataComplete;
	}
	
	protected void setDefaultMetadataComplete(boolean newDefaultMetadataComplete) {
		boolean oldMetadataComplete = this.defaultMetadataComplete;
		this.defaultMetadataComplete = newDefaultMetadataComplete;
		firePropertyChanged(DEFAULT_METADATA_COMPLETE_PROPERTY, oldMetadataComplete, newDefaultMetadataComplete);
	}
	
	public Boolean getSpecifiedMetadataComplete() {
		return this.specifiedMetadataComplete;
	}
	
	public void setSpecifiedMetadataComplete(Boolean newSpecifiedMetadataComplete) {
		Boolean oldMetadataComplete = this.specifiedMetadataComplete;
		this.specifiedMetadataComplete = newSpecifiedMetadataComplete;
		this.getTypeMappingResource().setMetadataComplete(newSpecifiedMetadataComplete);
		firePropertyChanged(SPECIFIED_METADATA_COMPLETE_PROPERTY, oldMetadataComplete, newSpecifiedMetadataComplete);
	}

	public OrmPersistentType getPersistentType() {
		return (OrmPersistentType) getParent();
	}

	/**
	 * ITypeMapping is changed and various ITypeMappings may have
	 * common settings.  In this method initialize the new ITypeMapping (this)
	 * fromthe old ITypeMapping (oldMapping)
	 * @param oldMapping
	 */
	public void initializeFrom(OrmTypeMapping oldMapping) {
		this.setClass(oldMapping.getClass_());
		this.setSpecifiedAccess(oldMapping.getSpecifiedAccess());
		this.setSpecifiedMetadataComplete(oldMapping.getSpecifiedMetadataComplete());
		this.setDefaultAccess(oldMapping.getDefaultAccess());
		this.setDefaultMetadataComplete(oldMapping.isDefaultMetadataComplete());
	}
	
	public Table getPrimaryDbTable() {
		return null;
	}

	public Table getDbTable(String tableName) {
		return null;
	}

	public Schema getDbSchema() {
		return null;
	}

	/**
	 * @see TypeMapping#attributeMappingKeyAllowed(String)
	 * 
	 * Default implementation:  override where needed
	 */
	public boolean attributeMappingKeyAllowed(String attributeMappingKey) {
		return true;
	}

	public Iterator<OrmPersistentAttribute> overridableAttributes() {
		return EmptyIterator.instance();
	}

	public Iterator<String> overridableAttributeNames() {
		return EmptyIterator.instance();
	}
	
	public Iterator<PersistentAttribute> allOverridableAttributes() {
		return EmptyIterator.instance();
	}

	public Iterator<String> allOverridableAttributeNames() {
		return EmptyIterator.instance();
	}

	public Iterator<OrmPersistentAttribute> overridableAssociations() {
		return EmptyIterator.instance();
	}	
	
	public Iterator<String> overridableAssociationNames() {
		return EmptyIterator.instance();
	}

	public Iterator<PersistentAttribute> allOverridableAssociations() {
		return EmptyIterator.instance();
	}

	public Iterator<String> allOverridableAssociationNames() {
		return EmptyIterator.instance();
	}

	public T getTypeMappingResource() {
		return this.typeMapping;
	}
	
	protected PersistenceUnitMetadata getPersistenceUnitMetadata() {
		return getEntityMappings().getPersistenceUnitMetadata();
	}

	protected boolean defaultMetadataComplete() {
		return getPersistenceUnitMetadata().isXmlMappingMetadataComplete();
	}

	protected AccessType defaultAccess() {
		if (!isMetadataComplete()) {
			if (getJavaPersistentType() != null) {
				if (getJavaPersistentType().hasAnyAttributeMappingAnnotations()) {
					return getJavaPersistentType().getAccess();
				}
				if (getPersistentType().getParentPersistentType() != null) {
					return getPersistentType().getParentPersistentType().getAccess();
				}
			}
		}
		return getEntityMappings().getAccess();
	}
	
	public JavaPersistentType getJavaPersistentType() {
		return this.javaPersistentType;
	}
	
	protected void setJavaPersistentType(JavaPersistentType newJavaPersistentType) {
		JavaPersistentType oldJavaPersistentType = this.javaPersistentType;
		this.javaPersistentType = newJavaPersistentType;
		firePropertyChanged(JAVA_PERSISTENT_TYPE_PROPERTY, oldJavaPersistentType, newJavaPersistentType);
	}
	
	protected void initializeJavaPersistentType() {
		JavaResourcePersistentType persistentTypeResource = getJavaResourcePersistentType();
		if (persistentTypeResource != null) {
			this.javaPersistentType = buildJavaPersistentType(persistentTypeResource);
		}	
	}

	protected JavaResourcePersistentType getJavaResourcePersistentType() {
		// try to resolve by only the locally specified name
		JavaResourcePersistentType persistentTypeResource = getJpaProject().getJavaResourcePersistentType(getClass_());
		if (persistentTypeResource == null) {
			// try to resolve by prepending the global package name
			persistentTypeResource = getJpaProject().getJavaResourcePersistentType(getEntityMappings().getPackage() + "." + getClass_());
		}
		return persistentTypeResource;
	}
	
	protected void updateJavaPersistentType() {
		JavaResourcePersistentType persistentTypeResource = getJavaResourcePersistentType();
		if (persistentTypeResource == null) {
			setJavaPersistentType(null);
		}
		else { 
			if (getJavaPersistentType() != null) {
				getJavaPersistentType().update(persistentTypeResource);
			}
			else {
				setJavaPersistentType(buildJavaPersistentType(persistentTypeResource));
			}
		}		
	}
	
	protected JavaPersistentType buildJavaPersistentType(JavaResourcePersistentType resourcePersistentType) {
		return getJpaFactory().buildJavaPersistentType(this, resourcePersistentType);
	}

	public void initialize(T typeMapping) {
		this.typeMapping = typeMapping;
		this.class_ = typeMapping.getClassName();
		this.initializeJavaPersistentType();
		this.specifiedMetadataComplete = this.metadataComplete(typeMapping);
		this.defaultMetadataComplete = this.defaultMetadataComplete();
		this.specifiedAccess = AccessType.fromXmlResourceModel(typeMapping.getAccess());
		this.defaultAccess = this.defaultAccess();
	}
	
	public void update(T typeMapping) {
		this.typeMapping = typeMapping;
		this.setClass(typeMapping.getClassName());
		this.updateJavaPersistentType();
		this.setSpecifiedMetadataComplete(this.metadataComplete(typeMapping));
		this.setDefaultMetadataComplete(this.defaultMetadataComplete());
		this.setSpecifiedAccess(AccessType.fromXmlResourceModel(typeMapping.getAccess()));
		this.setDefaultAccess(this.defaultAccess());
	}
	
	protected Boolean metadataComplete(AbstractXmlTypeMapping typeMapping) {
		return typeMapping.getMetadataComplete();
	}


	
	// *************************************************************************
	
	public JpaStructureNode getStructureNode(int offset) {
		if (this.typeMapping.containsOffset(offset)) {
			return getPersistentType();
		}
		return null;
	}
	
	public TextRange getSelectionTextRange() {
		return this.typeMapping.getSelectionTextRange();
	}
	
	public TextRange getClassTextRange() {
		return this.typeMapping.getClassTextRange();
	}
	
	public TextRange getAttributesTextRange() {
		return this.typeMapping.getAttributesTextRange();
	}

	public boolean containsOffset(int textOffset) {
		if (this.typeMapping == null) {
			return false;
		}
		return this.typeMapping.containsOffset(textOffset);
	}
	
	//************************* validation ************************
	@Override
	public void addToMessages(List<IMessage> messages) {
		super.addToMessages(messages);
		addClassMessages(messages);
	}
	protected void addClassMessages(List<IMessage> messages) {
		addUnspecifiedClassMessage(messages);
		addUnresolvedClassMessage(messages);
	}
	
	protected void addUnspecifiedClassMessage(List<IMessage> messages) {
		if (StringTools.stringIsEmpty(getClass_())) {
			messages.add(
				DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					JpaValidationMessages.PERSISTENT_TYPE_UNSPECIFIED_CLASS,
					this, 
					this.getClassTextRange())
			);
		}
	}
	
	protected void addUnresolvedClassMessage(List<IMessage> messages) {
		if (! StringTools.stringIsEmpty(getClass_())
				&& getJavaPersistentType() == null) {
			messages.add(
				DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					JpaValidationMessages.PERSISTENT_TYPE_UNRESOLVED_CLASS,
					new String[] {getClass_()},
					this, 
					this.getClassTextRange())
			);
		}
	}

	public TextRange getValidationTextRange() {
		return this.typeMapping.getValidationTextRange();
	}
}
