/*******************************************************************************
 * Copyright (c) 2009, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa2.resource.java;

import java.util.function.Function;

import org.eclipse.jpt.jpa.core.resource.java.JPA;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * JPA 2.0 Java-related stuff (annotations etc.)
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.3
 */
@SuppressWarnings("nls")
public interface JPA2_0 {

	// JPA package
	Function<IProjectFacetVersion, String> PACKAGE_ = JPA.PACKAGE_;

	// ********** API **********

	// JPA 2.0 annotations
	Function<IProjectFacetVersion, String> ACCESS = ver -> PACKAGE_.apply(ver) + "Access";
		String ACCESS__VALUE = "value";

	// ASSOCIATION_OVERRIDE
		String ASSOCIATION_OVERRIDE__JOIN_TABLE = "joinTable";

	Function<IProjectFacetVersion, String> CACHEABLE = ver -> PACKAGE_.apply(ver) + "Cacheable";
		String CACHEABLE__VALUE = "value";
		
	Function<IProjectFacetVersion, String> CASCADE_TYPE__DETACH = ver -> JPA.CASCADE_TYPE_.apply(ver) + "DETACH";

	Function<IProjectFacetVersion, String> COLLECTION_TABLE = ver -> PACKAGE_.apply(ver) + "CollectionTable";
		String COLLECTION_TABLE__NAME = "name";
		String COLLECTION_TABLE__SCHEMA = "schema";
		String COLLECTION_TABLE__CATALOG = "catalog";
		String COLLECTION_TABLE__JOIN_COLUMNS = "joinColumns";
		String COLLECTION_TABLE__UNIQUE_CONSTRAINTS = "uniqueConstraints";
	
	Function<IProjectFacetVersion, String> ELEMENT_COLLECTION = ver -> PACKAGE_.apply(ver) + "ElementCollection";
		String ELEMENT_COLLECTION__FETCH = "fetch";
		String ELEMENT_COLLECTION__TARGET_CLASS = "targetClass";

	Function<IProjectFacetVersion, String> MAP_KEY_CLASS = ver -> PACKAGE_.apply(ver) + "MapKeyClass";
		String MAP_KEY_CLASS__VALUE = "value";
	
	Function<IProjectFacetVersion, String> MAP_KEY_COLUMN = ver -> PACKAGE_.apply(ver) + "MapKeyColumn";
		String MAP_KEY_COLUMN__NAME = "name";
		String MAP_KEY_COLUMN__UNIQUE = "unique";
		String MAP_KEY_COLUMN__NULLABLE = "nullable";
		String MAP_KEY_COLUMN__INSERTABLE = "insertable";
		String MAP_KEY_COLUMN__UPDATABLE = "updatable";
		String MAP_KEY_COLUMN__COLUMN_DEFINITION = "columnDefinition";
		String MAP_KEY_COLUMN__TABLE = "table";
		String MAP_KEY_COLUMN__LENGTH = "length";
		String MAP_KEY_COLUMN__PRECISION = "precision";
		String MAP_KEY_COLUMN__SCALE = "scale";

	Function<IProjectFacetVersion, String> MAP_KEY_ENUMERATED = ver -> PACKAGE_.apply(ver) + "MapKeyEnumerated";
		String MAP_KEY_ENUMERATED__VALUE = "value";
		
	Function<IProjectFacetVersion, String> MAP_KEY_JOIN_COLUMN = ver -> PACKAGE_.apply(ver) + "MapKeyJoinColumn";
		String MAP_KEY_JOIN_COLUMN__NAME = "name";
		String MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = "referencedColumnName";
		String MAP_KEY_JOIN_COLUMN__UNIQUE = "unique";
		String MAP_KEY_JOIN_COLUMN__NULLABLE = "nullable";
		String MAP_KEY_JOIN_COLUMN__INSERTABLE = "insertable";
		String MAP_KEY_JOIN_COLUMN__UPDATABLE = "updatable";
		String MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION = "columnDefinition";
		String MAP_KEY_JOIN_COLUMN__TABLE = "table";
		
	Function<IProjectFacetVersion, String> MAP_KEY_JOIN_COLUMNS = ver -> PACKAGE_.apply(ver) + "MapKeyJoinColumns";
		String MAP_KEY_JOIN_COLUMNS__VALUE = "value";

	Function<IProjectFacetVersion, String> MAP_KEY_TEMPORAL = ver -> PACKAGE_.apply(ver) + "MapKeyTemporal";
		String MAP_KEY_TEMPORAL__VALUE = "value";

