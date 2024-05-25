/*******************************************************************************
 * Copyright (c) 2006, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.resource.java;

import java.util.function.Function;

import org.eclipse.jpt.jpa.core.JpaProject;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * JPA Java-related stuff (annotations etc.)
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.0
 */
@SuppressWarnings("nls")
public interface JPA {

	// JPA package
	Function<IProjectFacetVersion, String> PACKAGE = version -> JpaProject.isAboveJpa30(version) ? "jakarta.persistence"
			: "javax.persistence";
	Function<IProjectFacetVersion, String> PACKAGE_ = version -> PACKAGE.apply(version) + '.';

	// ********** API **********

	// JPA annotations
	Function<IProjectFacetVersion, String> ASSOCIATION_OVERRIDE = ver -> PACKAGE_.apply(ver) + "AssociationOverride";
		String ASSOCIATION_OVERRIDE__NAME = "name";
		String ASSOCIATION_OVERRIDE__JOIN_COLUMNS = "joinColumns";
	Function<IProjectFacetVersion, String> ASSOCIATION_OVERRIDES = ver -> PACKAGE_.apply(ver) + "AssociationOverrides";
		String ASSOCIATION_OVERRIDES__VALUE = "value";
	Function<IProjectFacetVersion, String> ATTRIBUTE_OVERRIDE = ver -> PACKAGE_.apply(ver) + "AttributeOverride";
		String ATTRIBUTE_OVERRIDE__NAME = "name";
		String ATTRIBUTE_OVERRIDE__COLUMN = "column";
	Function<IProjectFacetVersion, String> ATTRIBUTE_OVERRIDES = ver -> PACKAGE_.apply(ver) + "AttributeOverrides";
		String ATTRIBUTE_OVERRIDES__VALUE = "value";
	Function<IProjectFacetVersion, String> BASIC = ver -> PACKAGE_.apply(ver) + "Basic";
		String BASIC__FETCH = "fetch";
		String BASIC__OPTIONAL = "optional";
	Function<IProjectFacetVersion, String> COLUMN = ver -> PACKAGE_.apply(ver) + "Column";
		String COLUMN__NAME = "name";
		String COLUMN__UNIQUE = "unique";
		String COLUMN__NULLABLE = "nullable";
		String COLUMN__INSERTABLE = "insertable";
		String COLUMN__UPDATABLE = "updatable";
		String COLUMN__COLUMN_DEFINITION = "columnDefinition";
		String COLUMN__TABLE = "table";
		String COLUMN__LENGTH = "length";
		String COLUMN__PRECISION = "precision";
		String COLUMN__SCALE = "scale";
	Function<IProjectFacetVersion, String> COLUMN_RESULT = ver -> PACKAGE_.apply(ver) + "ColumnResult";
		String COLUMN_RESULT__NAME = "name";
	Function<IProjectFacetVersion, String> DISCRIMINATOR_COLUMN = ver -> PACKAGE_.apply(ver) + "DiscriminatorColumn";
		String DISCRIMINATOR_COLUMN__NAME = "name";
		String DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = "discriminatorType";
		String DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = "columnDefinition";
		String DISCRIMINATOR_COLUMN__LENGTH = "length";
	Function<IProjectFacetVersion, String> DISCRIMINATOR_VALUE = ver -> PACKAGE_.apply(ver) + "DiscriminatorValue";
		String DISCRIMINATOR_VALUE__VALUE = "value";
	Function<IProjectFacetVersion, String> EMBEDDABLE = ver -> PACKAGE_.apply(ver) + "Embeddable";
	Function<IProjectFacetVersion, String> EMBEDDED = ver -> PACKAGE_.apply(ver) + "Embedded";
	Function<IProjectFacetVersion, String> EMBEDDED_ID = ver -> PACKAGE_.apply(ver) + "EmbeddedId";
	Function<IProjectFacetVersion, String> ENTITY = ver -> PACKAGE_.apply(ver) + "Entity";
		String ENTITY__NAME = "name";
	Function<IProjectFacetVersion, String> ENTITY_LISTENERS = ver -> PACKAGE_.apply(ver) + "EntityListeners";
		String ENTITY_LISTENERS__VALUE = "value";
	Function<IProjectFacetVersion, String> ENTITY_RESULT = ver -> PACKAGE_.apply(ver) + "EntityResult";
		String ENTITY_RESULT__ENTITY_CLASS = "entityClass";
		String ENTITY_RESULT__FIELDS = "fields";
		String ENTITY_RESULT__DISCRIMINATOR_COLUMN = "discriminatorColumn";
	Function<IProjectFacetVersion, String> ENUMERATED = ver -> PACKAGE_.apply(ver) + "Enumerated";
		String ENUMERATED__VALUE = "value";
	Function<IProjectFacetVersion, String> EXCLUDE_DEFAULT_LISTENERS = ver -> PACKAGE_.apply(ver) + "ExcludeDefaultListeners";
	Function<IProjectFacetVersion, String> EXCLUDE_SUPERCLASS_LISTENERS = ver -> PACKAGE_.apply(ver) + "ExcludeSuperclassListeners";
	Function<IProjectFacetVersion, String> FIELD_RESULT = ver -> PACKAGE_.apply(ver) + "FieldResult";
		String FIELD_RESULT__NAME = "name";
		String FIELD_RESULT__COLUMN = "column";
	Function<IProjectFacetVersion, String> FLUSH_MODE = ver -> PACKAGE_.apply(ver) + "FlushMode";
		String FLUSH_MODE__VALUE = "value";
	Function<IProjectFacetVersion, String> GENERATED_VALUE = ver -> PACKAGE_.apply(ver) + "GeneratedValue";
		String GENERATED_VALUE__STRATEGY = "strategy";
		String GENERATED_VALUE__GENERATOR = "generator";
	Function<IProjectFacetVersion, String> ID = ver -> PACKAGE_.apply(ver) + "Id";
	Function<IProjectFacetVersion, String> ID_CLASS = ver -> PACKAGE_.apply(ver) + "IdClass";
		String ID_CLASS__VALUE = "value";
	Function<IProjectFacetVersion, String> INHERITANCE = ver -> PACKAGE_.apply(ver) + "Inheritance";
		String INHERITANCE__STRATEGY = "strategy";
	Function<IProjectFacetVersion, String> JOIN_COLUMN = ver -> PACKAGE_.apply(ver) + "JoinColumn";
		String JOIN_COLUMN__NAME = "name";
		String JOIN_COLUMN__REFERENCED_COLUMN_NAME = "referencedColumnName";
		String JOIN_COLUMN__UNIQUE = "unique";
		String JOIN_COLUMN__NULLABLE = "nullable";
		String JOIN_COLUMN__INSERTABLE = "insertable";
		String JOIN_COLUMN__UPDATABLE = "updatable";
		String JOIN_COLUMN__COLUMN_DEFINITION = "columnDefinition";
		String JOIN_COLUMN__TABLE = "table";
	Function<IProjectFacetVersion, String> JOIN_COLUMNS = ver -> PACKAGE_.apply(ver) + "JoinColumns";
		String JOIN_COLUMNS__VALUE = "value";
	Function<IProjectFacetVersion, String> JOIN_TABLE = ver -> PACKAGE_.apply(ver) + "JoinTable";
		String JOIN_TABLE__NAME = "name";
		String JOIN_TABLE__CATALOG = "catalog";
		String JOIN_TABLE__SCHEMA = "schema";
		String JOIN_TABLE__JOIN_COLUMNS = "joinColumns";
		String JOIN_TABLE__INVERSE_JOIN_COLUMNS = "inverseJoinColumns";
		String JOIN_TABLE__UNIQUE_CONSTRAINTS = "uniqueConstraints";
	Function<IProjectFacetVersion, String> LOB = ver -> PACKAGE_.apply(ver) + "Lob";
	Function<IProjectFacetVersion, String> MANY_TO_MANY = ver -> PACKAGE_.apply(ver) + "ManyToMany";
		String MANY_TO_MANY__TARGET_ENTITY = "targetEntity";
		String MANY_TO_MANY__CASCADE = "cascade";
		String MANY_TO_MANY__FETCH = "fetch";
		String MANY_TO_MANY__MAPPED_BY = "mappedBy";
	Function<IProjectFacetVersion, String> MANY_TO_ONE = ver -> PACKAGE_.apply(ver) + "ManyToOne";
		String MANY_TO_ONE__TARGET_ENTITY = "targetEntity";
		String MANY_TO_ONE__CASCADE = "cascade";
		String MANY_TO_ONE__FETCH = "fetch";
		String MANY_TO_ONE__OPTIONAL = "optional";
	Function<IProjectFacetVersion, String> MAP_KEY = ver -> PACKAGE_.apply(ver) + "MapKey";
		String MAP_KEY__NAME = "name";
	Function<IProjectFacetVersion, String> MAPPED_SUPERCLASS = ver -> PACKAGE_.apply(ver) + "MappedSuperclass";
	Function<IProjectFacetVersion, String> NAMED_NATIVE_QUERIES = ver -> PACKAGE_.apply(ver) + "NamedNativeQueries";
		String NAMED_NATIVE_QUERIES__VALUE = "value";
	Function<IProjectFacetVersion, String> NAMED_NATIVE_QUERY = ver -> PACKAGE_.apply(ver) + "NamedNativeQuery";
		String NAMED_NATIVE_QUERY__NAME = "name";
		String NAMED_NATIVE_QUERY__QUERY = "query";
		String NAMED_NATIVE_QUERY__HINTS = "hints";
		String NAMED_NATIVE_QUERY__RESULT_CLASS = "resultClass";
		String NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = "resultSetMapping";
	Function<IProjectFacetVersion, String> NAMED_QUERIES = ver -> PACKAGE_.apply(ver) + "NamedQueries";
		String NAMED_QUERIES__VALUE = "value";
	Function<IProjectFacetVersion, String> NAMED_QUERY = ver -> PACKAGE_.apply(ver) + "NamedQuery";
		String NAMED_QUERY__NAME = "name";
		String NAMED_QUERY__QUERY = "query";
		String NAMED_QUERY__HINTS = "hints";
	Function<IProjectFacetVersion, String> ONE_TO_MANY = ver -> PACKAGE_.apply(ver) + "OneToMany";
		String ONE_TO_MANY__TARGET_ENTITY = "targetEntity";
		String ONE_TO_MANY__CASCADE = "cascade";
		String ONE_TO_MANY__FETCH = "fetch";
		String ONE_TO_MANY__MAPPED_BY = "mappedBy";
	Function<IProjectFacetVersion, String> ONE_TO_ONE = ver -> PACKAGE_.apply(ver) + "OneToOne";
		String ONE_TO_ONE__TARGET_ENTITY = "targetEntity";
		String ONE_TO_ONE__CASCADE = "cascade";
		String ONE_TO_ONE__FETCH = "fetch";
		String ONE_TO_ONE__OPTIONAL = "optional";
		String ONE_TO_ONE__MAPPED_BY = "mappedBy";
	Function<IProjectFacetVersion, String> ORDER_BY = ver -> PACKAGE_.apply(ver) + "OrderBy";
		String ORDER_BY__VALUE = "value";
	Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXT = ver -> PACKAGE_.apply(ver) + "PersistenceContext";
		String PERSISTENCE_CONTEXT__NAME = "name";
		String PERSISTENCE_CONTEXT__UNIT_NAME = "unitName";
		String PERSISTENCE_CONTEXT__TYPE = "type";
	Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXTS = ver -> PACKAGE_.apply(ver) + "PersistenceContexts";
		String PERSISTENCE_CONTEXTS__VALUE = "value";
	Function<IProjectFacetVersion, String> PERSISTENCE_UNIT = ver -> PACKAGE_.apply(ver) + "XmlPersistenceUnit";
		String PERSISTENCE_UNIT__NAME = "name";
		String PERSISTENCE_UNIT__UNIT_NAME = "unitName";
	Function<IProjectFacetVersion, String> PERSISTENCE_UNITS = ver -> PACKAGE_.apply(ver) + "PersistenceUnits";
		String PERSISTENCE_UNITS__VALUE = "value";
	Function<IProjectFacetVersion, String> POST_LOAD = ver -> PACKAGE_.apply(ver) + "PostLoad";
	Function<IProjectFacetVersion, String> POST_PERSIST = ver -> PACKAGE_.apply(ver) + "PostPersist";
	Function<IProjectFacetVersion, String> POST_REMOVE = ver -> PACKAGE_.apply(ver) + "PostRemove";
	Function<IProjectFacetVersion, String> POST_UPDATE = ver -> PACKAGE_.apply(ver) + "PostUpdate";
	Function<IProjectFacetVersion, String> PRE_PERSIST = ver -> PACKAGE_.apply(ver) + "PrePersist";
	Function<IProjectFacetVersion, String> PRE_REMOVE = ver -> PACKAGE_.apply(ver) + "PreRemove";
	Function<IProjectFacetVersion, String> PRE_UPDATE = ver -> PACKAGE_.apply(ver) + "PreUpdate";
	Function<IProjectFacetVersion, String> PRIMARY_KEY_JOIN_COLUMN = ver -> PACKAGE_.apply(ver) + "PrimaryKeyJoinColumn";
		String PRIMARY_KEY_JOIN_COLUMN__NAME = "name";
		String PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = "referencedColumnName";
		String PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = "columnDefinition";
	Function<IProjectFacetVersion, String> PRIMARY_KEY_JOIN_COLUMNS = ver -> PACKAGE_.apply(ver) + "PrimaryKeyJoinColumns";
		String PRIMARY_KEY_JOIN_COLUMNS__VALUE = "value";
	Function<IProjectFacetVersion, String> QUERY_HINT = ver -> PACKAGE_.apply(ver) + "QueryHint";
		String QUERY_HINT__NAME = "name";
		String QUERY_HINT__VALUE = "value";
	Function<IProjectFacetVersion, String> SECONDARY_TABLE = ver -> PACKAGE_.apply(ver) + "SecondaryTable";
		String SECONDARY_TABLE__NAME = "name";
		String SECONDARY_TABLE__CATALOG = "catalog";
		String SECONDARY_TABLE__SCHEMA = "schema";
		String SECONDARY_TABLE__PK_JOIN_COLUMNS = "pkJoinColumns";
		String SECONDARY_TABLE__UNIQUE_CONSTRAINTS = "uniqueConstraints";
	Function<IProjectFacetVersion, String> SECONDARY_TABLES = ver -> PACKAGE_.apply(ver) + "SecondaryTables";
		String SECONDARY_TABLES__VALUE = "value";
	Function<IProjectFacetVersion, String> SEQUENCE_GENERATOR = ver -> PACKAGE_.apply(ver) + "SequenceGenerator";
		String SEQUENCE_GENERATOR__NAME = "name";
		String SEQUENCE_GENERATOR__SEQUENCE_NAME = "sequenceName";
		String SEQUENCE_GENERATOR__INITIAL_VALUE = "initialValue";
		String SEQUENCE_GENERATOR__ALLOCATION_SIZE = "allocationSize";
	Function<IProjectFacetVersion, String> SQL_RESULT_SET_MAPPING = ver -> PACKAGE_.apply(ver) + "SqlResultSetMapping";
		String SQL_RESULT_SET_MAPPING__NAME = "name";
		String SQL_RESULT_SET_MAPPING__ENTITIES = "entities";
		String SQL_RESULT_SET_MAPPING__COLUMNS = "columns";
	Function<IProjectFacetVersion, String> TABLE = ver -> PACKAGE_.apply(ver) + "Table";
		String TABLE__NAME = "name";
		String TABLE__CATALOG = "catalog";
		String TABLE__SCHEMA = "schema";
		String TABLE__UNIQUE_CONSTRAINTS = "uniqueConstraints";
	Function<IProjectFacetVersion, String> TABLE_GENERATOR = ver -> PACKAGE_.apply(ver) + "TableGenerator";
		String TABLE_GENERATOR__NAME = "name";
		String TABLE_GENERATOR__TABLE = "table";
		String TABLE_GENERATOR__CATALOG = "catalog";
		String TABLE_GENERATOR__SCHEMA = "schema";
		String TABLE_GENERATOR__PK_COLUMN_NAME = "pkColumnName";
		String TABLE_GENERATOR__VALUE_COLUMN_NAME = "valueColumnName";
		String TABLE_GENERATOR__PK_COLUMN_VALUE = "pkColumnValue";
		String TABLE_GENERATOR__INITIAL_VALUE = "initialValue";
		String TABLE_GENERATOR__ALLOCATION_SIZE = "allocationSize";
		String TABLE_GENERATOR__UNIQUE_CONSTRAINTS = "uniqueConstraints";
	Function<IProjectFacetVersion, String> TEMPORAL = ver -> PACKAGE_.apply(ver) + "Temporal";
		String TEMPORAL__VALUE = "value";
	Function<IProjectFacetVersion, String> TRANSIENT = ver -> PACKAGE_.apply(ver) + "Transient";
	Function<IProjectFacetVersion, String> UNIQUE_CONSTRAINT = ver -> PACKAGE_.apply(ver) + "UniqueConstraint";
		String UNIQUE_CONSTRAINT__COLUMN_NAMES = "columnNames";
	Function<IProjectFacetVersion, String> VERSION = ver -> PACKAGE_.apply(ver) + "Version";

