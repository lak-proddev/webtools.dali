/*******************************************************************************
 * Copyright (c) 2010, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa1.context;

import org.eclipse.jpt.jpa.core.context.ReadOnlyAssociationOverride;
import org.eclipse.jpt.jpa.core.context.ReadOnlyJoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyPersistentAttribute;
import org.eclipse.jpt.jpa.core.internal.context.JptValidator;
import org.eclipse.jpt.jpa.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.jpa.core.internal.validation.JpaValidationMessages;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

public class AssociationOverrideInverseJoinColumnValidator
	extends InverseJoinColumnValidator
{
	final ReadOnlyAssociationOverride override;

	public AssociationOverrideInverseJoinColumnValidator(
				ReadOnlyAssociationOverride override,
				ReadOnlyJoinColumn column,
				ReadOnlyJoinColumn.Owner joinColumnOwner,
				TableDescriptionProvider provider) {
		super(column, joinColumnOwner, provider);
		this.override = override;
	}

	public AssociationOverrideInverseJoinColumnValidator(
				ReadOnlyPersistentAttribute persistentAttribute,
				ReadOnlyAssociationOverride override,
				ReadOnlyJoinColumn column,
				ReadOnlyJoinColumn.Owner joinColumnOwner,
				TableDescriptionProvider provider) {
		super(persistentAttribute, column, joinColumnOwner, provider);
		this.override = override;
	}

	@Override
	protected JptValidator buildTableValidator() {
		return new TableValidator();
	}

	@Override
	protected IMessage buildUnresolvedNameMessage() {
		return this.override.isVirtual() ?
				this.buildVirtualOverrideUnresolvedNameMessage() :
				super.buildUnresolvedNameMessage();
	}

	protected IMessage buildVirtualOverrideUnresolvedNameMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				JpaValidationMessages.VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME,
				new String[] {
					this.override.getName(),
					this.column.getName(),
					this.column.getDbTable().getName()
				},
				this.column,
				this.column.getNameTextRange()
			);
	}

	@Override
	protected IMessage buildVirtualAttributeUnresolvedNameMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				this.getVirtualAttributeUnresolvedNameMessage(),
				new String[] {
					this.persistentAttribute.getName(),
					this.override.getName(),
					this.column.getName(),
					this.column.getDbTable().getName()
				},
				this.column,
				this.persistentAttribute.getValidationTextRange()
			);
	}

	@Override
	protected String getVirtualAttributeUnresolvedNameMessage() {
		return JpaValidationMessages.VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME;
	}

	@Override
	protected IMessage buildUnresolvedReferencedColumnNameMessage() {
		return this.override.isVirtual() ?
				this.buildVirtualOverrideUnresolvedReferencedColumnNameMessage() :
				super.buildUnresolvedReferencedColumnNameMessage();
	}

	protected IMessage buildVirtualOverrideUnresolvedReferencedColumnNameMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				JpaValidationMessages.VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME,
				new String[] {
					this.override.getName(),
					this.column.getReferencedColumnName(),
					this.column.getReferencedColumnDbTable().getName()
				},
				this.column,
				this.column.getReferencedColumnNameTextRange()
			);
	}

	@Override
	protected IMessage buildVirtualAttributeUnresolvedReferencedColumnNameMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				this.getVirtualAttributeUnresolvedReferencedColumnNameMessage(),
				new String[] {
					this.persistentAttribute.getName(),
					this.override.getName(),
					this.column.getReferencedColumnName(),
					this.column.getReferencedColumnDbTable().getName()
				},
				this.column,
				this.persistentAttribute.getValidationTextRange()
			);
	}

	@Override
	protected String getVirtualAttributeUnresolvedReferencedColumnNameMessage() {
		return JpaValidationMessages.VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_UNRESOLVED_NAME;
	}

	@Override
	protected IMessage buildUnspecifiedNameMultipleJoinColumnsMessage() {
		return this.override.isVirtual() ?
				this.buildVirtualOverrideUnspecifiedNameMultipleJoinColumnsMessage() :
				super.buildUnspecifiedNameMultipleJoinColumnsMessage();
	}

	protected IMessage buildVirtualOverrideUnspecifiedNameMultipleJoinColumnsMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				JpaValidationMessages.VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS,
				new String[] {this.override.getName()},
				this.column,
				this.column.getNameTextRange()
			);
	}

	@Override
	protected IMessage buildVirtualAttributeUnspecifiedNameMultipleJoinColumnsMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				this.getVirtualAttributeUnspecifiedNameMultipleJoinColumnsMessage(),
				new String[] {
					this.persistentAttribute.getName(),
					this.override.getName()
				},
				this.column,
				this.persistentAttribute.getValidationTextRange()
			);
	}

	@Override
	protected String getVirtualAttributeUnspecifiedNameMultipleJoinColumnsMessage() {
		return JpaValidationMessages.VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS;
	}

	@Override
	protected IMessage buildUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage() {
		return this.override.isVirtual() ?
				this.buildVirtualOverrideUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage() :
				super.buildUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage();
	}

	protected IMessage buildVirtualOverrideUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				JpaValidationMessages.VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS,
				new String[] {this.override.getName()},
				this.column,
				this.column.getReferencedColumnNameTextRange()
			);
	}

	@Override
	protected IMessage buildVirtualAttributeUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage() {
		return DefaultJpaValidationMessages.buildMessage(
				IMessage.HIGH_SEVERITY,
				this.getVirtualAttributeUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage(),
				new String[] {
					this.persistentAttribute.getName(),
					this.override.getName()
				},
				this.column,
				this.persistentAttribute.getValidationTextRange()
			);
	}

	@Override
	protected String getVirtualAttributeUnspecifiedReferencedColumnNameMultipleJoinColumnsMessage() {
		return JpaValidationMessages.VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS;
	}


	// ********** table validator **********

	public class TableValidator
		extends InverseJoinColumnValidator.TableValidator
	{
		protected TableValidator() {
			super();
		}

		@Override
		protected IMessage buildTableNotValidMessage() {
			return AssociationOverrideInverseJoinColumnValidator.this.override.isVirtual() ?
					this.buildVirtualOverrideColumnTableNotValidMessage() :
					super.buildTableNotValidMessage();
		}

		protected IMessage buildVirtualOverrideColumnTableNotValidMessage() {
			return DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					this.getVirtualOverrideColumnTableNotValidMessage(),
					new String[] {
						AssociationOverrideInverseJoinColumnValidator.this.override.getName(),
						this.getColumn().getTableName(),
						this.getColumn().getName(),
						this.getColumnTableDescriptionMessage()
					},
					this.getColumn(),
					this.getColumn().getTableNameTextRange()
				);
		}

		protected String getVirtualOverrideColumnTableNotValidMessage() {
			return JpaValidationMessages.VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID;
		}

		@Override
		protected IMessage buildVirtualAttributeTableNotValidMessage() {
			return DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					this.getVirtualAttributeColumnTableNotValidMessage(),
					new String[] {
						AssociationOverrideInverseJoinColumnValidator.this.persistentAttribute.getName(),
						AssociationOverrideInverseJoinColumnValidator.this.override.getName(),
						this.getColumn().getTableName(),
						this.getColumn().getName(),
						this.getColumnTableDescriptionMessage()
					},
					this.getColumn(),
					AssociationOverrideInverseJoinColumnValidator.this.persistentAttribute.getValidationTextRange()
				);
		}

		@Override
		protected String getVirtualAttributeColumnTableNotValidMessage() {
			return JpaValidationMessages.VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID;
		}
	}
}
