/*******************************************************************************
 *  Copyright (c) 2009  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.jpa2.context;

import org.eclipse.jpt.core.context.CollectionMapping;
import org.eclipse.jpt.core.context.Embeddable;
import org.eclipse.jpt.core.context.Entity;

public interface ElementCollectionMapping2_0
	extends AttributeMapping2_0, CollectionMapping
{
	/**
	 * Return the entity that owns the mapping. This is
	 * just a convenience method that calls getTypeMapping() and returns
	 * null if it is not an Entity
	 */
	Entity getEntity();
	
	// **************** target class **************************************
	
	String getTargetClass();

	String getSpecifiedTargetClass();
	void setSpecifiedTargetClass(String value);
		String SPECIFIED_TARGET_CLASS_PROPERTY = "specifiedTargetClass"; //$NON-NLS-1$

	String getDefaultTargetClass();
		String DEFAULT_TARGET_CLASS_PROPERTY = "defaultTargetClass"; //$NON-NLS-1$

	/**
	 * If the target class is a basic type this will return null.
	 */
	Embeddable getResolvedTargetEmbeddable();
		String RESOLVED_TARGET_EMBEDDABLE_PROPERTY = "resolvedTargetEmbeddable"; //$NON-NLS-1$
	/**
	 * Return the char to be used for browsing or creating the target class IType.
	 * @see org.eclipse.jdt.core.IType#getFullyQualifiedName(char)
	 */
	char getTargetClassEnclosingTypeSeparator();
	
	// **************** table **************************************

	/**
	 * Return the collection table for this element collection mapping.
	 * This will not be null.
	 */
	CollectionTable2_0 getCollectionTable();
}
