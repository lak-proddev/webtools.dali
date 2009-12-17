/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v2_0.platform;

import org.eclipse.jpt.eclipselink.ui.internal.platform.EclipseLinkNavigatorProvider;
import org.eclipse.jpt.ui.JpaPlatformUi;
import org.eclipse.jpt.ui.JpaPlatformUiFactory;

/**
 *  EclipseLink2_0JpaPlatformUiFactory
 */
public class EclipseLink2_0JpaPlatformUiFactory implements JpaPlatformUiFactory
{

	/**
	 * Zero arg constructor for extension point
	 */
	public EclipseLink2_0JpaPlatformUiFactory() {
		super();
	}

	public JpaPlatformUi buildJpaPlatformUi() {
		return new EclipseLink2_0JpaPlatformUi(
			new EclipseLinkNavigatorProvider(),
			EclipseLink2_0JpaPlatformUiProvider.instance()
		);
	}
}
