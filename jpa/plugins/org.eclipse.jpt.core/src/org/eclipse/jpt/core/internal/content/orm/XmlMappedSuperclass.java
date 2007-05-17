/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.content.orm;

import java.util.Iterator;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.core.internal.IPersistentAttribute;
import org.eclipse.jpt.core.internal.mappings.IMappedSuperclass;
import org.eclipse.jpt.core.internal.mappings.ITable;
import org.eclipse.jpt.core.internal.mappings.JpaCoreMappingsPackage;
import org.eclipse.jpt.utility.internal.iterators.EmptyIterator;
import org.eclipse.jpt.utility.internal.iterators.FilteringIterator;
import org.eclipse.jpt.utility.internal.iterators.TransformationIterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Mapped Superclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jpt.core.internal.content.orm.XmlMappedSuperclass#getIdClassForXml <em>Id Class For Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jpt.core.internal.content.orm.OrmPackage#getXmlMappedSuperclass()
 * @model kind="class"
 * @generated
 */
public class XmlMappedSuperclass extends XmlTypeMapping
	implements IMappedSuperclass
{
	/**
	 * The default value of the '{@link #getIdClass() <em>Id Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
	protected String idClass = ID_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdClassForXml() <em>Id Class For Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClassForXml()
	 * @generated
	 * @ordered
	 */
	protected XmlIdClass idClassForXml;

	protected XmlMappedSuperclass() {
		super();
		this.eAdapters().add(this.buildListener());
	}

	protected Adapter buildListener() {
		return new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				XmlMappedSuperclass.this.notifyChanged(notification);
			}
		};
	}

	protected void notifyChanged(Notification notification) {
		switch (notification.getFeatureID(IMappedSuperclass.class)) {
			case JpaCoreMappingsPackage.IMAPPED_SUPERCLASS__ID_CLASS :
				idClassChanged();
				break;
			default :
				break;
		}
		switch (notification.getFeatureID(XmlMappedSuperclass.class)) {
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				xmlIdClassChanged();
				break;
			default :
				break;
		}
	}

	protected void idClassChanged() {
		if (getIdClass() == null) {
			setIdClassForXml(null);
		}
		else {
			if (getIdClassForXml() == null) {
				setIdClassForXml(OrmFactory.eINSTANCE.createXmlIdClass());
			}
			getIdClassForXml().setValue(getIdClass());
		}
	}

	protected void xmlIdClassChanged() {
		if (getIdClassForXml() == null) {
			setIdClass(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.XML_MAPPED_SUPERCLASS;
	}

	/**
	 * Returns the value of the '<em><b>Id Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Class</em>' attribute.
	 * @see #setIdClass(String)
	 * @see org.eclipse.jpt.core.internal.content.orm.OrmPackage#getIMappedSuperclass_IdClass()
	 * @model
	 * @generated
	 */
	public String getIdClass() {
		return idClass;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.jpt.core.internal.content.orm.XmlMappedSuperclass#getIdClass <em>Id Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Class</em>' attribute.
	 * @see #getIdClass()
	 * @generated
	 */
	public void setIdClass(String newIdClass) {
		String oldIdClass = idClass;
		idClass = newIdClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS, oldIdClass, idClass));
	}

	/**
	 * Returns the value of the '<em><b>Id Class For Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Class For Xml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Class For Xml</em>' containment reference.
	 * @see #setIdClassForXml(XmlIdClass)
	 * @see org.eclipse.jpt.core.internal.content.orm.OrmPackage#getXmlMappedSuperclass_IdClassForXml()
	 * @model containment="true"
	 * @generated
	 */
	public XmlIdClass getIdClassForXml() {
		return idClassForXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdClassForXml(XmlIdClass newIdClassForXml, NotificationChain msgs) {
		XmlIdClass oldIdClassForXml = idClassForXml;
		idClassForXml = newIdClassForXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML, oldIdClassForXml, newIdClassForXml);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.jpt.core.internal.content.orm.XmlMappedSuperclass#getIdClassForXml <em>Id Class For Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Class For Xml</em>' containment reference.
	 * @see #getIdClassForXml()
	 * @generated
	 */
	public void setIdClassForXml(XmlIdClass newIdClassForXml) {
		if (newIdClassForXml != idClassForXml) {
			NotificationChain msgs = null;
			if (idClassForXml != null)
				msgs = ((InternalEObject) idClassForXml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML, null, msgs);
			if (newIdClassForXml != null)
				msgs = ((InternalEObject) newIdClassForXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML, null, msgs);
			msgs = basicSetIdClassForXml(newIdClassForXml, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML, newIdClassForXml, newIdClassForXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				return basicSetIdClassForXml(null, msgs);
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
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS :
				return getIdClass();
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				return getIdClassForXml();
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
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS :
				setIdClass((String) newValue);
				return;
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				setIdClassForXml((XmlIdClass) newValue);
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
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS :
				setIdClass(ID_CLASS_EDEFAULT);
				return;
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				setIdClassForXml((XmlIdClass) null);
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
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS :
				return ID_CLASS_EDEFAULT == null ? idClass != null : !ID_CLASS_EDEFAULT.equals(idClass);
			case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS_FOR_XML :
				return idClassForXml != null;
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
		if (baseClass == IMappedSuperclass.class) {
			switch (derivedFeatureID) {
				case OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS :
					return JpaCoreMappingsPackage.IMAPPED_SUPERCLASS__ID_CLASS;
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
		if (baseClass == IMappedSuperclass.class) {
			switch (baseFeatureID) {
				case JpaCoreMappingsPackage.IMAPPED_SUPERCLASS__ID_CLASS :
					return OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (idClass: ");
		result.append(idClass);
		result.append(')');
		return result.toString();
	}

	public String getKey() {
		return IMappingKeys.MAPPED_SUPERCLASS_TYPE_MAPPING_KEY;
	}

	public boolean tableNameIsInvalid(String tableName) {
		return false;
	}

	public Iterator<String> associatedTableNamesIncludingInherited() {
		return EmptyIterator.instance();
	}

	public Iterator<ITable> associatedTables() {
		return EmptyIterator.instance();
	}

	public Iterator<ITable> associatedTablesIncludingInherited() {
		return EmptyIterator.instance();
	}

	public Iterator<String> overridableAttributeNames() {
		return this.namesOf(this.overridableAttributes());
	}

	public Iterator<IPersistentAttribute> overridableAttributes() {
		return new FilteringIterator<IPersistentAttribute>(this.getPersistentType().attributes()) {
			@Override
			protected boolean accept(Object o) {
				return ((IPersistentAttribute) o).isOverridableAttribute();
			}
		};
	}

	public Iterator<String> overridableAssociationNames() {
		return this.namesOf(this.overridableAssociations());
	}

	public Iterator<IPersistentAttribute> overridableAssociations() {
		return new FilteringIterator<IPersistentAttribute>(this.getPersistentType().attributes()) {
			@Override
			protected boolean accept(Object o) {
				return ((IPersistentAttribute) o).isOverridableAssociation();
			}
		};
	}

	private Iterator<String> namesOf(Iterator<IPersistentAttribute> attributes) {
		return new TransformationIterator<IPersistentAttribute, String>(attributes) {
			@Override
			protected String transform(IPersistentAttribute attribute) {
				return attribute.getName();
			}
		};
	}

	@Override
	public int xmlSequence() {
		return 0;
	}
}
