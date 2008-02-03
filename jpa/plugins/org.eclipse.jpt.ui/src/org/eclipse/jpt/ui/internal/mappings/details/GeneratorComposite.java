/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.jpt.core.internal.context.base.IGenerator;
import org.eclipse.jpt.core.internal.context.base.IIdMapping;
import org.eclipse.jpt.ui.internal.listeners.SWTPropertyChangeListenerWrapper;
import org.eclipse.jpt.ui.internal.widgets.AbstractFormPane;
import org.eclipse.jpt.utility.internal.StringTools;
import org.eclipse.jpt.utility.internal.model.event.PropertyChangeEvent;
import org.eclipse.jpt.utility.internal.model.listener.PropertyChangeListener;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.internal.model.value.PropertyValueModel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This is the generic pane for a generator.
 *
 * @see IIdMapping
 * @see IGenerator
 * @see SequenceGeneratorComposite - A sub-pane
 * @see TalbeGeneratorComposite - A sub-pane
 *
 * @version 2.0
 * @since 1.0
 */
@SuppressWarnings("nls")
public abstract class GeneratorComposite<T extends IGenerator> extends AbstractFormPane<IIdMapping>
{
	private PropertyChangeListener generatorChangeListener;
	private PropertyValueModel<T> generatorHolder;
	private PropertyChangeListener namePropertyChangeListener;
	private Text nameText;

	/**
	 * Creates a new <code>GeneratorComposite</code>.
	 *
	 * @param parentPane The parent container of this one
	 * @param parent The parent container
	 */
	public GeneratorComposite(AbstractFormPane<? extends IIdMapping> parentPane,
                             Composite parent) {

		super(parentPane, parent);
	}

	/**
	 * Creates the new <code>IGenerator</code>.
	 *
	 * @return The newly created <code>IGenerator</code>
	 */
	protected abstract T buildGenerator();

	private PropertyChangeListener buildGeneratorChangeListener() {
		return new SWTPropertyChangeListenerWrapper(this.buildGeneratorChangeListener_());
	}

	@SuppressWarnings("unchecked")
	private PropertyChangeListener buildGeneratorChangeListener_() {
		return new PropertyChangeListener() {
			public void propertyChanged(PropertyChangeEvent e) {

				GeneratorComposite.this.uninstallListeners((T) e.oldValue());

				if (!isPopulating()) {
					GeneratorComposite.this.repopulate();
				}

				GeneratorComposite.this.installListeners((T) e.newValue());
			}
		};
	}

	private PropertyValueModel<T> buildGeneratorHolder() {
		return new PropertyAspectAdapter<IIdMapping, T>(getSubjectHolder(), propertyName()) {
			@Override
			protected T buildValue_() {
				return GeneratorComposite.this.getGenerator(subject);
			}
		};
	}

	private ModifyListener buildGeneratorNameModifyListener() {
		return new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (!isPopulating()) {
					String name = ((Text) e.getSource()).getText();
					updateGeneratorName(name);
				}
			}
		};
	}

	private PropertyChangeListener buildNamePropertyChangeListener() {
		return new SWTPropertyChangeListenerWrapper(buildNamePropertyChangeListener_());
	}

	private PropertyChangeListener buildNamePropertyChangeListener_() {
		return new PropertyChangeListener() {
			public void propertyChanged(PropertyChangeEvent e) {
				if (isPopulating()) {
					return;
				}

				GeneratorComposite.this.setPopulating(true);
				try {
					GeneratorComposite.this.populateNameViewer();
				}
				finally {
					GeneratorComposite.this.setPopulating(false);
				}
			}
		};
	}

	/**
	 * Builds the Generator specifiedName viewer.
	 *
	 * @param parent
	 * @return
	 */
	protected final Text buildNameText(Composite parent) {
		Text text = this.buildText(parent);
		text.addModifyListener(this.buildGeneratorNameModifyListener());
		return text;
	}

	protected void clearNameViewer() {
		this.nameText.setText("");
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void disengageListeners() {
		super.disengageListeners();

		this.generatorHolder.removePropertyChangeListener(
			PropertyValueModel.VALUE,
			this.generatorChangeListener
		);

		this.uninstallListeners(this.getGenerator(this.subject()));
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void doPopulate() {
		super.doPopulate();
		this.populateNameViewer();
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void engageListeners() {
		super.engageListeners();

		this.generatorHolder.addPropertyChangeListener(
			PropertyValueModel.VALUE,
			this.generatorChangeListener
		);

		this.installListeners(this.getGenerator(this.subject()));
	}

	/**
	 * Retrieves without creating the <code>IGenerator</code> from the subject.
	 *
	 * @param subject The subject used to retrieve the generator
	 * @return The <code>IGenerator</code> or <code>null</code> if it doesn't
	 * exists
	 */
	protected abstract T getGenerator(IIdMapping subject);

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void initialize() {
		super.initialize();

		this.generatorHolder            = buildGeneratorHolder();
		this.generatorChangeListener    = buildGeneratorChangeListener();
		this.namePropertyChangeListener = buildNamePropertyChangeListener();
	}

	protected void installListeners(T generator) {
		if (generator != null) {
			generator.addPropertyChangeListener(IGenerator.NAME_PROPERTY, this.namePropertyChangeListener);
		}
	}

	private void populateNameViewer() {
		IGenerator generator = this.getGenerator(this.subject());

		if (generator != null) {
			String name = generator.getName();

			if (name != null) {
				if (!this.nameText.getText().equals(name)) {
					this.nameText.setText(name);
					this.nameText.setSelection(0, 0);
				}
			}
			else {
				this.clearNameViewer();
			}
		}
		else {
			this.clearNameViewer();
		}
	}

	/**
	 * Returns the property name used to listen to the ID mapping when the
	 * generator changes.
	 *
	 * @return The property name associated with the generator
	 */
	protected abstract String propertyName();

	protected final void setNameText(Text nameText) {
		this.nameText = nameText;
	}

	protected void uninstallListeners(T generator) {
		if (generator != null) {
			generator.removePropertyChangeListener(IGenerator.NAME_PROPERTY, this.namePropertyChangeListener);
		}
	}

	private void updateGeneratorName(String name) {

		if (StringTools.stringIsEmpty(name)) {

			if (getGenerator(subject()).getName() == null) {
				return;
			}

			name = null;
		}

		IGenerator generator = getGenerator(subject());

		if (generator == null) {
			setPopulating(true);

			try {
				generator = buildGenerator();
			}
			finally {
				setPopulating(false);
			}
		}

		generator.setName(name);
	}
}