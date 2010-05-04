/*******************************************************************************
 *  Copyright (c) 2007, 2010 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.core.tests.internal.resource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.eclipse.jpt.eclipselink.core.tests.internal.JptEclipseLinkCoreTests;
import org.eclipse.jpt.eclipselink.core.tests.internal.resource.java.JptEclipseLinkCoreJavaResourceModelTests;

/**
 * Required Java system property:
 *    -Dorg.eclipse.jpt.jpa.jar=<jpa.jar path>
 *    -Dorg.eclipse.jpt.eclipselink.jar=<eclipselink.jar path>
 */
public class JptEclipselinkCoreResourceModelTests extends TestCase
{
	public static Test suite() {
		TestSuite suite = new TestSuite(JptEclipselinkCoreResourceModelTests.class.getName());
		if(JptEclipseLinkCoreTests.requiredJarsExists()) {
			suite.addTest(JptEclipseLinkCoreJavaResourceModelTests.suite());
		}
		else {
			suite.addTest(TestSuite.warning(JptEclipseLinkCoreTests.buildMissingJarErrorMessage()));
		}
		return suite;
	}

	private JptEclipselinkCoreResourceModelTests() {
		super();
		throw new UnsupportedOperationException();
	}
}
