/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal;

import java.util.ArrayList;
import java.util.ListIterator;
import org.eclipse.jpt.core.context.persistence.PersistenceUnit;
import org.eclipse.jpt.ui.JpaUiFactory;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.details.JpaPageComposite;
import org.eclipse.jpt.ui.internal.persistence.details.GenericPersistenceUnitGeneralComposite;
import org.eclipse.jpt.ui.internal.persistence.details.PersistenceUnitConnectionComposite;
import org.eclipse.jpt.ui.internal.persistence.details.PersistenceUnitPropertiesComposite;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * The default implementation of the UI factory required to show the information
 * related to a JPA mapping (type or attribute).
 *
 * @see JpaUiFactory
 *
 * @version 2.0
 * @since 1.0
 */
public abstract class BaseJpaUiFactory implements JpaUiFactory
{
	// **************** persistence unit composites ****************************
	
	public ListIterator<JpaPageComposite> createPersistenceUnitComposites(
		PropertyValueModel<PersistenceUnit> subjectHolder,
		Composite parent,
		WidgetFactory widgetFactory) {

		ArrayList<JpaPageComposite> pages =
			new ArrayList<JpaPageComposite>(1);

		pages.add(new GenericPersistenceUnitGeneralComposite(subjectHolder, parent, widgetFactory));
		pages.add(new PersistenceUnitConnectionComposite(subjectHolder, parent, widgetFactory));
		pages.add(new PersistenceUnitPropertiesComposite(subjectHolder, parent, widgetFactory));

		return pages.listIterator();
	}

}