	// JPA enums
	Function<IProjectFacetVersion, String> CASCADE_TYPE = ver -> PACKAGE_.apply(ver) + "CascadeType";
		Function<IProjectFacetVersion, String> CASCADE_TYPE_ = ver -> CASCADE_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> CASCADE_TYPE__ALL = ver -> CASCADE_TYPE_.apply(ver) + "ALL";
		Function<IProjectFacetVersion, String> CASCADE_TYPE__MERGE = ver -> CASCADE_TYPE_.apply(ver) + "MERGE";
		Function<IProjectFacetVersion, String> CASCADE_TYPE__PERSIST = ver -> CASCADE_TYPE_.apply(ver) + "PERSIST";
		Function<IProjectFacetVersion, String> CASCADE_TYPE__REFRESH = ver -> CASCADE_TYPE_.apply(ver) + "REFRESH";
		Function<IProjectFacetVersion, String> CASCADE_TYPE__REMOVE = ver -> CASCADE_TYPE_.apply(ver) + "REMOVE";

	Function<IProjectFacetVersion, String> DISCRIMINATOR_TYPE = ver -> PACKAGE_.apply(ver) + "DiscriminatorType";
		Function<IProjectFacetVersion, String> DISCRIMINATOR_TYPE_ = ver -> DISCRIMINATOR_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> DISCRIMINATOR_TYPE__CHAR = ver -> DISCRIMINATOR_TYPE_.apply(ver) + "CHAR";
		Function<IProjectFacetVersion, String> DISCRIMINATOR_TYPE__INTEGER = ver -> DISCRIMINATOR_TYPE_.apply(ver) + "INTEGER";
		Function<IProjectFacetVersion, String> DISCRIMINATOR_TYPE__STRING = ver -> DISCRIMINATOR_TYPE_.apply(ver) + "STRING";

