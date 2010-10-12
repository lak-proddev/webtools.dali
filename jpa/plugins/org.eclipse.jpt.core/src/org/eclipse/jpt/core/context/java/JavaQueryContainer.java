/*******************************************************************************
 * Copyright (c) 2009, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.context.java;

import java.util.ListIterator;
import org.eclipse.jpt.core.context.QueryContainer;
import org.eclipse.jpt.core.resource.java.JavaResourceAnnotatedElement;

/**
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.0
 * @since 2.3
 */
public interface JavaQueryContainer
	extends QueryContainer, JavaJpaContextNode
{
	@SuppressWarnings("unchecked")
	ListIterator<JavaNamedQuery> namedQueries();

	JavaNamedQuery addNamedQuery(int index);

	@SuppressWarnings("unchecked")
	ListIterator<JavaNamedNativeQuery> namedNativeQueries();

	JavaNamedNativeQuery addNamedNativeQuery(int index);
	
	void initialize(JavaResourceAnnotatedElement jrae);
	
	/**
	 * Update the JavaQueryContainer context model object to match the JavaResourceAnnotatedElement 
	 * resource model object. see {@link org.eclipse.jpt.core.JpaProject#update()}
	 */
	void update(JavaResourceAnnotatedElement jrae);

}