/*******************************************************************************
 * Copyright (c) 2006, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0, which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.jpt.core.internal.context.base.IColumn;
import org.eclipse.jpt.core.internal.context.base.IIdMapping;
import org.eclipse.jpt.ui.internal.details.IJpaComposite;
import org.eclipse.jpt.ui.internal.widgets.AbstractFormPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyValueModel;
import org.eclipse.jpt.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | ColumnComposite                                                       | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | TemporalTypeComposite                                                 | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | GenerationComposite                                                   | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see IIdMapping
 * @see BaseJpaUiFactory - The factory creating this pane
 * @see ColumnComposite
 * @see TemporalTypeComposite
 * @see GenerationComposite
 *
 * @version 2.0
 * @since 1.0
 */
public class IdMappingComposite extends AbstractFormPane<IIdMapping>
                                implements IJpaComposite<IIdMapping>
{
	/**
	 * Creates a new <code>IdMappingComposite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>IIdMapping</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public IdMappingComposite(PropertyValueModel<? extends IIdMapping> subjectHolder,
	                          Composite parent,
	                          TabbedPropertySheetWidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}

	private PropertyValueModel<? extends IColumn> buildColumnHolder() {
		return new TransformationPropertyValueModel<IIdMapping, IColumn>(getSubjectHolder())  {
			@Override
			protected IColumn transform_(IIdMapping value) {
				return value.getColumn();
			}
		};
	}

	private Composite buildPane(Composite container, int groupBoxMargin) {
		return buildSubPane(container, 0, groupBoxMargin, 0, groupBoxMargin);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void initializeLayout(Composite container) {

		int groupBoxMargin = groupBoxMargin();

		// Column widgets
		new ColumnComposite(this, buildColumnHolder(), container);

		// Temporal Type widgets
		new TemporalTypeComposite(this, buildPane(container, groupBoxMargin));

		// Generation pane
		new GenerationComposite(this, buildSubPane(container, 10));
	}
}