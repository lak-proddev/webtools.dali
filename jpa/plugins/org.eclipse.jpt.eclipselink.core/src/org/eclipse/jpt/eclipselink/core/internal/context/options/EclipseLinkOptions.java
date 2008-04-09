/*******************************************************************************
* Copyright (c) 2008 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.context.options;

import java.util.Map;

import org.eclipse.jpt.core.context.persistence.PersistenceUnit;
import org.eclipse.jpt.core.context.persistence.Property;
import org.eclipse.jpt.eclipselink.core.internal.context.EclipseLinkPersistenceUnitProperties;
import org.eclipse.jpt.utility.model.event.PropertyChangeEvent;
import org.eclipse.jpt.utility.model.value.ListValueModel;

/**
 *  EclipseLinkOptions
 */
public class EclipseLinkOptions extends EclipseLinkPersistenceUnitProperties
	implements Options
{
	// ********** EclipseLink properties **********
	private String sessionName;
	private String sessionsXml;
	private Boolean includeDescriptorQueries;
	private TargetDatabase targetDatabase;
	private String eventListener;


	// ********** constructors **********
	public EclipseLinkOptions(PersistenceUnit parent, ListValueModel<Property> propertyListAdapter) {
		super(parent, propertyListAdapter);
	}

	// ********** initialization **********
	/**
	 * Initializes properties with values from the persistence unit.
	 */
	@Override
	protected void initializeProperties() {
		// TOREVIEW - handle incorrect String in persistence.xml
		this.sessionName = 
			this.getStringValue(ECLIPSELINK_SESSION_NAME);
		this.sessionsXml = 
			this.getStringValue(ECLIPSELINK_SESSIONS_XML);
		this.includeDescriptorQueries = 
			this.getBooleanValue(ECLIPSELINK_SESSION_INCLUDE_DESCRIPTOR_QUERIES);
		this.targetDatabase = 
			this.getEnumValue(ECLIPSELINK_TARGET_DATABASE, TargetDatabase.values());
		this.eventListener = 
			this.getStringValue(ECLIPSELINK_SESSION_EVENT_LISTENER);
	}

	// ********** behavior **********
	/**
	 * Adds property names key/value pairs, where: 
	 * 		key = EclipseLink property key
	 * 		value = property id
	 */
	@Override
	protected void addPropertyNames(Map<String, String> propertyNames) {
		propertyNames.put(
			ECLIPSELINK_SESSION_NAME,
			SESSION_NAME_PROPERTY);
		propertyNames.put(
			ECLIPSELINK_SESSIONS_XML,
			SESSIONS_XML_PROPERTY);
		propertyNames.put(
			ECLIPSELINK_SESSION_INCLUDE_DESCRIPTOR_QUERIES,
			SESSION_INCLUDE_DESCRIPTOR_QUERIES_PROPERTY);
		propertyNames.put(
			ECLIPSELINK_TARGET_DATABASE,
			TARGET_DATABASE_PROPERTY);
		propertyNames.put(
			ECLIPSELINK_SESSION_EVENT_LISTENER,
			SESSION_EVENT_LISTENER_PROPERTY);
	}

	public void propertyChanged(PropertyChangeEvent event) {
		String aspectName = event.getAspectName();
		if (aspectName.equals(SESSION_NAME_PROPERTY)) {
			this.sessionNameChanged(event);
		}
		else if (aspectName.equals(SESSIONS_XML_PROPERTY)) {
			this.sessionsXmlChanged(event);
		}
		else if (aspectName.equals(TARGET_DATABASE_PROPERTY)) {
			this.targetDatabaseChanged(event);
		}
		else if (aspectName.equals(SESSION_INCLUDE_DESCRIPTOR_QUERIES_PROPERTY)) {
			this.includeDescriptorQueriesChanged(event);
		}
		else if (aspectName.equals(SESSION_EVENT_LISTENER_PROPERTY)) {
			this.eventListenerChanged(event);
		}
		else {
			throw new IllegalArgumentException("Illegal event received - property not applicable: " + aspectName);
		}
		return;
	}

	// ********** SessionName **********
	public String getSessionName() {
		return this.sessionName;
	}

	public void setSessionName(String newSessionName) {
		String old = this.sessionName;
		this.sessionName = newSessionName;
		this.putProperty(SESSION_NAME_PROPERTY, newSessionName);
		this.firePropertyChanged(SESSION_NAME_PROPERTY, old, newSessionName);
	}

	private void sessionNameChanged(PropertyChangeEvent event) {
		String newValue = (event.getNewValue() == null) ? null : ((Property) event.getNewValue()).getValue();
		String old = this.sessionName;
		this.sessionName = newValue;
		this.firePropertyChanged(event.getAspectName(), old, newValue);
	}

	public String getDefaultSessionName() {
		return DEFAULT_SESSION_NAME;
	}

		// ********** SessionsXml **********
		public String getSessionsXml() {
			return this.sessionsXml;
		}

		public void setSessionsXml(String newSessionsXml) {
			String old = this.sessionsXml;
			this.sessionsXml = newSessionsXml;
			this.putProperty(SESSIONS_XML_PROPERTY, newSessionsXml);
			this.firePropertyChanged(SESSIONS_XML_PROPERTY, old, newSessionsXml);
		}

		private void sessionsXmlChanged(PropertyChangeEvent event) {
			String newValue = (event.getNewValue() == null) ? null : ((Property) event.getNewValue()).getValue();
			String old = this.sessionsXml;
			this.sessionsXml = newValue;
			this.firePropertyChanged(event.getAspectName(), old, newValue);
		}

		public String getDefaultSessionsXml() {
			return DEFAULT_SESSIONS_XML;
		}

	// ********** IncludeDescriptorQueries **********
	public Boolean getIncludeDescriptorQueries() {
		return this.includeDescriptorQueries;
	}

	public void setIncludeDescriptorQueries(Boolean newIncludeDescriptorQueries) {
		Boolean old = this.includeDescriptorQueries;
		this.includeDescriptorQueries = newIncludeDescriptorQueries;
		this.putProperty(SESSION_INCLUDE_DESCRIPTOR_QUERIES_PROPERTY, newIncludeDescriptorQueries);
		this.firePropertyChanged(SESSION_INCLUDE_DESCRIPTOR_QUERIES_PROPERTY, old, newIncludeDescriptorQueries);
	}

	private void includeDescriptorQueriesChanged(PropertyChangeEvent event) {
		String stringValue = (event.getNewValue() == null) ? null : ((Property) event.getNewValue()).getValue();
		Boolean newValue = getBooleanValueOf(stringValue);
		
		Boolean old = this.includeDescriptorQueries;
		this.includeDescriptorQueries = newValue;
		this.firePropertyChanged(event.getAspectName(), old, newValue);
	}

	public Boolean getDefaultIncludeDescriptorQueries() {
		return DEFAULT_SESSION_INCLUDE_DESCRIPTOR_QUERIES;
	}

	// ********** TargetDatabase **********
	public TargetDatabase getTargetDatabase() {
		return this.targetDatabase;
	}
	
	public void setTargetDatabase(TargetDatabase newTargetDatabase) {
		TargetDatabase old = this.targetDatabase;
		this.targetDatabase = newTargetDatabase;
		this.putProperty(TARGET_DATABASE_PROPERTY, newTargetDatabase);
		this.firePropertyChanged(TARGET_DATABASE_PROPERTY, old, newTargetDatabase);
	}

	private void targetDatabaseChanged(PropertyChangeEvent event) {
		String stringValue = (event.getNewValue() == null) ? null : ((Property) event.getNewValue()).getValue();
		TargetDatabase newValue = getEnumValueOf(stringValue, TargetDatabase.values());
		TargetDatabase old = this.targetDatabase;
		this.targetDatabase = newValue;
		this.firePropertyChanged(event.getAspectName(), old, newValue);
	}
	
	public TargetDatabase getDefaultTargetDatabase() {
		return DEFAULT_TARGET_DATABASE;
	}

	// ********** EventListener **********
	public String getEventListener() {
		return this.eventListener;
	}

	public void setEventListener(String newEventListener) {
		String old = this.eventListener;
		this.eventListener = newEventListener;
		this.putProperty(SESSION_EVENT_LISTENER_PROPERTY, newEventListener);
		this.firePropertyChanged(SESSION_EVENT_LISTENER_PROPERTY, old, newEventListener);
	}

	private void eventListenerChanged(PropertyChangeEvent event) {
		String newValue = (event.getNewValue() == null) ? null : ((Property) event.getNewValue()).getValue();
		String old = this.eventListener;
		this.eventListener = newValue;
		this.firePropertyChanged(event.getAspectName(), old, newValue);
	}

	public String getDefaultEventListener() {
		return DEFAULT_SESSION_EVENT_LISTENER;
	}

}