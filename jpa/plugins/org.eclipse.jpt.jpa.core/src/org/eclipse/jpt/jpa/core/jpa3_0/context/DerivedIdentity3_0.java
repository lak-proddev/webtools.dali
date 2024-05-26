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
import org.eclipse.jpt.jpa.core.context.JpaContextModel;

/**
 * Derived identity
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
public interface DerivedIdentity3_0
	extends JpaContextModel
{
// TODO bjv rename methods
	/**
	 * Return the associated single relationship mapping.
	 */
	SingleRelationshipMapping3_0 getMapping();

	// ********** predominant strategy **********

	/**
	 * String associated with changes to the predominant derived identity
	 * strategy property.
	 */
	String PREDOMINANT_DERIVED_IDENTITY_STRATEGY_PROPERTY = "predominantDerivedIdentityStrategy";  //$NON-NLS-1$

	/**
	 * Return the mapping's predominant strategy.
	 */
	DerivedIdentityStrategy3_0 getPredominantDerivedIdentityStrategy();


	// ********** null strategy **********

	/**
	 * Return whether the mapping has no strategy.
	 */
	boolean usesNullDerivedIdentityStrategy();

	/**
	 * Configure the mapping so it has no strategy.
	 * This will remove all other strategies.
	 */
	void setNullDerivedIdentityStrategy();


	// ********** ID strategy **********

	/**
	 * Return the mapping's ID strategy.
	 */
	IdDerivedIdentityStrategy3_0 getIdDerivedIdentityStrategy();

	/**
	 * Return whether the mapping uses an ID strategy.
	 */
	boolean usesIdDerivedIdentityStrategy();
	Predicate<DerivedIdentity3_0> USES_ID_DERIVED_IDENTITY_STRATEGY = new UsesIdDerivedIdentityStrategy();
	class UsesIdDerivedIdentityStrategy
		extends PredicateAdapter<DerivedIdentity3_0>
	{
		@Override
		public boolean evaluate(DerivedIdentity3_0 identity) {
			return identity.usesIdDerivedIdentityStrategy();
		}
	}

	/**
	 * Configure the mapping so it has an ID strategy.
	 * This will remove all other strategies.
	 */
	void setIdDerivedIdentityStrategy();


	// ********** maps ID strategy **********

	/**
	 * Return the mapping's "maps ID" strategy.
	 */
	MapsIdDerivedIdentityStrategy3_0 getMapsIdDerivedIdentityStrategy();
	Transformer<DerivedIdentity3_0, MapsIdDerivedIdentityStrategy3_0> MAPS_ID_DERIVED_IDENTITY_STRATEGY_TRANSFORMER = new MapsIdDerivedIdentityStrategyTransformer();
	class MapsIdDerivedIdentityStrategyTransformer
		extends TransformerAdapter<DerivedIdentity3_0, MapsIdDerivedIdentityStrategy3_0>
	{
		@Override
		public MapsIdDerivedIdentityStrategy3_0 transform(DerivedIdentity3_0 identity) {
			return identity.getMapsIdDerivedIdentityStrategy();
		}
	}

	/**
	 * Return whether the mapping uses a "maps ID" strategy.
	 */
	boolean usesMapsIdDerivedIdentityStrategy();
	Predicate<DerivedIdentity3_0> USES_MAPS_ID_DERIVED_IDENTITY_STRATEGY = new UsesMapsIdDerivedIdentityStrategy();
	class UsesMapsIdDerivedIdentityStrategy
		extends PredicateAdapter<DerivedIdentity3_0>
	{
		@Override
		public boolean evaluate(DerivedIdentity3_0 identity) {
			return identity.usesMapsIdDerivedIdentityStrategy();
		}
	}

	/**
	 * Configure the mapping so it has a "maps ID" strategy.
	 * This will remove all other strategies.
	 */
	void setMapsIdDerivedIdentityStrategy();

}