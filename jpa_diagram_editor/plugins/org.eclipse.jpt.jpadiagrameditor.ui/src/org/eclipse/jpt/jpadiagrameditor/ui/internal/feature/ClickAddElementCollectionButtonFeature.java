/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2012 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Petya Sabeva - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/

package org.eclipse.jpt.jpadiagrameditor.ui.internal.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jpt.jpa.core.context.PersistentAttribute;
import org.eclipse.jpt.jpa.core.context.PersistentType;
import org.eclipse.jpt.jpa.core.jpa2.MappingKeys2_0;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.i18n.JPAEditorMessages;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.provider.IJPAEditorFeatureProvider;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.util.JpaArtifactFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchSite;

public class ClickAddElementCollectionButtonFeature extends AbstractCreateFeature {
	
	public ClickAddElementCollectionButtonFeature(IFeatureProvider provider) {
		super(provider, "", "");	//$NON-NLS-1$ //$NON-NLS-2$
	}
	
	@Override
	public boolean canExecute(IContext context) {
		return true;
	}

	@Override
	public boolean canUndo(IContext context) {
		return false;
	}

	public boolean canCreate(ICreateContext context) {
		return true;
	}
	
	public Object[] create(ICreateContext context) {
		ContainerShape entityShape = context.getTargetContainer();
		PersistentType jpt = (PersistentType)getFeatureProvider().getBusinessObjectForPictogramElement(entityShape);
		String newAttrName = JpaArtifactFactory.instance().createNewAttribute(jpt, true, getFeatureProvider());

		PersistentAttribute newAttr = jpt.resolveAttribute(newAttrName);
		newAttr.getJavaPersistentAttribute().setMappingKey(MappingKeys2_0.ELEMENT_COLLECTION_ATTRIBUTE_MAPPING_KEY);
		JpaArtifactFactory.instance().addOrmPersistentAttribute(jpt, newAttr, MappingKeys2_0.ELEMENT_COLLECTION_ATTRIBUTE_MAPPING_KEY);
		
		getFeatureProvider().addAddIgnore((PersistentType) newAttr.getParent(), newAttr.getName());
		addGraphicalRepresentation(context, newAttr);
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
        IWorkbenchSite ws = ((IEditorPart)getDiagramEditor()).getSite();
        ICompilationUnit cu = getFeatureProvider().getCompilationUnit(jpt);
        getFeatureProvider().getJPAEditorUtil().formatCode(cu, ws);

		return new Object[] {newAttr};
	}

	@Override
	public boolean isAvailable(IContext context) {
		return true;
	}

	@Override
	public String getName() {
		return JPAEditorMessages.ClickAddElementCollectionButtonFeature_CreateElementCollectionAttributeFeatureName;  			
	}

	@Override
	public String getDescription() {
		return JPAEditorMessages.ClickAddElementCollectionButtonFeature_CreateElementCollectionAttributeFeatureDescription;  
	}
	
	@Override
	public IJPAEditorFeatureProvider getFeatureProvider() {
		return (IJPAEditorFeatureProvider)super.getFeatureProvider();
	}

}
