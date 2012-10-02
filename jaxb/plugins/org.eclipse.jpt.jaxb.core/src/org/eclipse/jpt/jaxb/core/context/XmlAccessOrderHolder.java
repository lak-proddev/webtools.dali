/*******************************************************************************
 * Copyright (c) 2010, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.context;


/**
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.3
 * @since 3.0
 */
public interface XmlAccessOrderHolder<A extends XmlAccessOrder>
		extends JaxbContextNode {
	
	/**
	 * Return the access order, whether specified or defaulted.
	 * This should never return null since at least the default will be set
	 */
	A getAccessOrder();
	
	/**
	 * String constant associated with changes to the default access order
	 */
	String DEFAULT_ACCESS_ORDER_PROPERTY = "defaultAccessOrder"; //$NON-NLS-1$
	
	/**
	 * Return the default access order, never null
	 */
	A getDefaultAccessOrder();
	
	/**
	 * String constant associated with changes to the specified access order
	 */
	String SPECIFIED_ACCESS_ORDER_PROPERTY = "specifiedAccessOrder"; //$NON-NLS-1$
	
	/**
	 * Return the specified access order;
	 */
	A getSpecifiedAccessOrder();
	
	/**
	 * Set the specified access order.
	 */
	void setSpecifiedAccessOrder(A newSpecifiedAccessOrder);
}
