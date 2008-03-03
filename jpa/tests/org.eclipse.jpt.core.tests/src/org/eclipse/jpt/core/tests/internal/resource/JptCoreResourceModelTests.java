/*******************************************************************************
 *  Copyright (c) 2007 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.tests.internal.resource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.eclipse.jpt.core.tests.internal.resource.java.JptJavaResourceTests;

public class JptCoreResourceModelTests extends TestCase
{
	public static Test suite() {
		return suite(true);
	}
	
	public static Test suite(boolean all) {
		TestSuite suite = new TestSuite(JptCoreResourceModelTests.class.getName());
		suite.addTest(JptJavaResourceTests.suite(all));
		if (all) {
			suite.addTestSuite(OrmModelTests.class);
			suite.addTestSuite(PersistenceModelTests.class);
		}
		return suite;
	}

	private JptCoreResourceModelTests() {
		super();
		throw new UnsupportedOperationException();
	}
}
