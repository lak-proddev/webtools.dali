/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.tests.internal.content.java.mappings;

import junit.framework.Test;
import junit.framework.TestSuite;

public class JpaCoreContentJavaMappingsTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(JpaCoreContentJavaMappingsTests.class.getName());
//		suite.addTestSuite(JavaEntityTests.class);
		return suite;
	}

	private JpaCoreContentJavaMappingsTests() {
		super();
		throw new UnsupportedOperationException();
	}

}
