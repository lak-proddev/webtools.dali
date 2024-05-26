/*******************************************************************************
 * Copyright (c) 2011, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context;

import org.eclipse.jpt.jpa.core.context.AssociationOverrideContainer;
import org.eclipse.jpt.jpa.core.context.AssociationOverride;
import org.eclipse.jpt.jpa.core.context.JoinColumn;
import org.eclipse.jpt.jpa.core.context.Table;
import org.eclipse.jpt.jpa.core.internal.context.JpaValidator;

/**
 * JPA 2.0
 * Association override container.
 * Used by entities, embedded mappings, and element collection mappings.
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface AssociationOverrideContainer3_0
	extends AssociationOverrideContainer
{
	JpaValidator buildJoinTableValidator(AssociationOverride override, Table table);

	JpaValidator buildJoinTableJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter);

	JpaValidator buildJoinTableInverseJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter);


	// ********** parent adapter **********

	interface ParentAdapter
		extends AssociationOverrideContainer.ParentAdapter
	{
		JpaValidator buildJoinTableValidator(AssociationOverride override, Table table);

		JpaValidator buildJoinTableJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter);

		JpaValidator buildJoinTableInverseJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter);
	}
}