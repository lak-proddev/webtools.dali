/*******************************************************************************
 *  Copyright (c) 2006, 2009 Oracle. All rights reserved. This
 *  program and the accompanying materials are made available under the terms of
 *  the Eclipse Public License v1.0 which accompanies this distribution, and is
 *  available at http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors: Oracle. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.mappings.details;

import org.eclipse.jpt.core.JpaProject;
import org.eclipse.jpt.eclipselink.core.context.EclipseLinkConverter;
import org.eclipse.jpt.eclipselink.core.context.StructConverter;
import org.eclipse.jpt.eclipselink.ui.internal.mappings.EclipseLinkUiMappingsMessages;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.internal.util.PaneEnabler;
import org.eclipse.jpt.ui.internal.widgets.ClassChooserPane;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.utility.model.value.WritablePropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * |            -------------------------------------------------------------- |
 * | Name:      |                                                             ||
 * |            -------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see EclipseLinkConverter
 * @see ConvertComposite - A container of this widget
 *
 * @version 2.1
 * @since 2.1
 */
public class StructConverterComposite extends FormPane<StructConverter>
{

	/**
	 * Creates a new <code>StructConverterComposite</code>.
	 *
	 * @param parentPane The parent container of this one
	 * @param parent The parent container
	 */
	public StructConverterComposite(PropertyValueModel<? extends StructConverter> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}

	@Override
	protected void initializeLayout(Composite container) {
		
		addLabeledText(
			container, 
			EclipseLinkUiMappingsMessages.ConverterComposite_nameTextLabel, 
			buildNameTextHolder());
		
		addClassChooser(container);
		
		new PaneEnabler(buildBooleanHolder(), this);
	}
	
	protected WritablePropertyValueModel<String> buildNameTextHolder() {
		return new PropertyAspectAdapter<StructConverter, String>(
				getSubjectHolder(), EclipseLinkConverter.NAME_PROPERTY) {
			@Override
			protected String buildValue_() {
				return this.subject.getName();
			}
		
			@Override
			protected void setValue_(String value) {
				if (value.length() == 0) {
					value = null;
				}
				this.subject.setName(value);
			}
		};
	}

	
	private ClassChooserPane<StructConverter> addClassChooser(Composite container) {

		return new ClassChooserPane<StructConverter>(this, container) {

			@Override
			protected WritablePropertyValueModel<String> buildTextHolder() {
				return new PropertyAspectAdapter<StructConverter, String>(getSubjectHolder(), StructConverter.CONVERTER_CLASS_PROPERTY) {
					@Override
					protected String buildValue_() {
						return this.subject.getConverterClass();
					}

					@Override
					protected void setValue_(String value) {

						if (value.length() == 0) {
							value = null;
						}

						this.subject.setConverterClass(value);
					}
				};
			}

			@Override
			protected String getClassName() {
				return getSubject().getConverterClass();
			}

			@Override
			protected String getLabelText() {
				return EclipseLinkUiMappingsMessages.ConverterComposite_classLabel;
			}

			@Override
			protected JpaProject getJpaProject() {
				return getSubject().getJpaProject();
			}
			
			@Override
			protected void setClassName(String className) {
				getSubject().setConverterClass(className);
			}
			
			@Override
			protected String getSuperInterfaceName() {
				return StructConverter.ECLIPSELINK_STRUCT_CONVERTER_CLASS_NAME;
			}
			
			@Override
			protected char getEnclosingTypeSeparator() {
				return getSubject().getEnclosingTypeSeparator();
			}
		};
	}

	protected PropertyValueModel<Boolean> buildBooleanHolder() {
		return new TransformationPropertyValueModel<StructConverter, Boolean>(getSubjectHolder()) {
			@Override
			protected Boolean transform(StructConverter value) {
				return Boolean.valueOf(value != null);
			}
		};
	}
}
