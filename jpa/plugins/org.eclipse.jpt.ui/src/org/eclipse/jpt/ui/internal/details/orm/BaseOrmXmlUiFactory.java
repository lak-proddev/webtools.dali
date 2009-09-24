/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.details.orm;

import org.eclipse.jpt.core.context.orm.OrmBasicMapping;
import org.eclipse.jpt.core.context.orm.OrmEmbeddable;
import org.eclipse.jpt.core.context.orm.OrmEmbeddedIdMapping;
import org.eclipse.jpt.core.context.orm.OrmEmbeddedMapping;
import org.eclipse.jpt.core.context.orm.OrmEntity;
import org.eclipse.jpt.core.context.orm.OrmIdMapping;
import org.eclipse.jpt.core.context.orm.OrmManyToManyMapping;
import org.eclipse.jpt.core.context.orm.OrmManyToOneMapping;
import org.eclipse.jpt.core.context.orm.OrmMappedSuperclass;
import org.eclipse.jpt.core.context.orm.OrmOneToManyMapping;
import org.eclipse.jpt.core.context.orm.OrmOneToOneMapping;
import org.eclipse.jpt.core.context.orm.OrmTransientMapping;
import org.eclipse.jpt.core.context.orm.OrmVersionMapping;
import org.eclipse.jpt.ui.JpaUiFactory;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.details.JpaComposite;
import org.eclipse.jpt.ui.details.orm.OrmXmlUiFactory;
import org.eclipse.jpt.ui.internal.details.BasicMappingComposite;
import org.eclipse.jpt.ui.internal.details.EmbeddedIdMappingComposite;
import org.eclipse.jpt.ui.internal.details.EmbeddedMappingComposite;
import org.eclipse.jpt.ui.internal.details.IdMappingComposite;
import org.eclipse.jpt.ui.internal.details.ManyToManyMappingComposite;
import org.eclipse.jpt.ui.internal.details.ManyToOneMappingComposite;
import org.eclipse.jpt.ui.internal.details.OneToManyMappingComposite;
import org.eclipse.jpt.ui.internal.details.OneToOneMappingComposite;
import org.eclipse.jpt.ui.internal.details.TransientMappingComposite;
import org.eclipse.jpt.ui.internal.details.VersionMappingComposite;
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
public abstract class BaseOrmXmlUiFactory implements OrmXmlUiFactory
{
	
	// **************** orm type mapping composites ****************************
	
	public JpaComposite createOrmMappedSuperclassComposite(
			PropertyValueModel<OrmMappedSuperclass> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new OrmMappedSuperclassComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmEntityComposite(
			PropertyValueModel<OrmEntity> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new OrmEntityComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmEmbeddableComposite(
			PropertyValueModel<OrmEmbeddable> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new OrmEmbeddableComposite(subjectHolder, parent, widgetFactory);
	}
	
	
	// **************** orm attribute mapping composites ***********************
	
	public JpaComposite createOrmIdMappingComposite(
			PropertyValueModel<OrmIdMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new IdMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmEmbeddedIdMappingComposite(
			PropertyValueModel<OrmEmbeddedIdMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new EmbeddedIdMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmBasicMappingComposite(
			PropertyValueModel<OrmBasicMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new BasicMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmVersionMappingComposite(
			PropertyValueModel<OrmVersionMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new VersionMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmManyToOneMappingComposite(
			PropertyValueModel<OrmManyToOneMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new ManyToOneMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmOneToManyMappingComposite(
			PropertyValueModel<OrmOneToManyMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new OneToManyMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmOneToOneMappingComposite(
			PropertyValueModel<OrmOneToOneMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new OneToOneMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmManyToManyMappingComposite(
			PropertyValueModel<OrmManyToManyMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new ManyToManyMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmEmbeddedMappingComposite(
			PropertyValueModel<OrmEmbeddedMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new EmbeddedMappingComposite(subjectHolder, parent, widgetFactory);
	}
	
	public JpaComposite createOrmTransientMappingComposite(
			PropertyValueModel<OrmTransientMapping> subjectHolder,
			Composite parent,
			WidgetFactory widgetFactory) {
		return new TransientMappingComposite(subjectHolder, parent, widgetFactory);
	}
}
