/*******************************************************************************
 * Copyright (c) 2006 Oracle. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Oracle. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jpt.ui.internal.details.BaseJpaController;
import org.eclipse.jpt.ui.internal.widgets.CComboViewer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class EnumComboViewer extends BaseJpaController
{
	private EnumHolder enumHolder;
	private Adapter enumListener;
	
	private CComboViewer comboViewer;


	public EnumComboViewer(Composite parent, CommandStack theCommandStack, TabbedPropertySheetWidgetFactory widgetFactory) {
		super(parent, theCommandStack, widgetFactory);
		buildListener();
	}
	
	
	private void buildListener() {
		this.enumListener = new AdapterImpl() {
			public void notifyChanged(Notification notification) {
				modelChanged(notification);
			}
		};
	}
	
	@Override
	protected void buildWidget(Composite parent) {
		CCombo combo = getWidgetFactory().createCCombo(parent);
		this.comboViewer = new CComboViewer(combo);
		
		this.comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				EnumComboViewer.this.selectionChanged(event.getSelection());
			}
		});
	}
	
	void selectionChanged(ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			Object selection = ((IStructuredSelection) sel).getFirstElement();
			if ( ! this.enumHolder.get().equals(selection)) {
				this.enumHolder.set(selection);
//				this.editingDomain.getCommandStack().execute(
//					SetCommand.create(
//						this.editingDomain,
//						this.basicMapping,
//						OrmPackage.eINSTANCE.getBasicMapping_Optional(),
//						optional
//					)
//				);
			}
		}
	}

	private void modelChanged(Notification notification) {
		if (notification.getFeatureID(this.enumHolder.featureClass()) == 
				this.enumHolder.featureId()) {
			Display.getDefault().asyncExec(
				new Runnable() {
					public void run() {
						populate();
					}
				});
		}
	}
	
	@Override
	protected void engageListeners() {
		if (this.enumHolder != null && this.enumHolder.wrappedObject() != null) {
			this.enumHolder.wrappedObject().eAdapters().add(this.enumListener);
		}
	}
	
	@Override
	protected void disengageListeners() {
		if (this.enumHolder != null && this.enumHolder.wrappedObject() != null) {
			this.enumHolder.wrappedObject().eAdapters().remove(this.enumListener);
		}
	}
	
	public final void populate(EnumHolder enumHolder) {
		super.populate(enumHolder);
	}
	
	@Override
	public void doPopulate(EObject obj) {
		this.enumHolder = (EnumHolder) obj;
		populateCombo();
	}
	
	@Override
	protected void doPopulate() {
		populateCombo();
	}
	
	private void populateCombo() {
		this.comboViewer.getCombo().removeAll();
		if (this.enumHolder.wrappedObject() == null) {
			return;
		}
		
		this.comboViewer.add(this.enumHolder.enumValues());
		
		Object modelSetting = this.enumHolder.get();
		
		if (((IStructuredSelection) this.comboViewer.getSelection()).getFirstElement() != modelSetting) {
			this.comboViewer.setSelection(new StructuredSelection(modelSetting));
		}
	}

	
	@Override
	public Control getControl() {
		return this.comboViewer.getCombo();
	}
	
	
	/**
	 * An interface to wrap an object that supports accessType
	 * An object of this type must be passed in to populate(EObject)
	 */
	public static interface EnumHolder extends EObject {
		/**
		 * Return the num setting from the wrapped object
		 * @return
		 */
		Object get();
		
		/**
		 * Set the enum setting on the wrapped object
		 * @param fetch
		 */
		void set(Object enumSetting);
		
		/**
		 * Return the Class of the wrapped object
		 * @return
		 */
		Class featureClass();
		
		/**
		 * Return the feature id of enum setting on the wrapped object
		 * @return
		 */
		int featureId();
		
		/**
		 * The wrapped EObject that the enum setting is stored on
		 * @return
		 */
		EObject wrappedObject();
		
		Object[] enumValues();
	}
}
