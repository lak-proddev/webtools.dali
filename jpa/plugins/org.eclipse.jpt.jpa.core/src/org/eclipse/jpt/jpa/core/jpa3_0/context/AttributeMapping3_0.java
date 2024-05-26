/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context;

import org.eclipse.jpt.common.utility.internal.iterable.IterableTools;
import org.eclipse.jpt.jpa.core.context.AttributeMapping;

/**
 * JPA 2.0 attribute mapping
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.3
 */
public interface AttributeMapping3_0
	extends AttributeMapping
{
	/**
	 * Return the Canonical Metamodel field corresponding to the mapping.
	 * Return <code>null</code> if the mapping is not to be part of the
	 * Canonical Metamodel.
	 */
	MetamodelField3_0 getMetamodelField();

	/**
	 * Return the name of the mapping's type as used in the Canonical Metamodel.
	 */
	String getMetamodelTypeName();

	@SuppressWarnings("nls")
	Iterable<String> STANDARD_METAMODEL_FIELD_MODIFIERS =
		IterableTools.iterable(new String[] { "public", "static", "volatile" });
}