/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.platform.generic;

import org.eclipse.jpt.common.ui.internal.jface.AbstractItemLabelProvider;
import org.eclipse.jpt.common.ui.jface.DelegatingContentAndLabelProvider;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.StaticPropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.persistence.PersistenceUnit;
import org.eclipse.jpt.jpa.ui.JptJpaUiPlugin;
import org.eclipse.jpt.jpa.ui.internal.JptUiIcons;
import org.eclipse.swt.graphics.Image;

public class PersistenceUnitItemLabelProvider extends AbstractItemLabelProvider
{
	public PersistenceUnitItemLabelProvider(
			PersistenceUnit persistenceUnit, DelegatingContentAndLabelProvider labelProvider) {
		super(persistenceUnit, labelProvider);
	}
	
	
	@Override
	protected PropertyValueModel<Image> buildImageModel() {
		return new StaticPropertyValueModel<Image>(JptJpaUiPlugin.getImage(JptUiIcons.PERSISTENCE_UNIT));
	}
	
	@Override
	protected PropertyValueModel<String> buildTextModel() {
		return new PropertyAspectAdapter<PersistenceUnit, String>(PersistenceUnit.NAME_PROPERTY, (PersistenceUnit) model()) {
			 @Override
			protected String buildValue_() {
				return subject.getName();
			}
		};
	}
	
	@Override
	protected PropertyValueModel<String> buildDescriptionModel() {
		return new PropertyAspectAdapter<PersistenceUnit, String>(PersistenceUnit.NAME_PROPERTY, (PersistenceUnit) model()) {
			@Override
			protected String buildValue_() {
				return subject.getName()
				+ " - " + subject.getResource().getFullPath().makeRelative();
			}
		};
	}
}