	Function<IProjectFacetVersion, String> ENUM_TYPE = ver -> PACKAGE_.apply(ver) + "EnumType";
		Function<IProjectFacetVersion, String> ENUM_TYPE_ = ver -> ENUM_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> ENUM_TYPE__ORDINAL = ver -> ENUM_TYPE_.apply(ver) + "ORDINAL";
		Function<IProjectFacetVersion, String> ENUM_TYPE__STRING = ver -> ENUM_TYPE_.apply(ver) + "STRING";

	Function<IProjectFacetVersion, String> FETCH_TYPE = ver -> PACKAGE_.apply(ver) + "FetchType";
		Function<IProjectFacetVersion, String> FETCH_TYPE_ = ver -> FETCH_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> FETCH_TYPE__EAGER = ver -> FETCH_TYPE_.apply(ver) + "EAGER";
		Function<IProjectFacetVersion, String> FETCH_TYPE__LAZY = ver -> FETCH_TYPE_.apply(ver) + "LAZY";

	Function<IProjectFacetVersion, String> FLUSH_MODE_TYPE = ver -> PACKAGE_.apply(ver) + "FlushModeType";
		Function<IProjectFacetVersion, String> FLUSH_MODE_TYPE_ = ver -> FLUSH_MODE_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> FLUSH_MODE_TYPE__AUTO = ver -> FLUSH_MODE_TYPE_.apply(ver) + "AUTO";
		Function<IProjectFacetVersion, String> FLUSH_MODE_TYPE__COMMIT = ver -> FLUSH_MODE_TYPE_.apply(ver) + "COMMIT";

