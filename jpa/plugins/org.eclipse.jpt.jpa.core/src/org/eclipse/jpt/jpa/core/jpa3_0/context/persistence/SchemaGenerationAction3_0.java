/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context.persistence;

import org.eclipse.jpt.jpa.core.context.persistence.PersistenceXmlEnumValue;

/**
 *  SchemaGenerationAction
 */
public enum SchemaGenerationAction3_0 implements PersistenceXmlEnumValue {
	none("none"),  //$NON-NLS-1$
	create("create"),  //$NON-NLS-1$
	drop_and_create("drop-and-create"),  //$NON-NLS-1$
	drop("drop"); //$NON-NLS-1$

	private final String propertyValue;

	SchemaGenerationAction3_0(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * The string used as the property value in the persistence.xml
	 */
	public String getPropertyValue() {
		return this.propertyValue;
	}
}