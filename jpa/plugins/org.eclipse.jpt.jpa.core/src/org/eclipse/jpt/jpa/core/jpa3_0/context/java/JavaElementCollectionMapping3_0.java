/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context.java;

import org.eclipse.jpt.jpa.core.context.java.JavaAssociationOverrideContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeOverrideContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaConvertibleMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedColumn;
import org.eclipse.jpt.jpa.core.jpa3_0.context.ElementCollectionMapping3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ElementCollectionAnnotation3_0;

/**
 * Java element collection mapping
 * <p>
 * Provisional API: This interface is part of an interim API that is still under
 * development and expected to change significantly before reaching stability.
 * It is available at this early stage to solicit feedback from pioneering
 * adopters on the understanding that any code that uses this API will almost
 * certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.3
 */
public interface JavaElementCollectionMapping3_0
		extends ElementCollectionMapping3_0, JavaCollectionMapping3_0, JavaConvertibleMapping {
	ElementCollectionAnnotation3_0 getMappingAnnotation();

	JavaCollectionTable3_0 getCollectionTable();

	JavaSpecifiedColumn getValueColumn();

	JavaAttributeOverrideContainer getValueAttributeOverrideContainer();

	JavaAssociationOverrideContainer getValueAssociationOverrideContainer();
}