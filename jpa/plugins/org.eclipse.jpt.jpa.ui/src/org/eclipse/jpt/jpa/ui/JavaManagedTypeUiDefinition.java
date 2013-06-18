/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jpt.jpa.core.context.ManagedType;
import org.eclipse.jpt.jpa.core.context.java.JavaManagedType;

/**
 * A managed type UI definition provides the labels and images for the 
 * managed type indicated by {@link #getManagedTypeType()}.
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.3
 * @since 3.3
 */
public interface JavaManagedTypeUiDefinition {

	/**
	 * Return a type that corresponds to the definition's managed type.
	 * @see org.eclipse.jpt.jpa.core.context.java.JavaManagedTypeDefinition#getManagedTypeType()
	 */
	Class<? extends ManagedType> getManagedTypeType();

	/**
	 * Return an image descriptor corresponding to the managed type.
	 */
	ImageDescriptor getImageDescriptor(JavaManagedType managedType);
}
