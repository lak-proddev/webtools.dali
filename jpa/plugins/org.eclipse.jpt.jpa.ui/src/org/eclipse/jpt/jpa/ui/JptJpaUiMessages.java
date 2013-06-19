/*******************************************************************************
 * Copyright (c) 2006, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui;

import org.eclipse.osgi.util.NLS;

/**
 * Localized messages used by Dali JPA UI.
 */
public class JptJpaUiMessages {

	private static final String BUNDLE_NAME = "jpt_jpa_ui"; //$NON-NLS-1$
	private static final Class<?> BUNDLE_CLASS = JptJpaUiMessages.class;
	static {
		NLS.initializeMessages(BUNDLE_NAME, BUNDLE_CLASS);
	}

	public static String ACCESS_TYPE_COMPOSITE_ACCESS;
	public static String ADD_TO_EAR_COMPOSITE_EAR_MEMBER_SHIP;
	public static String ADD_TO_EAR_COMPOSITE_ADD_TO_EAR_LABEL;
	public static String ADD_TO_EAR_COMPOSITE_EAR_PROJECT_LABEL;
	public static String ADD_TO_EAR_COMPOSITE_NEW_BUTTON_LABEL;
	public static String ADD_PERSISTENT_ATTRIBUTE_DIALOG_ATTRIBUTE_LABEL;
	public static String ADD_PERSISTENT_ATTRIBUTE_DIALOG_MAPPING_LABEL;
	public static String ADD_PERSISTENT_ATTRIBUTE_DIALOG_NO_MAPPING_KEY_ERROR;
	public static String ADD_PERSISTENT_ATTRIBUTE_DIALOG_TITLE;
	public static String ADD_PERSISTENT_CLASS_DIALOG_CLASS_DIALOG_MESSAGE;
	public static String ADD_PERSISTENT_CLASS_DIALOG_CLASS_DIALOG_TITLE;
	public static String ADD_PERSISTENT_CLASS_DIALOG_CLASS_LABEL;
	public static String ADD_PERSISTENT_CLASS_DIALOG_CLASS_NOT_FOUND_WARNING;
	public static String ADD_PERSISTENT_CLASS_DIALOG_DUPLICATE_CLASS_WARNING;
	public static String ADD_PERSISTENT_CLASS_DIALOG_MAPPING_LABEL;
	public static String ADD_PERSISTENT_CLASS_DIALOG_NO_CLASS_ERROR;
	public static String ADD_PERSISTENT_CLASS_DIALOG_NO_MAPPING_KEY_ERROR;
	public static String ADD_PERSISTENT_CLASS_DIALOG_TITLE;
	public static String CONVERT_TO_JPA_CONVERTING_PROJECT;
	public static String CONVERT_TO_JPA_DETECTING_TECHNOLOGIES;
	public static String CONVERT_TO_JPA_INSTALLING_JPA_FACET;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_TITLE;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_DESC;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_SCHEMA_SETTINGS;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_ADD_CONNECTION_TO_PROJECT;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_CONNECT_LINK;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_SCHEMA;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_CONNECTION_INFO;
	public static String DATABASE_SCHEMA_WIZARD_PAGE_SCHEMA_INFO;
	public static String OPEN_JPA_RESOURCE_ACTION_OPEN;
	public static String OPEN_JPA_RESOURCE_ACTION_ERROR;
	public static String GENERAL_BROWSE;
	public static String GENERAL_REVERT;
	public static String GENERAL_DESELECT_ALL;
	public static String GENERAL_SELECT_ALL;
	public static String GENERAL_REFRESH;
	public static String GENERATE_DDL_WIZARD_TITLE;
	public static String GENERATE_ENTITIES_WIZARD_GENERATE_ENTITIES;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_CHOOSE_ENTITY_TABLE;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_ENTITY_NAME_COLUMN;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_GENERATE_ENTITIES;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_SYNCHRONIZE_CLASSES;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_TABLE_COLUMN;
	public static String GENERATE_ENTITIES_WIZARD_PAGE_TABLES;
	public static String GENERIC_PLATFORM_UI_DIALOG_NOT_SUPPORTED_MESSAGE_TEXT;
	public static String GENERIC_PLATFORM_UI_DIALOG_NOT_SUPPORTED_MESSAGE_TITLE;
	public static String JPA_CONTENT_LABEL;
	public static String JPA_DETAILS_VIEW_VIEW_NOT_AVAILABLE;
	public static String JPA_FACET_WIZARD_PAGE_ADD_DRIVER_LIBRARY_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_CONNECTION_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_CONNECTION_LINK;
	public static String JPA_FACET_WIZARD_PAGE_CONNECT_LINK;
	public static String JPA_FACET_WIZARD_PAGE_CONNECTED_TEXT;
	public static String JPA_FACET_WIZARD_PAGE_DEFAULT_CATALOG_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_DEFAULT_SCHEMA_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_DESCRIPTION;
	public static String JPA_FACET_WIZARD_PAGE_DISCOVER_CLASSES_BUTTON;
	public static String JPA_FACET_WIZARD_PAGE_DRIVER_LIBRARY_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_FACETS_PAGE_LINK;
	public static String JPA_FACET_WIZARD_PAGE_METAMODEL_SOURCE_FOLDER_LINK;
	public static String JPA_FACET_WIZARD_PAGE_JPA_IMPLEMENTATION_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_JPA_PREFS_LINK;
	public static String JPA_FACET_WIZARD_PAGE_LIST_CLASSES_BUTTON;
	public static String JPA_FACET_WIZARD_PAGE_METAMODEL_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_NONE;
	public static String JPA_FACET_WIZARD_PAGE_OVERRIDE_DEFAULT_CATALOG_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_OVERRIDE_DEFAULT_SCHEMA_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_PERSISTENT_CLASS_MANAGEMENT_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_PLATFORM_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_SPECIFY_LIB_LABEL;
	public static String JPA_FACET_WIZARD_PAGE_TITLE;
	public static String JPA_FACET_WIZARD_PAGE_USER_LIBS_LINK;
	public static String JPA_FACET_WIZARD_PAGE_USER_SERVER_LIB_LABEL;
	public static String JPA_JPQL_HYPERLINK_BUILDER_OPEN_DECLARATION;
	public static String JPA_JPQL_HYPERLINK_BUILDER_OPEN_DECLARED_TYPE;
	public static String JPA_JPQL_JAVA_COMPLETION_PROPOSAL_COMPUTER_ERROR;
	public static String JPA_JPQL_SSE_COMPLETION_PROPOSAL_COMPUTER_ERROR;
	public static String JPA_LIBRARY_PROVIDER_INSTALL_PANEL_INCLUDE_LIBRARIES;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_TITLE;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MESSAGE;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_ANNOTATE_IN_JAVA_RADIO_BUTTON;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_FILE_RADIO_BUTTON;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_FILE_LINK;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_FILE_BROWSE_BUTTON;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_TYPE_TABLE_COLUMN;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_TABLE_COLUMN;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_LIST_IN_PERSISTENCE_XML_CHECK_BOX;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_SELECTED_TYPES_PERSISTENT_ERROR;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_FILE_DOES_NOT_EXIST_ERROR;
	public static String JPA_MAKE_PERSISTENT_WIZARD_PAGE_MAPPING_FILE_NOT_LISTED_IN_PERSISTENCE_XML_ERROR;
	public static String JPA_STRUCTURE_VIEW_LINK_WITH_EDITOR_DESC;
	public static String JPA_STRUCTURE_VIEW_LINK_WITH_EDITOR_TEXT;
	public static String JPA_STRUCTURE_VIEW_LINK_WITH_EDITOR_TOOLTIP;
	public static String JPA_STRUCTURE_VIEW_STRUCTURE_NOT_AVAILABLE;
	public static String JPA_STRUCTURE_VIEW_STRUCTURE_PROVIDER_NOT_AVAILABLE;
	public static String JPA_STRUCTURE_VIEW_NUM_ITEMS_SELECTED;
	public static String JPQL_CONTENT_PROPOSAL_PROVIDER_DESCRIPTION;
	public static String MAPPING_FILE_WIZARD_TITLE;
	public static String MAPPING_FILE_WIZARD_PAGE_NEW_FILE_TITLE;
	public static String MAPPING_FILE_WIZARD_PAGE_newFile_desc;
	public static String MAPPING_FILE_WIZARD_PAGE_OPTIONS_TITLE;
	public static String MAPPING_FILE_WIZARD_PAGE_OPTIONS_DESC;
	public static String MAPPING_FILE_WIZARD_PAGE_PROJECT_LABEL;
	public static String MAPPING_FILE_WIZARD_PAGE_SOURCE_FOLDER_LABEL;
	public static String MAPPING_FILE_WIZARD_PAGE_FILE_PATH_LABEL;
	public static String MAPPING_FILE_WIZARD_PAGE_ACCESS_LABEL;
	public static String MAPPING_FILE_WIZARD_PAGE_ADD_TO_PERSISTENCE_UNIT_BUTTON;
	public static String MAPPING_FILE_WIZARD_PAGE_PERSISTENCE_UNIT_LABEL;
	public static String MAPPING_FILE_WIZARD_PAGE_INCORRECT_SOURCE_FOLDER_ERROR;
	public static String MAPPING_FILE_WIZARD_PAGE_ACCESS_LABEL_SOURCE_FOLDER_DIALOG_TITLE;
	public static String MAPPING_FILE_WIZARD_PAGE_ACCESS_LABEL_SOURCE_FOLDER_DIALOG_DESC;
	public static String JPA_PROJECT_WIZARD_TITLE;
	public static String NEW_JPA_PROJECT_WIZARD_FIRST_PAGE_DESCRIPTION;
	public static String NEW_JPA_PROJECT_WIZARD_FIRST_PAGE_TITLE;
	public static String ORM_ITEM_LABEL_PROVIDER_FACTORY_ENTITY_MAPPINGS_LABEL;
	public static String OVERWRITE_CONFIRMER_DIALOG_TEXT;
	public static String OVERWRITE_CONFIRMER_DIALOG_TITLE;
	public static String PERSISTENCE_ITEM_LABEL_PROVIDER_FACTORY_PERSISTENCE_LABEL;
	public static String ENTITIES_GENERATOR_JOB_NAME;
	public static String JPT_PREFERENCES_PAGE_DO_NOT_SHOW_DIALOGS;
	public static String JPT_PREFERENCES_PAGE_DO_NOT_SHOW_TEXT;
	public static String JPT_PREFERENCES_PAGE_CLEAR_BUTTON_TEXT;
	public static String JPA_PREFERENCES_PAGE_DESCRIPTION;
	public static String JPA_PREFERENCES_PAGE_ENTITY_GEN;
	public static String JPA_PREFERENCES_PAGE_ENTITY_GEN_DEFAULT_PACKAGE_LABEL;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR_DESCRIPTION;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR_LOWER_CASE_RADIO_BUTTON;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR_MATCH_FIRST_CHARACTER_CASE_RADIO_BUTTON;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR_TEXT_AREA_NUMBER_OF_LINES;
	public static String JPA_PREFERENCES_PAGE_JPQL_EDITOR_UPPER_CASE_RADIO_BUTTON;
	public static String JPA_PROBLEM_SEVERITIES_PAGE_DESCRIPTION;
	public static String JPA_ENTITY_GEN_PREFERENCE_PAGE_DESCRIPTION;
	public static String JPA_ENTITY_GEN_PREFERENCE_PAGE_GENERAL_GROUP_TITLE;
	public static String JPA_ENTITY_GEN_PREFERENCE_PAGE_DEFAULT_PACKAGE_LABEL;

