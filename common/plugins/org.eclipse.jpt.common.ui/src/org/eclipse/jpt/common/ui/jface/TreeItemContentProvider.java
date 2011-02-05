/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.common.ui.jface;

/**
 * Interface used in conjunction with DelegatingTreeContentProvider to return 
 * tree information for a particular item.
 * @see DelegatingTreeContentProvider
 * @see TreeItemContentProviderFactory
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface TreeItemContentProvider extends ItemContentProvider
{
	/**
	 * Return the parent of the represented item
	 */
	Object getParent();
	
	/**
	 * Return whether the represented item has children
	 */
	boolean hasChildren();
	
	/**
	 * Return the children of the represented item
	 */
	Object[] getChildren();
}