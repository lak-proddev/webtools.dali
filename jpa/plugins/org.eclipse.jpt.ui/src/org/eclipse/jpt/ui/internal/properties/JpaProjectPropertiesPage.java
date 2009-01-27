/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.properties;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jpt.core.JpaProject;
import org.eclipse.jpt.core.JptCorePlugin;
import org.eclipse.jpt.core.internal.JpaModelManager;
import org.eclipse.jpt.core.internal.facet.JpaFacetDataModelProperties;
import org.eclipse.jpt.core.internal.facet.JpaFacetDataModelProvider;
import org.eclipse.jpt.db.ConnectionProfile;
import org.eclipse.jpt.db.JptDbPlugin;
import org.eclipse.jpt.db.ui.internal.DTPUiTools;
import org.eclipse.jpt.ui.JptUiPlugin;
import org.eclipse.jpt.ui.internal.JpaHelpContextIds;
import org.eclipse.jpt.ui.internal.JptUiMessages;
import org.eclipse.jpt.utility.internal.StringTools;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;

public class JpaProjectPropertiesPage
	extends DataModelPropertyPage
	implements JpaFacetDataModelProperties
{
	public static final String PROP_ID= "org.eclipse.jpt.ui.jpaProjectPropertiesPage"; //$NON-NLS-1$

	private PlatformGroup platformGroup;

	private ConnectionGroup connectionGroup;

	private PersistentClassManagementGroup persistentClassManagementGroup;


	/**
	 * Constructor for SamplePropertyPage.
	 */
	public JpaProjectPropertiesPage() {
		super(DataModelFactory.createDataModel(new JpaFacetDataModelProvider()));
	}


	@Override
	protected Composite createTopLevelComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);

		platformGroup = new PlatformGroup(composite);
		connectionGroup = new ConnectionGroup(composite);
		persistentClassManagementGroup = new PersistentClassManagementGroup(composite);

		setRuntime();

		Dialog.applyDialogFont(parent);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, JpaHelpContextIds.PROPERTIES_JAVA_PERSISTENCE);

		return composite;
	}

	private void setRuntime() {
		if (getJpaProject() == null) {
			return;
		}
		IFacetedProject facetedProject = null;
		try {
			facetedProject = ProjectFacetsManager.create(getJpaProject().getProject());
		}
		catch (CoreException ce) {
			JptUiPlugin.log(ce);
			return;
		}
		IRuntime runtime = facetedProject.getPrimaryRuntime();
		model.setProperty(JpaFacetDataModelProperties.RUNTIME, runtime);
	}

	@Override
	protected String[] getValidationPropertyNames() {
		return new String[] {
			JpaFacetDataModelProperties.PLATFORM_ID,
			JpaFacetDataModelProperties.CONNECTION,
			JpaFacetDataModelProperties.USER_WANTS_TO_OVERRIDE_DEFAULT_SCHEMA,
			JpaFacetDataModelProperties.USER_OVERRIDE_DEFAULT_SCHEMA,
			JpaFacetDataModelProperties.DISCOVER_ANNOTATED_CLASSES
		};
	}

	protected JpaProject getJpaProject() {
		return (JpaProject) this.getElement().getAdapter(JpaProject.class);
	}

	Combo createCombo(Composite container, int span, boolean fillHorizontal) {
		Combo combo = new Combo(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		GridData gd;
		if (fillHorizontal) {
			gd = new GridData(GridData.FILL_HORIZONTAL);
		}
		else {
			gd = new GridData();
		}
		gd.horizontalSpan = span;
		combo.setLayoutData(gd);
		return combo;
	}

	Button createButton(Composite container, int span, String text, int style) {
		Button button = new Button(container, SWT.NONE | style);
		button.setText(text);
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		button.setLayoutData(gd);
		return button;
	}

	@Override
	protected void performDefaults() {
		platformGroup.performDefaults();
		connectionGroup.performDefaults();
		persistentClassManagementGroup.performDefaults();
	}

	@Override
	public boolean performOk() {
		JpaProject jpaProject = this.getJpaProject();
		if (jpaProject == null) {
			return true;  // the facet has been uninstalled during our trip to the properties
		}

		boolean change = false;
		boolean platformChange = false;

		IProject project = jpaProject.getProject();

		String platform = this.model.getStringProperty(JpaFacetDataModelProperties.PLATFORM_ID);
		if ( ! platform.equals(jpaProject.getJpaPlatform().getId())) {
			change = true;
			platformChange = true;
			JptCorePlugin.setJpaPlatformId(project, platform);
		}

		String connection = this.model.getStringProperty(JpaFacetDataModelProperties.CONNECTION);
		if ( ! connection.equals(jpaProject.getDataSource().getConnectionProfileName())) {
			change = true;
			jpaProject.getDataSource().setConnectionProfileName(connection);
			JptCorePlugin.setConnectionProfileName(project, connection);
		}
		
		String userOverrideDefaultSchema = null;
		if (this.model.getBooleanProperty(JpaFacetDataModelProperties.USER_WANTS_TO_OVERRIDE_DEFAULT_SCHEMA)) {
			userOverrideDefaultSchema = this.model.getStringProperty(JpaFacetDataModelProperties.USER_OVERRIDE_DEFAULT_SCHEMA);
		}
		String projectUserOverrideDefaultSchema = jpaProject.getUserOverrideDefaultSchema();
		if (! StringTools.stringsAreEqualIgnoreCase(userOverrideDefaultSchema, projectUserOverrideDefaultSchema)) {
			change = true;
			jpaProject.setUserOverrideDefaultSchema(userOverrideDefaultSchema);
			JptCorePlugin.setUserOverrideDefaultSchemaName(project, userOverrideDefaultSchema);
		}

		boolean discover = this.model.getBooleanProperty(JpaFacetDataModelProperties.DISCOVER_ANNOTATED_CLASSES);
		if (discover != jpaProject.discoversAnnotatedClasses()) {
			change = true;
			jpaProject.setDiscoversAnnotatedClasses(discover);
			JptCorePlugin.setDiscoverAnnotatedClasses(project, discover);
		}

		if (platformChange) {
			JpaModelManager.instance().rebuildJpaProject(project);
		}
		if (change) {
			buildProject(project);
		}
		return true;
	}

	private static void buildProject(final IProject project) {
		IRunnableWithProgress r= new IRunnableWithProgress() {
			public void run(IProgressMonitor pm) throws InvocationTargetException {
				try {
					project.build(IncrementalProjectBuilder.FULL_BUILD, pm);
				}
				catch (CoreException ce) {
					JptUiPlugin.log(ce);
				}
			}
		};
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, false, r);
		}
		catch (InterruptedException ie) { /* nothing to do */ }
		catch (InvocationTargetException ie) { /* nothing to do */ }
	}


	private final class PlatformGroup
	{
		final Combo platformCombo;
		
		
		public PlatformGroup(Composite composite) {
			Group group = new Group(composite, SWT.NONE);
			group.setText(JptUiMessages.JpaFacetWizardPage_platformLabel);
			group.setLayout(new GridLayout());
			group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			// TODO
			// PlatformUI.getWorkbench().getHelpSystem().setHelp(group, IDaliHelpContextIds.NEW_JPA_PROJECT_CONTENT_PAGE_DATABASE);
			
			platformCombo = createCombo(group, 1, true);
			synchHelper.synchCombo(platformCombo, PLATFORM_ID, null);
			platformCombo.addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						JpaProjectPropertiesPage.this.connectionGroup.updateConnectLink();
					}
				});
			
			performDefaults();
		}
		
		void performDefaults() {
			if (getJpaProject() == null) {
				return;
			}
			String platformId = getJpaProject().getJpaPlatform().getId();
			model.setProperty(PLATFORM_ID, platformId);
		}
	}
	
	
	private final class ConnectionGroup
	{
		final Combo connectionCombo;

		private Link connectionLink;
		
		private Link connectLink;
		
		private final Button overrideDefaultSchemaButton;
		
		private final Label defaultSchemaLabel;
		
		private final Combo defaultSchemaCombo;
		
		
		public ConnectionGroup(Composite composite) {
			Group group = new Group(composite, SWT.NONE);
			group.setText(JptUiMessages.JpaFacetWizardPage_connectionLabel);
			group.setLayout(new GridLayout(3, false));
			group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			connectionCombo = createCombo(group, 3, true);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(group, JpaHelpContextIds.PROPERTIES_JAVA_PERSISTENCE_CONNECTION);
			synchHelper.synchCombo(connectionCombo, CONNECTION, null);
			connectionCombo.addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						updateConnectLink();
					}
				});
			
			connectionLink = new Link(group, SWT.NONE);
			GridData data = new GridData(GridData.END, GridData.CENTER, false, false);
			data.horizontalSpan = 2;
			connectionLink.setLayoutData(data);
			connectionLink.setText(JptUiMessages.JpaFacetWizardPage_connectionLink);
			connectionLink.addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						openNewConnectionWizard();
					}
				}
			);
			
			connectLink = new Link(group, SWT.NONE);
			data = new GridData(GridData.END, GridData.CENTER, false, false);
			data.horizontalSpan = 2;
			connectLink.setLayoutData(data);
			connectLink.setText(JptUiMessages.JpaFacetWizardPage_connectLink);
			connectLink.setEnabled(false);
			connectLink.addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						openConnectionProfile();
					}
				});
			
			overrideDefaultSchemaButton = createButton(group, 3, JptUiMessages.JpaFacetWizardPage_overrideDefaultSchemaLabel, SWT.CHECK);
			synchHelper.synchCheckbox(overrideDefaultSchemaButton, USER_WANTS_TO_OVERRIDE_DEFAULT_SCHEMA, new Control[0]);
			
			defaultSchemaLabel = new Label(group, SWT.LEFT);
			defaultSchemaLabel.setText(JptUiMessages.JpaFacetWizardPage_defaultSchemaLabel);
			GridData gd = new GridData();
			gd.horizontalSpan = 1;
			defaultSchemaLabel.setLayoutData(gd);
			
			defaultSchemaCombo = createCombo(group, 1, true);
			synchHelper.synchCombo(
				defaultSchemaCombo, USER_OVERRIDE_DEFAULT_SCHEMA, 
				new Control[] {defaultSchemaLabel});
			
			performDefaults();
		}
		
		void openNewConnectionWizard() {
			String connectionName = DTPUiTools.createNewConnectionProfile();
			if (connectionName != null) {
				model.setProperty(CONNECTION, connectionName);
			}
		}
		
		void openConnectionProfile() {
			ConnectionProfile cp = this.getConnectionProfile();
			if (cp != null) {
				cp.connect();
			}
			model.setBooleanProperty(CONNECTION_ACTIVE, (cp != null) && cp.isActive());
			this.updateConnectLink(cp);
			return;
		}
		
		void updateConnectLink(ConnectionProfile cp) {
			connectLink.setEnabled((cp != null) && cp.isDisconnected());
		}
		
		void updateConnectLink() {
			this.updateConnectLink(this.getConnectionProfile());
		}
		
		ConnectionProfile getConnectionProfile() {
			// we just use the connection profile to log in, so go to the db plug-in
			return JptDbPlugin.instance().getConnectionProfileFactory().buildConnectionProfile(model.getStringProperty(CONNECTION));
		}

		void performDefaults() {
			if (getJpaProject() == null) {
				return;
			}
			model.setProperty(CONNECTION, getJpaProject().getDataSource().getConnectionProfileName());
			
			String defaultSchema = getJpaProject().getUserOverrideDefaultSchema();
			model.setProperty(USER_WANTS_TO_OVERRIDE_DEFAULT_SCHEMA, Boolean.valueOf(defaultSchema != null));
			model.setProperty(USER_OVERRIDE_DEFAULT_SCHEMA, defaultSchema);
		}
	}


	private final class PersistentClassManagementGroup
	{
		final Button discoverClassesButton;

		final Button listClassesButton;


		public PersistentClassManagementGroup(Composite composite) {
			Group group = new Group(composite, SWT.NONE);
			group.setText(JptUiMessages.JpaFacetWizardPage_persistentClassManagementLabel);
			group.setLayout(new GridLayout());
			group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			PlatformUI.getWorkbench().getHelpSystem().setHelp(group, JpaHelpContextIds.NEW_JPA_PROJECT_CONTENT_PAGE_CLASSPATH);

			discoverClassesButton = createButton(group, 1, JptUiMessages.JpaFacetWizardPage_discoverClassesButton, SWT.RADIO);
			synchHelper.synchRadio(discoverClassesButton, DISCOVER_ANNOTATED_CLASSES, null);
			
			listClassesButton = createButton(group, 1, JptUiMessages.JpaFacetWizardPage_listClassesButton, SWT.RADIO);
			synchHelper.synchRadio(listClassesButton, LIST_ANNOTATED_CLASSES, null);
			
			performDefaults();
		}
		
		void performDefaults() {
			if (getJpaProject() == null) {
				return;
			}
			boolean discoverClasses = getJpaProject().discoversAnnotatedClasses();
			model.setProperty(DISCOVER_ANNOTATED_CLASSES, Boolean.valueOf(discoverClasses));
		}
	}
}