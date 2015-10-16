/*******************************************************************************
 * Copyright (c) 2005, 2015 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.common.utility.internal.predicate.int_;

import java.io.Serializable;
import org.eclipse.jpt.common.utility.internal.BitTools;
import org.eclipse.jpt.common.utility.predicate.IntPredicate;

/**
 * Singleton predicate that returns <code>true</code> if the variable is odd.
 * 
 * @see IsEven
 */
public final class IsOdd
	implements IntPredicate, Serializable
{
	public static final IntPredicate INSTANCE = new IsOdd();

	public static  IntPredicate instance() {
		return INSTANCE;
	}

	// ensure single instance
	private IsOdd() {
		super();
	}

	public boolean evaluate(int variable) {
		return BitTools.isOdd(variable);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	private static final long serialVersionUID = 1L;
	private Object readResolve() {
		// replace this object with the singleton
		return INSTANCE;
	}
}
