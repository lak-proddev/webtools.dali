/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0, which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.base;


public interface IRelationshipMapping extends IAttributeMapping, IFetchable
{

	String getTargetEntity();

	String getSpecifiedTargetEntity();
	void setSpecifiedTargetEntity(String value);
		String SPECIFIED_TARGET_ENTITY_PROPERTY = "specifiedTargetEntityProperty";

	String getDefaultTargetEntity();
		String DEFAULT_TARGET_ENTITY_PROPERTY = "defaultTargetEntityProperty";

	IEntity getResolvedTargetEntity();
		String RESOLVED_TARGET_ENTITY_PROPERTY = "resolvedTargetEntityProperty";
	
	ICascade getCascade();

	/**
	 * Return whether the specified 'targetEntity' is valid.
	 */
	boolean targetEntityIsValid(String targetEntity);

	/**
	 * Return the Entity that owns this relationship mapping
	 * @return
	 */
	IEntity getEntity();

}