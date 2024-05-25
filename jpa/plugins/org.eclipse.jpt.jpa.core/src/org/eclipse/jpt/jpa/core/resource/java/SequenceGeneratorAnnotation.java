/*******************************************************************************
 * Copyright (c) 2007, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.resource.java;

import java.util.function.Function;

import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * Corresponds to the JPA annotation
 * <code>javax.persistence.SequenceGenerator</code>
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.1
 * @since 2.0
 */
public interface SequenceGeneratorAnnotation
	extends DatabaseGeneratorAnnotation
{
	Function<IProjectFacetVersion, String> ANNOTATION_NAME = JPA.SEQUENCE_GENERATOR;

	/**
	 * Corresponds to the 'sequenceName' element of the *Generator annotation.
	 * Return null if the element does not exist in Java.
	 */
	String getSequenceName();
		String SEQUENCE_NAME_PROPERTY = "sequenceName"; //$NON-NLS-1$

	/**
	 * Corresponds to the 'sequenceName' element of the *Generator annotation.
	 * Set to null to remove the element.
	 */
	void setSequenceName(String sequenceName);
	
	/**
	 * Return the {@link TextRange} for the 'sequenceName' element. If the element 
	 * does not exist return the {@link TextRange} for the SequenceGenerator annotation.
	 */
	TextRange getSequenceNameTextRange();

	/**
	 * Return whether the specified position touches the 'sequenceName' element.
	 * Return false if the element does not exist.
	 */
	boolean sequenceNameTouches(int pos);
}
