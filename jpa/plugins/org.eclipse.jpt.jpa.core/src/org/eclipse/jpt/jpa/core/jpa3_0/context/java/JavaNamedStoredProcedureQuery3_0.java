/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0.context.java;

import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.jpa.core.context.java.JavaQuery;
import org.eclipse.jpt.jpa.core.jpa3_0.context.NamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.NamedStoredProcedureQueryAnnotation3_0;

/**
 * JPA 2.1
 * Java named stored procedure query
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
public interface JavaNamedStoredProcedureQuery3_0 extends NamedStoredProcedureQuery3_0, JavaQuery {
	NamedStoredProcedureQueryAnnotation3_0 getQueryAnnotation();

	// *********** parameters ************

	ListIterable<JavaStoredProcedureParameter3_0> getParameters();

	JavaStoredProcedureParameter3_0 addParameter();

	JavaStoredProcedureParameter3_0 addParameter(int index);
}
