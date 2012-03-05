/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal;

@SuppressWarnings("nls")
public interface EclipseLinkJpaValidationMessages {

	public static final String BUNDLE_NAME = "eclipselink_jpa_validation";

	public static final String CACHE_EXPIRY_AND_EXPIRY_TIME_OF_DAY_BOTH_SPECIFIED = "CACHE_EXPIRY_AND_EXPIRY_TIME_OF_DAY_BOTH_SPECIFIED";

	public static final String CONVERTER_CLASS_IMPLEMENTS_CONVERTER = "CONVERTER_CLASS_IMPLEMENTS_CONVERTER";
	
	public static final String STRUCT_CONVERTER_CLASS_IMPLEMENTS_STRUCT_CONVERTER = "STRUCT_CONVERTER_CLASS_IMPLEMENTS_STRUCT_CONVERTER";
	
	public static final String CONVERTER_DUPLICATE_NAME = "CONVERTER_DUPLICATE_NAME";
	
	public static final String CONVERTER_NAME_UNDEFINED = "CONVERTER_NAME_UNDEFINED";
	
	public static final String RESERVED_CONVERTER_NAME = "RESERVED_CONVERTER_NAME";

	public static final String CONVERTER_CLASS_EXISTS = "CONVERTER_CLASS_EXISTS";
	
	public static final String CONVERTER_CLASS_DEFINED = "CONVERTER_CLASS_DEFINED";

	public static final String DESCRIPTOR_CUSTOMIZER_CLASS_NOT_SPECIFIED = "DESCRIPTOR_CUSTOMIZER_CLASS_NOT_SPECIFIED";

	public static final String DESCRIPTOR_CUSTOMIZER_CLASS_NOT_EXIST = "DESCRIPTOR_CUSTOMIZER_CLASS_NOT_EXIST";

	public static final String DESCRIPTOR_CUSTOMIZER_CLASS_NOT_VALID = "DESCRIPTOR_CUSTOMIZER_CLASS_NOT_VALID";

	public static final String DESCRIPTOR_CUSTOMIZER_CLASS_IMPLEMENTS_DESCRIPTOR_CUSTOMIZER = "DESCRIPTOR_CUSTOMIZER_CLASS_IMPLEMENTS_DESCRIPTOR_CUSTOMIZER";
	
	public static final String EXCEPTION_HANDLER_CLASS_NOT_SPECIFIED = "EXCEPTION_HANDLER_CLASS_NOT_SPECIFIED";
	
	public static final String EXCEPTION_HANDLER_CLASS_NOT_EXIST = "EXCEPTION_HANDLER_CLASS_NOT_EXIST";
	
	public static final String EXCEPTION_HANDLER_CLASS_NOT_VALID = "EXCEPTION_HANDLER_CLASS_NOT_VALID";
	
	public static final String EXCEPTION_HANDLER_CLASS_IMPLEMENTS_EXCEPTION_HANDLER = "EXCEPTION_HANDLER_CLASS_IMPLEMENTS_EXCEPTION_HANDLER";
	
	public static final String GENERATOR_DUPLICATE_NAME = "GENERATOR_DUPLICATE_NAME";

	public static final String GENERATOR_IDENTICAL = "GENERATOR_IDENTICAL";

	public static final String ID_MAPPING_UNRESOLVED_CONVERTER_NAME = "ID_MAPPING_UNRESOLVED_CONVERTER_NAME";

	public static final String MULTIPLE_OBJECT_VALUES_FOR_DATA_VALUE = "MULTIPLE_OBJECT_VALUES_FOR_DATA_VALUE";
	
	public static final String PERSISTENT_ATTRIBUTE_INVALID_VERSION_MAPPING_TYPE = "PERSISTENT_ATTRIBUTE_INVALID_VERSION_MAPPING_TYPE";

	public static final String PERSISTENCE_UNIT_LEGACY_DESCRIPTOR_CUSTOMIZER = "PERSISTENCE_UNIT_LEGACY_DESCRIPTOR_CUSTOMIZER";
	
	public static final String PERSISTENCE_UNIT_LEGACY_ENTITY_CACHING = "PERSISTENCE_UNIT_LEGACY_ENTITY_CACHING";

	public static final String PERSISTENCE_UNIT_CACHING_PROPERTY_IGNORED = "PERSISTENCE_UNIT_CACHING_PROPERTY_IGNORED";

	public static final String QUERY_DUPLICATE_NAME = "QUERY_DUPLICATE_NAME";

	public static final String QUERY_IDENTICAL = "QUERY_IDENTICAL";

	public static final String SESSION_CUSTOMIZER_CLASS_NOT_SPECIFIED = "SESSION_CUSTOMIZER_CLASS_NOT_SPECIFIED";
	
