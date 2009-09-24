/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v2_0.persistence.options;

import java.util.Collection;

import org.eclipse.jpt.core.jpa2.context.persistence.PersistenceUnit2_0;
import org.eclipse.jpt.core.jpa2.context.persistence.options.ValidationMode;
import org.eclipse.jpt.ui.internal.jpa2.Jpt2_0UiMessages;
import org.eclipse.jpt.ui.internal.widgets.EnumFormComboViewer;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 *  ValidationModeComposite
 */
public class ValidationModeComposite extends FormPane<PersistenceUnit2_0>
{
	/**
	 * Creates a new <code>ValidationModeComposite</code>.
	 * 
	 * @param parentController
	 *            The parent container of this one
	 * @param parent
	 *            The parent container
	 */
	public ValidationModeComposite(
				FormPane<?> parentPane,
		        PropertyValueModel<? extends PersistenceUnit2_0> subjectHolder,
		        Composite parent) {

		super(parentPane, subjectHolder, parent);
		}

	@Override
	protected void initializeLayout(Composite parent) {
		this.addLabeledComposite(
			parent,
				Jpt2_0UiMessages.ValidationModeComposite_validationModeLabel,
				this.addValidationModeCombo(parent),
				null			// TODO
		);
	}

	private EnumFormComboViewer<PersistenceUnit2_0, ValidationMode> addValidationModeCombo(Composite parent) {
		
		return new EnumFormComboViewer<PersistenceUnit2_0, ValidationMode>(this, this.getSubjectHolder(), parent) {
			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(PersistenceUnit2_0.SPECIFIED_VALIDATION_MODE_PROPERTY);
			}

			@Override
			protected ValidationMode[] getChoices() {
				return ValidationMode.values();
			}
			
			@Override
			protected boolean sortChoices() {
				return false;
			}
			
			@Override
			protected ValidationMode getDefaultValue() {
				return this.getSubject().getDefaultValidationMode();
			}

			@Override
			protected String displayString(ValidationMode value) {
				return this.buildDisplayString(Jpt2_0UiMessages.class, ValidationModeComposite.this, value);
			}

			@Override
			protected ValidationMode getValue() {
				return this.getSubject().getSpecifiedValidationMode();
			}

			@Override
			protected void setValue(ValidationMode value) {
				this.getSubject().setSpecifiedValidationMode(value);
			}
		};
	}
}
