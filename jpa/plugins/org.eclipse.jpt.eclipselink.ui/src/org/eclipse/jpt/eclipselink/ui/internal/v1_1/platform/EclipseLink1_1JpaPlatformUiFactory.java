/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v1_1.platform;

import org.eclipse.jpt.eclipselink.ui.internal.EclipseLinkJpaUiFactory;
import org.eclipse.jpt.eclipselink.ui.internal.platform.EclipseLinkJpaPlatformUi;
import org.eclipse.jpt.eclipselink.ui.internal.platform.EclipseLinkNavigatorProvider;
import org.eclipse.jpt.eclipselink.ui.internal.structure.EclipseLinkPersistenceResourceModelStructureProvider;
import org.eclipse.jpt.ui.JpaPlatformUi;
import org.eclipse.jpt.ui.JpaPlatformUiFactory;

public class EclipseLink1_1JpaPlatformUiFactory implements JpaPlatformUiFactory
{

	/**
	 * Zero arg constructor for extension point
	 */
	public EclipseLink1_1JpaPlatformUiFactory() {
		super();
	}

	public JpaPlatformUi buildJpaPlatformUi() {
		return new EclipseLinkJpaPlatformUi(
			new EclipseLinkJpaUiFactory(), //new EclipseLink1_1JpaUiFactory() is not being used because 
										   //we don't want the java Access annotation work to be exposed yet
										   //EclipseLink has backed out its JPA 2.0 annotation support until 
										   //it is released or licensing issues are cleared up
			new EclipseLinkNavigatorProvider(),
			EclipseLinkPersistenceResourceModelStructureProvider.instance(),
			EclipseLink1_1JpaPlatformUiProvider.instance()
		);
	}
}
