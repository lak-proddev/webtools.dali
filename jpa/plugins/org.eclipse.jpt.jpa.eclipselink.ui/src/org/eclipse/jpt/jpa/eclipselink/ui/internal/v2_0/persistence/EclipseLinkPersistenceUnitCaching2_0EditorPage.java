/*******************************************************************************
 * Copyright (c) 2009, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.v2_0.persistence;

import java.util.Collection;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jpt.common.ui.WidgetFactory;
import org.eclipse.jpt.common.ui.internal.widgets.EnumFormComboViewer;
import org.eclipse.jpt.common.ui.internal.widgets.IntegerCombo;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.internal.transformer.TransformerAdapter;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.common.utility.transformer.Transformer;
import org.eclipse.jpt.jpa.core.jpa2.context.persistence.PersistenceUnit2_0;
import org.eclipse.jpt.jpa.core.jpa2.context.persistence.options.SharedCacheMode2_0;
import org.eclipse.jpt.jpa.eclipselink.core.context.persistence.CacheType;
import org.eclipse.jpt.jpa.eclipselink.core.context.persistence.Caching;
import org.eclipse.jpt.jpa.eclipselink.ui.JptJpaEclipseLinkUiMessages;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.EclipseLinkHelpContextIds;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.persistence.caching.EclipseLinkPersistenceUnitCachingEditorPage;
import org.eclipse.jpt.jpa.ui.jpa2.persistence.JptJpaUiPersistenceMessages2_0;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;

public class EclipseLinkPersistenceUnitCaching2_0EditorPage
	extends EclipseLinkPersistenceUnitCachingEditorPage<Caching>
{
	public EclipseLinkPersistenceUnitCaching2_0EditorPage(
			PropertyValueModel<Caching> subjectModel,
			Composite parentComposite,
            WidgetFactory widgetFactory,
            ResourceManager resourceManager) {
		super(subjectModel, parentComposite, widgetFactory, resourceManager);
	}

	@Override
	protected void initializeLayout(Composite container) {
		Section section = this.getWidgetFactory().createSection(container, ExpandableComposite.TITLE_BAR | Section.DESCRIPTION);
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		section.setText(JptJpaEclipseLinkUiMessages.PERSISTENCE_XML_CACHING_TAB_SECTION_TITLE);
		section.setDescription(JptJpaEclipseLinkUiMessages.PERSISTENCE_XML_CACHING_TAB_SECTION_DESCRIPTION);

		Composite client = this.getWidgetFactory().createComposite(section);
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth  = 0;
		layout.marginTop    = 0;
		layout.marginLeft   = 0;
		layout.marginBottom = 0;
		layout.marginRight  = 0;
		client.setLayout(layout);
		client.setLayoutData(new GridData(GridData.FILL_BOTH));
		section.setClient(client);

		PropertyValueModel<PersistenceUnit2_0> persistenceUnitModel = this.buildPersistenceUnit2_0Model();

		// SharedCacheMode
		this.addLabel(client, JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_SHARED_CACHE_MODE_LABEL);		
		this.addSharedCacheModeCombo(client, persistenceUnitModel);

		// Defaults
		// Default Cache Type
		Label cacheTypeLabel = this.addLabel(client, JptJpaEclipseLinkUiMessages.PERSISTENCE_XML_CACHING_TAB_DEFAULT_CACHE_TYPE_LABEL);
		Combo cacheTypeCombo = this.buildDefaultCacheTypeCombo(client).getControl();

		// Default Cache Size
		Label cacheSizeLabel = this.addLabel(client, JptJpaEclipseLinkUiMessages.DEFAULT_CACHE_SIZE_COMPOSITE_DEFAULT_CACHE_SIZE);
		Combo cacheSizeCombo = this.addDefaultCacheSizeCombo(client).getControl();


		// Flush Clear Cache
		Label flushClearCacheLabel = this.addLabel(client, JptJpaEclipseLinkUiMessages.PERSISTENCE_XML_CACHING_TAB_FLUSH_CLEAR_CACHE_LABEL);
		Combo flushClearCacheCombo = this.addFlushClearCacheCombo(client).getControl();

		this.controlEnabledState(
			this.buildSharedCacheModeEnabledModel(persistenceUnitModel),
			cacheTypeLabel,
			cacheTypeCombo,
			cacheSizeLabel,
			cacheSizeCombo,
			flushClearCacheLabel,
			flushClearCacheCombo);
	}

	private PropertyValueModel<PersistenceUnit2_0> buildPersistenceUnit2_0Model() {
		return new PropertyAspectAdapter<Caching, PersistenceUnit2_0>(this.getSubjectHolder()) {
			@Override
			protected PersistenceUnit2_0 buildValue_() {
				return (PersistenceUnit2_0) this.subject.getPersistenceUnit();
			}
		};
	}


	//********* shared cache mode ***********

	private EnumFormComboViewer<PersistenceUnit2_0, SharedCacheMode2_0> addSharedCacheModeCombo(Composite parent, PropertyValueModel<? extends PersistenceUnit2_0> subjectModel) {
		return new EnumFormComboViewer<PersistenceUnit2_0, SharedCacheMode2_0>(this, subjectModel, parent) {
			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(PersistenceUnit2_0.SPECIFIED_SHARED_CACHE_MODE_PROPERTY);
			}

			@Override
			protected SharedCacheMode2_0[] getChoices() {
				return SharedCacheMode2_0.values();
			}

			@Override
			protected boolean sortChoices() {
				return false;
			}

			@Override
			protected SharedCacheMode2_0 getDefaultValue() {
				return this.getSubject().getDefaultSharedCacheMode();
			}

			@Override
			protected String displayString(SharedCacheMode2_0 value) {
				switch (value) {
					case ALL :
						return JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_ALL;
					case DISABLE_SELECTIVE :
						return JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_DISABLE_SELECTIVE;
					case ENABLE_SELECTIVE :
						return JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_ENABLE_SELECTIVE;
					case NONE :
						return JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_NONE;
					case UNSPECIFIED :
						return JptJpaUiPersistenceMessages2_0.SHARED_CACHE_MODE_COMPOSITE_UNSPECIFIED;
					default :
						throw new IllegalStateException();
				}
			}

			@Override
			protected SharedCacheMode2_0 getValue() {
				return this.getSubject().getSpecifiedSharedCacheMode();
			}

			@Override
			protected void setValue(SharedCacheMode2_0 value) {
				this.getSubject().setSpecifiedSharedCacheMode(value);
			}
		};
	}

	private PropertyValueModel<Boolean> buildSharedCacheModeEnabledModel(PropertyValueModel<PersistenceUnit2_0> persistenceUnitModel) {
		return new TransformationPropertyValueModel<SharedCacheMode2_0, Boolean>(this.buildSharedCacheModeModel(persistenceUnitModel), SHARED_CACHE_MODE_ENABLED_TRANSFORMER);
	}

	private PropertyValueModel<SharedCacheMode2_0> buildSharedCacheModeModel(PropertyValueModel<PersistenceUnit2_0> persistenceUnitModel) {
		return new PropertyAspectAdapter<PersistenceUnit2_0, SharedCacheMode2_0>(
								persistenceUnitModel, 
								PersistenceUnit2_0.SPECIFIED_SHARED_CACHE_MODE_PROPERTY, 
								PersistenceUnit2_0.DEFAULT_SHARED_CACHE_MODE_PROPERTY) {
			@Override
			protected SharedCacheMode2_0 buildValue_() {
				return this.subject.getSharedCacheMode();
			}
		};
	}

	private static final Transformer<SharedCacheMode2_0, Boolean> SHARED_CACHE_MODE_ENABLED_TRANSFORMER = new SharedCacheModeEnabledTransformer();
	/* CU private */ static class SharedCacheModeEnabledTransformer
		extends TransformerAdapter<SharedCacheMode2_0, Boolean>
	{
		@Override
		public Boolean transform(SharedCacheMode2_0 mode) {
			return Boolean.valueOf(mode != SharedCacheMode2_0.NONE);
		}
	}

	protected EnumFormComboViewer<Caching, CacheType> buildDefaultCacheTypeCombo(Composite container) {
		return new EnumFormComboViewer<Caching, CacheType>(this, container) {
			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(Caching.CACHE_TYPE_DEFAULT_PROPERTY);
			}

			@Override
			protected CacheType[] getChoices() {
				return CacheType.values();
			}

			@Override
			protected boolean sortChoices() {
				return false;
			}

			@Override
			protected CacheType getDefaultValue() {
				return getSubject().getDefaultCacheTypeDefault();
			}

			@Override
			protected String displayString(CacheType value) {
				switch (value) {
					case full :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_FULL;
					case weak :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_WEAK;
					case soft :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_SOFT;
					case soft_weak :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_SOFT_WEAK;
					case hard_weak :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_HARD_WEAK;
					case none  :
						return JptJpaEclipseLinkUiMessages.CACHE_TYPE_COMPOSITE_NONE;
					default :
						throw new IllegalStateException();
				}

			}

			@Override
			protected CacheType getValue() {
				return getSubject().getCacheTypeDefault();
			}

			@Override
			protected void setValue(CacheType value) {
				getSubject().setCacheTypeDefault(value);
			}

			@Override
			protected String getHelpId() {
				return EclipseLinkHelpContextIds.PERSISTENCE_CACHING_DEFAULT_TYPE;
			}
		};
	}

	protected IntegerCombo<Caching> addDefaultCacheSizeCombo(Composite container) {
		return new IntegerCombo<Caching>(this, container) {	
			@Override
			protected String getHelpId() {
				return EclipseLinkHelpContextIds.PERSISTENCE_CACHING_DEFAULT_SIZE;
			}

			@Override
			protected PropertyValueModel<Integer> buildDefaultHolder() {
				return new PropertyAspectAdapter<Caching, Integer>(getSubjectHolder()) {
					@Override
					protected Integer buildValue_() {
						return this.subject.getDefaultCacheSizeDefault();
					}
				};
			}

			@Override
			protected ModifiablePropertyValueModel<Integer> buildSelectedItemHolder() {
				return new PropertyAspectAdapter<Caching, Integer>(getSubjectHolder(), Caching.CACHE_SIZE_DEFAULT_PROPERTY) {
					@Override
					protected Integer buildValue_() {
						return this.subject.getCacheSizeDefault();
					}

					@Override
					protected void setValue_(Integer value) {
						this.subject.setCacheSizeDefault(value);
					}
				};
			}
		};
	}
}
