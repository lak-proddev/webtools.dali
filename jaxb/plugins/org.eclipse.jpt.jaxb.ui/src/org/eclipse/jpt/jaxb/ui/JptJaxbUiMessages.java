/*******************************************************************************
 * Copyright (c) 2010, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jaxb.ui;

import org.eclipse.osgi.util.NLS;

/**
 * Localized messages used by Dali JAXB UI.
 */
public class JptJaxbUiMessages {

	private static final String BUNDLE_NAME = "jpt_jaxb_ui"; //$NON-NLS-1$
	private static final Class<?> BUNDLE_CLASS = JptJaxbUiMessages.class;
	static {
		NLS.initializeMessages(BUNDLE_NAME, BUNDLE_CLASS);
	}
	
	public static String ADD_SCHEMA_TO_LIBRARY_JOB__NAME;
	
	public static String JAVA_PROJECT_WIZARD_PAGE_PROJECT;
	public static String JAVA_PROJECT_WIZARD_PAGE_DESTINATION_PROJECT;
	
	// ClassesGenerator
	public static String CLASSES_GENERATOR_PROJECT_WIZARD_PAGE_TITLE;
	public static String CLASSES_GENERATOR_PROJECT_WIZARD_PAGE_DESC;
	
	public static String CLASSES_GENERATOR_WIZARD_TITLE;
	public static String CLASSES_GENERATOR_WIZARD_ERROR_DIALOG_TITLE;
	public static String CLASSES_GENERATOR_WIZARD_COULD_NOT_CREATE;
	
	public static String ERROR_OPENING_EDITOR;
	
	public static String JAXB_CONTENT_LABEL;
	
	public static String SCHEMAS_PAGE_DESCRIPTION;
	public static String SCHEMAS_PAGE_REVERT;
	public static String SCHEMAS_PAGE_SCHEMAS;
	public static String SCHEMAS_PAGE_NAMESPACE_COLUMN_LABEL;
	public static String SCHEMAS_PAGE_LOCATION_COLUMN_LABEL;
	public static String SCHEMAS_PAGE_ADD_BUTTON_LABEL;
	public static String SCHEMAS_PAGE_EDIT_BUTTON_LABEL;
	public static String SCHEMAS_PAGE_REMOVE_BUTTON_LABEL;
	public static String SCHEMAS_PAGE_ADD_SCHEMA_MESSAGE;
	public static String SCHEMAS_PAGE_EDIT_SCHEMA_MESSAGE;
	public static String SCHEMAS_PAGE_ADD_SCHEMA_DIALOG_TITLE;
	public static String SCHEMAS_PAGE_EDIT_SCHEMA_DIALOG_TITLE;
	public static String SCHEMAS_PAGE_ADD_SCHEMA_TITLE;
	public static String SCHEMAS_PAGE_EDIT_SCHEMA_TITLE;
	public static String SCHEMAS_PAGE_LOCATION_LABEL;
	public static String SCHEMAS_PAGE_BROWSE_BUTTON_LABEL;
	public static String SCHEMAS_PAGE_NAMESPACE_LABEL;
	public static String SCHEMAS_PAGE_NO_NAMESPACE_TEXT;
	public static String SCHEMAS_PAGE_SCHEMA_UNRESOLVED_MESSAGE;
	public static String SCHEMAS_PAGE_DUPLICATE_NAMESPACE_MESSAGE;
	public static String SCHEMAS_PAGE_NO_LOCATION_MESSAGE;
	public static String SCHEMAS_PAGE_CHOOSE_LOCATION_TITLE;
	
	public static String SCHEMA_WIZARD_PAGE_TITLE;
	public static String SCHEMA_WIZARD_PAGE_DESC;
	
	public static String SCHEMA_WIZARD_PAGE_XML_CATALOG_TABLE_TITLE; 
	public static String SCHEMA_WIZARD_PAGE_XML_CATALOG_KEY_COLUMN; 
	public static String SCHEMA_WIZARD_PAGE_XML_CATALOG_URI_COLUMN; 

	public static String SCHEMA_WIZARD_PAGE_ERROR_URI_CANNOT_BE_LOCATED;

	public static String SELECT_FILE_OR_XML_CATALOG_ID_PANEL_FILE_FROM_WORKSPACE;
	public static String SELECT_FILE_OR_XML_CATALOG_ID_PANEL_XML_CATALOG_ENTRY;
	public static String SELECT_FILE_OR_XML_CATALOG_ID_PANEL_IMPORT_BUTTON;

	public static String CLASSES_GENERATOR_WIZARD_PAGE_TITLE;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_DESC;
	
	public static String CLASSES_GENERATOR_WIZARD_PAGE_USES_MOXY_IMPLEMENTATION;
	
	public static String CLASSES_GENERATOR_WIZARD_PAGE_CATALOG;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_BINDINGS_FILES;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_BROWSE_BUTTON;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_ADD_BUTTON;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_REMOVE_BUTTON;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_CHOOSE_A_BINDINGS_FILE;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_CHOOSE_A_CATALOG;

