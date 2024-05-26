/*******************************************************************************
 * Copyright (c) 2010, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context.java;

import org.eclipse.jpt.jpa.core.context.java.JavaSingleRelationshipMapping;
import org.eclipse.jpt.jpa.core.jpa3_0.context.SingleRelationshipMapping3_0;

/**
 * JPA 2.0 Java single (m:1, 1:1) mapping
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
public interface JavaSingleRelationshipMapping3_0 extends SingleRelationshipMapping3_0, JavaSingleRelationshipMapping {
	
	JavaDerivedIdentity3_0 getDerivedIdentity();
}