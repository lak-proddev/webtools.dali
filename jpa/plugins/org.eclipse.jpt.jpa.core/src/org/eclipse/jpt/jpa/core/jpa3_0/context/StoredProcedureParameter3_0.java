/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context;

import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.jpa3_0.ParameterMode3_0;

/**
 * stored procedure parameter
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
public interface StoredProcedureParameter3_0
	extends JpaContextModel
{

	// ********* name **********
	String getName();
		String NAME_PROPERTY = "name"; //$NON-NLS-1$
	
	void setName(String name);


	// *********** mode *************

	/**
	 * Return the specified mode if present, 
	 * otherwise return the default lock mode.
	 */
	ParameterMode3_0 getMode();
	ParameterMode3_0 getSpecifiedMode();
	void setSpecifiedMode(ParameterMode3_0 mode);
		String SPECIFIED_MODE_PROPERTY = "specifiedParameterMode"; //$NON-NLS-1$
	ParameterMode3_0 getDefaultMode();
		String DEFAULT_MODE_PROPERTY = "defaultParameterMode";  //$NON-NLS-1$


	// ********** type ***********

	String getTypeName();
		String TYPE_NAME_PROPERTY = "typeName"; //$NON-NLS-1$
	
	void setTypeName(String type);

	/**
	 * If the type name is specified, this will return it fully qualified. If not
	 * specified, then it will return null
	 */
	String getFullyQualifiedTypeName();
		String FULLY_QUALIFIED_TYPE_NAME_PROPERTY = "fullyQualifiedTypeName"; //$NON-NLS-1$

	/**
	 * Return the character to be used for browsing or
	 * creating the type {@link org.eclipse.jdt.core.IType IType}.
	 * @see org.eclipse.jdt.core.IType#getFullyQualifiedName(char)
	 */
	char getTypeEnclosingTypeSeparator();


	// ********** validation ***********

	/**
	 * Return whether this stored procedure parameter is <em>equivalent</em>
	 * to the specified stored procedure parameter.
	 */
	boolean isEquivalentTo(StoredProcedureParameter3_0 parameter);

}