	Function<IProjectFacetVersion, String> GENERATION_TYPE = ver -> PACKAGE_.apply(ver) + "GenerationType";
		Function<IProjectFacetVersion, String> GENERATION_TYPE_ = ver -> GENERATION_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> GENERATION_TYPE__AUTO = ver -> GENERATION_TYPE_.apply(ver) + "AUTO";
		Function<IProjectFacetVersion, String> GENERATION_TYPE__IDENTITY = ver -> GENERATION_TYPE_.apply(ver) + "IDENTITY";
		Function<IProjectFacetVersion, String> GENERATION_TYPE__SEQUENCE = ver -> GENERATION_TYPE_.apply(ver) + "SEQUENCE";
		Function<IProjectFacetVersion, String> GENERATION_TYPE__TABLE = ver -> GENERATION_TYPE_.apply(ver) + "TABLE";

	Function<IProjectFacetVersion, String> INHERITANCE_TYPE = ver -> PACKAGE_.apply(ver) + "InheritanceType";
		Function<IProjectFacetVersion, String> INHERITANCE_TYPE_ = ver -> INHERITANCE_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> INHERITANCE_TYPE__JOINED = ver -> INHERITANCE_TYPE_.apply(ver) + "JOINED";
		Function<IProjectFacetVersion, String> INHERITANCE_TYPE__SINGLE_TABLE = ver -> INHERITANCE_TYPE_.apply(ver) + "SINGLE_TABLE";
		Function<IProjectFacetVersion, String> INHERITANCE_TYPE__TABLE_PER_CLASS = ver -> INHERITANCE_TYPE_.apply(ver) + "TABLE_PER_CLASS";

	Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXT_TYPE = ver -> PACKAGE_.apply(ver) + "PersistenceContextType";
		Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXT_TYPE_ = ver -> PERSISTENCE_CONTEXT_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXT_TYPE__EXTENDED = ver -> PERSISTENCE_CONTEXT_TYPE_.apply(ver) + "EXTENDED";
		Function<IProjectFacetVersion, String> PERSISTENCE_CONTEXT_TYPE__TRANSACTION = ver -> PERSISTENCE_CONTEXT_TYPE_.apply(ver) + "TRANSACTION";

