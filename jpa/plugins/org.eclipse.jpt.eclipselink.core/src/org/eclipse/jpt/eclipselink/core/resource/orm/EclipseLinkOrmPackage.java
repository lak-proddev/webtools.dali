/*******************************************************************************
 *  Copyright (c) 2008  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.core.resource.orm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.jpt.core.resource.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmFactory
 * @model kind="package"
 * @generated
 */
public class EclipseLinkOrmPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "orm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "jpt.eclipselink.orm.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.jpt.eclipselink.core.resource.orm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EclipseLinkOrmPackage eINSTANCE = org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly <em>Xml Read Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlReadOnly()
	 * @generated
	 */
	public static final int XML_READ_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_READ_ONLY__READ_ONLY = 0;

	/**
	 * The number of structural features of the '<em>Xml Read Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_READ_ONLY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity <em>Xml Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEntity()
	 * @generated
	 */
	public static final int XML_ENTITY = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMappedSuperclass()
	 * @generated
	 */
	public static final int XML_MAPPED_SUPERCLASS = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned <em>Xml Private Owned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlPrivateOwned()
	 * @generated
	 */
	public static final int XML_PRIVATE_OWNED = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToOne()
	 * @generated
	 */
	public static final int XML_ONE_TO_ONE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToMany()
	 * @generated
	 */
	public static final int XML_ONE_TO_MANY = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer <em>Xml Customizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizer()
	 * @generated
	 */
	public static final int XML_CUSTOMIZER = 1;

	/**
	 * The feature id for the '<em><b>Customizer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CUSTOMIZER__CUSTOMIZER_CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Xml Customizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CUSTOMIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder <em>Xml Customizer Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizerHolder()
	 * @generated
	 */
	public static final int XML_CUSTOMIZER_HOLDER = 2;

	/**
	 * The feature id for the '<em><b>Customizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CUSTOMIZER_HOLDER__CUSTOMIZER = 0;

	/**
	 * The number of structural features of the '<em>Xml Customizer Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CUSTOMIZER_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CLASS_NAME = OrmPackage.XML_ENTITY__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ACCESS = OrmPackage.XML_ENTITY__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__METADATA_COMPLETE = OrmPackage.XML_ENTITY__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DESCRIPTION = OrmPackage.XML_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ATTRIBUTES = OrmPackage.XML_ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAME = OrmPackage.XML_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__TABLE = OrmPackage.XML_ENTITY__TABLE;

	/**
	 * The feature id for the '<em><b>Secondary Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SECONDARY_TABLES = OrmPackage.XML_ENTITY__SECONDARY_TABLES;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRIMARY_KEY_JOIN_COLUMNS = OrmPackage.XML_ENTITY__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ID_CLASS = OrmPackage.XML_ENTITY__ID_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__INHERITANCE = OrmPackage.XML_ENTITY__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DISCRIMINATOR_VALUE = OrmPackage.XML_ENTITY__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DISCRIMINATOR_COLUMN = OrmPackage.XML_ENTITY__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SEQUENCE_GENERATOR = OrmPackage.XML_ENTITY__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__TABLE_GENERATOR = OrmPackage.XML_ENTITY__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAMED_QUERIES = OrmPackage.XML_ENTITY__NAMED_QUERIES;

	/**
	 * The feature id for the '<em><b>Named Native Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAMED_NATIVE_QUERIES = OrmPackage.XML_ENTITY__NAMED_NATIVE_QUERIES;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SQL_RESULT_SET_MAPPINGS = OrmPackage.XML_ENTITY__SQL_RESULT_SET_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXCLUDE_DEFAULT_LISTENERS = OrmPackage.XML_ENTITY__EXCLUDE_DEFAULT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = OrmPackage.XML_ENTITY__EXCLUDE_SUPERCLASS_LISTENERS;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ENTITY_LISTENERS = OrmPackage.XML_ENTITY__ENTITY_LISTENERS;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_PERSIST = OrmPackage.XML_ENTITY__PRE_PERSIST;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_PERSIST = OrmPackage.XML_ENTITY__POST_PERSIST;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_REMOVE = OrmPackage.XML_ENTITY__PRE_REMOVE;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_REMOVE = OrmPackage.XML_ENTITY__POST_REMOVE;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_UPDATE = OrmPackage.XML_ENTITY__PRE_UPDATE;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_UPDATE = OrmPackage.XML_ENTITY__POST_UPDATE;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_LOAD = OrmPackage.XML_ENTITY__POST_LOAD;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ATTRIBUTE_OVERRIDES = OrmPackage.XML_ENTITY__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Association Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ASSOCIATION_OVERRIDES = OrmPackage.XML_ENTITY__ASSOCIATION_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__READ_ONLY = OrmPackage.XML_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CUSTOMIZER = OrmPackage.XML_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_FEATURE_COUNT = OrmPackage.XML_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CLASS_NAME = OrmPackage.XML_MAPPED_SUPERCLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ACCESS = OrmPackage.XML_MAPPED_SUPERCLASS__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__METADATA_COMPLETE = OrmPackage.XML_MAPPED_SUPERCLASS__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__DESCRIPTION = OrmPackage.XML_MAPPED_SUPERCLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ATTRIBUTES = OrmPackage.XML_MAPPED_SUPERCLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ID_CLASS = OrmPackage.XML_MAPPED_SUPERCLASS__ID_CLASS;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = OrmPackage.XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = OrmPackage.XML_MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ENTITY_LISTENERS = OrmPackage.XML_MAPPED_SUPERCLASS__ENTITY_LISTENERS;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_PERSIST = OrmPackage.XML_MAPPED_SUPERCLASS__PRE_PERSIST;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_PERSIST = OrmPackage.XML_MAPPED_SUPERCLASS__POST_PERSIST;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_REMOVE = OrmPackage.XML_MAPPED_SUPERCLASS__PRE_REMOVE;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_REMOVE = OrmPackage.XML_MAPPED_SUPERCLASS__POST_REMOVE;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_UPDATE = OrmPackage.XML_MAPPED_SUPERCLASS__PRE_UPDATE;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_UPDATE = OrmPackage.XML_MAPPED_SUPERCLASS__POST_UPDATE;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_LOAD = OrmPackage.XML_MAPPED_SUPERCLASS__POST_LOAD;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__READ_ONLY = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CUSTOMIZER = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS_FEATURE_COUNT = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable <em>Xml Mutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMutable()
	 * @generated
	 */
	public static final int XML_MUTABLE = 5;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MUTABLE__MUTABLE = 0;

	/**
	 * The number of structural features of the '<em>Xml Mutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MUTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlId <em>Xml Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlId
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlId()
	 * @generated
	 */
	public static final int XML_ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__NAME = OrmPackage.XML_ID_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__COLUMN = OrmPackage.XML_ID_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__LOB = OrmPackage.XML_ID_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TEMPORAL = OrmPackage.XML_ID_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__ENUMERATED = OrmPackage.XML_ID_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__GENERATED_VALUE = OrmPackage.XML_ID_IMPL__GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TABLE_GENERATOR = OrmPackage.XML_ID_IMPL__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__SEQUENCE_GENERATOR = OrmPackage.XML_ID_IMPL__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__MUTABLE = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_FEATURE_COUNT = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic <em>Xml Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasic()
	 * @generated
	 */
	public static final int XML_BASIC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__NAME = OrmPackage.XML_BASIC_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__COLUMN = OrmPackage.XML_BASIC_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__LOB = OrmPackage.XML_BASIC_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__TEMPORAL = OrmPackage.XML_BASIC_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__ENUMERATED = OrmPackage.XML_BASIC_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__FETCH = OrmPackage.XML_BASIC_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__OPTIONAL = OrmPackage.XML_BASIC_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__MUTABLE = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_FEATURE_COUNT = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion <em>Xml Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVersion()
	 * @generated
	 */
	public static final int XML_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__NAME = OrmPackage.XML_VERSION_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__COLUMN = OrmPackage.XML_VERSION_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__LOB = OrmPackage.XML_VERSION_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__TEMPORAL = OrmPackage.XML_VERSION_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__ENUMERATED = OrmPackage.XML_VERSION_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__MUTABLE = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_FEATURE_COUNT = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIVATE_OWNED__PRIVATE_OWNED = 0;

	/**
	 * The number of structural features of the '<em>Xml Private Owned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIVATE_OWNED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch <em>Xml Join Fetch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetch()
	 * @generated
	 */
	public static final int XML_JOIN_FETCH = 10;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_FETCH__JOIN_FETCH = 0;

	/**
	 * The number of structural features of the '<em>Xml Join Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_FETCH_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__NAME = OrmPackage.XML_ONE_TO_ONE_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__TARGET_ENTITY = OrmPackage.XML_ONE_TO_ONE_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__FETCH = OrmPackage.XML_ONE_TO_ONE_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_TABLE = OrmPackage.XML_ONE_TO_ONE_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__CASCADE = OrmPackage.XML_ONE_TO_ONE_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__OPTIONAL = OrmPackage.XML_ONE_TO_ONE_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE_IMPL__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__MAPPED_BY = OrmPackage.XML_ONE_TO_ONE_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE_IMPL__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_FETCH = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_FEATURE_COUNT = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__NAME = OrmPackage.XML_ONE_TO_MANY_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__TARGET_ENTITY = OrmPackage.XML_ONE_TO_MANY_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__FETCH = OrmPackage.XML_ONE_TO_MANY_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_TABLE = OrmPackage.XML_ONE_TO_MANY_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__CASCADE = OrmPackage.XML_ONE_TO_MANY_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAPPED_BY = OrmPackage.XML_ONE_TO_MANY_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__ORDER_BY = OrmPackage.XML_ONE_TO_MANY_IMPL__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAP_KEY = OrmPackage.XML_ONE_TO_MANY_IMPL__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_MANY_IMPL__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_FETCH = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_FEATURE_COUNT = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToOne()
	 * @generated
	 */
	public static final int XML_MANY_TO_ONE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__NAME = OrmPackage.XML_MANY_TO_ONE_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__TARGET_ENTITY = OrmPackage.XML_MANY_TO_ONE_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__FETCH = OrmPackage.XML_MANY_TO_ONE_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_TABLE = OrmPackage.XML_MANY_TO_ONE_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__CASCADE = OrmPackage.XML_MANY_TO_ONE_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__OPTIONAL = OrmPackage.XML_MANY_TO_ONE_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_COLUMNS = OrmPackage.XML_MANY_TO_ONE_IMPL__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_FETCH = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_FEATURE_COUNT = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToMany()
	 * @generated
	 */
	public static final int XML_MANY_TO_MANY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__NAME = OrmPackage.XML_MANY_TO_MANY_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__TARGET_ENTITY = OrmPackage.XML_MANY_TO_MANY_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__FETCH = OrmPackage.XML_MANY_TO_MANY_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__JOIN_TABLE = OrmPackage.XML_MANY_TO_MANY_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__CASCADE = OrmPackage.XML_MANY_TO_MANY_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAPPED_BY = OrmPackage.XML_MANY_TO_MANY_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__ORDER_BY = OrmPackage.XML_MANY_TO_MANY_IMPL__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAP_KEY = OrmPackage.XML_MANY_TO_MANY_IMPL__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__JOIN_FETCH = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_FEATURE_COUNT = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType <em>Xml Join Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetchType()
	 * @generated
	 */
	public static final int XML_JOIN_FETCH_TYPE = 15;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlReadOnlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMappedSuperclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPrivateOwnedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlJoinFetchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlJoinFetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCustomizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCustomizerHolderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EclipseLinkOrmPackage()
	{
		super(eNS_URI, EclipseLinkOrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EclipseLinkOrmPackage init()
	{
		if (isInited) return (EclipseLinkOrmPackage)EPackage.Registry.INSTANCE.getEPackage(EclipseLinkOrmPackage.eNS_URI);

		// Obtain or create and register package
		EclipseLinkOrmPackage theEclipseLinkOrmPackage = (EclipseLinkOrmPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EclipseLinkOrmPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EclipseLinkOrmPackage());

		isInited = true;

		// Initialize simple dependencies
		OrmPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEclipseLinkOrmPackage.createPackageContents();

		// Initialize created meta-data
		theEclipseLinkOrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclipseLinkOrmPackage.freeze();

		return theEclipseLinkOrmPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly <em>Xml Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Read Only</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly
	 * @generated
	 */
	public EClass getXmlReadOnly()
	{
		return xmlReadOnlyEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly#getReadOnly()
	 * @see #getXmlReadOnly()
	 * @generated
	 */
	public EAttribute getXmlReadOnly_ReadOnly()
	{
		return (EAttribute)xmlReadOnlyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity <em>Xml Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Entity</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity
	 * @generated
	 */
	public EClass getXmlEntity()
	{
		return xmlEntityEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Mapped Superclass</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass
	 * @generated
	 */
	public EClass getXmlMappedSuperclass()
	{
		return xmlMappedSuperclassEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable <em>Xml Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Mutable</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable
	 * @generated
	 */
	public EClass getXmlMutable()
	{
		return xmlMutableEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable#getMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable#getMutable()
	 * @see #getXmlMutable()
	 * @generated
	 */
	public EAttribute getXmlMutable_Mutable()
	{
		return (EAttribute)xmlMutableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlId <em>Xml Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Id</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlId
	 * @generated
	 */
	public EClass getXmlId()
	{
		return xmlIdEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic <em>Xml Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic
	 * @generated
	 */
	public EClass getXmlBasic()
	{
		return xmlBasicEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion <em>Xml Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Version</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion
	 * @generated
	 */
	public EClass getXmlVersion()
	{
		return xmlVersionEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned <em>Xml Private Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Private Owned</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned
	 * @generated
	 */
	public EClass getXmlPrivateOwned()
	{
		return xmlPrivateOwnedEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned#isPrivateOwned <em>Private Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Owned</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned#isPrivateOwned()
	 * @see #getXmlPrivateOwned()
	 * @generated
	 */
	public EAttribute getXmlPrivateOwned_PrivateOwned()
	{
		return (EAttribute)xmlPrivateOwnedEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch <em>Xml Join Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Join Fetch</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch
	 * @generated
	 */
	public EClass getXmlJoinFetch()
	{
		return xmlJoinFetchEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch#getJoinFetch <em>Join Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Fetch</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch#getJoinFetch()
	 * @see #getXmlJoinFetch()
	 * @generated
	 */
	public EAttribute getXmlJoinFetch_JoinFetch()
	{
		return (EAttribute)xmlJoinFetchEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To One</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne
	 * @generated
	 */
	public EClass getXmlOneToOne()
	{
		return xmlOneToOneEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To Many</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany
	 * @generated
	 */
	public EClass getXmlOneToMany()
	{
		return xmlOneToManyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To One</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne
	 * @generated
	 */
	public EClass getXmlManyToOne()
	{
		return xmlManyToOneEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To Many</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany
	 * @generated
	 */
	public EClass getXmlManyToMany()
	{
		return xmlManyToManyEClass;
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType <em>Xml Join Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Join Fetch Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType
	 * @generated
	 */
	public EEnum getXmlJoinFetchType()
	{
		return xmlJoinFetchTypeEEnum;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer <em>Xml Customizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Customizer</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer
	 * @generated
	 */
	public EClass getXmlCustomizer()
	{
		return xmlCustomizerEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer#getCustomizerClassName <em>Customizer Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customizer Class Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer#getCustomizerClassName()
	 * @see #getXmlCustomizer()
	 * @generated
	 */
	public EAttribute getXmlCustomizer_CustomizerClassName()
	{
		return (EAttribute)xmlCustomizerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder <em>Xml Customizer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Customizer Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder
	 * @generated
	 */
	public EClass getXmlCustomizerHolder()
	{
		return xmlCustomizerHolderEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder#getCustomizer <em>Customizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customizer</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder#getCustomizer()
	 * @see #getXmlCustomizerHolder()
	 * @generated
	 */
	public EReference getXmlCustomizerHolder_Customizer()
	{
		return (EReference)xmlCustomizerHolderEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EclipseLinkOrmFactory getEclipseLinkOrmFactory()
	{
		return (EclipseLinkOrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xmlReadOnlyEClass = createEClass(XML_READ_ONLY);
		createEAttribute(xmlReadOnlyEClass, XML_READ_ONLY__READ_ONLY);

		xmlCustomizerEClass = createEClass(XML_CUSTOMIZER);
		createEAttribute(xmlCustomizerEClass, XML_CUSTOMIZER__CUSTOMIZER_CLASS_NAME);

		xmlCustomizerHolderEClass = createEClass(XML_CUSTOMIZER_HOLDER);
		createEReference(xmlCustomizerHolderEClass, XML_CUSTOMIZER_HOLDER__CUSTOMIZER);

		xmlEntityEClass = createEClass(XML_ENTITY);

		xmlMappedSuperclassEClass = createEClass(XML_MAPPED_SUPERCLASS);

		xmlMutableEClass = createEClass(XML_MUTABLE);
		createEAttribute(xmlMutableEClass, XML_MUTABLE__MUTABLE);

		xmlIdEClass = createEClass(XML_ID);

		xmlBasicEClass = createEClass(XML_BASIC);

		xmlVersionEClass = createEClass(XML_VERSION);

		xmlPrivateOwnedEClass = createEClass(XML_PRIVATE_OWNED);
		createEAttribute(xmlPrivateOwnedEClass, XML_PRIVATE_OWNED__PRIVATE_OWNED);

		xmlJoinFetchEClass = createEClass(XML_JOIN_FETCH);
		createEAttribute(xmlJoinFetchEClass, XML_JOIN_FETCH__JOIN_FETCH);

		xmlOneToOneEClass = createEClass(XML_ONE_TO_ONE);

		xmlOneToManyEClass = createEClass(XML_ONE_TO_MANY);

		xmlManyToOneEClass = createEClass(XML_MANY_TO_ONE);

		xmlManyToManyEClass = createEClass(XML_MANY_TO_MANY);

		// Create enums
		xmlJoinFetchTypeEEnum = createEEnum(XML_JOIN_FETCH_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlEntityEClass.getESuperTypes().add(theOrmPackage.getXmlEntity());
		xmlEntityEClass.getESuperTypes().add(this.getXmlReadOnly());
		xmlEntityEClass.getESuperTypes().add(this.getXmlCustomizerHolder());
		xmlMappedSuperclassEClass.getESuperTypes().add(theOrmPackage.getXmlMappedSuperclass());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlReadOnly());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlCustomizerHolder());
		xmlIdEClass.getESuperTypes().add(theOrmPackage.getXmlIdImpl());
		xmlIdEClass.getESuperTypes().add(this.getXmlMutable());
		xmlBasicEClass.getESuperTypes().add(theOrmPackage.getXmlBasicImpl());
		xmlBasicEClass.getESuperTypes().add(this.getXmlMutable());
		xmlVersionEClass.getESuperTypes().add(theOrmPackage.getXmlVersionImpl());
		xmlVersionEClass.getESuperTypes().add(this.getXmlMutable());
		xmlOneToOneEClass.getESuperTypes().add(theOrmPackage.getXmlOneToOneImpl());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlPrivateOwned());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlOneToManyEClass.getESuperTypes().add(theOrmPackage.getXmlOneToManyImpl());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlPrivateOwned());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlManyToOneEClass.getESuperTypes().add(theOrmPackage.getXmlManyToOneImpl());
		xmlManyToOneEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlManyToManyEClass.getESuperTypes().add(theOrmPackage.getXmlManyToManyImpl());
		xmlManyToManyEClass.getESuperTypes().add(this.getXmlJoinFetch());

		// Initialize classes and features; add operations and parameters
		initEClass(xmlReadOnlyEClass, XmlReadOnly.class, "XmlReadOnly", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlReadOnly_ReadOnly(), theXMLTypePackage.getBooleanObject(), "readOnly", null, 0, 1, XmlReadOnly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCustomizerEClass, XmlCustomizer.class, "XmlCustomizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlCustomizer_CustomizerClassName(), ecorePackage.getEString(), "customizerClassName", null, 0, 1, XmlCustomizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCustomizerHolderEClass, XmlCustomizerHolder.class, "XmlCustomizerHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlCustomizerHolder_Customizer(), this.getXmlCustomizer(), null, "customizer", null, 0, 1, XmlCustomizerHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEntityEClass, XmlEntity.class, "XmlEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlMappedSuperclassEClass, XmlMappedSuperclass.class, "XmlMappedSuperclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlMutableEClass, XmlMutable.class, "XmlMutable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlMutable_Mutable(), theXMLTypePackage.getBooleanObject(), "mutable", null, 0, 1, XmlMutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdEClass, XmlId.class, "XmlId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlBasicEClass, XmlBasic.class, "XmlBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlVersionEClass, XmlVersion.class, "XmlVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPrivateOwnedEClass, XmlPrivateOwned.class, "XmlPrivateOwned", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPrivateOwned_PrivateOwned(), theXMLTypePackage.getBoolean(), "privateOwned", null, 0, 1, XmlPrivateOwned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinFetchEClass, XmlJoinFetch.class, "XmlJoinFetch", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlJoinFetch_JoinFetch(), this.getXmlJoinFetchType(), "joinFetch", null, 0, 1, XmlJoinFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOneToOneEClass, XmlOneToOne.class, "XmlOneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlOneToManyEClass, XmlOneToMany.class, "XmlOneToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToOneEClass, XmlManyToOne.class, "XmlManyToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToManyEClass, XmlManyToMany.class, "XmlManyToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(xmlJoinFetchTypeEEnum, XmlJoinFetchType.class, "XmlJoinFetchType");
		addEEnumLiteral(xmlJoinFetchTypeEEnum, XmlJoinFetchType.INNER);
		addEEnumLiteral(xmlJoinFetchTypeEEnum, XmlJoinFetchType.OUTER);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly <em>Xml Read Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlReadOnly()
		 * @generated
		 */
		public static final EClass XML_READ_ONLY = eINSTANCE.getXmlReadOnly();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_READ_ONLY__READ_ONLY = eINSTANCE.getXmlReadOnly_ReadOnly();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity <em>Xml Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEntity()
		 * @generated
		 */
		public static final EClass XML_ENTITY = eINSTANCE.getXmlEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMappedSuperclass()
		 * @generated
		 */
		public static final EClass XML_MAPPED_SUPERCLASS = eINSTANCE.getXmlMappedSuperclass();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable <em>Xml Mutable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMutable()
		 * @generated
		 */
		public static final EClass XML_MUTABLE = eINSTANCE.getXmlMutable();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MUTABLE__MUTABLE = eINSTANCE.getXmlMutable_Mutable();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlId <em>Xml Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlId
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlId()
		 * @generated
		 */
		public static final EClass XML_ID = eINSTANCE.getXmlId();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic <em>Xml Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasic()
		 * @generated
		 */
		public static final EClass XML_BASIC = eINSTANCE.getXmlBasic();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion <em>Xml Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVersion()
		 * @generated
		 */
		public static final EClass XML_VERSION = eINSTANCE.getXmlVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned <em>Xml Private Owned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlPrivateOwned()
		 * @generated
		 */
		public static final EClass XML_PRIVATE_OWNED = eINSTANCE.getXmlPrivateOwned();

		/**
		 * The meta object literal for the '<em><b>Private Owned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PRIVATE_OWNED__PRIVATE_OWNED = eINSTANCE.getXmlPrivateOwned_PrivateOwned();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch <em>Xml Join Fetch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetch()
		 * @generated
		 */
		public static final EClass XML_JOIN_FETCH = eINSTANCE.getXmlJoinFetch();

		/**
		 * The meta object literal for the '<em><b>Join Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_JOIN_FETCH__JOIN_FETCH = eINSTANCE.getXmlJoinFetch_JoinFetch();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToOne()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_ONE = eINSTANCE.getXmlOneToOne();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToMany()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_MANY = eINSTANCE.getXmlOneToMany();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToOne()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_ONE = eINSTANCE.getXmlManyToOne();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToMany()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_MANY = eINSTANCE.getXmlManyToMany();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType <em>Xml Join Fetch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetchType()
		 * @generated
		 */
		public static final EEnum XML_JOIN_FETCH_TYPE = eINSTANCE.getXmlJoinFetchType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer <em>Xml Customizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizer()
		 * @generated
		 */
		public static final EClass XML_CUSTOMIZER = eINSTANCE.getXmlCustomizer();

		/**
		 * The meta object literal for the '<em><b>Customizer Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CUSTOMIZER__CUSTOMIZER_CLASS_NAME = eINSTANCE.getXmlCustomizer_CustomizerClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder <em>Xml Customizer Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizerHolder()
		 * @generated
		 */
		public static final EClass XML_CUSTOMIZER_HOLDER = eINSTANCE.getXmlCustomizerHolder();

		/**
		 * The meta object literal for the '<em><b>Customizer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CUSTOMIZER_HOLDER__CUSTOMIZER = eINSTANCE.getXmlCustomizerHolder_Customizer();

	}

} //EclipseLinkOrmPackage
