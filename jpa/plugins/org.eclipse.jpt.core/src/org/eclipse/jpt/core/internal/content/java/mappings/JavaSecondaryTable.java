/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.content.java.mappings;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.ITypeMapping;
import org.eclipse.jpt.core.internal.jdtutility.CombinationIndexedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.ConversionDeclarationAnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.IndexedAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.IndexedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.Member;
import org.eclipse.jpt.core.internal.jdtutility.MemberIndexedAnnotationAdapter;
import org.eclipse.jpt.core.internal.mappings.IAbstractJoinColumn;
import org.eclipse.jpt.core.internal.mappings.IPrimaryKeyJoinColumn;
import org.eclipse.jpt.core.internal.mappings.ISecondaryTable;
import org.eclipse.jpt.core.internal.mappings.JpaCoreMappingsPackage;
import org.eclipse.jpt.utility.internal.Filter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Secondary Table</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getJavaSecondaryTable()
 * @model kind="class"
 * @generated
 */
public class JavaSecondaryTable extends AbstractJavaTable
	implements ISecondaryTable
{
	/**
	 * The cached value of the '{@link #getSpecifiedPrimaryKeyJoinColumns() <em>Specified Primary Key Join Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedPrimaryKeyJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IPrimaryKeyJoinColumn> specifiedPrimaryKeyJoinColumns;

	/**
	 * The cached value of the '{@link #getDefaultPrimaryKeyJoinColumns() <em>Default Primary Key Join Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrimaryKeyJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IPrimaryKeyJoinColumn> defaultPrimaryKeyJoinColumns;

	private final IndexedAnnotationAdapter annotationAdapter;

	protected JavaSecondaryTable() {
		super();
		throw new UnsupportedOperationException("Use JavaSecondaryTable(Owner, Member, int) instead");
	}

	public JavaSecondaryTable(Owner owner, Member member, IndexedDeclarationAnnotationAdapter idaa) {
		super(owner, member, idaa);
		this.annotationAdapter = new MemberIndexedAnnotationAdapter(member, idaa);
		this.getDefaultPrimaryKeyJoinColumns().add(this.createPrimaryKeyJoinColumn(0));
	}

	/**
	 * check for changes to the 'specifiedJoinColumns' and
	 * 'specifiedInverseJoinColumns' lists so we can notify the
	 * model adapter of any changes;
	 * also listen for changes to the 'defaultJoinColumns' and
	 * 'defaultInverseJoinColumns' lists so we can spank the developer
	 */
	@Override
	protected void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		switch (notification.getFeatureID(ISecondaryTable.class)) {
			case JpaCoreMappingsPackage.ISECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				specifiedPKJoinColumnsChanged(notification);
				break;
			default :
				break;
		}
	}

	@SuppressWarnings("unchecked")
	void specifiedPKJoinColumnsChanged(Notification notification) {
		switch (notification.getEventType()) {
			case Notification.ADD :
				specifiedPKJoinColumnAdded(notification.getPosition(), (IPrimaryKeyJoinColumn) notification.getNewValue());
				break;
			case Notification.ADD_MANY :
				specifiedPKJoinColumnsAdded(notification.getPosition(), (List<IPrimaryKeyJoinColumn>) notification.getNewValue());
				break;
			case Notification.REMOVE :
				specifiedPKJoinColumnRemoved(notification.getPosition(), (IPrimaryKeyJoinColumn) notification.getOldValue());
				break;
			case Notification.REMOVE_MANY :
				if (notification.getPosition() == Notification.NO_INDEX) {
					specifiedPKJoinColumnsCleared((List<IPrimaryKeyJoinColumn>) notification.getOldValue());
				}
				else {
					// Notification.getNewValue() returns an array of the positions of objects that were removed
					specifiedPKJoinColumnsRemoved((int[]) notification.getNewValue(), (List<IPrimaryKeyJoinColumn>) notification.getOldValue());
				}
				break;
			case Notification.SET :
				if (!notification.isTouch()) {
					specifiedPKJoinColumnSet(notification.getPosition(), (IPrimaryKeyJoinColumn) notification.getOldValue(), (IPrimaryKeyJoinColumn) notification.getNewValue());
				}
				break;
			case Notification.MOVE :
				// Notification.getOldValue() returns the source index
				// Notification.getPositon() returns the target index
				// Notification.getNewValue() returns the moved object
				specifiedPKJoinColumnMoved(notification.getOldIntValue(), notification.getPosition(), (IPrimaryKeyJoinColumn) notification.getNewValue());
				break;
			default :
				break;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JpaJavaMappingsPackage.Literals.JAVA_SECONDARY_TABLE;
	}

	public EList<IPrimaryKeyJoinColumn> getPrimaryKeyJoinColumns() {
		return this.getSpecifiedPrimaryKeyJoinColumns().isEmpty() ? this.getDefaultPrimaryKeyJoinColumns() : this.getSpecifiedPrimaryKeyJoinColumns();
	}

	/**
	 * Returns the value of the '<em><b>Specified Primary Key Join Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jpt.core.internal.mappings.IPrimaryKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Primary Key Join Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Primary Key Join Columns</em>' containment reference list.
	 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getISecondaryTable_SpecifiedPrimaryKeyJoinColumns()
	 * @model type="org.eclipse.jpt.core.internal.mappings.IPrimaryKeyJoinColumn" containment="true"
	 * @generated
	 */
	public EList<IPrimaryKeyJoinColumn> getSpecifiedPrimaryKeyJoinColumns() {
		if (specifiedPrimaryKeyJoinColumns == null) {
			specifiedPrimaryKeyJoinColumns = new EObjectContainmentEList<IPrimaryKeyJoinColumn>(IPrimaryKeyJoinColumn.class, this, JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS);
		}
		return specifiedPrimaryKeyJoinColumns;
	}

	/**
	 * Returns the value of the '<em><b>Default Primary Key Join Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jpt.core.internal.mappings.IPrimaryKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Primary Key Join Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Primary Key Join Columns</em>' containment reference list.
	 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getISecondaryTable_DefaultPrimaryKeyJoinColumns()
	 * @model type="org.eclipse.jpt.core.internal.mappings.IPrimaryKeyJoinColumn" containment="true"
	 * @generated
	 */
	public EList<IPrimaryKeyJoinColumn> getDefaultPrimaryKeyJoinColumns() {
		if (defaultPrimaryKeyJoinColumns == null) {
			defaultPrimaryKeyJoinColumns = new EObjectContainmentEList<IPrimaryKeyJoinColumn>(IPrimaryKeyJoinColumn.class, this, JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS);
		}
		return defaultPrimaryKeyJoinColumns;
	}

	public ITypeMapping typeMapping() {
		return (ITypeMapping) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS :
				return ((InternalEList<?>) getPrimaryKeyJoinColumns()).basicRemove(otherEnd, msgs);
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				return ((InternalEList<?>) getSpecifiedPrimaryKeyJoinColumns()).basicRemove(otherEnd, msgs);
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
				return ((InternalEList<?>) getDefaultPrimaryKeyJoinColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS :
				return getPrimaryKeyJoinColumns();
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				return getSpecifiedPrimaryKeyJoinColumns();
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
				return getDefaultPrimaryKeyJoinColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				getSpecifiedPrimaryKeyJoinColumns().clear();
				getSpecifiedPrimaryKeyJoinColumns().addAll((Collection<? extends IPrimaryKeyJoinColumn>) newValue);
				return;
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
				getDefaultPrimaryKeyJoinColumns().clear();
				getDefaultPrimaryKeyJoinColumns().addAll((Collection<? extends IPrimaryKeyJoinColumn>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				getSpecifiedPrimaryKeyJoinColumns().clear();
				return;
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
				getDefaultPrimaryKeyJoinColumns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS :
				return !getPrimaryKeyJoinColumns().isEmpty();
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
				return specifiedPrimaryKeyJoinColumns != null && !specifiedPrimaryKeyJoinColumns.isEmpty();
			case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
				return defaultPrimaryKeyJoinColumns != null && !defaultPrimaryKeyJoinColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ISecondaryTable.class) {
			switch (derivedFeatureID) {
				case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS :
					return JpaCoreMappingsPackage.ISECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS;
				case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
					return JpaCoreMappingsPackage.ISECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS;
				case JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
					return JpaCoreMappingsPackage.ISECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ISecondaryTable.class) {
			switch (baseFeatureID) {
				case JpaCoreMappingsPackage.ISECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS :
					return JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS;
				case JpaCoreMappingsPackage.ISECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS :
					return JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS;
				case JpaCoreMappingsPackage.ISECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS :
					return JpaJavaMappingsPackage.JAVA_SECONDARY_TABLE__DEFAULT_PRIMARY_KEY_JOIN_COLUMNS;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	protected void updateFromJava(CompilationUnit astRoot) {
		super.updateFromJava(astRoot);
		this.updateSpecifiedPrimaryKeyJoinColumnsFromJava(astRoot);
	}

	/**
	 * here we just worry about getting the join column lists the same size;
	 * then we delegate to the join columns to synch themselves up
	 */
	private void updateSpecifiedPrimaryKeyJoinColumnsFromJava(CompilationUnit astRoot) {
		// synchronize the model join columns with the Java source
		List<IPrimaryKeyJoinColumn> joinColumns = getSpecifiedPrimaryKeyJoinColumns();
		int persSize = joinColumns.size();
		int javaSize = 0;
		boolean allJavaAnnotationsFound = false;
		for (int i = 0; i < persSize; i++) {
			JavaPrimaryKeyJoinColumn joinColumn = (JavaPrimaryKeyJoinColumn) joinColumns.get(i);
			if (joinColumn.annotation(astRoot) == null) {
				allJavaAnnotationsFound = true;
				break; // no need to go any further
			}
			joinColumn.updateFromJava(astRoot);
			javaSize++;
		}
		if (allJavaAnnotationsFound) {
			// remove any model join columns beyond those that correspond to the Java annotations
			while (persSize > javaSize) {
				persSize--;
				joinColumns.remove(persSize);
			}
		}
		else {
			// add new model join columns until they match the Java annotations
			while (!allJavaAnnotationsFound) {
				JavaPrimaryKeyJoinColumn joinColumn = this.createJavaPrimaryKeyJoinColumn(javaSize);
				if (joinColumn.annotation(astRoot) == null) {
					allJavaAnnotationsFound = true;
				}
				else {
					getSpecifiedPrimaryKeyJoinColumns().add(joinColumn);
					joinColumn.updateFromJava(astRoot);
					javaSize++;
				}
			}
		}
	}

	/**
	 * allow owners to verify the annotation
	 */
	public Annotation annotation(CompilationUnit astRoot) {
		return this.annotationAdapter.getAnnotation(astRoot);
	}

	@Override
	protected void setDefaultName(String newDefaultName) {
		throw new UnsupportedOperationException("No default name for a secondary table");
	}

	// ********** AbstractJavaTable implementation **********
	@Override
	protected DeclarationAnnotationElementAdapter<String> nameAdapter(DeclarationAnnotationAdapter daa) {
		return ConversionDeclarationAnnotationElementAdapter.forStrings(daa, JPA.SECONDARY_TABLE__NAME);
	}

	@Override
	protected DeclarationAnnotationElementAdapter<String> schemaAdapter(DeclarationAnnotationAdapter daa) {
		return ConversionDeclarationAnnotationElementAdapter.forStrings(daa, JPA.SECONDARY_TABLE__SCHEMA);
	}

	@Override
	protected DeclarationAnnotationElementAdapter<String> catalogAdapter(DeclarationAnnotationAdapter daa) {
		return ConversionDeclarationAnnotationElementAdapter.forStrings(daa, JPA.SECONDARY_TABLE__CATALOG);
	}

	public IPrimaryKeyJoinColumn createPrimaryKeyJoinColumn(int index) {
		return this.createJavaPrimaryKeyJoinColumn(index);
	}

	private JavaPrimaryKeyJoinColumn createJavaPrimaryKeyJoinColumn(int index) {
		return JavaPrimaryKeyJoinColumn.createSecondaryTableJoinColumn(this.getDeclarationAnnotationAdapter(), buildPkJoinColumnOwner(), this.getMember(), index);
	}

	protected IAbstractJoinColumn.Owner buildPkJoinColumnOwner() {
		return new ISecondaryTable.PrimaryKeyJoinColumnOwner(this);
	}

	public boolean containsSpecifiedPrimaryKeyJoinColumns() {
		return !this.getSpecifiedPrimaryKeyJoinColumns().isEmpty();
	}

	@Override
	protected JavaUniqueConstraint createJavaUniqueConstraint(int index) {
		return JavaUniqueConstraint.createSecondaryTableUniqueConstraint(new UniqueConstraintOwner(this), this.getDeclarationAnnotationAdapter(), getMember(), index);
	}

	// ********** persistence model -> java annotations **********
	void moveAnnotation(int newIndex) {
		this.annotationAdapter.moveAnnotation(newIndex);
	}

	void newAnnotation() {
		this.annotationAdapter.newMarkerAnnotation();
	}

	void removeAnnotation() {
		this.annotationAdapter.removeAnnotation();
	}

	// ********** jpa model -> java annotations **********
	/**
	 * slide over all the annotations that follow the new join column
	 */
	public void specifiedPKJoinColumnAdded(int index, IPrimaryKeyJoinColumn joinColumn) {
		//JoinColumn was added to persistence model when udating from java, do not need
		//to edit the java in this case. TODO is there a better way to handle this??
		if (((JavaPrimaryKeyJoinColumn) joinColumn).annotation(getMember().astRoot()) == null) {
			this.synchPKJoinColumnAnnotationsAfterAdd(index + 1);
			((JavaPrimaryKeyJoinColumn) joinColumn).newAnnotation();
		}
	}

	// bjv look at this
	public void specifiedPKJoinColumnsAdded(int index, List<IPrimaryKeyJoinColumn> joinColumns) {
		//JoinColumn was added to persistence model when udating from java, do not need
		//to edit the java in this case. TODO is there a better way to handle this??
		if (!joinColumns.isEmpty() && ((JavaPrimaryKeyJoinColumn) joinColumns.get(0)).annotation(getMember().astRoot()) == null) {
			this.synchPKJoinColumnAnnotationsAfterAdd(index + joinColumns.size());
			for (IPrimaryKeyJoinColumn joinColumn : joinColumns) {
				((JavaPrimaryKeyJoinColumn) joinColumn).newAnnotation();
			}
		}
	}

	public void specifiedPKJoinColumnRemoved(int index, IPrimaryKeyJoinColumn joinColumn) {
		((JavaPrimaryKeyJoinColumn) joinColumn).removeAnnotation();
		this.synchPKJoinColumnAnnotationsAfterRemove(index);
	}

	public void specifiedPKJoinColumnsRemoved(int[] indexes, List<IPrimaryKeyJoinColumn> joinColumns) {
		for (IPrimaryKeyJoinColumn joinColumn : joinColumns) {
			((JavaPrimaryKeyJoinColumn) joinColumn).removeAnnotation();
		}
		this.synchPKJoinColumnAnnotationsAfterRemove(indexes[0]);
	}

	public void specifiedPKJoinColumnsCleared(List<IPrimaryKeyJoinColumn> joinColumns) {
		for (IPrimaryKeyJoinColumn joinColumn : joinColumns) {
			((JavaPrimaryKeyJoinColumn) joinColumn).removeAnnotation();
		}
	}

	public void specifiedPKJoinColumnSet(int index, IPrimaryKeyJoinColumn oldJoinColumn, IPrimaryKeyJoinColumn newJoinColumn) {
		((JavaPrimaryKeyJoinColumn) newJoinColumn).newAnnotation();
	}

	public void specifiedPKJoinColumnMoved(int sourceIndex, int targetIndex, IPrimaryKeyJoinColumn joinColumn) {
		List<IPrimaryKeyJoinColumn> joinColumns = this.getSpecifiedPrimaryKeyJoinColumns();
		int begin = Math.min(sourceIndex, targetIndex);
		int end = Math.max(sourceIndex, targetIndex);
		for (int i = begin; i-- > end;) {
			this.synch(joinColumns.get(i), i);
		}
	}

	/**
	 * synchronize the annotations with the model join columns,
	 * starting at the end of the list to prevent overlap
	 */
	private void synchPKJoinColumnAnnotationsAfterAdd(int index) {
		List<IPrimaryKeyJoinColumn> joinColumns = this.getSpecifiedPrimaryKeyJoinColumns();
		for (int i = joinColumns.size(); i-- > index;) {
			this.synch(joinColumns.get(i), i);
		}
	}

	/**
	 * synchronize the annotations with the model join columns,
	 * starting at the specified index to prevent overlap
	 */
	private void synchPKJoinColumnAnnotationsAfterRemove(int index) {
		List<IPrimaryKeyJoinColumn> joinColumns = this.getSpecifiedPrimaryKeyJoinColumns();
		for (int i = index; i < joinColumns.size(); i++) {
			this.synch(joinColumns.get(i), i);
		}
	}

	private void synch(IPrimaryKeyJoinColumn joinColumn, int index) {
		((JavaPrimaryKeyJoinColumn) joinColumn).moveAnnotation(index);
	}

	@Override
	public Iterator<String> candidateValuesFor(int pos, Filter<String> filter, CompilationUnit astRoot) {
		Iterator<String> result = super.candidateValuesFor(pos, filter, astRoot);
		if (result != null) {
			return result;
		}
		for (IPrimaryKeyJoinColumn column : this.getPrimaryKeyJoinColumns()) {
			result = ((JavaPrimaryKeyJoinColumn) column).candidateValuesFor(pos, filter, astRoot);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	// ********** static methods **********
	static JavaSecondaryTable createJavaSecondaryTable(Owner owner, Member member, int index) {
		return JpaJavaMappingsFactory.eINSTANCE.createJavaSecondaryTable(owner, member, buildDeclarationAnnotationAdapter(index));
	}

	private static IndexedDeclarationAnnotationAdapter buildDeclarationAnnotationAdapter(int index) {
		return new CombinationIndexedDeclarationAnnotationAdapter(JPA.SECONDARY_TABLE, JPA.SECONDARY_TABLES, index);
	}
} // JavaSecondaryTable
