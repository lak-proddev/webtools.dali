/*******************************************************************************
 * Copyright (c) 2005, 2006 Oracle. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Oracle. - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jpt.core.internal.mappings.IMappedSuperclass;
import org.eclipse.jpt.ui.internal.details.BaseJpaComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class MappedSuperclassComposite extends BaseJpaComposite 
{
	private IMappedSuperclass mappedSuperclass;
	private Adapter mappedSuperclassListener;
	
	private CommandStack commandStack;
	
	
	public MappedSuperclassComposite(Composite parent, CommandStack commandStack, TabbedPropertySheetWidgetFactory widgetFactory) {
		super(parent, SWT.NULL, commandStack, widgetFactory);
		this.mappedSuperclassListener = buildMappedSuperclassListener();
	}
	
	private Adapter buildMappedSuperclassListener() {
		return new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				mappedSuperclassChanged(notification);
			}
		};
	}
	
	@Override
	protected void initializeLayout(Composite composite) {
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		
//		Label accessTypeLabel = new Label(composite, SWT.LEFT);
//		accessTypeLabel.setText(DaliUiMessages.MappedSuperclassComposite_accessType);
//		this.accessTypeComboViewer = buildAccessTypeCombo(composite);
//		//eventually this will be enabled if editing xml instead of java
//		this.accessTypeComboViewer.getCombo().setEnabled(false);
//		GridData gridData = new GridData();
//		gridData.horizontalAlignment = GridData.FILL;
//		gridData.grabExcessHorizontalSpace = true;
//		this.accessTypeComboViewer.getCombo().setLayoutData(gridData);
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(this.accessTypeComboViewer.getCombo(), IDaliHelpContextIds.ENTITY_ACCESS_TYPE);
		
	}
	
//	private ComboViewer buildAccessTypeCombo(Composite parent) {
//		ComboViewer viewer = new ComboViewer(parent, SWT.READ_ONLY);
//		viewer.add(AccessType.VALUES.toArray());
//		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
//			public void selectionChanged(SelectionChangedEvent event) {
//				if (populating) {
//					return;
//				}
//				if (event.getSelection() instanceof StructuredSelection) {
//					StructuredSelection selection = (StructuredSelection) event.getSelection();
//					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, persistentType, OrmPackage.eINSTANCE.getPersistentType_AccessType(), selection.getFirstElement()));
//				}
//			}
//		});
//		return viewer;
//	}
	
	@Override
	protected void doPopulate(EObject model) {
		this.mappedSuperclass = (IMappedSuperclass) model;
	}
	
	@Override
	protected void doPopulate() {
		
	}
	
	
	protected void engageListeners() {
//		this.persistentTypeItemProvider.addListener(getPersistentTypeListener());
//		this.persistentType.eAdapters().add(this.persistentTypeItemProvider);
	}

	protected void disengageListeners() {
//		if (this.persistentType != null){
//			this.persistentType.eAdapters().remove(this.persistentTypeItemProvider);
//			this.persistentTypeItemProvider.removeListener(getPersistentTypeListener());
//		}
	}
	
	private void mappedSuperclassChanged(Notification notification) {
		
	}
	
//	private INotifyChangedListener getPersistentTypeListener() {
//		if (this.persistentTypeListener == null) {
//			this.persistentTypeListener = new INotifyChangedListener() {
//				public void notifyChanged(Notification notification) {
//					if (notification.getFeatureID(PersistentType.class) == OrmPackage.PERSISTENT_TYPE__ACCESS_TYPE) {
//						final AccessType accessType = (AccessType) notification.getNewValue();
//						Display.getDefault().syncExec(new Runnable() {
//							public void run() {
//								if (((StructuredSelection) accessTypeComboViewer.getSelection()).getFirstElement() != accessType) {
//									accessTypeComboViewer.setSelection(new StructuredSelection(accessType));
//								}
//							}
//						});
//					}
//				}
//			};
//		}
//		return this.persistentTypeListener;
//	}
}
