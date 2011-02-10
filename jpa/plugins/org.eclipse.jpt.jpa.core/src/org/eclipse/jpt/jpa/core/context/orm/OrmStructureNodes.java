/*******************************************************************************
 * Copyright (c) 2006, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.context.orm;

import org.eclipse.jpt.jpa.core.JptJpaCorePlugin;

/**
 * 
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.0
 * @since 2.0
 */
public interface OrmStructureNodes 
{
	
	String ENTITY_MAPPINGS_ID = JptJpaCorePlugin.PLUGIN_ID + ".orm.entityMappings"; //$NON-NLS-1$
	
	String PERSISTENT_TYPE_ID = JptJpaCorePlugin.PLUGIN_ID + ".orm.persistentType"; //$NON-NLS-1$
	
	String PERSISTENT_ATTRIBUTE_ID = JptJpaCorePlugin.PLUGIN_ID + ".orm.persistentAttribute"; //$NON-NLS-1$

}