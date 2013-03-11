/*******************************************************************************
 * Copyright (c) 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.v2_0.persistence;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jpt.common.ui.WidgetFactory;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.persistence.PersistenceUnit;
import org.eclipse.jpt.jpa.eclipselink.ui.JptJpaEclipseLinkUiMessages;
import org.eclipse.jpt.jpa.ui.editors.JpaEditorPageDefinition;
import org.eclipse.jpt.jpa.ui.internal.jpa2.persistence.PersistenceUnitEditorPageDefinition;
import org.eclipse.swt.widgets.Composite;

/**
 *  EclipseLinkPersistenceUnitSchemaGeneration2_5EditorPageDefinition
 */
public class EclipseLinkPersistenceUnitSchemaGeneration2_5EditorPageDefinition
extends PersistenceUnitEditorPageDefinition
{
	// singleton
	private static final JpaEditorPageDefinition INSTANCE = 
			new EclipseLinkPersistenceUnitSchemaGeneration2_5EditorPageDefinition();
	
	/**
	 * Return the singleton.
	 */
	public static JpaEditorPageDefinition instance() {
		return INSTANCE;
	}
	
	
	/**
	 * Ensure single instance.
	 */
	private EclipseLinkPersistenceUnitSchemaGeneration2_5EditorPageDefinition() {
		super();
	}
	
	
	public ImageDescriptor getTitleImageDescriptor() {
		return null;
	}
	
	public String getTitleText() {	
		return JptJpaEclipseLinkUiMessages.PERSISTENCE_XML_ECLIPSELINK_SCHEMA_GENERATION_PAGE_TITLE;
	}
	
	public String getHelpID() {
		return null;
	}
	
	@Override
	protected void buildEditorPageContent(Composite parent, WidgetFactory widgetFactory, ResourceManager resourceManager, PropertyValueModel<PersistenceUnit> persistenceUnitModel) {
	
			new EclipseLinkPersistenceUnitSchemaGeneration2_5EditorPage(persistenceUnitModel, parent, widgetFactory, resourceManager);
	}
}