	public static final String SESSION_CUSTOMIZER_CLASS_NOT_EXIST = "SESSION_CUSTOMIZER_CLASS_NOT_EXIST";

	public static final String SESSION_CUSTOMIZER_CLASS_NOT_VALID = "SESSION_CUSTOMIZER_CLASS_NOT_VALID";

	public static final String SESSION_CUSTOMIZER_CLASS_IMPLEMENTS_SESSION_CUSTOMIZER = "SESSION_CUSTOMIZER_CLASS_IMPLEMENTS_SESSION_CUSTOMIZER";

	public static final String SESSION_LOGGER_CLASS_NOT_SPECIFIED = "SESSION_LOGGER_CLASS_NOT_SPECIFIED";
	
	public static final String SESSION_LOGGER_CLASS_NOT_EXIST = "SESSION_LOGGER_CLASS_NOT_EXIST";
	
	public static final String SESSION_LOGGER_CLASS_IMPLEMENTS_SESSION_LOG = "SESSION_LOGGER_CLASS_IMPLEMENTS_SESSION_LOG";
	
	public static final String SESSION_PROFILER_CLASS_NOT_SPECIFIED = "SESSION_PROFILER_CLASS_NOT_SPECIFIED";
	
	public static final String SESSION_PROFILER_CLASS_NOT_EXIST = "SESSION_PROFILER_CLASS_NOT_EXIST";
	
	public static final String SESSION_PROFILER_CLASS_NOT_VALID = "SESSION_PROFILER_CLASS_NOT_VALID";
	
	public static final String SESSION_PROFILER_CLASS_IMPLEMENTS_SESSIONP_ROFILER = "SESSION_PROFILER_CLASS_IMPLEMENTS_SESSION_PROFILER";

	public static final String BASIC_COLLECTION_MAPPING_DEPRECATED = "BASIC_COLLECTION_MAPPING_DEPRECATED";
	
	public static final String BASIC_MAP_MAPPING_DEPRECATED = "BASIC_MAP_MAPPING_DEPRECATED";

	public static final String TYPE_MAPPING_MEMBER_CLASS_NOT_STATIC = "TYPE_MAPPING_MEMBER_CLASS_NOT_STATIC";

	public static final String TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME = "TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME = "VIRTUAL_TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_TENANT_DISCRIMINATOR_COLUMN_UNRESOLVED_NAME";
	public static final String TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID = "TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID = "VIRTUAL_TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_TENANT_DISCRIMINATOR_COLUMN_TABLE_NOT_VALID";
	public static final String MULTITENANT_NOT_SPECIFIED_WITH_TENANT_DISCRIMINATOR_COLUMNS = "MULTITENANT_NOT_SPECIFIED_WITH_TENANT_DISCRIMINATOR_COLUMNS";
	public static final String MULTITENANT_METADATA_CANNOT_BE_SPECIFIED_ON_NON_ROOT_ENTITY = "MULTITENANT_METADATA_CANNOT_BE_SPECIFIED_ON_NON_ROOT_ENTITY";
	public static final String MULTITENANT_TABLE_PER_TENANT_NOT_SUPPORTED = "MULTITENANT_TABLE_PER_TENANT_NOT_SUPPORTED";
	public static final String MULTITENANT_VPD_MIGHT_NOT_BE_NOT_SUPPORTED = "MULTITENANT_VPD_MIGHT_NOT_BE_NOT_SUPPORTED";
	public static final String MULTITENANT_VPD_NOT_SUPPORTED_ON_NON_ORACLE_DATABASE_PLATFORM = "MULTITENANT_VPD_NOT_SUPPORTED_ON_NON_ORACLE_DATABASE_PLATFORM";
	public static final String MULTITENANT_VPD_INCLUDE_CRITERIA_WILL_BE_IGNORED = "MULTITENANT_VPD_INCLUDE_CRITERIA_WILL_BE_IGNORED";

	public static final String VIRTUAL_ATTRIBUTE_NO_ATTRIBUTE_TYPE_SPECIFIED = "VIRTUAL_ATTRIBUTE_NO_ATTRIBUTE_TYPE_SPECIFIED";
	public static final String VIRTUAL_ATTRIBUTE_ATTRIBUTE_TYPE_DOES_NOT_EXIST = "VIRTUAL_ATTRIBUTE_ATTRIBUTE_TYPE_DOES_NOT_EXIST";
	public static final String VIRTUAL_TYPE_PARENT_CLASS_DOES_NOT_EXIST = "VIRTUAL_TYPE_PARENT_CLASS_DOES_NOT_EXIST";
}
