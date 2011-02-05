/*******************************************************************************
 *  Copyright (c) 2011  Oracle. All rights reserved.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v1.0, which accompanies this distribution
 *  and is available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jaxb.core.xsd;

import org.eclipse.xsd.XSDTypeDefinition;


public abstract class XsdTypeDefinition
		extends XsdAdapter {
	
	protected final XSDTypeDefinition xsdTypeDefinition;
	
	
	protected XsdTypeDefinition(XSDTypeDefinition xsdTypeDefinition) {
		super();
		this.xsdTypeDefinition = xsdTypeDefinition;
	}
	
	
	public String getName() {
		return this.xsdTypeDefinition.getName();
	}
}