	Function<IProjectFacetVersion, String> MAPS_ID = ver -> PACKAGE_.apply(ver) + "MapsId";
		String MAPS_ID__VALUE = "value";

	// NAMED_QUERY
		String NAMED_QUERY__LOCK_MODE = "lockMode";

	// ONE_TO_MANY
		String ONE_TO_MANY__ORPHAN_REMOVAL = "orphanRemoval";

	// ONE_TO_ONE
		String ONE_TO_ONE__ORPHAN_REMOVAL = "orphanRemoval";

	Function<IProjectFacetVersion, String> ORDER_COLUMN = ver -> PACKAGE_.apply(ver) + "OrderColumn";
		String ORDER_COLUMN__NAME = "name";
		String ORDER_COLUMN__NULLABLE = "nullable";
		String ORDER_COLUMN__INSERTABLE = "insertable";
		String ORDER_COLUMN__UPDATABLE = "updatable";
		String ORDER_COLUMN__COLUMN_DEFINITION = "columnDefinition";

	// SEQUENCE_GENERATOR
		String SEQUENCE_GENERATOR__CATALOG = "catalog";
		String SEQUENCE_GENERATOR__SCHEMA = "schema";


	// JPA 2.0 enums
	Function<IProjectFacetVersion, String> ACCESS_TYPE = ver -> PACKAGE_.apply(ver) + "AccessType";
		Function<IProjectFacetVersion, String> ACCESS_TYPE_ = ver -> ACCESS_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> ACCESS_TYPE__FIELD = ver -> ACCESS_TYPE_.apply(ver) + "FIELD";
		Function<IProjectFacetVersion, String> ACCESS_TYPE__PROPERTY = ver -> ACCESS_TYPE_.apply(ver) + "PROPERTY";

	Function<IProjectFacetVersion, String> LOCK_MODE_TYPE = ver -> PACKAGE_.apply(ver) + "LockModeType";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE_ = ver -> LOCK_MODE_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__READ = ver -> LOCK_MODE_TYPE_.apply(ver) + "READ";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__WRITE = ver -> LOCK_MODE_TYPE_.apply(ver) + "WRITE";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__OPTIMISTIC = ver -> LOCK_MODE_TYPE_.apply(ver) + "OPTIMISTIC";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__OPTIMISTIC_FORCE_INCREMENT = ver -> LOCK_MODE_TYPE_.apply(ver) + "OPTIMISTIC_FORCE_INCREMENT";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__PESSIMISTIC_READ = ver -> LOCK_MODE_TYPE_.apply(ver) + "PESSIMISTIC_READ";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__PESSIMISTIC_WRITE = ver -> LOCK_MODE_TYPE_.apply(ver) + "PESSIMISTIC_WRITE";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__PESSIMISTIC_FORCE_INCREMENT = ver -> LOCK_MODE_TYPE_.apply(ver) + "PESSIMISTIC_FORCE_INCREMENT";
		Function<IProjectFacetVersion, String> LOCK_MODE_TYPE__NONE = ver -> LOCK_MODE_TYPE_.apply(ver) + "NONE";

	// JPA 2.0 metamodel
	Function<IProjectFacetVersion, String> METAMODEL_PACKAGE = ver -> PACKAGE_.apply(ver) + "metamodel";
		Function<IProjectFacetVersion, String> METAMODEL_PACKAGE_ = ver -> METAMODEL_PACKAGE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> STATIC_METAMODEL = ver -> METAMODEL_PACKAGE_.apply(ver) + "StaticMetamodel";
		String STATIC_METAMODEL__VALUE = "value";
		Function<IProjectFacetVersion, String> SINGULAR_ATTRIBUTE = ver -> METAMODEL_PACKAGE_.apply(ver) + "SingularAttribute";
		Function<IProjectFacetVersion, String> COLLECTION_ATTRIBUTE = ver -> METAMODEL_PACKAGE_.apply(ver) + "CollectionAttribute";
		Function<IProjectFacetVersion, String> LIST_ATTRIBUTE = ver -> METAMODEL_PACKAGE_.apply(ver) + "ListAttribute";
		Function<IProjectFacetVersion, String> MAP_ATTRIBUTE = ver -> METAMODEL_PACKAGE_.apply(ver) + "MapAttribute";
		Function<IProjectFacetVersion, String> SET_ATTRIBUTE = ver -> METAMODEL_PACKAGE_.apply(ver) + "SetAttribute";
}
