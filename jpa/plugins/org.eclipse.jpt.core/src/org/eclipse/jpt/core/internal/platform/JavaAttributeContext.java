/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Oracle. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.internal.platform;

import java.util.List;
import org.eclipse.jpt.core.internal.IAttributeMapping;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.core.internal.IPersistentType;
import org.eclipse.jpt.core.internal.ITypeMapping;
import org.eclipse.jpt.core.internal.content.java.IJavaAttributeMapping;
import org.eclipse.jpt.core.internal.validation.IJpaValidationMessages;
import org.eclipse.jpt.core.internal.validation.JpaValidationMessages;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

public abstract class JavaAttributeContext extends BaseContext
{
	protected IJavaAttributeMapping attributeMapping;
	
	public JavaAttributeContext(IContext parentContext, IJavaAttributeMapping javaAttributeMapping) {
		super(parentContext);
		this.attributeMapping = javaAttributeMapping;
	}
	
	@Override
	protected void initialize() {}

	protected void populateGeneratorRepository(GeneratorRepository generatorRepository) {
		//do nothing, override as necessary
	}

	protected PersistenceUnitContext persistenceUnitContext() {
		return (PersistenceUnitContext) persistentAttributeContext().javaTypeContext().getParentContext();
	}
	
	protected JavaPersistentAttributeContext persistentAttributeContext() {
		return (JavaPersistentAttributeContext) getParentContext();
	}

	protected boolean embeddableOwned() {
		return getMapping().typeMapping().getKey() == IMappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY;
	}
	
	protected boolean entityOwned() {
		return getMapping().typeMapping().getKey() == IMappingKeys.ENTITY_TYPE_MAPPING_KEY;
	}
	
	public final void refreshDefaults(DefaultsContext defaultsContext) {
		defaultsContext = wrapDefaultsContext(defaultsContext);
		refreshDefaultsInternal(defaultsContext);
	}
	
	protected void refreshDefaultsInternal(DefaultsContext defaultsContext) {
		this.attributeMapping.refreshDefaults(defaultsContext);
	}
	
	protected IAttributeMapping getMapping() {
		return this.attributeMapping;
	}
	
	public final DefaultsContext wrapDefaultsContext(final DefaultsContext defaultsContext) {
		return new DefaultsContext() {
			public Object getDefault(String key) {
				return JavaAttributeContext.this.getDefault(key, defaultsContext);
			}
		
			public IPersistentType persistentType(String fullyQualifiedTypeName) {
				return defaultsContext.persistentType(fullyQualifiedTypeName);
			}
		};
	}
	
	protected Object getDefault(String key, DefaultsContext defaultsContext) {
		if (key.equals(BaseJpaPlatform.DEFAULT_COLUMN_NAME_KEY)) {
			return getMapping().getPersistentAttribute().getName();			
		}
		return defaultsContext.getDefault(key);
	}
	
	@Override
	public void addToMessages(List<IMessage> messages) {
		super.addToMessages(messages);
		
		addInvalidMappingMessage(messages);
	}
	
	protected void addInvalidMappingMessage(List<IMessage> messages) {
		IAttributeMapping attributeMapping = getMapping();
		ITypeMapping typeMapping = attributeMapping.typeMapping();
		if (! typeMapping.attributeMappingKeyAllowed(attributeMapping.getKey())) {
			messages.add(
				JpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					IJpaValidationMessages.PERSISTENT_ATTRIBUTE_INVALID_MAPPING,
					new String[] {attributeMapping.getPersistentAttribute().getName()},
					attributeMapping, attributeMapping.validationTextRange())
			);
		}
	}
}
