/*******************************************************************************
* Copyright (c) 2008 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.customization;

import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.eclipselink.core.internal.context.customization.Customization;
import org.eclipse.jpt.eclipselink.ui.internal.EclipseLinkUiMessages;
import org.eclipse.jpt.ui.internal.widgets.AbstractPane;
import org.eclipse.jpt.ui.internal.widgets.ClassChooserPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.model.value.WritablePropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 *  SessionCustomizerComposite
 */
public class SessionCustomizerComposite extends AbstractPane<Customization>
{
	/**
	 * Creates a new <code>SessionCustomizerComposite</code>.
	 *
	 * @param parentPane The parent pane of this one
	 * @param parent The parent container
	 */
	public SessionCustomizerComposite(AbstractPane<? extends Customization> parentPane,
                           Composite parent) {

		super(parentPane, parent);
	}

	private ClassChooserPane<Customization> initializeClassChooser(Composite container) {

		return new ClassChooserPane<Customization>(this, container) {

			@Override
			protected WritablePropertyValueModel<String> buildTextHolder() {
				return new PropertyAspectAdapter<Customization, String>(getSubjectHolder(), Customization.SESSION_CUSTOMIZER_PROPERTY) {
					@Override
					protected String buildValue_() {
						return subject.getSessionCustomizer();
					}

					@Override
					protected void setValue_(String value) {

						if (value.length() == 0) {
							value = null;
						}

						subject.setSessionCustomizer(value);
					}
				};
			}

			@Override
			protected String className() {
				return subject().getSessionCustomizer();
			}

			@Override
			protected String labelText() {
				return EclipseLinkUiMessages.PersistenceXmlCustomizationTab_sessionCustomizerLabel;
			}

			@Override
			protected IPackageFragmentRoot packageFragmentRoot() {
				//TODO
//				IProject project = subject().getJpaProject().getProject();
//				IJavaProject root = JavaCore.create(project);
//
//				try {
//					return root.getAllPackageFragmentRoots()[0];
//				}
//				catch (JavaModelException e) {
//					JptEclipseLinkUiPlugin.log(e);
//				}
				return null;
			}

			@Override
			protected void promptType() {
				IType type = chooseType();

				if (type != null) {
					String className = type.getFullyQualifiedName();
					subject().setSessionCustomizer(className);
				}
			}
		};
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void initializeLayout(Composite container) {
		this.initializeClassChooser(container);
	}
}
