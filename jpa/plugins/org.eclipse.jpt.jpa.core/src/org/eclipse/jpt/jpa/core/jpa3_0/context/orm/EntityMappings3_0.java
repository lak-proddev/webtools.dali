/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context.orm;

import org.eclipse.jpt.jpa.core.context.orm.EntityMappings;
import org.eclipse.jpt.jpa.core.resource.orm.XmlEntityMappings;

/**
 * Context model corresponding to the
 * XML resource model {@link XmlEntityMappings},
 * which corresponds to the <code>entity-mappings</code> element
 * in the 2.1 <code>orm.xml</code> file.
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
  * 
 * @version 3.3
 * @since 3.3
*/
public interface EntityMappings3_0
	extends EntityMappings
{

	Iterable<OrmConverterType3_0> getConverterTypes();
	OrmConverterType3_0 getConverterType(String className);
	OrmConverterType3_0 addConverterType(String className);
	boolean containsConverterType(String className);
}