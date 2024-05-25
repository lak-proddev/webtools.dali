/*******************************************************************************
 * Copyright (c) 2012, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa2_1.resource.java;

import java.util.function.Function;

import org.eclipse.jpt.jpa.core.resource.java.JPA;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * JPA 2.1 Java-related stuff (annotations etc.)
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
@SuppressWarnings("nls")
public interface JPA2_1 {

	// JPA package
	Function<IProjectFacetVersion, String> PACKAGE_ = JPA.PACKAGE_;

	// ********** API **********

	// JPA 2.1 annotations
	Function<IProjectFacetVersion, String> CONVERTER = ver -> PACKAGE_.apply(ver) + "Converter";
		String CONVERTER__AUTO_APPLY = "autoApply";
		
	Function<IProjectFacetVersion, String> NAMED_STORED_PROCEDURE_QUERIES = ver -> PACKAGE_.apply(ver) + "NamedStoredProcedureQueries";
		String NAMED_STORED_PROCEDURE_QUERIES__VALUE = "value";
	Function<IProjectFacetVersion, String> NAMED_STORED_PROCEDURE_QUERY =ver -> PACKAGE_.apply(ver) + "NamedStoredProcedureQuery";
		String NAMED_STORED_PROCEDURE_QUERY__NAME = "name";
		String NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME= "procedureName";
		String NAMED_STORED_PROCEDURE_QUERY__PARAMETERS = "parameters";
		String NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASSES = "resultClasses";
		String NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPINGS= "resultSetMappings";
		String NAMED_STORED_PROCEDURE_QUERY__HINTS = "hints";
	Function<IProjectFacetVersion, String> NAMED_STORED_PROCEDURE_PARAMETER = ver -> PACKAGE_.apply(ver) + "StoredProcedureParameter";
		String NAMED_STORED_PROCEDURE_PARAMETER__NAME = "name";
		String NAMED_STORED_PROCEDURE_PARAMETER__MODE = "mode";
		String NAMED_STORED_PROCEDURE_PARAMETER__TYPE = "type";
		
	// JPA 2.1 enums
	Function<IProjectFacetVersion, String> PARAMETER_MODE = ver -> PACKAGE_.apply(ver) + "ParameterMode";
		Function<IProjectFacetVersion, String> PARAMETER_MODE_ = ver -> PARAMETER_MODE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> PARAMETER_MODE__IN = ver -> PARAMETER_MODE_.apply(ver) + "IN";
		Function<IProjectFacetVersion, String> PARAMETER_MODE__INOUT = ver -> PARAMETER_MODE_.apply(ver) + "INOUT";
		Function<IProjectFacetVersion, String> PARAMETER_MODE__OUT = ver -> PARAMETER_MODE_.apply(ver) + "OUT";
		Function<IProjectFacetVersion, String> PARAMETER_MODE__REF_CURSOR= ver -> PARAMETER_MODE_.apply(ver) + "REF_CURSOR";

}
