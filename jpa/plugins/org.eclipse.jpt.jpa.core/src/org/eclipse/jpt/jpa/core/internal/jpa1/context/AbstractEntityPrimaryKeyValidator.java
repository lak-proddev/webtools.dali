/*******************************************************************************
 * Copyright (c) 2011, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa1.context;

import java.util.List;

import org.eclipse.jpt.jpa.core.context.AttributeMapping;
import org.eclipse.jpt.jpa.core.context.Entity;
import org.eclipse.jpt.jpa.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.jpa.core.internal.validation.JpaValidationMessages;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public abstract class AbstractEntityPrimaryKeyValidator extends
		AbstractPrimaryKeyValidator {

	protected AbstractEntityPrimaryKeyValidator(Entity entity) {
		super(entity);
	}

	protected Entity entity() {
		return (Entity) this.typeMapping();
	}
	
	public boolean validate(List<IMessage> messages, IReporter reporter) {
		// if an entity is non-root, it is not allowed to define primary keys
		if (! entity().isRootEntity()) {
			validatePrimaryKeyForNonRoot(messages, reporter);
		}
		else {
			validatePrimaryKeyForRoot(messages, reporter);
		}
		return true;
	}
	
	protected void validatePrimaryKeyForNonRoot(List<IMessage> messages, IReporter reporter) {
		validateNonRootEntityDoesNotSpecifyIdClass(messages, reporter);
		validateNonRootEntityDoesNotSpecifyPrimaryKeyAttributes(messages, reporter);
	}
	
	protected void validatePrimaryKeyForRoot(List<IMessage> messages, IReporter reporter) {
		validatePrimaryKeyIsNotRedefined(messages, reporter);
		validateIdClassIsUsedIfNecessary(messages, reporter);
		
		// if the primary key is not defined on an ancestor, it must be defined here
		if (! definesPrimaryKey(typeMapping())) {
			messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.ENTITY_NO_PK,
						EMPTY_STRING_ARRAY,
						entity(),
						entity().getValidationTextRange()));
		}
		
		// if primary key is composite, it may either use an id class or embedded id, not both
		validateOneOfIdClassOrEmbeddedIdIsUsed(messages, reporter);
		// ... and only one embedded id
		validateOneEmbeddedId(messages, reporter);
		// ... and not both id and embedded id
		validateOneOfEmbeddedOrIdIsUsed(messages, reporter);
		
		validateMapsIdMappings(messages, reporter);
		
		if (specifiesIdClass()) {
			validateIdClass(idClassReference().getIdClass(), messages, reporter);
		}
	}
	
	protected void validateNonRootEntityDoesNotSpecifyIdClass(List<IMessage> messages, IReporter reporter) {
		if (idClassReference().isSpecified()) {
			messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.ENTITY_NON_ROOT_ID_CLASS_SPECIFIED,
						EMPTY_STRING_ARRAY,
						entity(),
						idClassReference().getValidationTextRange()));
		}
	}
	
	protected void validateNonRootEntityDoesNotSpecifyPrimaryKeyAttributes(List<IMessage> messages, IReporter reporter) {
		for (AttributeMapping each : getPrimaryKeyMappingsDefinedLocally(typeMapping())) {
			messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.ENTITY_NON_ROOT_ID_ATTRIBUTE_SPECIFIED,
						EMPTY_STRING_ARRAY,
						each,
						getAttributeMappingTextRange(each)));
		}
	}
}
