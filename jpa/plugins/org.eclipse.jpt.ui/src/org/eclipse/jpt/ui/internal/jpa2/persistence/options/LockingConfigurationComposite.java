/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.ui.internal.jpa2.persistence.options;

import org.eclipse.jpt.core.jpa2.context.persistence.options.JpaOptions2_0;
import org.eclipse.jpt.ui.internal.jpa2.Jpt2_0UiMessages;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.ui.internal.widgets.IntegerCombo;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.utility.model.value.WritablePropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 *  LockingConfigurationComposite
 */
public class LockingConfigurationComposite extends FormPane<JpaOptions2_0>
{
	/**
	 * Creates a new <code>LockingConfigurationComposite</code>.
	 *
	 * @param parentController
	 *            The parent container of this one
	 * @param parent
	 *            The parent container
	 */
	public LockingConfigurationComposite(
					FormPane<? extends JpaOptions2_0> parentComposite,
					Composite parent) {

		super(parentComposite, parent);
	}

	@Override
	protected void initializeLayout(Composite parent) {
		this.addLockTimeoutCombo(parent);
	}
	
	private void addLockTimeoutCombo(Composite parent) {
		new IntegerCombo<JpaOptions2_0>(this, parent) {
			
			@Override
			protected String getLabelText() {
				return Jpt2_0UiMessages.LockingConfigurationComposite_lockTimeoutLabel;
			}
		
			@Override
			protected String getHelpId() {
				return null;		// TODO
			}
			
			@Override
			protected PropertyValueModel<Integer> buildDefaultHolder() {
				return new PropertyAspectAdapter<JpaOptions2_0, Integer>(this.getSubjectHolder()) {
					@Override
					protected Integer buildValue_() {
						return this.subject.getDefaultLockTimeout();
					}
				};
			}
			
			@Override
			protected WritablePropertyValueModel<Integer> buildSelectedItemHolder() {
				return new PropertyAspectAdapter<JpaOptions2_0, Integer>(this.getSubjectHolder(), JpaOptions2_0.LOCK_TIMEOUT_PROPERTY) {
					@Override
					protected Integer buildValue_() {
						return this.subject.getLockTimeout();
					}

					@Override
					protected void setValue_(Integer value) {
						this.subject.setLockTimeout(value);
					}
				};
			}
		};
	}
}