	Function<IProjectFacetVersion, String> TEMPORAL_TYPE = ver -> PACKAGE_.apply(ver) + "TemporalType";
		Function<IProjectFacetVersion, String> TEMPORAL_TYPE_ = ver -> TEMPORAL_TYPE.apply(ver) + '.';
		Function<IProjectFacetVersion, String> TEMPORAL_TYPE__DATE = ver -> TEMPORAL_TYPE_.apply(ver) + "DATE";
		Function<IProjectFacetVersion, String> TEMPORAL_TYPE__TIME = ver -> TEMPORAL_TYPE_.apply(ver) + "TIME";
		Function<IProjectFacetVersion, String> TEMPORAL_TYPE__TIMESTAMP = ver -> TEMPORAL_TYPE_.apply(ver) + "TIMESTAMP";

	// JPA interfaces
	Function<IProjectFacetVersion, String> ENTITY_MANAGER = ver -> PACKAGE_.apply(ver) + "EntityManager";
	Function<IProjectFacetVersion, String> ENTITY_MANAGER_FACTORY = ver -> PACKAGE_.apply(ver) + "EntityManagerFactory";
	Function<IProjectFacetVersion, String> ENTITY_TRANSACTION = ver -> PACKAGE_.apply(ver) + "EntityTransaction";
	Function<IProjectFacetVersion, String> INSTRUMENTABLE_CLASS_LOADER = ver -> PACKAGE_.apply(ver) + "InstrumentableClassLoader";
	Function<IProjectFacetVersion, String> QUERY = ver -> PACKAGE_.apply(ver) + "Query";

