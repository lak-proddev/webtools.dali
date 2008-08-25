/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.schema.generation;

import org.eclipse.jpt.eclipselink.core.internal.context.schema.generation.SchemaGeneration;
import org.eclipse.jpt.eclipselink.ui.internal.EclipseLinkUiMessages;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.details.JpaPageComposite;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * PersistenceXmlSchemaGenerationTab
 */
public class PersistenceXmlSchemaGenerationTab
	extends FormPane<SchemaGeneration>
	implements JpaPageComposite
{
	// ********** constructors/initialization **********
	public PersistenceXmlSchemaGenerationTab(
				PropertyValueModel<SchemaGeneration> subjectHolder,
				Composite parent,
				WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}

	@Override
	protected void initializeLayout(Composite container) {
		new EclipseLinkSchemaGenerationComposite(this, container);
	}

	// ********** JpaPageComposite implementation **********
	public String getHelpID() {
		return null;
	}

	public Image getPageImage() {
		return null;
	}

	public String getPageText() {
		return EclipseLinkUiMessages.PersistenceXmlSchemaGenerationTab_title;
	}
}