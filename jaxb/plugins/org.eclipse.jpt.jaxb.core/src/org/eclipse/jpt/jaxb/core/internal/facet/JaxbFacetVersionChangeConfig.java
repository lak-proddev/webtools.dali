/*******************************************************************************
 *  Copyright (c) 2010  Oracle. All rights reserved.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v1.0, which accompanies this distribution
 *  and is available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.facet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jpt.jaxb.core.internal.JptJaxbCoreMessages;


public class JaxbFacetVersionChangeConfig
		extends JaxbFacetConfig {
	
	public JaxbFacetVersionChangeConfig() {
		super();
	}
	
	
	// **************** validation ********************************************
	
	@Override
	protected IStatus validatePlatform() {
		IStatus status = super.validatePlatform();
		
		if (status.isOK()) {
			if (! getPlatform().supportsJaxbFacetVersion(getProjectFacetVersion())) {
				status = buildErrorStatus(JptJaxbCoreMessages.JaxbFacetConfig_validatePlatformDoesNotSupportFacetVersion);
			}
		}
		
		return status;
	}
}