	public static String SELECT_JPA_PROJECT_WIZARD_PAGE_TITLE;
	public static String SELECT_JPA_PROJECT_WIZARD_PAGE_MSG;

	public static String SELECT_MAPPING_FILE_DIALOG_TITLE;
	public static String SELECT_MAPPING_FILE_DIALOG_MESSAGE;
	public static String SELECT_MAPPING_FILE_DIALOG_NEW_BUTTON;
	public static String SELECT_MAPPING_FILE_DIALOG_NEW_BUTTON_TOOL_TIP;

	public static String SYNCHRONIZING_CLASSES_TASK_NAME;

	public static String JAVA_METADATA_CONVERSION_WIZARD_TITLE;
	public static String JAVA_METADATA_CONVERSION_WARNING;
	public static String JAVA_METADATA_CONVERSION_MAPPING_FILE_DOES_NOT_EXIST;
	public static String JAVA_METADATA_CONVERSION_MAPPING_FILE_VERSION_IS_INVALID;
	public static String JAVA_METADATA_CONVERSION_MAPPING_FILE_NOT_LISTED_IN_PERSISTENCE_XML;
	public static String JAVA_METADATA_CONVERSION_NO_GENERATORS_TO_CONVERT;
	public static String JAVA_METADATA_CONVERSION_NO_QUERIES_TO_CONVERT;
	public static String JAVA_METADATA_CONVERSION_WIZARD_PAGE_MAPPING_FILE_BROWSE_BUTTON;
	public static String JAVA_METADATA_CONVERSION_WIZARD_PAGE_MAPPING_FILE_BROWSE_BUTTON_TOOL_TIP;
	public static String JAVA_METADATA_CONVERSION_WIZARD_PAGE_LABEL;
	public static String JAVA_METADATA_CONVERSION_WIZARD_PAGE_NEW_MAPPING_FILE_LINK;
	public static String JAVA_METADATA_CONVERSION_WIZARD_PAGE_NEW_MAPPING_FILE_LINK_TOOL_TIP;
	public static String JAVA_GENERATOR_CONVERSION_WIZARD_PAGE_TITLE;
	public static String JAVA_GENERATOR_CONVERSION_WIZARD_PAGE_DESCRIPTION;
	public static String JAVA_QUERY_CONVERSION_WIZARD_PAGE_TITLE;
	public static String JAVA_QUERY_CONVERSION_WIZARD_PAGE_DESCRIPTION;

	public static String SET_JPA_SELECTION_JOB_NAME;

	public static String JPA_XML_COMPLETION_PROPOSAL_COMPUTER_SPECIAL_NAME_MSG;

	public static String JPA_PLATFORM_UI_MISSING_JPA_PLATFORM;

	public static String JPA_XML_EDITOR_PAGE_HELP;
	public static String JPA_XML_EDITOR_SOURCE_PAGE;

	private JptJpaUiMessages() {
		throw new UnsupportedOperationException();
	}
}