	public static String CLASSES_GENERATOR_WIZARD_PAGE_SOURCE_FOLDER_SELECTION_DIALOG_TITLE;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_CHOOSE_SOURCE_FOLDER_DIALOG_DESC;

	public static String CLASSES_GENERATOR_WIZARD_PAGE_JAXB_LIBRARIES_NOT_AVAILABLE;
	public static String CLASSES_GENERATOR_WIZARD_PAGE_MOXY_LIBRARIES_NOT_AVAILABLE;

	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TITLE;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_DESC;

	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_PROXY_GROUP;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_NO_PROXY;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_PROXY;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_PROXY_FILE;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_CHOOSE_A_PROXY_FILE;
	
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_USE_STRICT_VALIDATION;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_MAKE_READ_ONLY;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_SUPPRESS_PACKAGE_INFO_GEN;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_SUPPRESSES_HEADER_GEN;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TARGET;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_VERBOSE;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_QUIET;

	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TREATS_AS_XML_SCHEMA;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TREATS_AS_RELAX_NG;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TREATS_AS_RELAX_NG_COMPACT;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TREATS_AS_DTD;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_TREATS_AS_WSDL;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_SHOWS_VERSION;
	public static String CLASSES_GENERATOR_OPTIONS_WIZARD_PAGE_SHOWS_HELP;
	
	public static String CLASSES_GENERATOR_EXTENSION_OPTIONS_WIZARD_PAGE_TITLE;
	public static String CLASSES_GENERATOR_EXTENSION_OPTIONS_WIZARD_PAGE_DESC;
	
	public static String CLASSES_GENERATOR_EXTENSION_OPTIONS_WIZARD_PAGE_ALLOW_EXTENSIONS;
	public static String CLASSES_GENERATOR_EXTENSION_OPTIONS_WIZARD_PAGE_CLASSPATH;
	public static String CLASSES_GENERATOR_EXTENSION_OPTIONS_WIZARD_PAGE_ADDITIONAL_ARGUMENTS;

	public static String CLASSES_GENERATOR_UI_GENERATING_ENTITIES;
	public static String CLASSES_GENERATOR_UI_GENERATING_ENTITIES_TASK;

	public static String CLASSES_GENERATOR_UI_GENERATING_CLASSES_WARNING_TITLE;
	public static String CLASSES_GENERATOR_UI_GENERATING_CLASSES_WARNING_MESSAGE;

	// SchemaGenerator
	public static String SCHEMA_GENERATOR_WIZARD_TITLE;
	public static String SCHEMA_GENERATOR_WIZARD_GENERATING_SCHEMA;
	public static String SCHEMA_GENERATOR_WIZARD_OPEN_SCHEMA_FILE_JOB_NAME;

	public static String SCHEMA_GENERATOR_PROJECT_WIZARD_PAGE_TITLE;
	public static String SCHEMA_GENERATOR_PROJECT_WIZARD_DESC;
	
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_TITLE;
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_DESC;
	
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_SCHEMA_LOCATION;
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_SCHEMA;
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_PACKAGES;
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_BROWSE;
	
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_CHOOSE_SCHEMA_DIALOG_TITLE;
	
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_ERROR_NO_SCHEMA;
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_ERROR_NO_PACKAGE;
	
	public static String SCHEMA_GENERATOR_WIZARD_PAGE_JAXB_LIBRARIES_NOT_AVAILABLE;

	public static String SCHEMA_GENERATOR_WIZARD_PAGE_MOXY_LIBRARIES_NOT_AVAILABLE;
	
	public static String SCHEMA_GENERATOR_WIZARD_GENERATE_SCHEMA_TASK;
	
	public static String NEW_SCHEMA_FILE_WIZARD_PAGE_ERROR_NOT_JAVA_PROJECT;
	public static String NEW_SCHEMA_FILE_WIZARD_PAGE_OVERWRITE_EXISTING_SCHEMAS;
	
	// JptGenerateJob
	
	public static String GENERATE_JAXB_CLASSES_JOB_GENERATING_CLASSES;
	public static String GENERATE_JAXB_CLASSES_JOB_GENERATING_CLASSES_TASK;
	
	// new project wizard
	
	public static String JAXB_PROJECT_WIZARD_TITLE;
	
	public static String JAXB_PROJECT_WIZARD_FIRST_PAGE_TITLE;
	public static String JAXB_PROJECT_WIZARD_FIRST_PAGE_DESC;
	
	
	// facet page
	
	public static String JAXB_FACET_WIZARD_PAGE_TITLE;
	public static String JAXB_FACET_WIZARD_PAGE_DESC;
	public static String JAXB_FACET_WIZARD_PAGE_PLATFORM_LABEL;
	public static String JAXB_FACET_WIZARD_PAGE_FACETS_PAGE_LINK;
	public static String JAXB_FACET_WIZARD_PAGE_JAXB_IMPLEMENTATION_LABEL;
	
	
	public static String JAXB_PLATFORM_UI_MISSING_JAXB_PLATFORM;


	private JptJaxbUiMessages() {
		throw new UnsupportedOperationException();
	}
}
