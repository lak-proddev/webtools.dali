/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.orm.details;

import java.util.ListIterator;
import org.eclipse.jpt.core.context.PrimaryKeyJoinColumn;
import org.eclipse.jpt.core.context.orm.OrmEntity;
import org.eclipse.jpt.core.context.orm.OrmPrimaryKeyJoinColumn;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.internal.mappings.details.AbstractPrimaryKeyJoinColumnsComposite;
import org.eclipse.jpt.ui.internal.widgets.AbstractPane;
import org.eclipse.jpt.utility.internal.model.value.ListAspectAdapter;
import org.eclipse.jpt.utility.model.value.ListValueModel;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * @see OrmEntity
 * @see OrmInheritanceComposite - The container of this pane
 *
 * @version 2.0
 * @since 2.0
 */
public class OrmPrimaryKeyJoinColumnsComposite extends AbstractPrimaryKeyJoinColumnsComposite<OrmEntity>
{

	/**
	 * Creates a new <code>OrmPrimaryKeyJoinColumnsComposite</code>.
	 *
	 * @param parentPane The parent controller of this one
	 * @param parent The parent container
	 */
	public OrmPrimaryKeyJoinColumnsComposite(AbstractPane<? extends OrmEntity> subjectHolder,
	                                      Composite parent) {

		super(subjectHolder, parent);
	}

	/**
	 * Creates a new <code>OrmPrimaryKeyJoinColumnsComposite</code>.
	 *
	 * @param subjectHolder The holder of this pane's subject
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public OrmPrimaryKeyJoinColumnsComposite(PropertyValueModel<? extends OrmEntity> subjectHolder,
	                                      Composite parent,
	                                      WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}
	
	@Override
	protected ListValueModel<OrmPrimaryKeyJoinColumn> buildDefaultJoinColumnsListHolder() {
		return new ListAspectAdapter<OrmEntity, OrmPrimaryKeyJoinColumn>(
			getSubjectHolder(),
			OrmEntity.DEFAULT_PRIMARY_KEY_JOIN_COLUMNS_LIST)
		{
			@Override
			protected ListIterator<OrmPrimaryKeyJoinColumn> listIterator_() {
				return subject.defaultPrimaryKeyJoinColumns();
			}
//TODO defaultPrimaryKeyJoinColumnsSize when I can change the API
//			@Override
//			protected int size_() {
//				return subject.defaultPrimaryKeyJoinColumnsSize();
//			}
		};
	}
	
	@Override
	protected void switchDefaultToSpecified() {
		ListIterator<OrmPrimaryKeyJoinColumn> defaultJoinColumns = subject().defaultPrimaryKeyJoinColumns();

		int index = 0;
		while (defaultJoinColumns.hasNext()) {
			OrmPrimaryKeyJoinColumn defaultJoinColumn = defaultJoinColumns.next();
			String columnName = defaultJoinColumn.getName();
			String referencedColumnName = defaultJoinColumn.getReferencedColumnName();

			PrimaryKeyJoinColumn pkJoinColumn = subject().addSpecifiedPrimaryKeyJoinColumn(index++);
			pkJoinColumn.setSpecifiedName(columnName);
			pkJoinColumn.setSpecifiedReferencedColumnName(referencedColumnName);
		}
	}
	
}