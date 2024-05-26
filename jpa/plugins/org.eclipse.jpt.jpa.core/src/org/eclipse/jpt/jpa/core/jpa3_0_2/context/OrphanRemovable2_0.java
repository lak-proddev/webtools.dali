/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0_2.context;

import org.eclipse.jpt.jpa.core.context.JpaContextModel;

/**
 * Oprhan removal
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
public interface OrphanRemovable2_0
	extends JpaContextModel
{
	boolean isOrphanRemoval();

	Boolean getSpecifiedOrphanRemoval();
	void setSpecifiedOrphanRemoval(Boolean orphanRemoval);
		String SPECIFIED_ORPHAN_REMOVAL_PROPERTY = "specifiedOrphanRemoval"; //$NON-NLS-1$

	boolean isDefaultOrphanRemoval();
		String DEFAULT_ORPHAN_REMOVAL_PROPERTY = "defaultOrphanRemoval"; //$NON-NLS-1$
		boolean DEFAULT_ORPHAN_REMOVAL = false;
}
