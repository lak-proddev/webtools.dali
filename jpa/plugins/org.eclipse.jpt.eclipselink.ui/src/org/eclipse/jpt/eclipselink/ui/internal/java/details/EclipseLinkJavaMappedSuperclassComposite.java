/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.java.details;

import org.eclipse.jpt.core.context.java.JavaMappedSuperclass;
import org.eclipse.jpt.eclipselink.core.context.java.EclipseLinkJavaMappedSuperclass;
import org.eclipse.jpt.eclipselink.core.context.java.EclipseLinkJavaCaching;
import org.eclipse.jpt.eclipselink.core.context.java.EclipseLinkJavaConverterHolder;
import org.eclipse.jpt.eclipselink.ui.internal.mappings.EclipseLinkUiMappingsMessages;
import org.eclipse.jpt.eclipselink.ui.internal.mappings.details.EclipseLinkMappedSuperclassAdvancedComposite;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.details.JpaComposite;
import org.eclipse.jpt.ui.internal.mappings.details.IdClassComposite;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * The pane used for an EclipseLink Java Mapped Superclass.
 *
 * @see EclipseLinkMappedSuperclass
 * @see EclipselinkJpaUiFactory - The factory creating this pane
 *
 * @version 2.1
 * @since 2.1
 */
public class EclipseLinkJavaMappedSuperclassComposite extends FormPane<JavaMappedSuperclass>
                                       implements JpaComposite
{
	/**
	 * Creates a new <code>MappedSuperclassComposite</code>.
	 *
	 * @param subjectHolder The holder of this pane's subject
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public EclipseLinkJavaMappedSuperclassComposite(PropertyValueModel<? extends JavaMappedSuperclass> subjectHolder,
	                                 Composite parent,
	                                 WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}

	@Override
	protected void initializeLayout(Composite container) {
		new IdClassComposite(this, container);
		
		initializeCachingPane(container);
		initializeConvertersPane(container);
		initializeAdvancedPane(container);
	}
	
	protected void initializeCachingPane(Composite container) {

		container = addCollapsableSection(
			addSubPane(container, 5),
			EclipseLinkUiMappingsMessages.EclipseLinkTypeMappingComposite_caching
		);

		new JavaCachingComposite(this, buildCachingHolder(), container);
	}

	private PropertyAspectAdapter<JavaMappedSuperclass, EclipseLinkJavaCaching> buildCachingHolder() {
		return new PropertyAspectAdapter<JavaMappedSuperclass, EclipseLinkJavaCaching>(
			getSubjectHolder())
		{
			@Override
			protected EclipseLinkJavaCaching buildValue_() {
				return ((EclipseLinkJavaMappedSuperclass) this.subject).getCaching();
			}
		};
	}
	
	protected void initializeConvertersPane(Composite container) {
		container = addCollapsableSection(
			container,
			EclipseLinkUiMappingsMessages.EclipseLinkTypeMappingComposite_converters
		);

		new ConvertersComposite(this, buildConverterHolderValueModel(), container);
	}

	protected PropertyValueModel<EclipseLinkJavaConverterHolder> buildConverterHolderValueModel() {
		return new PropertyAspectAdapter<JavaMappedSuperclass, EclipseLinkJavaConverterHolder>(getSubjectHolder()) {
			@Override
			protected EclipseLinkJavaConverterHolder buildValue_() {
				return ((EclipseLinkJavaMappedSuperclass) this.subject).getConverterHolder();
			}	
		};
	}
	
	protected void initializeAdvancedPane(Composite container) {
		new EclipseLinkMappedSuperclassAdvancedComposite(this, container);
	}
}