	// JPA classes
	Function<IProjectFacetVersion, String> PERSISTENCE = ver -> PACKAGE_.apply(ver) + "XmlPersistence";

	// JPA exceptions
	Function<IProjectFacetVersion, String> NON_UNIQUE_RESULT_EXCEPTION = ver -> PACKAGE_.apply(ver) + "NonUniqueResultException";
	Function<IProjectFacetVersion, String> OBJECT_NOT_FOUND_EXCEPTION = ver -> PACKAGE_.apply(ver) + "ObjectNotFoundException";
	Function<IProjectFacetVersion, String> PERSISTENCE_EXCEPTION = ver -> PACKAGE_.apply(ver) + "PersistenceException";


	// ********** SPI **********

	// JPA SPI package
	Function<IProjectFacetVersion, String> SPI_PACKAGE = ver -> PACKAGE_.apply(ver) + "spi";
	Function<IProjectFacetVersion, String> SPI_PACKAGE_ = ver -> SPI_PACKAGE.apply(ver) + '.';

	// JPA SPI interfaces
	Function<IProjectFacetVersion, String> ENTITY_MANAGER_FACTORY_PROVIDER = ver -> SPI_PACKAGE.apply(ver) + "EntityManagerFactoryProvider";
	Function<IProjectFacetVersion, String> PERSISTENCE_INFO = ver -> SPI_PACKAGE.apply(ver) + "PersistenceInfo";
	Function<IProjectFacetVersion, String> PERSISTENCE_PROVIDER = ver -> SPI_PACKAGE.apply(ver) + "PersistenceProvider";

}
