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
 *  SchemaGenerationSource
 */
public enum SchemaGenerationTarget3_0 implements PersistenceXmlEnumValue {
	metadata("metadata"),  //$NON-NLS-1$
	script("script"),  //$NON-NLS-1$
	metadata_then_script("metadata-then-script"),  //$NON-NLS-1$
	script_then_metadata("script-then-metadata"); //$NON-NLS-1$

	private final String propertyValue;
	
	SchemaGenerationTarget3_0(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * The string used as the property value in the persistence.xml
	 */
	public String getPropertyValue() {
		return this.propertyValue;
	}
}