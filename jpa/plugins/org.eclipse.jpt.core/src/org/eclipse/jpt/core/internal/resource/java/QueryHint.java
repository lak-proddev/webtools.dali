/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.ITextRange;

/**
 * Corresponds to the javax.persistence.QueryHint annotation
 */
public interface QueryHint extends JavaResource
{
	String ANNOTATION_NAME = JPA.QUERY_HINT;

	/**
	 * Corresponds to the name element of the QueryHint annotation.
	 * Returns null if the name valuePair does not exist in the annotation
	 */
	String getName();
	
	/**
	 * Corresponds to the name element of the QueryHint annotation.
	 * Setting to null will remove the name valuePair
	 */
	void setName(String name);
		String NAME_PROPERTY = "nameProperty";
		
	/**
	 * Corresponds to the value element of the QueryHint annotation.
	 * Returns null if the value valuePair does not exist in the annotation
	 */
	String getValue();
	
	/**
	 * Corresponds to the value element of the QueryHint annotation.
	 * Setting to null will remove the value valuePair
	 */
	void setValue(String value);
		String VALUE_PROPERTY = "valueProperty";

	/**
	 * Return the ITextRange for the name element.  If the name element 
	 * does not exist return the ITextRange for the QueryHint annotation.
	 */
	ITextRange nameTextRange(CompilationUnit astRoot);

	/**
	 * Return the ITextRange for the value element.  If the value element 
	 * does not exist return the ITextRange for the QueryHint annotation.
	 */
	ITextRange valueTextRange(CompilationUnit astRoot);

}
