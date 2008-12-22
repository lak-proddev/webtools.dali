/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.context;

/**
 * 
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface SequenceGenerator
	extends Generator
{
	int DEFAULT_INITIAL_VALUE = 1;


	// ********** sequence name **********

	String getSpecifiedSequenceName();
	void setSpecifiedSequenceName(String value);
		String SPECIFIED_SEQUENCE_NAME_PROPERTY = "specifiedSequenceName"; //$NON-NLS-1$
	String getSequenceName();
	String getDefaultSequenceName();
		String DEFAULT_SEQUENCE_NAME_PROPERTY = "defaultSequenceName"; //$NON-NLS-1$

}
