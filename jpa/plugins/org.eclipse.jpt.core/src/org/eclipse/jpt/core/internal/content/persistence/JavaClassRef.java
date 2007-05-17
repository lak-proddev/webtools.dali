/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.content.persistence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.IType;
import org.eclipse.jem.internal.adapters.jdom.JDOMSearchHelper;
import org.eclipse.jpt.core.internal.ITextRange;
import org.eclipse.jpt.core.internal.XmlEObject;
import org.eclipse.jpt.utility.internal.StringTools;
import org.eclipse.wst.common.internal.emf.utilities.DOMUtilities;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jpt.core.internal.content.persistence.JavaClassRef#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jpt.core.internal.content.persistence.PersistencePackage#getJavaClassRef()
 * @model kind="class"
 * @generated
 */
public class JavaClassRef extends XmlEObject
{
	/**
	 * The default value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected String javaClass = JAVA_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaClassRef() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.JAVA_CLASS_REF;
	}

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(String)
	 * @see org.eclipse.jpt.core.internal.content.persistence.PersistencePackage#getJavaClassRef_JavaClass()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	public String getJavaClass() {
		return javaClass;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.jpt.core.internal.content.persistence.JavaClassRef#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	public void setJavaClass(String newJavaClass) {
		String oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.JAVA_CLASS_REF__JAVA_CLASS, oldJavaClass, javaClass));
	}

	public IType findJdtType() {
		String fqClassName = getJavaClass();
		if (StringTools.stringIsEmpty(fqClassName)) {
			return null;
		}
		int dotIndex = fqClassName.lastIndexOf('.');
		String packageName = (dotIndex >= 0) ? fqClassName.substring(0, dotIndex) : "";
		String className = (dotIndex >= 0) ? fqClassName.substring(dotIndex + 1, fqClassName.length()) : fqClassName;
		return JDOMSearchHelper.findType(packageName, className, getJpaProject().getJavaProject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.JAVA_CLASS_REF__JAVA_CLASS :
				return getJavaClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.JAVA_CLASS_REF__JAVA_CLASS :
				setJavaClass((String) newValue);
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
			case PersistencePackage.JAVA_CLASS_REF__JAVA_CLASS :
				setJavaClass(JAVA_CLASS_EDEFAULT);
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
			case PersistencePackage.JAVA_CLASS_REF__JAVA_CLASS :
				return JAVA_CLASS_EDEFAULT == null ? javaClass != null : !JAVA_CLASS_EDEFAULT.equals(javaClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (javaClass: ");
		result.append(javaClass);
		result.append(')');
		return result.toString();
	}

	@Override
	public ITextRange validationTextRange() {
		IDOMNode textNode = (IDOMNode) DOMUtilities.getChildTextNode(node);
		if (textNode != null) {
			return buildTextRange(textNode);
		}
		else {
			return buildTextRange(node);
		}
	}
}
