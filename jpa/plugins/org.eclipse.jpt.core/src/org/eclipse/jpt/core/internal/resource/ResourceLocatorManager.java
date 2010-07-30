/*******************************************************************************
 *  Copyright (c) 2010  Oracle. All rights reserved.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v1.0, which accompanies this distribution
 *  and is available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.internal.resource;

import static org.eclipse.jpt.core.internal.XPointUtil.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.core.expressions.Expression;
import org.eclipse.core.expressions.ExpressionConverter;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jpt.core.JptCorePlugin;
import org.eclipse.jpt.core.internal.XPointUtil.XPointException;
import org.eclipse.jpt.core.internal.resource.ResourceLocatorConfig.Priority;
import org.eclipse.jpt.core.resource.ResourceLocator;
import org.eclipse.jpt.utility.internal.iterables.FilteringIterable;
import org.eclipse.jpt.utility.internal.iterables.TransformationIterable;

public class ResourceLocatorManager {
	
	public static final String EXTENSION_POINT_ID = "resourceLocators";
	public static final String QUALIFIED_EXTENSION_POINT_ID = JptCorePlugin.PLUGIN_ID_ + EXTENSION_POINT_ID;
	public static final String RESOURCE_LOCATOR_ELEMENT = "resourceLocator";
	public static final String ID_ATTRIBUTE = "id";
	public static final String CLASS_ATTRIBUTE = "class";
	public static final String PRIORITY_ATTRIBUTE = "priority";
	public static final String ENABLEMENT_ELEMENT = "enablement";
	
	
	private static ResourceLocatorManager INSTANCE;
	
	
	public static ResourceLocatorManager instance() {
		if (INSTANCE == null) {
			INSTANCE = new ResourceLocatorManager();
		}
		return INSTANCE;
	}
	
	
	private Set<ResourceLocatorConfig> resourceLocatorConfigs;
	private Map<String, ResourceLocatorConfig> resourceLocatorLookupTable;
	
	
	private ResourceLocatorManager() {
		this.resourceLocatorConfigs = new HashSet<ResourceLocatorConfig>();
		this.resourceLocatorLookupTable = new HashMap<String, ResourceLocatorConfig>();
		readExtensions();
	}
	
	
	/**
	 * Return the {@link ResourceLocator} of highest priority that is acceptable
	 * for the given project
	 */
	public ResourceLocator getResourceLocator(final IProject project) {
		return new FilteringIterable<ResourceLocator>(
				new TransformationIterable<ResourceLocatorConfig, ResourceLocator>(
						new FilteringIterable<ResourceLocatorConfig>(
								new TreeSet<ResourceLocatorConfig>(this.resourceLocatorConfigs)) {
							@Override
							protected boolean accept(ResourceLocatorConfig o) {
								return o.isEnabledFor(project);
							}
						}) {
					@Override
					protected ResourceLocator transform(ResourceLocatorConfig o) {
						return o.getResourceLocator();
					}
				}) {
			@Override
			protected boolean accept(ResourceLocator o) {
				return o != null;
			}
		}.iterator().next();
	}
	
	private void readExtensions() {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		final IExtensionPoint xpoint 
				= registry.getExtensionPoint(JptCorePlugin.PLUGIN_ID, EXTENSION_POINT_ID);
		
		if (xpoint == null) {
			throw new IllegalStateException();
		}
		
		final List<IConfigurationElement> configs = new ArrayList<IConfigurationElement>();
		
		for (IExtension extension : xpoint.getExtensions()) {
        	for (IConfigurationElement element : extension.getConfigurationElements()) {
        		configs.add(element);
        	}
		}
		
		for (IConfigurationElement element : configs) {
			if (element.getName().equals(RESOURCE_LOCATOR_ELEMENT)) {
                readExtension(element);
			}
		}
	}
	
	private void readExtension(IConfigurationElement element) {
		try {
			final ResourceLocatorConfig rlConfig = new ResourceLocatorConfig();
			
			// plug-in id
			rlConfig.setPluginId(element.getContributor().getName());
			
			// resource locator id
			rlConfig.setId(findRequiredAttribute(element, ID_ATTRIBUTE));
			
			if (this.resourceLocatorLookupTable.containsKey(rlConfig.getId())) {
				logDuplicateExtension(QUALIFIED_EXTENSION_POINT_ID, rlConfig.getId());
				throw new XPointException();
			}
			
			// resource locator class name
			rlConfig.setClassName(findRequiredAttribute(element, CLASS_ATTRIBUTE));
			
			// priority
			String priorityString = element.getAttribute(PRIORITY_ATTRIBUTE).trim();
			Priority priority = Priority.get(priorityString);
			if (priority == null) {
				logInvalidValue(element, PRIORITY_ATTRIBUTE, priorityString);
				throw new XPointException();
			}
			rlConfig.setPriority(priority);
			
			// enablement
			for (IConfigurationElement child : element.getChildren()) {
				String childName = child.getName();
				if (childName.equals(ENABLEMENT_ELEMENT)) {
					Expression expr;
					try {
						expr = ExpressionConverter.getDefault().perform(child);
					}
					catch (CoreException e) {
						log(e);
						throw new XPointException();
					}
					rlConfig.setEnablementCondition(expr);
				}
			}
			
			this.resourceLocatorConfigs.add(rlConfig);
			this.resourceLocatorLookupTable.put(rlConfig.getId(), rlConfig);
		}
		catch (XPointException e) {
			// Ignore and continue. The problem has already been reported to the user
			// in the log.
		}
	}
}