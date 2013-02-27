/*******************************************************************************
 * Copyright (c) 2005, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details;

import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.iterable.SuperListIterableWrapper;
import org.eclipse.jpt.common.utility.internal.model.value.ListAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ListPropertyValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ReadOnlyModifiablePropertyValueModelWrapper;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.ValueListAdapter;
import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.common.utility.model.event.StateChangeEvent;
import org.eclipse.jpt.common.utility.model.listener.StateChangeAdapter;
import org.eclipse.jpt.common.utility.model.listener.StateChangeListener;
import org.eclipse.jpt.common.utility.model.value.ListValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.SpecifiedJoinColumn;
import org.eclipse.jpt.jpa.core.context.SpecifiedJoinTable;
import org.eclipse.jpt.jpa.core.context.JoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyJoinTable;
import org.eclipse.jpt.jpa.ui.details.JptJpaUiDetailsMessages;
import org.eclipse.jpt.jpa.ui.internal.JpaHelpContextIds;
import org.eclipse.jpt.jpa.ui.internal.details.JoinColumnsComposite.JoinColumnsEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class JoinTableComposite
	extends ReferenceTableComposite<ReadOnlyJoinTable>
{
	private Button overrideDefaultInverseJoinColumnsCheckBox;

	private JoinColumnsComposite<ReadOnlyJoinTable> inverseJoinColumnsComposite;


	public JoinTableComposite(
			Pane<?> parentPane,
			PropertyValueModel<? extends ReadOnlyJoinTable> tableModel,
			PropertyValueModel<Boolean> enabledModel,
			Composite parentComposite) {
		super(parentPane, tableModel, enabledModel, parentComposite);
	}

	@Override
	protected boolean tableIsVirtual(ReadOnlyJoinTable joinTable) {
		return joinTable.getParent().getRelationship().isVirtual();
	}

	@Override
	protected Composite addComposite(Composite container) {
		return this.addSubPane(container, 2, 0, 0, 0, 0);
	}

	@Override
	protected void initializeLayout(Composite container) {
		// Name widgets
		this.addLabel(container, JptJpaUiDetailsMessages.JoinTableComposite_name);
		this.addTableCombo(container, JpaHelpContextIds.MAPPING_JOIN_TABLE_NAME);
		
		// schema widgets
		this.addLabel(container, JptJpaUiDetailsMessages.JoinTableComposite_schema);
		this.addSchemaCombo(container, JpaHelpContextIds.MAPPING_JOIN_TABLE_SCHEMA);

		// catalog widgets
		this.addLabel(container, JptJpaUiDetailsMessages.JoinTableComposite_catalog);
		this.addCatalogCombo(container, JpaHelpContextIds.MAPPING_JOIN_TABLE_CATALOG);

		// Join Columns group pane
		Group joinColumnGroupPane = addTitledGroup(
			container,
			JptJpaUiDetailsMessages.JoinTableComposite_joinColumn
		);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		joinColumnGroupPane.setLayoutData(gridData);

		// Override Default Join Columns check box
		this.overrideDefaultJoinColumnsCheckBox = addCheckBox(
			joinColumnGroupPane,
			JptJpaUiDetailsMessages.JoinTableComposite_overrideDefaultJoinColumns,
			buildOverrideDefaultJoinColumnHolder(),
			null
		);

		this.joinColumnsComposite = new JoinColumnsComposite<ReadOnlyJoinTable>(
			this,
			joinColumnGroupPane,
			buildJoinColumnsEditor(),
			buildJoinColumnsEnabledModel()
		);

		// Inverse Join Columns group pane
		Group inverseJoinColumnGroupPane = addTitledGroup(
			container,
			JptJpaUiDetailsMessages.JoinTableComposite_inverseJoinColumn
		);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		inverseJoinColumnGroupPane.setLayoutData(gridData);

		// Override Default Inverse Join Columns check box
		this.overrideDefaultInverseJoinColumnsCheckBox = addCheckBox(
			inverseJoinColumnGroupPane,
			JptJpaUiDetailsMessages.JoinTableComposite_overrideDefaultInverseJoinColumns,
			buildOverrideDefaultInverseJoinColumnHolder(),
			null
		);

		this.inverseJoinColumnsComposite = new JoinColumnsComposite<ReadOnlyJoinTable>(
			this,
			inverseJoinColumnGroupPane,
			buildInverseJoinColumnsEditor(),
			new InverseJoinColumnPaneEnablerHolder()
		);
	}

	SpecifiedJoinColumn addInverseJoinColumn(ReadOnlyJoinTable joinTable) {

		InverseJoinColumnInJoinTableDialog dialog = new InverseJoinColumnInJoinTableDialog(this.getShell(), this.getResourceManager(), joinTable);

		dialog.setBlockOnOpen(true);
		dialog.open();
		if (dialog.wasConfirmed()) {
			return addInverseJoinColumnFromDialog(dialog.getSubject());
		}
		return null;
	}

	SpecifiedJoinColumn addInverseJoinColumnFromDialog(InverseJoinColumnInJoinTableStateObject stateObject) {

		SpecifiedJoinTable subject = (SpecifiedJoinTable) getSubject();
		int index = subject.getSpecifiedInverseJoinColumnsSize();

		SpecifiedJoinColumn joinColumn = subject.addSpecifiedInverseJoinColumn(index);
		stateObject.updateJoinColumn(joinColumn);
		return joinColumn;
	}

	private void setSelectedInverseJoinColumn(SpecifiedJoinColumn joinColumn) {
		this.inverseJoinColumnsComposite.setSelectedJoinColumn(joinColumn);
	}

	private InverseJoinColumnsProvider buildInverseJoinColumnsEditor() {
		return new InverseJoinColumnsProvider();
	}

	private ModifiablePropertyValueModel<Boolean> buildOverrideDefaultInverseJoinColumnHolder() {
		return new OverrideDefaultInverseJoinColumnHolder();
	}
	
	ListValueModel<JoinColumn> buildSpecifiedInverseJoinColumnsListHolder() {
		return new ListAspectAdapter<ReadOnlyJoinTable, JoinColumn>(getSubjectHolder(), ReadOnlyJoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST) {
			@Override
			protected ListIterable<JoinColumn> getListIterable() {
				return new SuperListIterableWrapper<JoinColumn>(this.subject.getSpecifiedInverseJoinColumns());
			}

			@Override
			protected int size_() {
				return this.subject.getSpecifiedInverseJoinColumnsSize();
			}
		};
	}


	void editInverseJoinColumn(InverseJoinColumnInJoinTableStateObject stateObject) {
		stateObject.updateJoinColumn(stateObject.getJoinColumn());
	}

	void editInverseJoinColumn(JoinColumn joinColumn) {

		InverseJoinColumnInJoinTableDialog dialog = new InverseJoinColumnInJoinTableDialog(this.getShell(), this.getResourceManager(), this.getSubject(), joinColumn);


		dialog.setBlockOnOpen(true);
		dialog.open();
		if (dialog.wasConfirmed()) {
			editInverseJoinColumn(dialog.getSubject());
		}
	}

	void updateInverseJoinColumns() {
		if (this.isPopulating()) {
			return;
		}
		
		SpecifiedJoinTable joinTable = (SpecifiedJoinTable) this.getSubject();
		if (joinTable == null) {
			return;
		}
		
		boolean selected = this.overrideDefaultInverseJoinColumnsCheckBox.getSelection();
		this.setPopulating(true);

		try {
			if (selected) {
				joinTable.convertDefaultInverseJoinColumnToSpecified();
				setSelectedInverseJoinColumn(joinTable.getSpecifiedInverseJoinColumn(0));
			} else {
				joinTable.clearSpecifiedInverseJoinColumns();
			}
		} finally {
			this.setPopulating(false);
		}
	}



	class InverseJoinColumnsProvider implements JoinColumnsEditor<ReadOnlyJoinTable> {

		public SpecifiedJoinColumn addJoinColumn(ReadOnlyJoinTable subject) {
			return JoinTableComposite.this.addInverseJoinColumn(subject);
		}

		public JoinColumn getDefaultJoinColumn(ReadOnlyJoinTable subject) {
			return subject.getDefaultInverseJoinColumn();
		}

		public String getDefaultPropertyName() {
			return ReadOnlyJoinTable.DEFAULT_INVERSE_JOIN_COLUMN;
		}

		public void editJoinColumn(ReadOnlyJoinTable subject, JoinColumn joinColumn) {
			JoinTableComposite.this.editInverseJoinColumn(joinColumn);
		}

		public boolean hasSpecifiedJoinColumns(ReadOnlyJoinTable subject) {
			return subject.hasSpecifiedInverseJoinColumns();
		}

		public void removeJoinColumn(ReadOnlyJoinTable subject, SpecifiedJoinColumn joinColumn) {
			((SpecifiedJoinTable) subject).removeSpecifiedInverseJoinColumn(joinColumn);
		}

		public ListIterable<JoinColumn> getSpecifiedJoinColumns(ReadOnlyJoinTable subject) {
			return new SuperListIterableWrapper<JoinColumn>(subject.getSpecifiedInverseJoinColumns());
		}

		public int getSpecifiedJoinColumnsSize(ReadOnlyJoinTable subject) {
			return subject.getSpecifiedInverseJoinColumnsSize();
		}

		public String getSpecifiedJoinColumnsListPropertyName() {
			return ReadOnlyJoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST;
		}
	}
	
	private class OverrideDefaultInverseJoinColumnHolder extends ListPropertyValueModelAdapter<Boolean>
	    implements ModifiablePropertyValueModel<Boolean> {
	
		public OverrideDefaultInverseJoinColumnHolder() {
			super(buildSpecifiedInverseJoinColumnsListHolder());
		}
	
		@Override
		protected Boolean buildValue() {
			return Boolean.valueOf(this.listModel.size() > 0);
		}
	
		public void setValue(Boolean value) {
			updateInverseJoinColumns();
		}
	}

	
	private class InverseJoinColumnPaneEnablerHolder 
		extends TransformationPropertyValueModel<ReadOnlyJoinTable, Boolean>
	{
		private StateChangeListener stateListener;
		
		
		public InverseJoinColumnPaneEnablerHolder() {
			super(
				new ValueListAdapter<ReadOnlyJoinTable>(
					new ReadOnlyModifiablePropertyValueModelWrapper<ReadOnlyJoinTable>(getSubjectHolder()), 
					ReadOnlyJoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST));
			this.stateListener = new StateListener();
		}

		class StateListener
			extends StateChangeAdapter
		{
			@Override
			public void stateChanged(StateChangeEvent event) {
				wrappedValueStateChanged();
			}
		}
		
		void wrappedValueStateChanged() {
			Object old = this.value;
			this.firePropertyChanged(VALUE, old, this.value = this.transform(this.valueModel.getValue()));
		}
		
		@Override
		protected Boolean transform(ReadOnlyJoinTable table) {
			return (table == null) ? Boolean.FALSE : super.transform(table);
		}
		
		@Override
		protected Boolean transform_(ReadOnlyJoinTable table) {
			boolean virtual = JoinTableComposite.this.tableIsVirtual(table);
			return Boolean.valueOf(! virtual && table.getSpecifiedInverseJoinColumnsSize() > 0);
		}
		
		@Override
		protected void engageModel() {
			super.engageModel();
			this.valueModel.addStateChangeListener(this.stateListener);
		}
		
		@Override
		protected void disengageModel() {
			this.valueModel.removeStateChangeListener(this.stateListener);
			super.disengageModel();
		}
	}
}