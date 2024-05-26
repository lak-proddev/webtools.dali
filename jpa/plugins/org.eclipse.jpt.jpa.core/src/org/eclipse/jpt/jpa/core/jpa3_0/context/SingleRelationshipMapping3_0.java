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

import org.eclipse.jpt.common.utility.internal.predicate.PredicateAdapter;
import org.eclipse.jpt.common.utility.internal.transformer.TransformerAdapter;
import org.eclipse.jpt.common.utility.predicate.Predicate;
import org.eclipse.jpt.common.utility.transformer.Transformer;
import org.eclipse.jpt.jpa.core.context.SingleRelationshipMapping;

/**
 * JPA 2.0 single relationship (m:1, 1:1) mapping
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.3
 * @since 2.3
 */
public interface SingleRelationshipMapping3_0
	extends SingleRelationshipMapping, RelationshipMapping3_0
{
	DerivedIdentity3_0 getDerivedIdentity();
	Transformer<SingleRelationshipMapping3_0, DerivedIdentity3_0> DERIVED_IDENTITY_TRANSFORMER = new DerivedIdentityTransformer();
	class DerivedIdentityTransformer
		extends TransformerAdapter<SingleRelationshipMapping3_0, DerivedIdentity3_0>
	{
		@Override
		public DerivedIdentity3_0 transform(SingleRelationshipMapping3_0 mapping) {
			return mapping.getDerivedIdentity();
		}
	}

	Predicate<SingleRelationshipMapping3_0> TYPE_MAPPING_USES_ID_DERIVED_IDENTITY_STRATEGY = new TypeMappingUsesIdDerivedIdentityStrategy();
	class TypeMappingUsesIdDerivedIdentityStrategy
		extends PredicateAdapter<SingleRelationshipMapping3_0>
	{
		@Override
		public boolean evaluate(SingleRelationshipMapping3_0 mapping) {
			return mapping.getDerivedIdentity().usesIdDerivedIdentityStrategy();
		}
	}

	Predicate<SingleRelationshipMapping3_0> TYPE_MAPPING_USES_MAPS_ID_DERIVED_IDENTITY_STRATEGY = new TypeMappingUsesMapsIdDerivedIdentityStrategy();
	class TypeMappingUsesMapsIdDerivedIdentityStrategy
		extends PredicateAdapter<SingleRelationshipMapping3_0>
	{
		@Override
		public boolean evaluate(SingleRelationshipMapping3_0 mapping) {
			return mapping.getDerivedIdentity().usesMapsIdDerivedIdentityStrategy();
		}
	}
}
