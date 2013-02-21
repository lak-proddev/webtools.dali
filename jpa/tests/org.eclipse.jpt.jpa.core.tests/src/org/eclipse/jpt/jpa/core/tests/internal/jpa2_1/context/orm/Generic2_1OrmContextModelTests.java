/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.tests.internal.jpa2_1.context.orm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.eclipse.jpt.jpa.core.tests.internal.jpa2_1.context.persistence.Generic2_1JpaMetadataConversionTests;

public class Generic2_1OrmContextModelTests extends TestCase
{

	public static Test suite() {
		TestSuite suite = new TestSuite(Generic2_1OrmContextModelTests.class.getPackage().getName());

		suite.addTestSuite(GenericOrmNamedStoredProcedureQuery2_1Tests.class);
		suite.addTestSuite(GenericOrmStoredProcedureParameter2_1Tests.class);
		suite.addTestSuite(Generic2_1JpaMetadataConversionTests.class);

		return suite;
	}

	private Generic2_1OrmContextModelTests() {
		super();
		throw new UnsupportedOperationException();
	}

}
