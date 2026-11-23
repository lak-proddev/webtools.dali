/*******************************************************************************
 * Copyright (c) 2026 Lakshminarayana Nekkanti and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Lakshminarayana Nekkanti - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.tests.internal.platform;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * EclipseLink platform tests. None of them creates a JPA project, so no
 * persistence jar system property is required.
 */
public class JptJpaEclipseLinkCorePlatformTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(JptJpaEclipseLinkCorePlatformTests.class.getPackage().getName());
		suite.addTestSuite(EclipseLinkJpaPlatformTests.class);
		suite.addTestSuite(EclipseLinkOrmResourceTypeTests.class);
		suite.addTestSuite(EclipseLinkOrmSchemaTests.class);
		suite.addTestSuite(EclipseLinkJakartaIdMappingDefinitionTests.class);
		suite.addTestSuite(EclipseLinkLibraryValidatorTests.class);
		return suite;
	}

	private JptJpaEclipseLinkCorePlatformTests() {
		super();
		throw new UnsupportedOperationException();
	}
}
