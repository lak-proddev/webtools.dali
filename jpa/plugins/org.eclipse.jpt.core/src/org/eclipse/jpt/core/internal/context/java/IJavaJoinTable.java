/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0, which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.java;

import java.util.ListIterator;
import org.eclipse.jpt.core.internal.context.base.IJoinTable;
import org.eclipse.jpt.core.internal.resource.java.JavaPersistentAttributeResource;


public interface IJavaJoinTable extends IJoinTable, IJavaJpaContextNode
{
	void initializeFromResource(JavaPersistentAttributeResource attributeResource);
	
	void update(JavaPersistentAttributeResource attributeResource);
	
	boolean isSpecified();
	
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> joinColumns();
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> defaultJoinColumns();
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> specifiedJoinColumns();
	IJavaJoinColumn addSpecifiedJoinColumn(int index);
	
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> inverseJoinColumns();
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> defaultInverseJoinColumns();
	@SuppressWarnings("unchecked")
	ListIterator<IJavaJoinColumn> specifiedInverseJoinColumns();
	IJavaJoinColumn addSpecifiedInverseJoinColumn(int index);

}