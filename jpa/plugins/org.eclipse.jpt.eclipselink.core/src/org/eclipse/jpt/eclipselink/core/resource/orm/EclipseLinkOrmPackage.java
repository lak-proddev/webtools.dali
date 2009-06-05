/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.resource.orm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.jpt.core.resource.orm.OrmPackage;
import org.eclipse.jpt.eclipselink1_1.core.resource.orm.EclipseLink1_1OrmPackage;

/**
 * <!-- begin-user-doc -->
 * 
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 *  
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.1
 * @since 2.1
 * 
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
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter <em>Xml Named Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlNamedConverter()
	 * @generated
	 */
	public static final int XML_NAMED_CONVERTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_CONVERTER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Xml Named Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_CONVERTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer <em>Xml Customizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizer
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizer()
	 * @generated
	 */
	public static final int XML_CUSTOMIZER = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder <em>Xml Customizer Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCustomizerHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCustomizerHolder()
	 * @generated
	 */
	public static final int XML_CUSTOMIZER_HOLDER = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder <em>Xml Converters Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConvertersHolder()
	 * @generated
	 */
	public static final int XML_CONVERTERS_HOLDER = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEntityMappings()
	 * @generated
	 */
	public static final int XML_ENTITY_MAPPINGS = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking <em>Xml Change Tracking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTracking()
	 * @generated
	 */
	public static final int XML_CHANGE_TRACKING = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder <em>Xml Change Tracking Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTrackingHolder()
	 * @generated
	 */
	public static final int XML_CHANGE_TRACKING_HOLDER = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddable()
	 * @generated
	 */
	public static final int XML_EMBEDDABLE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly <em>Xml Read Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlReadOnly
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlReadOnly()
	 * @generated
	 */
	public static final int XML_READ_ONLY = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay <em>Xml Time Of Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTimeOfDay()
	 * @generated
	 */
	public static final int XML_TIME_OF_DAY = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache <em>Xml Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCache()
	 * @generated
	 */
	public static final int XML_CACHE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder <em>Xml Cache Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCacheHolder()
	 * @generated
	 */
	public static final int XML_CACHE_HOLDER = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity <em>Xml Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEntity()
	 * @generated
	 */
	public static final int XML_ENTITY = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMappedSuperclass()
	 * @generated
	 */
	public static final int XML_MAPPED_SUPERCLASS = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable <em>Xml Mutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMutable
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlMutable()
	 * @generated
	 */
	public static final int XML_MUTABLE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConvertibleMapping()
	 * @generated
	 */
	public static final int XML_CONVERTIBLE_MAPPING = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlId <em>Xml Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlId
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlId()
	 * @generated
	 */
	public static final int XML_ID = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlIdImpl()
	 * @generated
	 */
	public static final int XML_ID_IMPL = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic <em>Xml Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasic()
	 * @generated
	 */
	public static final int XML_BASIC = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicImpl()
	 * @generated
	 */
	public static final int XML_BASIC_IMPL = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion <em>Xml Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVersion()
	 * @generated
	 */
	public static final int XML_VERSION = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVersionImpl()
	 * @generated
	 */
	public static final int XML_VERSION_IMPL = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned <em>Xml Private Owned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlPrivateOwned()
	 * @generated
	 */
	public static final int XML_PRIVATE_OWNED = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch <em>Xml Join Fetch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetch()
	 * @generated
	 */
	public static final int XML_JOIN_FETCH = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToOne()
	 * @generated
	 */
	public static final int XML_ONE_TO_ONE = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToOneImpl()
	 * @generated
	 */
	public static final int XML_ONE_TO_ONE_IMPL = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToMany()
	 * @generated
	 */
	public static final int XML_ONE_TO_MANY = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToManyImpl()
	 * @generated
	 */
	public static final int XML_ONE_TO_MANY_IMPL = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToOne()
	 * @generated
	 */
	public static final int XML_MANY_TO_ONE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToOneImpl()
	 * @generated
	 */
	public static final int XML_MANY_TO_ONE_IMPL = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToMany()
	 * @generated
	 */
	public static final int XML_MANY_TO_MANY = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToManyImpl()
	 * @generated
	 */
	public static final int XML_MANY_TO_MANY_IMPL = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter <em>Xml Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConverter()
	 * @generated
	 */
	public static final int XML_CONVERTER = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter <em>Xml Type Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTypeConverter()
	 * @generated
	 */
	public static final int XML_TYPE_CONVERTER = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue <em>Xml Conversion Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConversionValue()
	 * @generated
	 */
	public static final int XML_CONVERSION_VALUE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter <em>Xml Object Type Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlObjectTypeConverter()
	 * @generated
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter <em>Xml Struct Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlStructConverter()
	 * @generated
	 */
	public static final int XML_STRUCT_CONVERTER = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder <em>Xml Converter Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConverterHolder()
	 * @generated
	 */
	public static final int XML_CONVERTER_HOLDER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER__NAME = XML_NAMED_CONVERTER__NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER__CLASS_NAME = XML_NAMED_CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_FEATURE_COUNT = XML_NAMED_CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_CONVERTER__NAME = XML_NAMED_CONVERTER__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_CONVERTER__DATA_TYPE = XML_NAMED_CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_CONVERTER__OBJECT_TYPE = XML_NAMED_CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Type Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_CONVERTER_FEATURE_COUNT = XML_NAMED_CONVERTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERSION_VALUE__DATA_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Object Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERSION_VALUE__OBJECT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Xml Conversion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERSION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER__NAME = XML_NAMED_CONVERTER__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER__DATA_TYPE = XML_NAMED_CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER__OBJECT_TYPE = XML_NAMED_CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversion Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER__CONVERSION_VALUES = XML_NAMED_CONVERTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Object Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER__DEFAULT_OBJECT_VALUE = XML_NAMED_CONVERTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml Object Type Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OBJECT_TYPE_CONVERTER_FEATURE_COUNT = XML_NAMED_CONVERTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STRUCT_CONVERTER__NAME = XML_NAMED_CONVERTER__NAME;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STRUCT_CONVERTER__CONVERTER = XML_NAMED_CONVERTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Struct Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STRUCT_CONVERTER_FEATURE_COUNT = XML_NAMED_CONVERTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTERS_HOLDER__CONVERTERS = 0;

	/**
	 * The feature id for the '<em><b>Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTERS_HOLDER__TYPE_CONVERTERS = 1;

	/**
	 * The feature id for the '<em><b>Object Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTERS_HOLDER__OBJECT_TYPE_CONVERTERS = 2;

	/**
	 * The feature id for the '<em><b>Struct Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTERS_HOLDER__STRUCT_CONVERTERS = 3;

	/**
	 * The number of structural features of the '<em>Xml Converters Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTERS_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter <em>Xml Stored Procedure Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlStoredProcedureParameter()
	 * @generated
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Query Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Jdbc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Jdbc Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Xml Stored Procedure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_STORED_PROCEDURE_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery <em>Xml Named Stored Procedure Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Returns Result Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET = 4;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__HINTS = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY__PARAMETERS = 6;

	/**
	 * The number of structural features of the '<em>Xml Named Stored Procedure Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_STORED_PROCEDURE_QUERY_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__VERSION = OrmPackage.XML_ENTITY_MAPPINGS__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__DESCRIPTION = OrmPackage.XML_ENTITY_MAPPINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__PERSISTENCE_UNIT_METADATA = OrmPackage.XML_ENTITY_MAPPINGS__PERSISTENCE_UNIT_METADATA;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__PACKAGE = OrmPackage.XML_ENTITY_MAPPINGS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SCHEMA = OrmPackage.XML_ENTITY_MAPPINGS__SCHEMA;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__CATALOG = OrmPackage.XML_ENTITY_MAPPINGS__CATALOG;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__ACCESS = OrmPackage.XML_ENTITY_MAPPINGS__ACCESS;

	/**
	 * The feature id for the '<em><b>Sequence Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SEQUENCE_GENERATORS = OrmPackage.XML_ENTITY_MAPPINGS__SEQUENCE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Table Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__TABLE_GENERATORS = OrmPackage.XML_ENTITY_MAPPINGS__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__NAMED_QUERIES = OrmPackage.XML_ENTITY_MAPPINGS__NAMED_QUERIES;

	/**
	 * The feature id for the '<em><b>Named Native Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__NAMED_NATIVE_QUERIES = OrmPackage.XML_ENTITY_MAPPINGS__NAMED_NATIVE_QUERIES;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SQL_RESULT_SET_MAPPINGS = OrmPackage.XML_ENTITY_MAPPINGS__SQL_RESULT_SET_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Mapped Superclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__MAPPED_SUPERCLASSES = OrmPackage.XML_ENTITY_MAPPINGS__MAPPED_SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__ENTITIES = OrmPackage.XML_ENTITY_MAPPINGS__ENTITIES;

	/**
	 * The feature id for the '<em><b>Embeddables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__EMBEDDABLES = OrmPackage.XML_ENTITY_MAPPINGS__EMBEDDABLES;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__CONVERTERS = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__TYPE_CONVERTERS = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__OBJECT_TYPE_CONVERTERS = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Struct Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__STRUCT_CONVERTERS = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__NAMED_STORED_PROCEDURE_QUERIES = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Entity Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS_FEATURE_COUNT = OrmPackage.XML_ENTITY_MAPPINGS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlPersistenceUnitMetadata()
	 * @generated
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA = 10;

	/**
	 * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = OrmPackage.XML_PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = OrmPackage.XML_PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS;

	/**
	 * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA__EXCLUDE_DEFAULT_MAPPINGS = OrmPackage.XML_PERSISTENCE_UNIT_METADATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = OrmPackage.XML_PERSISTENCE_UNIT_METADATA_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CHANGE_TRACKING__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Xml Change Tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CHANGE_TRACKING_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CHANGE_TRACKING_HOLDER__CHANGE_TRACKING = 0;

	/**
	 * The number of structural features of the '<em>Xml Change Tracking Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CHANGE_TRACKING_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy <em>Xml Copy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCopyPolicy()
	 * @generated
	 */
	public static final int XML_COPY_POLICY = 15;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COPY_POLICY__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Xml Copy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COPY_POLICY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy <em>Xml Instantiation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlInstantiationPolicy()
	 * @generated
	 */
	public static final int XML_INSTANTIATION_POLICY = 16;

	/**
	 * The number of structural features of the '<em>Xml Instantiation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_INSTANTIATION_POLICY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy <em>Xml Clone Copy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCloneCopyPolicy()
	 * @generated
	 */
	public static final int XML_CLONE_COPY_POLICY = 17;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CLONE_COPY_POLICY__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Working Copy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CLONE_COPY_POLICY__WORKING_COPY_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Xml Clone Copy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CLONE_COPY_POLICY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CLASS_NAME = OrmPackage.XML_EMBEDDABLE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__ACCESS = OrmPackage.XML_EMBEDDABLE__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__METADATA_COMPLETE = OrmPackage.XML_EMBEDDABLE__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__DESCRIPTION = OrmPackage.XML_EMBEDDABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__ATTRIBUTES = OrmPackage.XML_EMBEDDABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Customizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CUSTOMIZER = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CHANGE_TRACKING = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CONVERTERS = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__TYPE_CONVERTERS = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__OBJECT_TYPE_CONVERTERS = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Struct Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__STRUCT_CONVERTERS = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__COPY_POLICY = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__INSTANTIATION_COPY_POLICY = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CLONE_COPY_POLICY = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__PROPERTIES = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Xml Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE_FEATURE_COUNT = OrmPackage.XML_EMBEDDABLE_FEATURE_COUNT + 11;

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
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TIME_OF_DAY__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TIME_OF_DAY__MINUTE = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TIME_OF_DAY__SECOND = 2;

	/**
	 * The feature id for the '<em><b>Millisecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TIME_OF_DAY__MILLISECOND = 3;

	/**
	 * The number of structural features of the '<em>Xml Time Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TIME_OF_DAY_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__EXPIRY = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__SHARED = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Always Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__ALWAYS_REFRESH = 4;

	/**
	 * The feature id for the '<em><b>Refresh Only If Newer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__REFRESH_ONLY_IF_NEWER = 5;

	/**
	 * The feature id for the '<em><b>Disable Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__DISABLE_HITS = 6;

	/**
	 * The feature id for the '<em><b>Coordination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__COORDINATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Expiry Time Of Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE__EXPIRY_TIME_OF_DAY = 8;

	/**
	 * The number of structural features of the '<em>Xml Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE_FEATURE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE_HOLDER__CACHE = 0;

	/**
	 * The feature id for the '<em><b>Existence Checking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE_HOLDER__EXISTENCE_CHECKING = 1;

	/**
	 * The number of structural features of the '<em>Xml Cache Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CACHE_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking <em>Xml Optimistic Locking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOptimisticLocking()
	 * @generated
	 */
	public static final int XML_OPTIMISTIC_LOCKING = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OPTIMISTIC_LOCKING__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OPTIMISTIC_LOCKING__CASCADE = 1;

	/**
	 * The feature id for the '<em><b>Selected Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OPTIMISTIC_LOCKING__SELECTED_COLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Xml Optimistic Locking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_OPTIMISTIC_LOCKING_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CHANGE_TRACKING = OrmPackage.XML_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CACHE = OrmPackage.XML_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Existence Checking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXISTENCE_CHECKING = OrmPackage.XML_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CONVERTERS = OrmPackage.XML_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__TYPE_CONVERTERS = OrmPackage.XML_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Object Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__OBJECT_TYPE_CONVERTERS = OrmPackage.XML_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Struct Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__STRUCT_CONVERTERS = OrmPackage.XML_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__OPTIMISTIC_LOCKING = OrmPackage.XML_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__COPY_POLICY = OrmPackage.XML_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__INSTANTIATION_COPY_POLICY = OrmPackage.XML_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CLONE_COPY_POLICY = OrmPackage.XML_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAMED_STORED_PROCEDURE_QUERIES = OrmPackage.XML_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PROPERTIES = OrmPackage.XML_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXCLUDE_DEFAULT_MAPPINGS = OrmPackage.XML_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Xml Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_FEATURE_COUNT = OrmPackage.XML_ENTITY_FEATURE_COUNT + 16;

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
	 * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CHANGE_TRACKING = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CACHE = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Existence Checking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXISTENCE_CHECKING = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CONVERTERS = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__TYPE_CONVERTERS = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Object Type Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTERS = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Struct Converters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__STRUCT_CONVERTERS = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__COPY_POLICY = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CLONE_COPY_POLICY = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PROPERTIES = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Xml Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS_FEATURE_COUNT = OrmPackage.XML_MAPPED_SUPERCLASS_FEATURE_COUNT + 15;

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
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_HOLDER__CONVERTER = 0;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_HOLDER__TYPE_CONVERTER = 1;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_HOLDER__OBJECT_TYPE_CONVERTER = 2;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_HOLDER__STRUCT_CONVERTER = 3;

	/**
	 * The number of structural features of the '<em>Xml Converter Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTER_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__LOB = OrmPackage.XML_CONVERTIBLE_MAPPING__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__TEMPORAL = OrmPackage.XML_CONVERTIBLE_MAPPING__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__ENUMERATED = OrmPackage.XML_CONVERTIBLE_MAPPING__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__CONVERTER = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__TYPE_CONVERTER = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__OBJECT_TYPE_CONVERTER = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__STRUCT_CONVERTER = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__CONVERT = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Convertible Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING_FEATURE_COUNT = OrmPackage.XML_CONVERTIBLE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods <em>Xml Access Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlAccessMethods()
	 * @generated
	 */
	public static final int XML_ACCESS_METHODS = 29;

	/**
	 * The feature id for the '<em><b>Get Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ACCESS_METHODS__GET_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Set Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ACCESS_METHODS__SET_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Xml Access Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ACCESS_METHODS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder <em>Xml Access Methods Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlAccessMethodsHolder()
	 * @generated
	 */
	public static final int XML_ACCESS_METHODS_HOLDER = 30;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ACCESS_METHODS_HOLDER__ACCESS_METHODS = 0;

	/**
	 * The number of structural features of the '<em>Xml Access Methods Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ACCESS_METHODS_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedId()
	 * @generated
	 */
	public static final int XML_EMBEDDED_ID = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedIdImpl()
	 * @generated
	 */
	public static final int XML_EMBEDDED_ID_IMPL = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbedded()
	 * @generated
	 */
	public static final int XML_EMBEDDED = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedImpl()
	 * @generated
	 */
	public static final int XML_EMBEDDED_IMPL = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getAttributes()
	 * @generated
	 */
	public static final int ATTRIBUTES = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection <em>Xml Basic Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicCollection()
	 * @generated
	 */
	public static final int XML_BASIC_COLLECTION = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl <em>Xml Basic Collection Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicCollectionImpl()
	 * @generated
	 */
	public static final int XML_BASIC_COLLECTION_IMPL = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap <em>Xml Basic Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicMap()
	 * @generated
	 */
	public static final int XML_BASIC_MAP = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl <em>Xml Basic Map Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicMapImpl()
	 * @generated
	 */
	public static final int XML_BASIC_MAP_IMPL = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation <em>Xml Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTransformation()
	 * @generated
	 */
	public static final int XML_TRANSFORMATION = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl <em>Xml Transformation Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTransformationImpl()
	 * @generated
	 */
	public static final int XML_TRANSFORMATION_IMPL = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty <em>Xml Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlProperty()
	 * @generated
	 */
	public static final int XML_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PROPERTY__VALUE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Xml Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__NAME = OrmPackage.XML_ID__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__COLUMN = OrmPackage.XML_ID__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__LOB = OrmPackage.XML_ID__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TEMPORAL = OrmPackage.XML_ID__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__ENUMERATED = OrmPackage.XML_ID__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__GENERATED_VALUE = OrmPackage.XML_ID__GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TABLE_GENERATOR = OrmPackage.XML_ID__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__SEQUENCE_GENERATOR = OrmPackage.XML_ID__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__MUTABLE = OrmPackage.XML_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__CONVERTER = OrmPackage.XML_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TYPE_CONVERTER = OrmPackage.XML_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__OBJECT_TYPE_CONVERTER = OrmPackage.XML_ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__STRUCT_CONVERTER = OrmPackage.XML_ID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__CONVERT = OrmPackage.XML_ID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__ACCESS_METHODS = OrmPackage.XML_ID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__PROPERTIES = OrmPackage.XML_ID_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_FEATURE_COUNT = OrmPackage.XML_ID_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__NAME = OrmPackage.XML_ID_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__COLUMN = OrmPackage.XML_ID_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__LOB = OrmPackage.XML_ID_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__TEMPORAL = OrmPackage.XML_ID_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__ENUMERATED = OrmPackage.XML_ID_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__GENERATED_VALUE = OrmPackage.XML_ID_IMPL__GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__TABLE_GENERATOR = OrmPackage.XML_ID_IMPL__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__SEQUENCE_GENERATOR = OrmPackage.XML_ID_IMPL__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__MUTABLE = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__CONVERTER = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__TYPE_CONVERTER = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__OBJECT_TYPE_CONVERTER = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__STRUCT_CONVERTER = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__CONVERT = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__ACCESS_METHODS = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__PROPERTIES = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Id Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL_FEATURE_COUNT = OrmPackage.XML_ID_IMPL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__NAME = OrmPackage.XML_EMBEDDED_ID__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__ATTRIBUTE_OVERRIDES = OrmPackage.XML_EMBEDDED_ID__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__ACCESS_METHODS = OrmPackage.XML_EMBEDDED_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__PROPERTIES = OrmPackage.XML_EMBEDDED_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_FEATURE_COUNT = OrmPackage.XML_EMBEDDED_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__NAME = OrmPackage.XML_EMBEDDED_ID_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__ATTRIBUTE_OVERRIDES = OrmPackage.XML_EMBEDDED_ID_IMPL__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__ACCESS_METHODS = OrmPackage.XML_EMBEDDED_ID_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__PROPERTIES = OrmPackage.XML_EMBEDDED_ID_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Embedded Id Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL_FEATURE_COUNT = OrmPackage.XML_EMBEDDED_ID_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__NAME = OrmPackage.XML_EMBEDDED__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__ATTRIBUTE_OVERRIDES = OrmPackage.XML_EMBEDDED__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__ACCESS_METHODS = OrmPackage.XML_EMBEDDED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__PROPERTIES = OrmPackage.XML_EMBEDDED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_FEATURE_COUNT = OrmPackage.XML_EMBEDDED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__NAME = OrmPackage.XML_EMBEDDED_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__ATTRIBUTE_OVERRIDES = OrmPackage.XML_EMBEDDED_IMPL__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__ACCESS_METHODS = OrmPackage.XML_EMBEDDED_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__PROPERTIES = OrmPackage.XML_EMBEDDED_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Embedded Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL_FEATURE_COUNT = OrmPackage.XML_EMBEDDED_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__NAME = OrmPackage.XML_BASIC__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__COLUMN = OrmPackage.XML_BASIC__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__LOB = OrmPackage.XML_BASIC__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__TEMPORAL = OrmPackage.XML_BASIC__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__ENUMERATED = OrmPackage.XML_BASIC__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__FETCH = OrmPackage.XML_BASIC__FETCH;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__OPTIONAL = OrmPackage.XML_BASIC__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__MUTABLE = OrmPackage.XML_BASIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__CONVERTER = OrmPackage.XML_BASIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__TYPE_CONVERTER = OrmPackage.XML_BASIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__OBJECT_TYPE_CONVERTER = OrmPackage.XML_BASIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__STRUCT_CONVERTER = OrmPackage.XML_BASIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__CONVERT = OrmPackage.XML_BASIC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__ACCESS_METHODS = OrmPackage.XML_BASIC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__PROPERTIES = OrmPackage.XML_BASIC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_FEATURE_COUNT = OrmPackage.XML_BASIC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__NAME = OrmPackage.XML_BASIC_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__COLUMN = OrmPackage.XML_BASIC_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__LOB = OrmPackage.XML_BASIC_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__TEMPORAL = OrmPackage.XML_BASIC_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__ENUMERATED = OrmPackage.XML_BASIC_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__FETCH = OrmPackage.XML_BASIC_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__OPTIONAL = OrmPackage.XML_BASIC_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__MUTABLE = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__CONVERTER = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__TYPE_CONVERTER = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__OBJECT_TYPE_CONVERTER = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__STRUCT_CONVERTER = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__CONVERT = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__ACCESS_METHODS = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__PROPERTIES = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Basic Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL_FEATURE_COUNT = OrmPackage.XML_BASIC_IMPL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__NAME = OrmPackage.XML_VERSION__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__COLUMN = OrmPackage.XML_VERSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__LOB = OrmPackage.XML_VERSION__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__TEMPORAL = OrmPackage.XML_VERSION__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__ENUMERATED = OrmPackage.XML_VERSION__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__MUTABLE = OrmPackage.XML_VERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__CONVERTER = OrmPackage.XML_VERSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__TYPE_CONVERTER = OrmPackage.XML_VERSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__OBJECT_TYPE_CONVERTER = OrmPackage.XML_VERSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__STRUCT_CONVERTER = OrmPackage.XML_VERSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__CONVERT = OrmPackage.XML_VERSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__ACCESS_METHODS = OrmPackage.XML_VERSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__PROPERTIES = OrmPackage.XML_VERSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_FEATURE_COUNT = OrmPackage.XML_VERSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__NAME = OrmPackage.XML_VERSION_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__COLUMN = OrmPackage.XML_VERSION_IMPL__COLUMN;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__LOB = OrmPackage.XML_VERSION_IMPL__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__TEMPORAL = OrmPackage.XML_VERSION_IMPL__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__ENUMERATED = OrmPackage.XML_VERSION_IMPL__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__MUTABLE = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__CONVERTER = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__TYPE_CONVERTER = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__OBJECT_TYPE_CONVERTER = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__STRUCT_CONVERTER = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__CONVERT = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__ACCESS_METHODS = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__PROPERTIES = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml Version Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL_FEATURE_COUNT = OrmPackage.XML_VERSION_IMPL_FEATURE_COUNT + 8;

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
	public static final int XML_ONE_TO_ONE__NAME = OrmPackage.XML_ONE_TO_ONE__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__TARGET_ENTITY = OrmPackage.XML_ONE_TO_ONE__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__FETCH = OrmPackage.XML_ONE_TO_ONE__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__CASCADE = OrmPackage.XML_ONE_TO_ONE__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_TABLE = OrmPackage.XML_ONE_TO_ONE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__OPTIONAL = OrmPackage.XML_ONE_TO_ONE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__MAPPED_BY = OrmPackage.XML_ONE_TO_ONE__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_ONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_FETCH = OrmPackage.XML_ONE_TO_ONE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__ACCESS_METHODS = OrmPackage.XML_ONE_TO_ONE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PROPERTIES = OrmPackage.XML_ONE_TO_ONE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_FEATURE_COUNT = OrmPackage.XML_ONE_TO_ONE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__NAME = OrmPackage.XML_ONE_TO_ONE_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__TARGET_ENTITY = OrmPackage.XML_ONE_TO_ONE_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__FETCH = OrmPackage.XML_ONE_TO_ONE_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__CASCADE = OrmPackage.XML_ONE_TO_ONE_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__JOIN_TABLE = OrmPackage.XML_ONE_TO_ONE_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE_IMPL__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__OPTIONAL = OrmPackage.XML_ONE_TO_ONE_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__MAPPED_BY = OrmPackage.XML_ONE_TO_ONE_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__PRIMARY_KEY_JOIN_COLUMNS = OrmPackage.XML_ONE_TO_ONE_IMPL__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__JOIN_FETCH = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__ACCESS_METHODS = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__PROPERTIES = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml One To One Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL_FEATURE_COUNT = OrmPackage.XML_ONE_TO_ONE_IMPL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__NAME = OrmPackage.XML_ONE_TO_MANY__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__TARGET_ENTITY = OrmPackage.XML_ONE_TO_MANY__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__FETCH = OrmPackage.XML_ONE_TO_MANY__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__CASCADE = OrmPackage.XML_ONE_TO_MANY__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAPPED_BY = OrmPackage.XML_ONE_TO_MANY__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_TABLE = OrmPackage.XML_ONE_TO_MANY__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__ORDER_BY = OrmPackage.XML_ONE_TO_MANY__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAP_KEY = OrmPackage.XML_ONE_TO_MANY__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_MANY__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_MANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_FETCH = OrmPackage.XML_ONE_TO_MANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__ACCESS_METHODS = OrmPackage.XML_ONE_TO_MANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__PROPERTIES = OrmPackage.XML_ONE_TO_MANY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_FEATURE_COUNT = OrmPackage.XML_ONE_TO_MANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__NAME = OrmPackage.XML_ONE_TO_MANY_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__TARGET_ENTITY = OrmPackage.XML_ONE_TO_MANY_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__FETCH = OrmPackage.XML_ONE_TO_MANY_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__CASCADE = OrmPackage.XML_ONE_TO_MANY_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__MAPPED_BY = OrmPackage.XML_ONE_TO_MANY_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__JOIN_TABLE = OrmPackage.XML_ONE_TO_MANY_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__ORDER_BY = OrmPackage.XML_ONE_TO_MANY_IMPL__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__MAP_KEY = OrmPackage.XML_ONE_TO_MANY_IMPL__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__JOIN_COLUMNS = OrmPackage.XML_ONE_TO_MANY_IMPL__JOIN_COLUMNS;

	
	/**
	 * The feature id for the '<em><b>Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__PRIVATE_OWNED = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__JOIN_FETCH = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__ACCESS_METHODS = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__PROPERTIES = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml One To Many Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL_FEATURE_COUNT = OrmPackage.XML_ONE_TO_MANY_IMPL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__NAME = OrmPackage.XML_MANY_TO_ONE__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__TARGET_ENTITY = OrmPackage.XML_MANY_TO_ONE__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__FETCH = OrmPackage.XML_MANY_TO_ONE__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__CASCADE = OrmPackage.XML_MANY_TO_ONE__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_TABLE = OrmPackage.XML_MANY_TO_ONE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_COLUMNS = OrmPackage.XML_MANY_TO_ONE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__OPTIONAL = OrmPackage.XML_MANY_TO_ONE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_FETCH = OrmPackage.XML_MANY_TO_ONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__ACCESS_METHODS = OrmPackage.XML_MANY_TO_ONE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__PROPERTIES = OrmPackage.XML_MANY_TO_ONE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_FEATURE_COUNT = OrmPackage.XML_MANY_TO_ONE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__NAME = OrmPackage.XML_MANY_TO_ONE_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__TARGET_ENTITY = OrmPackage.XML_MANY_TO_ONE_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__FETCH = OrmPackage.XML_MANY_TO_ONE_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__CASCADE = OrmPackage.XML_MANY_TO_ONE_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__JOIN_TABLE = OrmPackage.XML_MANY_TO_ONE_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__JOIN_COLUMNS = OrmPackage.XML_MANY_TO_ONE_IMPL__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__OPTIONAL = OrmPackage.XML_MANY_TO_ONE_IMPL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__JOIN_FETCH = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__ACCESS_METHODS = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__PROPERTIES = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Many To One Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL_FEATURE_COUNT = OrmPackage.XML_MANY_TO_ONE_IMPL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__NAME = OrmPackage.XML_MANY_TO_MANY__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__TARGET_ENTITY = OrmPackage.XML_MANY_TO_MANY__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__FETCH = OrmPackage.XML_MANY_TO_MANY__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__CASCADE = OrmPackage.XML_MANY_TO_MANY__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAPPED_BY = OrmPackage.XML_MANY_TO_MANY__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__JOIN_TABLE = OrmPackage.XML_MANY_TO_MANY__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__ORDER_BY = OrmPackage.XML_MANY_TO_MANY__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAP_KEY = OrmPackage.XML_MANY_TO_MANY__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__JOIN_FETCH = OrmPackage.XML_MANY_TO_MANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__ACCESS_METHODS = OrmPackage.XML_MANY_TO_MANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__PROPERTIES = OrmPackage.XML_MANY_TO_MANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_FEATURE_COUNT = OrmPackage.XML_MANY_TO_MANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__NAME = OrmPackage.XML_MANY_TO_MANY_IMPL__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__TARGET_ENTITY = OrmPackage.XML_MANY_TO_MANY_IMPL__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__FETCH = OrmPackage.XML_MANY_TO_MANY_IMPL__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__CASCADE = OrmPackage.XML_MANY_TO_MANY_IMPL__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__MAPPED_BY = OrmPackage.XML_MANY_TO_MANY_IMPL__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__JOIN_TABLE = OrmPackage.XML_MANY_TO_MANY_IMPL__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__ORDER_BY = OrmPackage.XML_MANY_TO_MANY_IMPL__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__MAP_KEY = OrmPackage.XML_MANY_TO_MANY_IMPL__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__JOIN_FETCH = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__ACCESS_METHODS = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__PROPERTIES = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Many To Many Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL_FEATURE_COUNT = OrmPackage.XML_MANY_TO_MANY_IMPL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION__NAME = OrmPackage.XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION__ACCESS_METHODS = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION__PROPERTIES = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Basic Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION_FEATURE_COUNT = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION_IMPL__NAME = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION_IMPL__ACCESS_METHODS = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION_IMPL__PROPERTIES = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Basic Collection Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_COLLECTION_IMPL_FEATURE_COUNT = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP__NAME = OrmPackage.XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP__ACCESS_METHODS = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP__PROPERTIES = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Basic Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP_FEATURE_COUNT = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP_IMPL__NAME = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP_IMPL__ACCESS_METHODS = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP_IMPL__PROPERTIES = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Basic Map Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_MAP_IMPL_FEATURE_COUNT = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION__NAME = OrmPackage.XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION__ACCESS_METHODS = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION__PROPERTIES = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION_FEATURE_COUNT = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION_IMPL__NAME = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION_IMPL__ACCESS_METHODS = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION_IMPL__PROPERTIES = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Transformation Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSFORMATION_IMPL_FEATURE_COUNT = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne <em>Xml Variable One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVariableOneToOne()
	 * @generated
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE__NAME = OrmPackage.XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE__ACCESS_METHODS = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE__PROPERTIES = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Variable One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_FEATURE_COUNT = OrmPackage.XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl <em>Xml Variable One To One Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVariableOneToOneImpl()
	 * @generated
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_IMPL = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_IMPL__NAME = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_IMPL__ACCESS_METHODS = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_IMPL__PROPERTIES = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Variable One To One Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VARIABLE_ONE_TO_ONE_IMPL_FEATURE_COUNT = OrmPackage.ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__IDS = OrmPackage.ATTRIBUTES__IDS;

	/**
	 * The feature id for the '<em><b>Embedded Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__EMBEDDED_IDS = OrmPackage.ATTRIBUTES__EMBEDDED_IDS;

	/**
	 * The feature id for the '<em><b>Basics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__BASICS = OrmPackage.ATTRIBUTES__BASICS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__VERSIONS = OrmPackage.ATTRIBUTES__VERSIONS;

	/**
	 * The feature id for the '<em><b>Many To Ones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__MANY_TO_ONES = OrmPackage.ATTRIBUTES__MANY_TO_ONES;

	/**
	 * The feature id for the '<em><b>One To Manys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__ONE_TO_MANYS = OrmPackage.ATTRIBUTES__ONE_TO_MANYS;

	/**
	 * The feature id for the '<em><b>One To Ones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__ONE_TO_ONES = OrmPackage.ATTRIBUTES__ONE_TO_ONES;

	/**
	 * The feature id for the '<em><b>Many To Manys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__MANY_TO_MANYS = OrmPackage.ATTRIBUTES__MANY_TO_MANYS;

	/**
	 * The feature id for the '<em><b>Embeddeds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__EMBEDDEDS = OrmPackage.ATTRIBUTES__EMBEDDEDS;

	/**
	 * The feature id for the '<em><b>Transients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__TRANSIENTS = OrmPackage.ATTRIBUTES__TRANSIENTS;

	/**
	 * The feature id for the '<em><b>Basic Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__BASIC_COLLECTIONS = OrmPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__BASIC_MAPS = OrmPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__TRANSFORMATIONS = OrmPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable One To Ones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__VARIABLE_ONE_TO_ONES = OrmPackage.ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES_FEATURE_COUNT = OrmPackage.ATTRIBUTES_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection <em>Xml Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlDirection()
	 * @generated
	 */
	public static final int XML_DIRECTION = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType <em>Xml Change Tracking Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTrackingType()
	 * @generated
	 */
	public static final int XML_CHANGE_TRACKING_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getCacheType()
	 * @generated
	 */
	public static final int CACHE_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType <em>Cache Coordination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getCacheCoordinationType()
	 * @generated
	 */
	public static final int CACHE_COORDINATION_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType <em>Xml Join Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetchType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlJoinFetchType()
	 * @generated
	 */
	public static final int XML_JOIN_FETCH_TYPE = 67;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNamedConverterEClass = null;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType <em>Existence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getExistenceType()
	 * @generated
	 */
	public static final int EXISTENCE_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType <em>Xml Optimistic Locking Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOptimisticLockingType()
	 * @generated
	 */
	public static final int XML_OPTIMISTIC_LOCKING_TYPE = 66;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlChangeTrackingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlChangeTrackingHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCopyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlInstantiationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCloneCopyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConvertersHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlStoredProcedureParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNamedStoredProcedureQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEntityMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPersistenceUnitMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddableEClass = null;

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
	private EClass xmlTimeOfDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlCacheHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOptimisticLockingEClass = null;

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
	private EClass xmlConvertibleMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAccessMethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAccessMethodsHolderEClass = null;

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
	private EClass xmlIdImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedIdImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedImplEClass = null;

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
	private EClass xmlBasicImplEClass = null;

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
	private EClass xmlVersionImplEClass = null;

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
	private EClass xmlOneToOneImplEClass = null;

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
	private EClass xmlOneToManyImplEClass = null;

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
	private EClass xmlManyToOneImplEClass = null;

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
	private EClass xmlManyToManyImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicCollectionImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicMapImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTransformationImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlVariableOneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlVariableOneToOneImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlChangeTrackingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTypeConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConversionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlObjectTypeConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlStructConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConverterHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheCoordinationTypeEEnum = null;

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
	private EEnum existenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlOptimisticLockingTypeEEnum = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EclipseLinkOrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		EclipseLinkOrmPackage theEclipseLinkOrmPackage = (EclipseLinkOrmPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EclipseLinkOrmPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EclipseLinkOrmPackage());

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

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EclipseLinkOrmPackage.eNS_URI, theEclipseLinkOrmPackage);
		return theEclipseLinkOrmPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter <em>Xml Named Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Named Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter
	 * @generated
	 */
	public EClass getXmlNamedConverter()
	{
		return xmlNamedConverterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter#getName()
	 * @see #getXmlNamedConverter()
	 * @generated
	 */
	public EAttribute getXmlNamedConverter_Name()
	{
		return (EAttribute)xmlNamedConverterEClass.getEStructuralFeatures().get(0);
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
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking <em>Xml Change Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Change Tracking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking
	 * @generated
	 */
	public EClass getXmlChangeTracking()
	{
		return xmlChangeTrackingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking#getType()
	 * @see #getXmlChangeTracking()
	 * @generated
	 */
	public EAttribute getXmlChangeTracking_Type()
	{
		return (EAttribute)xmlChangeTrackingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder <em>Xml Change Tracking Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Change Tracking Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder
	 * @generated
	 */
	public EClass getXmlChangeTrackingHolder()
	{
		return xmlChangeTrackingHolderEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder#getChangeTracking <em>Change Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Tracking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder#getChangeTracking()
	 * @see #getXmlChangeTrackingHolder()
	 * @generated
	 */
	public EReference getXmlChangeTrackingHolder_ChangeTracking()
	{
		return (EReference)xmlChangeTrackingHolderEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy <em>Xml Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy
	 * @generated
	 */
	public EClass getXmlCopyPolicy()
	{
		return xmlCopyPolicyEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy#getClass_()
	 * @see #getXmlCopyPolicy()
	 * @generated
	 */
	public EAttribute getXmlCopyPolicy_Class()
	{
		return (EAttribute)xmlCopyPolicyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy <em>Xml Instantiation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Instantiation Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy
	 * @generated
	 */
	public EClass getXmlInstantiationPolicy()
	{
		return xmlInstantiationPolicyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy <em>Xml Clone Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Clone Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy
	 * @generated
	 */
	public EClass getXmlCloneCopyPolicy()
	{
		return xmlCloneCopyPolicyEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy#getMethod()
	 * @see #getXmlCloneCopyPolicy()
	 * @generated
	 */
	public EAttribute getXmlCloneCopyPolicy_Method()
	{
		return (EAttribute)xmlCloneCopyPolicyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy#getWorkingCopyMethod <em>Working Copy Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Method</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy#getWorkingCopyMethod()
	 * @see #getXmlCloneCopyPolicy()
	 * @generated
	 */
	public EAttribute getXmlCloneCopyPolicy_WorkingCopyMethod()
	{
		return (EAttribute)xmlCloneCopyPolicyEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder <em>Xml Converters Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Converters Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder
	 * @generated
	 */
	public EClass getXmlConvertersHolder()
	{
		return xmlConvertersHolderEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getConverters <em>Converters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Converters</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getConverters()
	 * @see #getXmlConvertersHolder()
	 * @generated
	 */
	public EReference getXmlConvertersHolder_Converters()
	{
		return (EReference)xmlConvertersHolderEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getTypeConverters <em>Type Converters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Converters</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getTypeConverters()
	 * @see #getXmlConvertersHolder()
	 * @generated
	 */
	public EReference getXmlConvertersHolder_TypeConverters()
	{
		return (EReference)xmlConvertersHolderEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getObjectTypeConverters <em>Object Type Converters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Type Converters</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getObjectTypeConverters()
	 * @see #getXmlConvertersHolder()
	 * @generated
	 */
	public EReference getXmlConvertersHolder_ObjectTypeConverters()
	{
		return (EReference)xmlConvertersHolderEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getStructConverters <em>Struct Converters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Converters</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder#getStructConverters()
	 * @see #getXmlConvertersHolder()
	 * @generated
	 */
	public EReference getXmlConvertersHolder_StructConverters()
	{
		return (EReference)xmlConvertersHolderEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter <em>Xml Stored Procedure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Stored Procedure Parameter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter
	 * @generated
	 */
	public EClass getXmlStoredProcedureParameter()
	{
		return xmlStoredProcedureParameterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getDirection()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_Direction()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getName()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_Name()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getQueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Parameter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getQueryParameter()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_QueryParameter()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getType()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_Type()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getJdbcType <em>Jdbc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getJdbcType()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_JdbcType()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getJdbcTypeName <em>Jdbc Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Type Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter#getJdbcTypeName()
	 * @see #getXmlStoredProcedureParameter()
	 * @generated
	 */
	public EAttribute getXmlStoredProcedureParameter_JdbcTypeName()
	{
		return (EAttribute)xmlStoredProcedureParameterEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery <em>Xml Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Named Stored Procedure Query</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery
	 * @generated
	 */
	public EClass getXmlNamedStoredProcedureQuery()
	{
		return xmlNamedStoredProcedureQueryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getName()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedStoredProcedureQuery_Name()
	{
		return (EAttribute)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getResultClass()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedStoredProcedureQuery_ResultClass()
	{
		return (EAttribute)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getResultSetMapping()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedStoredProcedureQuery_ResultSetMapping()
	{
		return (EAttribute)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getProcedureName()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedStoredProcedureQuery_ProcedureName()
	{
		return (EAttribute)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getReturnsResultSet <em>Returns Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returns Result Set</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getReturnsResultSet()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedStoredProcedureQuery_ReturnsResultSet()
	{
		return (EAttribute)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getHints()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EReference getXmlNamedStoredProcedureQuery_Hints()
	{
		return (EReference)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery#getParameters()
	 * @see #getXmlNamedStoredProcedureQuery()
	 * @generated
	 */
	public EReference getXmlNamedStoredProcedureQuery_Parameters()
	{
		return (EReference)xmlNamedStoredProcedureQueryEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Entity Mappings</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings
	 * @generated
	 */
	public EClass getXmlEntityMappings()
	{
		return xmlEntityMappingsEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings#getNamedStoredProcedureQueries <em>Named Stored Procedure Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Queries</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings#getNamedStoredProcedureQueries()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_NamedStoredProcedureQueries()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Persistence Unit Metadata</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata
	 * @generated
	 */
	public EClass getXmlPersistenceUnitMetadata()
	{
		return xmlPersistenceUnitMetadataEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata#isExcludeDefaultMappings()
	 * @see #getXmlPersistenceUnitMetadata()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitMetadata_ExcludeDefaultMappings()
	{
		return (EAttribute)xmlPersistenceUnitMetadataEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embeddable</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable
	 * @generated
	 */
	public EClass getXmlEmbeddable()
	{
		return xmlEmbeddableEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getCopyPolicy <em>Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getCopyPolicy()
	 * @see #getXmlEmbeddable()
	 * @generated
	 */
	public EReference getXmlEmbeddable_CopyPolicy()
	{
		return (EReference)xmlEmbeddableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getInstantiationCopyPolicy()
	 * @see #getXmlEmbeddable()
	 * @generated
	 */
	public EReference getXmlEmbeddable_InstantiationCopyPolicy()
	{
		return (EReference)xmlEmbeddableEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getCloneCopyPolicy <em>Clone Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getCloneCopyPolicy()
	 * @see #getXmlEmbeddable()
	 * @generated
	 */
	public EReference getXmlEmbeddable_CloneCopyPolicy()
	{
		return (EReference)xmlEmbeddableEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getProperties()
	 * @see #getXmlEmbeddable()
	 * @generated
	 */
	public EReference getXmlEmbeddable_Properties()
	{
		return (EReference)xmlEmbeddableEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable#getExcludeDefaultMappings()
	 * @see #getXmlEmbeddable()
	 * @generated
	 */
	public EAttribute getXmlEmbeddable_ExcludeDefaultMappings()
	{
		return (EAttribute)xmlEmbeddableEClass.getEStructuralFeatures().get(4);
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
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay <em>Xml Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Time Of Day</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay
	 * @generated
	 */
	public EClass getXmlTimeOfDay()
	{
		return xmlTimeOfDayEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getHour()
	 * @see #getXmlTimeOfDay()
	 * @generated
	 */
	public EAttribute getXmlTimeOfDay_Hour()
	{
		return (EAttribute)xmlTimeOfDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getMinute()
	 * @see #getXmlTimeOfDay()
	 * @generated
	 */
	public EAttribute getXmlTimeOfDay_Minute()
	{
		return (EAttribute)xmlTimeOfDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getSecond()
	 * @see #getXmlTimeOfDay()
	 * @generated
	 */
	public EAttribute getXmlTimeOfDay_Second()
	{
		return (EAttribute)xmlTimeOfDayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getMillisecond <em>Millisecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Millisecond</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay#getMillisecond()
	 * @see #getXmlTimeOfDay()
	 * @generated
	 */
	public EAttribute getXmlTimeOfDay_Millisecond()
	{
		return (EAttribute)xmlTimeOfDayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache <em>Xml Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Cache</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache
	 * @generated
	 */
	public EClass getXmlCache()
	{
		return xmlCacheEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getExpiry()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_Expiry()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getSize()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_Size()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getShared()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_Shared()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getType()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_Type()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getAlwaysRefresh <em>Always Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Refresh</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getAlwaysRefresh()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_AlwaysRefresh()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Only If Newer</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getRefreshOnlyIfNewer()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_RefreshOnlyIfNewer()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getDisableHits <em>Disable Hits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Hits</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getDisableHits()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_DisableHits()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getCoordinationType <em>Coordination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordination Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getCoordinationType()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EAttribute getXmlCache_CoordinationType()
	{
		return (EAttribute)xmlCacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getExpiryTimeOfDay <em>Expiry Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expiry Time Of Day</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache#getExpiryTimeOfDay()
	 * @see #getXmlCache()
	 * @generated
	 */
	public EReference getXmlCache_ExpiryTimeOfDay()
	{
		return (EReference)xmlCacheEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder <em>Xml Cache Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Cache Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder
	 * @generated
	 */
	public EClass getXmlCacheHolder()
	{
		return xmlCacheHolderEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder#getCache()
	 * @see #getXmlCacheHolder()
	 * @generated
	 */
	public EReference getXmlCacheHolder_Cache()
	{
		return (EReference)xmlCacheHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder#getExistenceChecking <em>Existence Checking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existence Checking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder#getExistenceChecking()
	 * @see #getXmlCacheHolder()
	 * @generated
	 */
	public EAttribute getXmlCacheHolder_ExistenceChecking()
	{
		return (EAttribute)xmlCacheHolderEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking <em>Xml Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Optimistic Locking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking
	 * @generated
	 */
	public EClass getXmlOptimisticLocking()
	{
		return xmlOptimisticLockingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getType()
	 * @see #getXmlOptimisticLocking()
	 * @generated
	 */
	public EAttribute getXmlOptimisticLocking_Type()
	{
		return (EAttribute)xmlOptimisticLockingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getCascade()
	 * @see #getXmlOptimisticLocking()
	 * @generated
	 */
	public EAttribute getXmlOptimisticLocking_Cascade()
	{
		return (EAttribute)xmlOptimisticLockingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getSelectedColumns <em>Selected Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Columns</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking#getSelectedColumns()
	 * @see #getXmlOptimisticLocking()
	 * @generated
	 */
	public EReference getXmlOptimisticLocking_SelectedColumns()
	{
		return (EReference)xmlOptimisticLockingEClass.getEStructuralFeatures().get(2);
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getOptimisticLocking <em>Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimistic Locking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getOptimisticLocking()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_OptimisticLocking()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getCopyPolicy <em>Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getCopyPolicy()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_CopyPolicy()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getInstantiationCopyPolicy()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_InstantiationCopyPolicy()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getCloneCopyPolicy <em>Clone Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getCloneCopyPolicy()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_CloneCopyPolicy()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getNamedStoredProcedureQueries <em>Named Stored Procedure Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Queries</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getNamedStoredProcedureQueries()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_NamedStoredProcedureQueries()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getProperties()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_Properties()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntity#getExcludeDefaultMappings()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EAttribute getXmlEntity_ExcludeDefaultMappings()
	{
		return (EAttribute)xmlEntityEClass.getEStructuralFeatures().get(6);
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getOptimisticLocking <em>Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimistic Locking</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getOptimisticLocking()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_OptimisticLocking()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getCopyPolicy <em>Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getCopyPolicy()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_CopyPolicy()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getInstantiationCopyPolicy()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_InstantiationCopyPolicy()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getCloneCopyPolicy <em>Clone Copy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getCloneCopyPolicy()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_CloneCopyPolicy()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getProperties()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_Properties()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlMappedSuperclass#getExcludeDefaultMappings()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EAttribute getXmlMappedSuperclass_ExcludeDefaultMappings()
	{
		return (EAttribute)xmlMappedSuperclassEClass.getEStructuralFeatures().get(5);
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
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Convertible Mapping</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping
	 * @generated
	 */
	public EClass getXmlConvertibleMapping()
	{
		return xmlConvertibleMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping#getConvert()
	 * @see #getXmlConvertibleMapping()
	 * @generated
	 */
	public EAttribute getXmlConvertibleMapping_Convert()
	{
		return (EAttribute)xmlConvertibleMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods <em>Xml Access Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Access Methods</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods
	 * @generated
	 */
	public EClass getXmlAccessMethods()
	{
		return xmlAccessMethodsEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods#getGetMethod <em>Get Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Get Method</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods#getGetMethod()
	 * @see #getXmlAccessMethods()
	 * @generated
	 */
	public EAttribute getXmlAccessMethods_GetMethod()
	{
		return (EAttribute)xmlAccessMethodsEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods#getSetMethod <em>Set Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Method</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods#getSetMethod()
	 * @see #getXmlAccessMethods()
	 * @generated
	 */
	public EAttribute getXmlAccessMethods_SetMethod()
	{
		return (EAttribute)xmlAccessMethodsEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder <em>Xml Access Methods Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Access Methods Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder
	 * @generated
	 */
	public EClass getXmlAccessMethodsHolder()
	{
		return xmlAccessMethodsHolderEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder#getAccessMethods <em>Access Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Methods</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder#getAccessMethods()
	 * @see #getXmlAccessMethodsHolder()
	 * @generated
	 */
	public EReference getXmlAccessMethodsHolder_AccessMethods()
	{
		return (EReference)xmlAccessMethodsHolderEClass.getEStructuralFeatures().get(0);
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlId#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlId#getProperties()
	 * @see #getXmlId()
	 * @generated
	 */
	public EReference getXmlId_Properties()
	{
		return (EReference)xmlIdEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Id Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl
	 * @generated
	 */
	public EClass getXmlIdImpl()
	{
		return xmlIdImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Id</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId
	 * @generated
	 */
	public EClass getXmlEmbeddedId()
	{
		return xmlEmbeddedIdEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId#getProperties()
	 * @see #getXmlEmbeddedId()
	 * @generated
	 */
	public EReference getXmlEmbeddedId_Properties()
	{
		return (EReference)xmlEmbeddedIdEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Id Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl
	 * @generated
	 */
	public EClass getXmlEmbeddedIdImpl()
	{
		return xmlEmbeddedIdImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded
	 * @generated
	 */
	public EClass getXmlEmbedded()
	{
		return xmlEmbeddedEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded#getProperties()
	 * @see #getXmlEmbedded()
	 * @generated
	 */
	public EReference getXmlEmbedded_Properties()
	{
		return (EReference)xmlEmbeddedEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl
	 * @generated
	 */
	public EClass getXmlEmbeddedImpl()
	{
		return xmlEmbeddedImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasic#getProperties()
	 * @see #getXmlBasic()
	 * @generated
	 */
	public EReference getXmlBasic_Properties()
	{
		return (EReference)xmlBasicEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl
	 * @generated
	 */
	public EClass getXmlBasicImpl()
	{
		return xmlBasicImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersion#getProperties()
	 * @see #getXmlVersion()
	 * @generated
	 */
	public EReference getXmlVersion_Properties()
	{
		return (EReference)xmlVersionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Version Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl
	 * @generated
	 */
	public EClass getXmlVersionImpl()
	{
		return xmlVersionImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOne#getProperties()
	 * @see #getXmlOneToOne()
	 * @generated
	 */
	public EReference getXmlOneToOne_Properties()
	{
		return (EReference)xmlOneToOneEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To One Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl
	 * @generated
	 */
	public EClass getXmlOneToOneImpl()
	{
		return xmlOneToOneImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany#getProperties()
	 * @see #getXmlOneToMany()
	 * @generated
	 */
	public EReference getXmlOneToMany_Properties()
	{
		return (EReference)xmlOneToManyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To Many Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl
	 * @generated
	 */
	public EClass getXmlOneToManyImpl()
	{
		return xmlOneToManyImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOne#getProperties()
	 * @see #getXmlManyToOne()
	 * @generated
	 */
	public EReference getXmlManyToOne_Properties()
	{
		return (EReference)xmlManyToOneEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To One Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl
	 * @generated
	 */
	public EClass getXmlManyToOneImpl()
	{
		return xmlManyToOneImplEClass;
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToMany#getProperties()
	 * @see #getXmlManyToMany()
	 * @generated
	 */
	public EReference getXmlManyToMany_Properties()
	{
		return (EReference)xmlManyToManyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To Many Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl
	 * @generated
	 */
	public EClass getXmlManyToManyImpl()
	{
		return xmlManyToManyImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes
	 * @generated
	 */
	public EClass getAttributes()
	{
		return attributesEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getBasicCollections <em>Basic Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Collections</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getBasicCollections()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_BasicCollections()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getBasicMaps <em>Basic Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Maps</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getBasicMaps()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_BasicMaps()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getTransformations()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Transformations()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getVariableOneToOnes <em>Variable One To Ones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable One To Ones</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes#getVariableOneToOnes()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_VariableOneToOnes()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection <em>Xml Basic Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Collection</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection
	 * @generated
	 */
	public EClass getXmlBasicCollection()
	{
		return xmlBasicCollectionEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection#getProperties()
	 * @see #getXmlBasicCollection()
	 * @generated
	 */
	public EReference getXmlBasicCollection_Properties()
	{
		return (EReference)xmlBasicCollectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl <em>Xml Basic Collection Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Collection Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl
	 * @generated
	 */
	public EClass getXmlBasicCollectionImpl()
	{
		return xmlBasicCollectionImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap <em>Xml Basic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Map</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap
	 * @generated
	 */
	public EClass getXmlBasicMap()
	{
		return xmlBasicMapEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap#getProperties()
	 * @see #getXmlBasicMap()
	 * @generated
	 */
	public EReference getXmlBasicMap_Properties()
	{
		return (EReference)xmlBasicMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl <em>Xml Basic Map Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Map Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl
	 * @generated
	 */
	public EClass getXmlBasicMapImpl()
	{
		return xmlBasicMapImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation <em>Xml Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Transformation</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation
	 * @generated
	 */
	public EClass getXmlTransformation()
	{
		return xmlTransformationEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation#getProperties()
	 * @see #getXmlTransformation()
	 * @generated
	 */
	public EReference getXmlTransformation_Properties()
	{
		return (EReference)xmlTransformationEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl <em>Xml Transformation Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Transformation Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl
	 * @generated
	 */
	public EClass getXmlTransformationImpl()
	{
		return xmlTransformationImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty <em>Xml Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Property</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty
	 * @generated
	 */
	public EClass getXmlProperty()
	{
		return xmlPropertyEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getName()
	 * @see #getXmlProperty()
	 * @generated
	 */
	public EAttribute getXmlProperty_Name()
	{
		return (EAttribute)xmlPropertyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getValue()
	 * @see #getXmlProperty()
	 * @generated
	 */
	public EAttribute getXmlProperty_Value()
	{
		return (EAttribute)xmlPropertyEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty#getValueType()
	 * @see #getXmlProperty()
	 * @generated
	 */
	public EAttribute getXmlProperty_ValueType()
	{
		return (EAttribute)xmlPropertyEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne <em>Xml Variable One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Variable One To One</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne
	 * @generated
	 */
	public EClass getXmlVariableOneToOne()
	{
		return xmlVariableOneToOneEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne#getProperties()
	 * @see #getXmlVariableOneToOne()
	 * @generated
	 */
	public EReference getXmlVariableOneToOne_Properties()
	{
		return (EReference)xmlVariableOneToOneEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl <em>Xml Variable One To One Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Variable One To One Impl</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl
	 * @generated
	 */
	public EClass getXmlVariableOneToOneImpl()
	{
		return xmlVariableOneToOneImplEClass;
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection <em>Xml Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Direction</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection
	 * @generated
	 */
	public EEnum getXmlDirection()
	{
		return xmlDirectionEEnum;
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType <em>Xml Change Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Change Tracking Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType
	 * @generated
	 */
	public EEnum getXmlChangeTrackingType()
	{
		return xmlChangeTrackingTypeEEnum;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter <em>Xml Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter
	 * @generated
	 */
	public EClass getXmlConverter()
	{
		return xmlConverterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter#getClassName()
	 * @see #getXmlConverter()
	 * @generated
	 */
	public EAttribute getXmlConverter_ClassName()
	{
		return (EAttribute)xmlConverterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter <em>Xml Type Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Type Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter
	 * @generated
	 */
	public EClass getXmlTypeConverter()
	{
		return xmlTypeConverterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter#getDataType()
	 * @see #getXmlTypeConverter()
	 * @generated
	 */
	public EAttribute getXmlTypeConverter_DataType()
	{
		return (EAttribute)xmlTypeConverterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter#getObjectType()
	 * @see #getXmlTypeConverter()
	 * @generated
	 */
	public EAttribute getXmlTypeConverter_ObjectType()
	{
		return (EAttribute)xmlTypeConverterEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue <em>Xml Conversion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Conversion Value</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue
	 * @generated
	 */
	public EClass getXmlConversionValue()
	{
		return xmlConversionValueEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Value</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue#getDataValue()
	 * @see #getXmlConversionValue()
	 * @generated
	 */
	public EAttribute getXmlConversionValue_DataValue()
	{
		return (EAttribute)xmlConversionValueEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue#getObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Value</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue#getObjectValue()
	 * @see #getXmlConversionValue()
	 * @generated
	 */
	public EAttribute getXmlConversionValue_ObjectValue()
	{
		return (EAttribute)xmlConversionValueEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter <em>Xml Object Type Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Object Type Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter
	 * @generated
	 */
	public EClass getXmlObjectTypeConverter()
	{
		return xmlObjectTypeConverterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getDataType()
	 * @see #getXmlObjectTypeConverter()
	 * @generated
	 */
	public EAttribute getXmlObjectTypeConverter_DataType()
	{
		return (EAttribute)xmlObjectTypeConverterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getObjectType()
	 * @see #getXmlObjectTypeConverter()
	 * @generated
	 */
	public EAttribute getXmlObjectTypeConverter_ObjectType()
	{
		return (EAttribute)xmlObjectTypeConverterEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getConversionValues <em>Conversion Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversion Values</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getConversionValues()
	 * @see #getXmlObjectTypeConverter()
	 * @generated
	 */
	public EReference getXmlObjectTypeConverter_ConversionValues()
	{
		return (EReference)xmlObjectTypeConverterEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getDefaultObjectValue <em>Default Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Object Value</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter#getDefaultObjectValue()
	 * @see #getXmlObjectTypeConverter()
	 * @generated
	 */
	public EAttribute getXmlObjectTypeConverter_DefaultObjectValue()
	{
		return (EAttribute)xmlObjectTypeConverterEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter <em>Xml Struct Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Struct Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter
	 * @generated
	 */
	public EClass getXmlStructConverter()
	{
		return xmlStructConverterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter#getConverter()
	 * @see #getXmlStructConverter()
	 * @generated
	 */
	public EAttribute getXmlStructConverter_Converter()
	{
		return (EAttribute)xmlStructConverterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder <em>Xml Converter Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Converter Holder</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder
	 * @generated
	 */
	public EClass getXmlConverterHolder()
	{
		return xmlConverterHolderEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getConverter()
	 * @see #getXmlConverterHolder()
	 * @generated
	 */
	public EReference getXmlConverterHolder_Converter()
	{
		return (EReference)xmlConverterHolderEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getTypeConverter <em>Type Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getTypeConverter()
	 * @see #getXmlConverterHolder()
	 * @generated
	 */
	public EReference getXmlConverterHolder_TypeConverter()
	{
		return (EReference)xmlConverterHolderEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getObjectTypeConverter <em>Object Type Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getObjectTypeConverter()
	 * @see #getXmlConverterHolder()
	 * @generated
	 */
	public EReference getXmlConverterHolder_ObjectTypeConverter()
	{
		return (EReference)xmlConverterHolderEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getStructConverter <em>Struct Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Converter</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder#getStructConverter()
	 * @see #getXmlConverterHolder()
	 * @generated
	 */
	public EReference getXmlConverterHolder_StructConverter()
	{
		return (EReference)xmlConverterHolderEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheType
	 * @generated
	 */
	public EEnum getCacheType()
	{
		return cacheTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType <em>Cache Coordination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Coordination Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType
	 * @generated
	 */
	public EEnum getCacheCoordinationType()
	{
		return cacheCoordinationTypeEEnum;
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
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType <em>Existence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Existence Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType
	 * @generated
	 */
	public EEnum getExistenceType()
	{
		return existenceTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType <em>Xml Optimistic Locking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Optimistic Locking Type</em>'.
	 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType
	 * @generated
	 */
	public EEnum getXmlOptimisticLockingType()
	{
		return xmlOptimisticLockingTypeEEnum;
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
		xmlNamedConverterEClass = createEClass(XML_NAMED_CONVERTER);
		createEAttribute(xmlNamedConverterEClass, XML_NAMED_CONVERTER__NAME);

		xmlConverterEClass = createEClass(XML_CONVERTER);
		createEAttribute(xmlConverterEClass, XML_CONVERTER__CLASS_NAME);

		xmlTypeConverterEClass = createEClass(XML_TYPE_CONVERTER);
		createEAttribute(xmlTypeConverterEClass, XML_TYPE_CONVERTER__DATA_TYPE);
		createEAttribute(xmlTypeConverterEClass, XML_TYPE_CONVERTER__OBJECT_TYPE);

		xmlConversionValueEClass = createEClass(XML_CONVERSION_VALUE);
		createEAttribute(xmlConversionValueEClass, XML_CONVERSION_VALUE__DATA_VALUE);
		createEAttribute(xmlConversionValueEClass, XML_CONVERSION_VALUE__OBJECT_VALUE);

		xmlObjectTypeConverterEClass = createEClass(XML_OBJECT_TYPE_CONVERTER);
		createEAttribute(xmlObjectTypeConverterEClass, XML_OBJECT_TYPE_CONVERTER__DATA_TYPE);
		createEAttribute(xmlObjectTypeConverterEClass, XML_OBJECT_TYPE_CONVERTER__OBJECT_TYPE);
		createEReference(xmlObjectTypeConverterEClass, XML_OBJECT_TYPE_CONVERTER__CONVERSION_VALUES);
		createEAttribute(xmlObjectTypeConverterEClass, XML_OBJECT_TYPE_CONVERTER__DEFAULT_OBJECT_VALUE);

		xmlStructConverterEClass = createEClass(XML_STRUCT_CONVERTER);
		createEAttribute(xmlStructConverterEClass, XML_STRUCT_CONVERTER__CONVERTER);

		xmlConvertersHolderEClass = createEClass(XML_CONVERTERS_HOLDER);
		createEReference(xmlConvertersHolderEClass, XML_CONVERTERS_HOLDER__CONVERTERS);
		createEReference(xmlConvertersHolderEClass, XML_CONVERTERS_HOLDER__TYPE_CONVERTERS);
		createEReference(xmlConvertersHolderEClass, XML_CONVERTERS_HOLDER__OBJECT_TYPE_CONVERTERS);
		createEReference(xmlConvertersHolderEClass, XML_CONVERTERS_HOLDER__STRUCT_CONVERTERS);

		xmlStoredProcedureParameterEClass = createEClass(XML_STORED_PROCEDURE_PARAMETER);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__DIRECTION);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__NAME);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__TYPE);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE);
		createEAttribute(xmlStoredProcedureParameterEClass, XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME);

		xmlNamedStoredProcedureQueryEClass = createEClass(XML_NAMED_STORED_PROCEDURE_QUERY);
		createEAttribute(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__NAME);
		createEAttribute(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS);
		createEAttribute(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING);
		createEAttribute(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME);
		createEAttribute(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET);
		createEReference(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__HINTS);
		createEReference(xmlNamedStoredProcedureQueryEClass, XML_NAMED_STORED_PROCEDURE_QUERY__PARAMETERS);

		xmlEntityMappingsEClass = createEClass(XML_ENTITY_MAPPINGS);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__NAMED_STORED_PROCEDURE_QUERIES);

		xmlPersistenceUnitMetadataEClass = createEClass(XML_PERSISTENCE_UNIT_METADATA);
		createEAttribute(xmlPersistenceUnitMetadataEClass, XML_PERSISTENCE_UNIT_METADATA__EXCLUDE_DEFAULT_MAPPINGS);

		xmlCustomizerEClass = createEClass(XML_CUSTOMIZER);
		createEAttribute(xmlCustomizerEClass, XML_CUSTOMIZER__CUSTOMIZER_CLASS_NAME);

		xmlCustomizerHolderEClass = createEClass(XML_CUSTOMIZER_HOLDER);
		createEReference(xmlCustomizerHolderEClass, XML_CUSTOMIZER_HOLDER__CUSTOMIZER);

		xmlChangeTrackingEClass = createEClass(XML_CHANGE_TRACKING);
		createEAttribute(xmlChangeTrackingEClass, XML_CHANGE_TRACKING__TYPE);

		xmlChangeTrackingHolderEClass = createEClass(XML_CHANGE_TRACKING_HOLDER);
		createEReference(xmlChangeTrackingHolderEClass, XML_CHANGE_TRACKING_HOLDER__CHANGE_TRACKING);

		xmlCopyPolicyEClass = createEClass(XML_COPY_POLICY);
		createEAttribute(xmlCopyPolicyEClass, XML_COPY_POLICY__CLASS);

		xmlInstantiationPolicyEClass = createEClass(XML_INSTANTIATION_POLICY);

		xmlCloneCopyPolicyEClass = createEClass(XML_CLONE_COPY_POLICY);
		createEAttribute(xmlCloneCopyPolicyEClass, XML_CLONE_COPY_POLICY__METHOD);
		createEAttribute(xmlCloneCopyPolicyEClass, XML_CLONE_COPY_POLICY__WORKING_COPY_METHOD);

		xmlEmbeddableEClass = createEClass(XML_EMBEDDABLE);
		createEReference(xmlEmbeddableEClass, XML_EMBEDDABLE__COPY_POLICY);
		createEReference(xmlEmbeddableEClass, XML_EMBEDDABLE__INSTANTIATION_COPY_POLICY);
		createEReference(xmlEmbeddableEClass, XML_EMBEDDABLE__CLONE_COPY_POLICY);
		createEReference(xmlEmbeddableEClass, XML_EMBEDDABLE__PROPERTIES);
		createEAttribute(xmlEmbeddableEClass, XML_EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS);

		xmlReadOnlyEClass = createEClass(XML_READ_ONLY);
		createEAttribute(xmlReadOnlyEClass, XML_READ_ONLY__READ_ONLY);

		xmlTimeOfDayEClass = createEClass(XML_TIME_OF_DAY);
		createEAttribute(xmlTimeOfDayEClass, XML_TIME_OF_DAY__HOUR);
		createEAttribute(xmlTimeOfDayEClass, XML_TIME_OF_DAY__MINUTE);
		createEAttribute(xmlTimeOfDayEClass, XML_TIME_OF_DAY__SECOND);
		createEAttribute(xmlTimeOfDayEClass, XML_TIME_OF_DAY__MILLISECOND);

		xmlCacheEClass = createEClass(XML_CACHE);
		createEAttribute(xmlCacheEClass, XML_CACHE__EXPIRY);
		createEAttribute(xmlCacheEClass, XML_CACHE__SIZE);
		createEAttribute(xmlCacheEClass, XML_CACHE__SHARED);
		createEAttribute(xmlCacheEClass, XML_CACHE__TYPE);
		createEAttribute(xmlCacheEClass, XML_CACHE__ALWAYS_REFRESH);
		createEAttribute(xmlCacheEClass, XML_CACHE__REFRESH_ONLY_IF_NEWER);
		createEAttribute(xmlCacheEClass, XML_CACHE__DISABLE_HITS);
		createEAttribute(xmlCacheEClass, XML_CACHE__COORDINATION_TYPE);
		createEReference(xmlCacheEClass, XML_CACHE__EXPIRY_TIME_OF_DAY);

		xmlCacheHolderEClass = createEClass(XML_CACHE_HOLDER);
		createEReference(xmlCacheHolderEClass, XML_CACHE_HOLDER__CACHE);
		createEAttribute(xmlCacheHolderEClass, XML_CACHE_HOLDER__EXISTENCE_CHECKING);

		xmlOptimisticLockingEClass = createEClass(XML_OPTIMISTIC_LOCKING);
		createEAttribute(xmlOptimisticLockingEClass, XML_OPTIMISTIC_LOCKING__TYPE);
		createEAttribute(xmlOptimisticLockingEClass, XML_OPTIMISTIC_LOCKING__CASCADE);
		createEReference(xmlOptimisticLockingEClass, XML_OPTIMISTIC_LOCKING__SELECTED_COLUMNS);

		xmlEntityEClass = createEClass(XML_ENTITY);
		createEReference(xmlEntityEClass, XML_ENTITY__OPTIMISTIC_LOCKING);
		createEReference(xmlEntityEClass, XML_ENTITY__COPY_POLICY);
		createEReference(xmlEntityEClass, XML_ENTITY__INSTANTIATION_COPY_POLICY);
		createEReference(xmlEntityEClass, XML_ENTITY__CLONE_COPY_POLICY);
		createEReference(xmlEntityEClass, XML_ENTITY__NAMED_STORED_PROCEDURE_QUERIES);
		createEReference(xmlEntityEClass, XML_ENTITY__PROPERTIES);
		createEAttribute(xmlEntityEClass, XML_ENTITY__EXCLUDE_DEFAULT_MAPPINGS);

		xmlMappedSuperclassEClass = createEClass(XML_MAPPED_SUPERCLASS);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__COPY_POLICY);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__CLONE_COPY_POLICY);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__PROPERTIES);
		createEAttribute(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS);

		xmlMutableEClass = createEClass(XML_MUTABLE);
		createEAttribute(xmlMutableEClass, XML_MUTABLE__MUTABLE);

		xmlConverterHolderEClass = createEClass(XML_CONVERTER_HOLDER);
		createEReference(xmlConverterHolderEClass, XML_CONVERTER_HOLDER__CONVERTER);
		createEReference(xmlConverterHolderEClass, XML_CONVERTER_HOLDER__TYPE_CONVERTER);
		createEReference(xmlConverterHolderEClass, XML_CONVERTER_HOLDER__OBJECT_TYPE_CONVERTER);
		createEReference(xmlConverterHolderEClass, XML_CONVERTER_HOLDER__STRUCT_CONVERTER);

		xmlConvertibleMappingEClass = createEClass(XML_CONVERTIBLE_MAPPING);
		createEAttribute(xmlConvertibleMappingEClass, XML_CONVERTIBLE_MAPPING__CONVERT);

		xmlAccessMethodsEClass = createEClass(XML_ACCESS_METHODS);
		createEAttribute(xmlAccessMethodsEClass, XML_ACCESS_METHODS__GET_METHOD);
		createEAttribute(xmlAccessMethodsEClass, XML_ACCESS_METHODS__SET_METHOD);

		xmlAccessMethodsHolderEClass = createEClass(XML_ACCESS_METHODS_HOLDER);
		createEReference(xmlAccessMethodsHolderEClass, XML_ACCESS_METHODS_HOLDER__ACCESS_METHODS);

		xmlPropertyEClass = createEClass(XML_PROPERTY);
		createEAttribute(xmlPropertyEClass, XML_PROPERTY__NAME);
		createEAttribute(xmlPropertyEClass, XML_PROPERTY__VALUE);
		createEAttribute(xmlPropertyEClass, XML_PROPERTY__VALUE_TYPE);

		xmlIdEClass = createEClass(XML_ID);
		createEReference(xmlIdEClass, XML_ID__PROPERTIES);

		xmlIdImplEClass = createEClass(XML_ID_IMPL);

		xmlEmbeddedIdEClass = createEClass(XML_EMBEDDED_ID);
		createEReference(xmlEmbeddedIdEClass, XML_EMBEDDED_ID__PROPERTIES);

		xmlEmbeddedIdImplEClass = createEClass(XML_EMBEDDED_ID_IMPL);

		xmlEmbeddedEClass = createEClass(XML_EMBEDDED);
		createEReference(xmlEmbeddedEClass, XML_EMBEDDED__PROPERTIES);

		xmlEmbeddedImplEClass = createEClass(XML_EMBEDDED_IMPL);

		xmlBasicEClass = createEClass(XML_BASIC);
		createEReference(xmlBasicEClass, XML_BASIC__PROPERTIES);

		xmlBasicImplEClass = createEClass(XML_BASIC_IMPL);

		xmlVersionEClass = createEClass(XML_VERSION);
		createEReference(xmlVersionEClass, XML_VERSION__PROPERTIES);

		xmlVersionImplEClass = createEClass(XML_VERSION_IMPL);

		xmlPrivateOwnedEClass = createEClass(XML_PRIVATE_OWNED);
		createEAttribute(xmlPrivateOwnedEClass, XML_PRIVATE_OWNED__PRIVATE_OWNED);

		xmlJoinFetchEClass = createEClass(XML_JOIN_FETCH);
		createEAttribute(xmlJoinFetchEClass, XML_JOIN_FETCH__JOIN_FETCH);

		xmlOneToOneEClass = createEClass(XML_ONE_TO_ONE);
		createEReference(xmlOneToOneEClass, XML_ONE_TO_ONE__PROPERTIES);

		xmlOneToOneImplEClass = createEClass(XML_ONE_TO_ONE_IMPL);

		xmlOneToManyEClass = createEClass(XML_ONE_TO_MANY);
		createEReference(xmlOneToManyEClass, XML_ONE_TO_MANY__PROPERTIES);

		xmlOneToManyImplEClass = createEClass(XML_ONE_TO_MANY_IMPL);

		xmlManyToOneEClass = createEClass(XML_MANY_TO_ONE);
		createEReference(xmlManyToOneEClass, XML_MANY_TO_ONE__PROPERTIES);

		xmlManyToOneImplEClass = createEClass(XML_MANY_TO_ONE_IMPL);

		xmlManyToManyEClass = createEClass(XML_MANY_TO_MANY);
		createEReference(xmlManyToManyEClass, XML_MANY_TO_MANY__PROPERTIES);

		xmlManyToManyImplEClass = createEClass(XML_MANY_TO_MANY_IMPL);

		xmlBasicCollectionEClass = createEClass(XML_BASIC_COLLECTION);
		createEReference(xmlBasicCollectionEClass, XML_BASIC_COLLECTION__PROPERTIES);

		xmlBasicCollectionImplEClass = createEClass(XML_BASIC_COLLECTION_IMPL);

		xmlBasicMapEClass = createEClass(XML_BASIC_MAP);
		createEReference(xmlBasicMapEClass, XML_BASIC_MAP__PROPERTIES);

		xmlBasicMapImplEClass = createEClass(XML_BASIC_MAP_IMPL);

		xmlTransformationEClass = createEClass(XML_TRANSFORMATION);
		createEReference(xmlTransformationEClass, XML_TRANSFORMATION__PROPERTIES);

		xmlTransformationImplEClass = createEClass(XML_TRANSFORMATION_IMPL);

		xmlVariableOneToOneEClass = createEClass(XML_VARIABLE_ONE_TO_ONE);
		createEReference(xmlVariableOneToOneEClass, XML_VARIABLE_ONE_TO_ONE__PROPERTIES);

		xmlVariableOneToOneImplEClass = createEClass(XML_VARIABLE_ONE_TO_ONE_IMPL);

		attributesEClass = createEClass(ATTRIBUTES);
		createEReference(attributesEClass, ATTRIBUTES__BASIC_COLLECTIONS);
		createEReference(attributesEClass, ATTRIBUTES__BASIC_MAPS);
		createEReference(attributesEClass, ATTRIBUTES__TRANSFORMATIONS);
		createEReference(attributesEClass, ATTRIBUTES__VARIABLE_ONE_TO_ONES);

		// Create enums
		xmlDirectionEEnum = createEEnum(XML_DIRECTION);
		xmlChangeTrackingTypeEEnum = createEEnum(XML_CHANGE_TRACKING_TYPE);
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		cacheCoordinationTypeEEnum = createEEnum(CACHE_COORDINATION_TYPE);
		existenceTypeEEnum = createEEnum(EXISTENCE_TYPE);
		xmlOptimisticLockingTypeEEnum = createEEnum(XML_OPTIMISTIC_LOCKING_TYPE);
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
		xmlConverterEClass.getESuperTypes().add(this.getXmlNamedConverter());
		xmlTypeConverterEClass.getESuperTypes().add(this.getXmlNamedConverter());
		xmlObjectTypeConverterEClass.getESuperTypes().add(this.getXmlNamedConverter());
		xmlStructConverterEClass.getESuperTypes().add(this.getXmlNamedConverter());
		xmlEntityMappingsEClass.getESuperTypes().add(theOrmPackage.getXmlEntityMappings());
		xmlEntityMappingsEClass.getESuperTypes().add(this.getXmlConvertersHolder());
		xmlPersistenceUnitMetadataEClass.getESuperTypes().add(theOrmPackage.getXmlPersistenceUnitMetadata());
		xmlEmbeddableEClass.getESuperTypes().add(theOrmPackage.getXmlEmbeddable());
		xmlEmbeddableEClass.getESuperTypes().add(this.getXmlCustomizerHolder());
		xmlEmbeddableEClass.getESuperTypes().add(this.getXmlChangeTrackingHolder());
		xmlEmbeddableEClass.getESuperTypes().add(this.getXmlConvertersHolder());
		xmlEntityEClass.getESuperTypes().add(theOrmPackage.getXmlEntity());
		xmlEntityEClass.getESuperTypes().add(this.getXmlReadOnly());
		xmlEntityEClass.getESuperTypes().add(this.getXmlCustomizerHolder());
		xmlEntityEClass.getESuperTypes().add(this.getXmlChangeTrackingHolder());
		xmlEntityEClass.getESuperTypes().add(this.getXmlCacheHolder());
		xmlEntityEClass.getESuperTypes().add(this.getXmlConvertersHolder());
		xmlMappedSuperclassEClass.getESuperTypes().add(theOrmPackage.getXmlMappedSuperclass());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlReadOnly());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlCustomizerHolder());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlChangeTrackingHolder());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlCacheHolder());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getXmlConvertersHolder());
		xmlConvertibleMappingEClass.getESuperTypes().add(theOrmPackage.getXmlConvertibleMapping());
		xmlConvertibleMappingEClass.getESuperTypes().add(this.getXmlConverterHolder());
		xmlIdEClass.getESuperTypes().add(theOrmPackage.getXmlId());
		xmlIdEClass.getESuperTypes().add(this.getXmlMutable());
		xmlIdEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlIdEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlIdImplEClass.getESuperTypes().add(theOrmPackage.getXmlIdImpl());
		xmlIdImplEClass.getESuperTypes().add(this.getXmlId());
		xmlEmbeddedIdEClass.getESuperTypes().add(theOrmPackage.getXmlEmbeddedId());
		xmlEmbeddedIdEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlEmbeddedIdImplEClass.getESuperTypes().add(theOrmPackage.getXmlEmbeddedIdImpl());
		xmlEmbeddedIdImplEClass.getESuperTypes().add(this.getXmlEmbeddedId());
		xmlEmbeddedEClass.getESuperTypes().add(theOrmPackage.getXmlEmbedded());
		xmlEmbeddedEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlEmbeddedImplEClass.getESuperTypes().add(theOrmPackage.getXmlEmbeddedImpl());
		xmlEmbeddedImplEClass.getESuperTypes().add(this.getXmlEmbedded());
		xmlBasicEClass.getESuperTypes().add(theOrmPackage.getXmlBasic());
		xmlBasicEClass.getESuperTypes().add(this.getXmlMutable());
		xmlBasicEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlBasicEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlBasicImplEClass.getESuperTypes().add(theOrmPackage.getXmlBasicImpl());
		xmlBasicImplEClass.getESuperTypes().add(this.getXmlBasic());
		xmlVersionEClass.getESuperTypes().add(theOrmPackage.getXmlVersion());
		xmlVersionEClass.getESuperTypes().add(this.getXmlMutable());
		xmlVersionEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlVersionEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlVersionImplEClass.getESuperTypes().add(theOrmPackage.getXmlVersionImpl());
		xmlVersionImplEClass.getESuperTypes().add(this.getXmlVersion());
		xmlOneToOneEClass.getESuperTypes().add(theOrmPackage.getXmlOneToOne());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlPrivateOwned());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlOneToOneImplEClass.getESuperTypes().add(theOrmPackage.getXmlOneToOneImpl());
		xmlOneToOneImplEClass.getESuperTypes().add(this.getXmlOneToOne());
		xmlOneToManyEClass.getESuperTypes().add(theOrmPackage.getXmlOneToMany());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlPrivateOwned());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlOneToManyImplEClass.getESuperTypes().add(theOrmPackage.getXmlOneToManyImpl());
		xmlOneToManyImplEClass.getESuperTypes().add(this.getXmlOneToMany());
		xmlManyToOneEClass.getESuperTypes().add(theOrmPackage.getXmlManyToOne());
		xmlManyToOneEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlManyToOneEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlManyToOneImplEClass.getESuperTypes().add(theOrmPackage.getXmlManyToOneImpl());
		xmlManyToOneImplEClass.getESuperTypes().add(this.getXmlManyToOne());
		xmlManyToManyEClass.getESuperTypes().add(theOrmPackage.getXmlManyToMany());
		xmlManyToManyEClass.getESuperTypes().add(this.getXmlJoinFetch());
		xmlManyToManyEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlManyToManyImplEClass.getESuperTypes().add(theOrmPackage.getXmlManyToManyImpl());
		xmlManyToManyImplEClass.getESuperTypes().add(this.getXmlManyToMany());
		xmlBasicCollectionEClass.getESuperTypes().add(theOrmPackage.getXmlAttributeMapping());
		xmlBasicCollectionEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlBasicCollectionImplEClass.getESuperTypes().add(theOrmPackage.getAbstractXmlAttributeMapping());
		xmlBasicCollectionImplEClass.getESuperTypes().add(this.getXmlBasicCollection());
		xmlBasicMapEClass.getESuperTypes().add(theOrmPackage.getXmlAttributeMapping());
		xmlBasicMapEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlBasicMapImplEClass.getESuperTypes().add(theOrmPackage.getAbstractXmlAttributeMapping());
		xmlBasicMapImplEClass.getESuperTypes().add(this.getXmlBasicMap());
		xmlTransformationEClass.getESuperTypes().add(theOrmPackage.getXmlAttributeMapping());
		xmlTransformationEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlTransformationImplEClass.getESuperTypes().add(theOrmPackage.getAbstractXmlAttributeMapping());
		xmlTransformationImplEClass.getESuperTypes().add(this.getXmlTransformation());
		xmlVariableOneToOneEClass.getESuperTypes().add(theOrmPackage.getXmlAttributeMapping());
		xmlVariableOneToOneEClass.getESuperTypes().add(this.getXmlAccessMethodsHolder());
		xmlVariableOneToOneImplEClass.getESuperTypes().add(theOrmPackage.getAbstractXmlAttributeMapping());
		xmlVariableOneToOneImplEClass.getESuperTypes().add(this.getXmlVariableOneToOne());
		attributesEClass.getESuperTypes().add(theOrmPackage.getAttributes());

		// Initialize classes and features; add operations and parameters
		initEClass(xmlNamedConverterEClass, XmlNamedConverter.class, "XmlNamedConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlNamedConverter_Name(), ecorePackage.getEString(), "name", null, 0, 1, XmlNamedConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConverterEClass, XmlConverter.class, "XmlConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlConverter_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, XmlConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTypeConverterEClass, XmlTypeConverter.class, "XmlTypeConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlTypeConverter_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, XmlTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTypeConverter_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, XmlTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConversionValueEClass, XmlConversionValue.class, "XmlConversionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlConversionValue_DataValue(), ecorePackage.getEString(), "dataValue", null, 0, 1, XmlConversionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlConversionValue_ObjectValue(), ecorePackage.getEString(), "objectValue", null, 0, 1, XmlConversionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlObjectTypeConverterEClass, XmlObjectTypeConverter.class, "XmlObjectTypeConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlObjectTypeConverter_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, XmlObjectTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlObjectTypeConverter_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, XmlObjectTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlObjectTypeConverter_ConversionValues(), this.getXmlConversionValue(), null, "conversionValues", null, 0, -1, XmlObjectTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlObjectTypeConverter_DefaultObjectValue(), ecorePackage.getEString(), "defaultObjectValue", null, 0, 1, XmlObjectTypeConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlStructConverterEClass, XmlStructConverter.class, "XmlStructConverter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlStructConverter_Converter(), ecorePackage.getEString(), "converter", null, 0, 1, XmlStructConverter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConvertersHolderEClass, XmlConvertersHolder.class, "XmlConvertersHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlConvertersHolder_Converters(), this.getXmlConverter(), null, "converters", null, 0, -1, XmlConvertersHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConvertersHolder_TypeConverters(), this.getXmlTypeConverter(), null, "typeConverters", null, 0, -1, XmlConvertersHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConvertersHolder_ObjectTypeConverters(), this.getXmlObjectTypeConverter(), null, "objectTypeConverters", null, 0, -1, XmlConvertersHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConvertersHolder_StructConverters(), this.getXmlStructConverter(), null, "structConverters", null, 0, -1, XmlConvertersHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlStoredProcedureParameterEClass, XmlStoredProcedureParameter.class, "XmlStoredProcedureParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlStoredProcedureParameter_Direction(), this.getXmlDirection(), "direction", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlStoredProcedureParameter_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlStoredProcedureParameter_QueryParameter(), theXMLTypePackage.getString(), "queryParameter", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlStoredProcedureParameter_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlStoredProcedureParameter_JdbcType(), theXMLTypePackage.getIntObject(), "jdbcType", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlStoredProcedureParameter_JdbcTypeName(), theXMLTypePackage.getString(), "jdbcTypeName", null, 0, 1, XmlStoredProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNamedStoredProcedureQueryEClass, XmlNamedStoredProcedureQuery.class, "XmlNamedStoredProcedureQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlNamedStoredProcedureQuery_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedStoredProcedureQuery_ResultClass(), theXMLTypePackage.getString(), "resultClass", null, 0, 1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedStoredProcedureQuery_ResultSetMapping(), theXMLTypePackage.getString(), "resultSetMapping", null, 0, 1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedStoredProcedureQuery_ProcedureName(), theXMLTypePackage.getString(), "procedureName", null, 0, 1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedStoredProcedureQuery_ReturnsResultSet(), theXMLTypePackage.getBooleanObject(), "returnsResultSet", null, 0, 1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlNamedStoredProcedureQuery_Hints(), theOrmPackage.getXmlQueryHint(), null, "hints", null, 0, -1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlNamedStoredProcedureQuery_Parameters(), this.getXmlStoredProcedureParameter(), null, "parameters", null, 0, -1, XmlNamedStoredProcedureQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEntityMappingsEClass, XmlEntityMappings.class, "XmlEntityMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlEntityMappings_NamedStoredProcedureQueries(), this.getXmlNamedStoredProcedureQuery(), null, "namedStoredProcedureQueries", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlPersistenceUnitMetadataEClass, XmlPersistenceUnitMetadata.class, "XmlPersistenceUnitMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPersistenceUnitMetadata_ExcludeDefaultMappings(), theXMLTypePackage.getBoolean(), "excludeDefaultMappings", null, 0, 1, XmlPersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCustomizerEClass, XmlCustomizer.class, "XmlCustomizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlCustomizer_CustomizerClassName(), ecorePackage.getEString(), "customizerClassName", null, 0, 1, XmlCustomizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCustomizerHolderEClass, XmlCustomizerHolder.class, "XmlCustomizerHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlCustomizerHolder_Customizer(), this.getXmlCustomizer(), null, "customizer", null, 0, 1, XmlCustomizerHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlChangeTrackingEClass, XmlChangeTracking.class, "XmlChangeTracking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlChangeTracking_Type(), this.getXmlChangeTrackingType(), "type", null, 0, 1, XmlChangeTracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlChangeTrackingHolderEClass, XmlChangeTrackingHolder.class, "XmlChangeTrackingHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlChangeTrackingHolder_ChangeTracking(), this.getXmlChangeTracking(), null, "changeTracking", null, 0, 1, XmlChangeTrackingHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCopyPolicyEClass, XmlCopyPolicy.class, "XmlCopyPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlCopyPolicy_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, XmlCopyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlInstantiationPolicyEClass, XmlInstantiationPolicy.class, "XmlInstantiationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlCloneCopyPolicyEClass, XmlCloneCopyPolicy.class, "XmlCloneCopyPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlCloneCopyPolicy_Method(), theXMLTypePackage.getString(), "method", null, 0, 1, XmlCloneCopyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCloneCopyPolicy_WorkingCopyMethod(), theXMLTypePackage.getString(), "workingCopyMethod", null, 0, 1, XmlCloneCopyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEmbeddableEClass, XmlEmbeddable.class, "XmlEmbeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlEmbeddable_CopyPolicy(), this.getXmlCopyPolicy(), null, "copyPolicy", null, 0, 1, XmlEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEmbeddable_InstantiationCopyPolicy(), this.getXmlCopyPolicy(), null, "instantiationCopyPolicy", null, 0, 1, XmlEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEmbeddable_CloneCopyPolicy(), this.getXmlCopyPolicy(), null, "cloneCopyPolicy", null, 0, 1, XmlEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEmbeddable_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEmbeddable_ExcludeDefaultMappings(), theXMLTypePackage.getBooleanObject(), "excludeDefaultMappings", null, 0, 1, XmlEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlReadOnlyEClass, XmlReadOnly.class, "XmlReadOnly", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlReadOnly_ReadOnly(), theXMLTypePackage.getBooleanObject(), "readOnly", null, 0, 1, XmlReadOnly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTimeOfDayEClass, XmlTimeOfDay.class, "XmlTimeOfDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlTimeOfDay_Hour(), theXMLTypePackage.getIntObject(), "hour", null, 0, 1, XmlTimeOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTimeOfDay_Minute(), theXMLTypePackage.getIntObject(), "minute", null, 0, 1, XmlTimeOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTimeOfDay_Second(), theXMLTypePackage.getIntObject(), "second", null, 0, 1, XmlTimeOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTimeOfDay_Millisecond(), theXMLTypePackage.getIntObject(), "millisecond", null, 0, 1, XmlTimeOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCacheEClass, XmlCache.class, "XmlCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlCache_Expiry(), theXMLTypePackage.getIntObject(), "expiry", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_Size(), theXMLTypePackage.getIntObject(), "size", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_Shared(), theXMLTypePackage.getBooleanObject(), "shared", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_Type(), this.getCacheType(), "type", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_AlwaysRefresh(), theXMLTypePackage.getBooleanObject(), "alwaysRefresh", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_RefreshOnlyIfNewer(), theXMLTypePackage.getBooleanObject(), "refreshOnlyIfNewer", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_DisableHits(), theXMLTypePackage.getBooleanObject(), "disableHits", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCache_CoordinationType(), this.getCacheCoordinationType(), "coordinationType", "", 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlCache_ExpiryTimeOfDay(), this.getXmlTimeOfDay(), null, "expiryTimeOfDay", null, 0, 1, XmlCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlCacheHolderEClass, XmlCacheHolder.class, "XmlCacheHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlCacheHolder_Cache(), this.getXmlCache(), null, "cache", null, 0, 1, XmlCacheHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlCacheHolder_ExistenceChecking(), this.getExistenceType(), "existenceChecking", "", 0, 1, XmlCacheHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOptimisticLockingEClass, XmlOptimisticLocking.class, "XmlOptimisticLocking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlOptimisticLocking_Type(), this.getXmlOptimisticLockingType(), "type", null, 0, 1, XmlOptimisticLocking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlOptimisticLocking_Cascade(), theXMLTypePackage.getBooleanObject(), "cascade", null, 0, 1, XmlOptimisticLocking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlOptimisticLocking_SelectedColumns(), theOrmPackage.getXmlColumn(), null, "selectedColumns", null, 0, -1, XmlOptimisticLocking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEntityEClass, XmlEntity.class, "XmlEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlEntity_OptimisticLocking(), this.getXmlOptimisticLocking(), null, "optimisticLocking", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_CopyPolicy(), this.getXmlCopyPolicy(), null, "copyPolicy", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_InstantiationCopyPolicy(), this.getXmlCopyPolicy(), null, "instantiationCopyPolicy", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_CloneCopyPolicy(), this.getXmlCopyPolicy(), null, "cloneCopyPolicy", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_NamedStoredProcedureQueries(), this.getXmlNamedStoredProcedureQuery(), null, "namedStoredProcedureQueries", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntity_ExcludeDefaultMappings(), theXMLTypePackage.getBooleanObject(), "excludeDefaultMappings", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlMappedSuperclassEClass, XmlMappedSuperclass.class, "XmlMappedSuperclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlMappedSuperclass_OptimisticLocking(), this.getXmlOptimisticLocking(), null, "optimisticLocking", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_CopyPolicy(), this.getXmlCopyPolicy(), null, "copyPolicy", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_InstantiationCopyPolicy(), this.getXmlCopyPolicy(), null, "instantiationCopyPolicy", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_CloneCopyPolicy(), this.getXmlCopyPolicy(), null, "cloneCopyPolicy", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlMappedSuperclass_ExcludeDefaultMappings(), theXMLTypePackage.getBooleanObject(), "excludeDefaultMappings", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlMutableEClass, XmlMutable.class, "XmlMutable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlMutable_Mutable(), theXMLTypePackage.getBooleanObject(), "mutable", null, 0, 1, XmlMutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConverterHolderEClass, XmlConverterHolder.class, "XmlConverterHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlConverterHolder_Converter(), this.getXmlConverter(), null, "converter", null, 0, 1, XmlConverterHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConverterHolder_TypeConverter(), this.getXmlTypeConverter(), null, "typeConverter", null, 0, 1, XmlConverterHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConverterHolder_ObjectTypeConverter(), this.getXmlObjectTypeConverter(), null, "objectTypeConverter", null, 0, 1, XmlConverterHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlConverterHolder_StructConverter(), this.getXmlStructConverter(), null, "structConverter", null, 0, 1, XmlConverterHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlConvertibleMappingEClass, XmlConvertibleMapping.class, "XmlConvertibleMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlConvertibleMapping_Convert(), ecorePackage.getEString(), "convert", null, 0, 1, XmlConvertibleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAccessMethodsEClass, XmlAccessMethods.class, "XmlAccessMethods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlAccessMethods_GetMethod(), theXMLTypePackage.getString(), "getMethod", null, 0, 1, XmlAccessMethods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAccessMethods_SetMethod(), theXMLTypePackage.getString(), "setMethod", null, 0, 1, XmlAccessMethods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAccessMethodsHolderEClass, XmlAccessMethodsHolder.class, "XmlAccessMethodsHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlAccessMethodsHolder_AccessMethods(), this.getXmlAccessMethods(), null, "accessMethods", null, 0, 1, XmlAccessMethodsHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlPropertyEClass, XmlProperty.class, "XmlProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlProperty_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlProperty_ValueType(), theXMLTypePackage.getString(), "valueType", null, 0, 1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdEClass, XmlId.class, "XmlId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlId_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdImplEClass, XmlIdImpl.class, "XmlIdImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEmbeddedIdEClass, XmlEmbeddedId.class, "XmlEmbeddedId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlEmbeddedId_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlEmbeddedId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEmbeddedIdImplEClass, XmlEmbeddedIdImpl.class, "XmlEmbeddedIdImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEmbeddedEClass, XmlEmbedded.class, "XmlEmbedded", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlEmbedded_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlEmbedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEmbeddedImplEClass, XmlEmbeddedImpl.class, "XmlEmbeddedImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlBasicEClass, XmlBasic.class, "XmlBasic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlBasic_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBasicImplEClass, XmlBasicImpl.class, "XmlBasicImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlVersionEClass, XmlVersion.class, "XmlVersion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlVersion_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlVersionImplEClass, XmlVersionImpl.class, "XmlVersionImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPrivateOwnedEClass, XmlPrivateOwned.class, "XmlPrivateOwned", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPrivateOwned_PrivateOwned(), theXMLTypePackage.getBoolean(), "privateOwned", null, 0, 1, XmlPrivateOwned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinFetchEClass, XmlJoinFetch.class, "XmlJoinFetch", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlJoinFetch_JoinFetch(), this.getXmlJoinFetchType(), "joinFetch", null, 0, 1, XmlJoinFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOneToOneEClass, XmlOneToOne.class, "XmlOneToOne", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlOneToOne_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOneToOneImplEClass, XmlOneToOneImpl.class, "XmlOneToOneImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlOneToManyEClass, XmlOneToMany.class, "XmlOneToMany", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlOneToMany_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlOneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOneToManyImplEClass, XmlOneToManyImpl.class, "XmlOneToManyImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToOneEClass, XmlManyToOne.class, "XmlManyToOne", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlManyToOne_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlManyToOneImplEClass, XmlManyToOneImpl.class, "XmlManyToOneImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToManyEClass, XmlManyToMany.class, "XmlManyToMany", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlManyToMany_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlManyToManyImplEClass, XmlManyToManyImpl.class, "XmlManyToManyImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlBasicCollectionEClass, XmlBasicCollection.class, "XmlBasicCollection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlBasicCollection_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlBasicCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBasicCollectionImplEClass, XmlBasicCollectionImpl.class, "XmlBasicCollectionImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlBasicMapEClass, XmlBasicMap.class, "XmlBasicMap", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlBasicMap_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlBasicMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBasicMapImplEClass, XmlBasicMapImpl.class, "XmlBasicMapImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTransformationEClass, XmlTransformation.class, "XmlTransformation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlTransformation_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTransformationImplEClass, XmlTransformationImpl.class, "XmlTransformationImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlVariableOneToOneEClass, XmlVariableOneToOne.class, "XmlVariableOneToOne", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlVariableOneToOne_Properties(), this.getXmlProperty(), null, "properties", null, 0, -1, XmlVariableOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlVariableOneToOneImplEClass, XmlVariableOneToOneImpl.class, "XmlVariableOneToOneImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributes_BasicCollections(), this.getXmlBasicCollection(), null, "basicCollections", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_BasicMaps(), this.getXmlBasicMap(), null, "basicMaps", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Transformations(), this.getXmlTransformation(), null, "transformations", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_VariableOneToOnes(), this.getXmlVariableOneToOne(), null, "variableOneToOnes", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xmlDirectionEEnum, XmlDirection.class, "XmlDirection");
		addEEnumLiteral(xmlDirectionEEnum, XmlDirection.IN);
		addEEnumLiteral(xmlDirectionEEnum, XmlDirection.OUT);
		addEEnumLiteral(xmlDirectionEEnum, XmlDirection.IN_OUT);
		addEEnumLiteral(xmlDirectionEEnum, XmlDirection.OUT_CURSOR);

		initEEnum(xmlChangeTrackingTypeEEnum, XmlChangeTrackingType.class, "XmlChangeTrackingType");
		addEEnumLiteral(xmlChangeTrackingTypeEEnum, XmlChangeTrackingType.ATTRIBUTE);
		addEEnumLiteral(xmlChangeTrackingTypeEEnum, XmlChangeTrackingType.OBJECT);
		addEEnumLiteral(xmlChangeTrackingTypeEEnum, XmlChangeTrackingType.DEFERRED);
		addEEnumLiteral(xmlChangeTrackingTypeEEnum, XmlChangeTrackingType.AUTO);

		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.FULL);
		addEEnumLiteral(cacheTypeEEnum, CacheType.WEAK);
		addEEnumLiteral(cacheTypeEEnum, CacheType.SOFT);
		addEEnumLiteral(cacheTypeEEnum, CacheType.SOFT_WEAK);
		addEEnumLiteral(cacheTypeEEnum, CacheType.HARD_WEAK);
		addEEnumLiteral(cacheTypeEEnum, CacheType.CACHE);
		addEEnumLiteral(cacheTypeEEnum, CacheType.NONE);

		initEEnum(cacheCoordinationTypeEEnum, CacheCoordinationType.class, "CacheCoordinationType");
		addEEnumLiteral(cacheCoordinationTypeEEnum, CacheCoordinationType.SEND_OBJECT_CHANGES);
		addEEnumLiteral(cacheCoordinationTypeEEnum, CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS);
		addEEnumLiteral(cacheCoordinationTypeEEnum, CacheCoordinationType.SEND_NEW_OBJECTS_WITH_CHANGES);
		addEEnumLiteral(cacheCoordinationTypeEEnum, CacheCoordinationType.NONE);

		initEEnum(existenceTypeEEnum, ExistenceType.class, "ExistenceType");
		addEEnumLiteral(existenceTypeEEnum, ExistenceType.CHECK_CACHE);
		addEEnumLiteral(existenceTypeEEnum, ExistenceType.CHECK_DATABASE);
		addEEnumLiteral(existenceTypeEEnum, ExistenceType.ASSUME_EXISTENCE);
		addEEnumLiteral(existenceTypeEEnum, ExistenceType.ASSUME_NON_EXISTENCE);

		initEEnum(xmlOptimisticLockingTypeEEnum, XmlOptimisticLockingType.class, "XmlOptimisticLockingType");
		addEEnumLiteral(xmlOptimisticLockingTypeEEnum, XmlOptimisticLockingType.ALL_COLUMNS);
		addEEnumLiteral(xmlOptimisticLockingTypeEEnum, XmlOptimisticLockingType.CHANGED_COLUMNS);
		addEEnumLiteral(xmlOptimisticLockingTypeEEnum, XmlOptimisticLockingType.SELECTED_COLUMNS);
		addEEnumLiteral(xmlOptimisticLockingTypeEEnum, XmlOptimisticLockingType.VERSION_COLUMN);

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
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter <em>Xml Named Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedConverter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlNamedConverter()
		 * @generated
		 */
		public static final EClass XML_NAMED_CONVERTER = eINSTANCE.getXmlNamedConverter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_CONVERTER__NAME = eINSTANCE.getXmlNamedConverter_Name();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking <em>Xml Change Tracking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTracking
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTracking()
		 * @generated
		 */
		public static final EClass XML_CHANGE_TRACKING = eINSTANCE.getXmlChangeTracking();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CHANGE_TRACKING__TYPE = eINSTANCE.getXmlChangeTracking_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder <em>Xml Change Tracking Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTrackingHolder()
		 * @generated
		 */
		public static final EClass XML_CHANGE_TRACKING_HOLDER = eINSTANCE.getXmlChangeTrackingHolder();

		/**
		 * The meta object literal for the '<em><b>Change Tracking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CHANGE_TRACKING_HOLDER__CHANGE_TRACKING = eINSTANCE.getXmlChangeTrackingHolder_ChangeTracking();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy <em>Xml Copy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCopyPolicy
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCopyPolicy()
		 * @generated
		 */
		public static final EClass XML_COPY_POLICY = eINSTANCE.getXmlCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_COPY_POLICY__CLASS = eINSTANCE.getXmlCopyPolicy_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy <em>Xml Instantiation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlInstantiationPolicy
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlInstantiationPolicy()
		 * @generated
		 */
		public static final EClass XML_INSTANTIATION_POLICY = eINSTANCE.getXmlInstantiationPolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy <em>Xml Clone Copy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCloneCopyPolicy
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCloneCopyPolicy()
		 * @generated
		 */
		public static final EClass XML_CLONE_COPY_POLICY = eINSTANCE.getXmlCloneCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CLONE_COPY_POLICY__METHOD = eINSTANCE.getXmlCloneCopyPolicy_Method();

		/**
		 * The meta object literal for the '<em><b>Working Copy Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CLONE_COPY_POLICY__WORKING_COPY_METHOD = eINSTANCE.getXmlCloneCopyPolicy_WorkingCopyMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder <em>Xml Converters Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertersHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConvertersHolder()
		 * @generated
		 */
		public static final EClass XML_CONVERTERS_HOLDER = eINSTANCE.getXmlConvertersHolder();

		/**
		 * The meta object literal for the '<em><b>Converters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTERS_HOLDER__CONVERTERS = eINSTANCE.getXmlConvertersHolder_Converters();

		/**
		 * The meta object literal for the '<em><b>Type Converters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTERS_HOLDER__TYPE_CONVERTERS = eINSTANCE.getXmlConvertersHolder_TypeConverters();

		/**
		 * The meta object literal for the '<em><b>Object Type Converters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTERS_HOLDER__OBJECT_TYPE_CONVERTERS = eINSTANCE.getXmlConvertersHolder_ObjectTypeConverters();

		/**
		 * The meta object literal for the '<em><b>Struct Converters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTERS_HOLDER__STRUCT_CONVERTERS = eINSTANCE.getXmlConvertersHolder_StructConverters();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter <em>Xml Stored Procedure Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStoredProcedureParameter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlStoredProcedureParameter()
		 * @generated
		 */
		public static final EClass XML_STORED_PROCEDURE_PARAMETER = eINSTANCE.getXmlStoredProcedureParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__DIRECTION = eINSTANCE.getXmlStoredProcedureParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__NAME = eINSTANCE.getXmlStoredProcedureParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Query Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER = eINSTANCE.getXmlStoredProcedureParameter_QueryParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__TYPE = eINSTANCE.getXmlStoredProcedureParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Jdbc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE = eINSTANCE.getXmlStoredProcedureParameter_JdbcType();

		/**
		 * The meta object literal for the '<em><b>Jdbc Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME = eINSTANCE.getXmlStoredProcedureParameter_JdbcTypeName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery <em>Xml Named Stored Procedure Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlNamedStoredProcedureQuery
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlNamedStoredProcedureQuery()
		 * @generated
		 */
		public static final EClass XML_NAMED_STORED_PROCEDURE_QUERY = eINSTANCE.getXmlNamedStoredProcedureQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_STORED_PROCEDURE_QUERY__NAME = eINSTANCE.getXmlNamedStoredProcedureQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Result Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS = eINSTANCE.getXmlNamedStoredProcedureQuery_ResultClass();

		/**
		 * The meta object literal for the '<em><b>Result Set Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING = eINSTANCE.getXmlNamedStoredProcedureQuery_ResultSetMapping();

		/**
		 * The meta object literal for the '<em><b>Procedure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME = eINSTANCE.getXmlNamedStoredProcedureQuery_ProcedureName();

		/**
		 * The meta object literal for the '<em><b>Returns Result Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET = eINSTANCE.getXmlNamedStoredProcedureQuery_ReturnsResultSet();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_NAMED_STORED_PROCEDURE_QUERY__HINTS = eINSTANCE.getXmlNamedStoredProcedureQuery_Hints();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_NAMED_STORED_PROCEDURE_QUERY__PARAMETERS = eINSTANCE.getXmlNamedStoredProcedureQuery_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEntityMappings
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEntityMappings()
		 * @generated
		 */
		public static final EClass XML_ENTITY_MAPPINGS = eINSTANCE.getXmlEntityMappings();

		/**
		 * The meta object literal for the '<em><b>Named Stored Procedure Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__NAMED_STORED_PROCEDURE_QUERIES = eINSTANCE.getXmlEntityMappings_NamedStoredProcedureQueries();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlPersistenceUnitMetadata
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlPersistenceUnitMetadata()
		 * @generated
		 */
		public static final EClass XML_PERSISTENCE_UNIT_METADATA = eINSTANCE.getXmlPersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_METADATA__EXCLUDE_DEFAULT_MAPPINGS = eINSTANCE.getXmlPersistenceUnitMetadata_ExcludeDefaultMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddable
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddable()
		 * @generated
		 */
		public static final EClass XML_EMBEDDABLE = eINSTANCE.getXmlEmbeddable();

		/**
		 * The meta object literal for the '<em><b>Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDABLE__COPY_POLICY = eINSTANCE.getXmlEmbeddable_CopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Instantiation Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDABLE__INSTANTIATION_COPY_POLICY = eINSTANCE.getXmlEmbeddable_InstantiationCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Clone Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDABLE__CLONE_COPY_POLICY = eINSTANCE.getXmlEmbeddable_CloneCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDABLE__PROPERTIES = eINSTANCE.getXmlEmbeddable_Properties();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS = eINSTANCE.getXmlEmbeddable_ExcludeDefaultMappings();

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
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay <em>Xml Time Of Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTimeOfDay()
		 * @generated
		 */
		public static final EClass XML_TIME_OF_DAY = eINSTANCE.getXmlTimeOfDay();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TIME_OF_DAY__HOUR = eINSTANCE.getXmlTimeOfDay_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TIME_OF_DAY__MINUTE = eINSTANCE.getXmlTimeOfDay_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TIME_OF_DAY__SECOND = eINSTANCE.getXmlTimeOfDay_Second();

		/**
		 * The meta object literal for the '<em><b>Millisecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TIME_OF_DAY__MILLISECOND = eINSTANCE.getXmlTimeOfDay_Millisecond();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache <em>Xml Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCache
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCache()
		 * @generated
		 */
		public static final EClass XML_CACHE = eINSTANCE.getXmlCache();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__EXPIRY = eINSTANCE.getXmlCache_Expiry();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__SIZE = eINSTANCE.getXmlCache_Size();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__SHARED = eINSTANCE.getXmlCache_Shared();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__TYPE = eINSTANCE.getXmlCache_Type();

		/**
		 * The meta object literal for the '<em><b>Always Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__ALWAYS_REFRESH = eINSTANCE.getXmlCache_AlwaysRefresh();

		/**
		 * The meta object literal for the '<em><b>Refresh Only If Newer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__REFRESH_ONLY_IF_NEWER = eINSTANCE.getXmlCache_RefreshOnlyIfNewer();

		/**
		 * The meta object literal for the '<em><b>Disable Hits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__DISABLE_HITS = eINSTANCE.getXmlCache_DisableHits();

		/**
		 * The meta object literal for the '<em><b>Coordination Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE__COORDINATION_TYPE = eINSTANCE.getXmlCache_CoordinationType();

		/**
		 * The meta object literal for the '<em><b>Expiry Time Of Day</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CACHE__EXPIRY_TIME_OF_DAY = eINSTANCE.getXmlCache_ExpiryTimeOfDay();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder <em>Xml Cache Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlCacheHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlCacheHolder()
		 * @generated
		 */
		public static final EClass XML_CACHE_HOLDER = eINSTANCE.getXmlCacheHolder();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CACHE_HOLDER__CACHE = eINSTANCE.getXmlCacheHolder_Cache();

		/**
		 * The meta object literal for the '<em><b>Existence Checking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CACHE_HOLDER__EXISTENCE_CHECKING = eINSTANCE.getXmlCacheHolder_ExistenceChecking();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking <em>Xml Optimistic Locking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLocking
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOptimisticLocking()
		 * @generated
		 */
		public static final EClass XML_OPTIMISTIC_LOCKING = eINSTANCE.getXmlOptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_OPTIMISTIC_LOCKING__TYPE = eINSTANCE.getXmlOptimisticLocking_Type();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_OPTIMISTIC_LOCKING__CASCADE = eINSTANCE.getXmlOptimisticLocking_Cascade();

		/**
		 * The meta object literal for the '<em><b>Selected Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_OPTIMISTIC_LOCKING__SELECTED_COLUMNS = eINSTANCE.getXmlOptimisticLocking_SelectedColumns();

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
		 * The meta object literal for the '<em><b>Optimistic Locking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__OPTIMISTIC_LOCKING = eINSTANCE.getXmlEntity_OptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__COPY_POLICY = eINSTANCE.getXmlEntity_CopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Instantiation Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__INSTANTIATION_COPY_POLICY = eINSTANCE.getXmlEntity_InstantiationCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Clone Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__CLONE_COPY_POLICY = eINSTANCE.getXmlEntity_CloneCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Named Stored Procedure Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__NAMED_STORED_PROCEDURE_QUERIES = eINSTANCE.getXmlEntity_NamedStoredProcedureQueries();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__PROPERTIES = eINSTANCE.getXmlEntity_Properties();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY__EXCLUDE_DEFAULT_MAPPINGS = eINSTANCE.getXmlEntity_ExcludeDefaultMappings();

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
		 * The meta object literal for the '<em><b>Optimistic Locking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING = eINSTANCE.getXmlMappedSuperclass_OptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__COPY_POLICY = eINSTANCE.getXmlMappedSuperclass_CopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Instantiation Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY = eINSTANCE.getXmlMappedSuperclass_InstantiationCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Clone Copy Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__CLONE_COPY_POLICY = eINSTANCE.getXmlMappedSuperclass_CloneCopyPolicy();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__PROPERTIES = eINSTANCE.getXmlMappedSuperclass_Properties();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS = eINSTANCE.getXmlMappedSuperclass_ExcludeDefaultMappings();

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
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConvertibleMapping
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConvertibleMapping()
		 * @generated
		 */
		public static final EClass XML_CONVERTIBLE_MAPPING = eINSTANCE.getXmlConvertibleMapping();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERTIBLE_MAPPING__CONVERT = eINSTANCE.getXmlConvertibleMapping_Convert();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods <em>Xml Access Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlAccessMethods()
		 * @generated
		 */
		public static final EClass XML_ACCESS_METHODS = eINSTANCE.getXmlAccessMethods();

		/**
		 * The meta object literal for the '<em><b>Get Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ACCESS_METHODS__GET_METHOD = eINSTANCE.getXmlAccessMethods_GetMethod();

		/**
		 * The meta object literal for the '<em><b>Set Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ACCESS_METHODS__SET_METHOD = eINSTANCE.getXmlAccessMethods_SetMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder <em>Xml Access Methods Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethodsHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlAccessMethodsHolder()
		 * @generated
		 */
		public static final EClass XML_ACCESS_METHODS_HOLDER = eINSTANCE.getXmlAccessMethodsHolder();

		/**
		 * The meta object literal for the '<em><b>Access Methods</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ACCESS_METHODS_HOLDER__ACCESS_METHODS = eINSTANCE.getXmlAccessMethodsHolder_AccessMethods();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ID__PROPERTIES = eINSTANCE.getXmlId_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlIdImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlIdImpl()
		 * @generated
		 */
		public static final EClass XML_ID_IMPL = eINSTANCE.getXmlIdImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedId
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedId()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_ID = eINSTANCE.getXmlEmbeddedId();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDED_ID__PROPERTIES = eINSTANCE.getXmlEmbeddedId_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedIdImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedIdImpl()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_ID_IMPL = eINSTANCE.getXmlEmbeddedIdImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbedded
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbedded()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED = eINSTANCE.getXmlEmbedded();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_EMBEDDED__PROPERTIES = eINSTANCE.getXmlEmbedded_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlEmbeddedImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlEmbeddedImpl()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_IMPL = eINSTANCE.getXmlEmbeddedImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_BASIC__PROPERTIES = eINSTANCE.getXmlBasic_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicImpl()
		 * @generated
		 */
		public static final EClass XML_BASIC_IMPL = eINSTANCE.getXmlBasicImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_VERSION__PROPERTIES = eINSTANCE.getXmlVersion_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVersionImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVersionImpl()
		 * @generated
		 */
		public static final EClass XML_VERSION_IMPL = eINSTANCE.getXmlVersionImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ONE_TO_ONE__PROPERTIES = eINSTANCE.getXmlOneToOne_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToOneImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToOneImpl()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_ONE_IMPL = eINSTANCE.getXmlOneToOneImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ONE_TO_MANY__PROPERTIES = eINSTANCE.getXmlOneToMany_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToManyImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOneToManyImpl()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_MANY_IMPL = eINSTANCE.getXmlOneToManyImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MANY_TO_ONE__PROPERTIES = eINSTANCE.getXmlManyToOne_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToOneImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToOneImpl()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_ONE_IMPL = eINSTANCE.getXmlManyToOneImpl();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MANY_TO_MANY__PROPERTIES = eINSTANCE.getXmlManyToMany_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlManyToManyImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlManyToManyImpl()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_MANY_IMPL = eINSTANCE.getXmlManyToManyImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.Attributes <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.Attributes
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getAttributes()
		 * @generated
		 */
		public static final EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Basic Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__BASIC_COLLECTIONS = eINSTANCE.getAttributes_BasicCollections();

		/**
		 * The meta object literal for the '<em><b>Basic Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__BASIC_MAPS = eINSTANCE.getAttributes_BasicMaps();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__TRANSFORMATIONS = eINSTANCE.getAttributes_Transformations();

		/**
		 * The meta object literal for the '<em><b>Variable One To Ones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__VARIABLE_ONE_TO_ONES = eINSTANCE.getAttributes_VariableOneToOnes();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection <em>Xml Basic Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollection
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicCollection()
		 * @generated
		 */
		public static final EClass XML_BASIC_COLLECTION = eINSTANCE.getXmlBasicCollection();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_BASIC_COLLECTION__PROPERTIES = eINSTANCE.getXmlBasicCollection_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl <em>Xml Basic Collection Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicCollectionImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicCollectionImpl()
		 * @generated
		 */
		public static final EClass XML_BASIC_COLLECTION_IMPL = eINSTANCE.getXmlBasicCollectionImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap <em>Xml Basic Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMap
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicMap()
		 * @generated
		 */
		public static final EClass XML_BASIC_MAP = eINSTANCE.getXmlBasicMap();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_BASIC_MAP__PROPERTIES = eINSTANCE.getXmlBasicMap_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl <em>Xml Basic Map Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlBasicMapImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlBasicMapImpl()
		 * @generated
		 */
		public static final EClass XML_BASIC_MAP_IMPL = eINSTANCE.getXmlBasicMapImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation <em>Xml Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformation
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTransformation()
		 * @generated
		 */
		public static final EClass XML_TRANSFORMATION = eINSTANCE.getXmlTransformation();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_TRANSFORMATION__PROPERTIES = eINSTANCE.getXmlTransformation_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl <em>Xml Transformation Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTransformationImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTransformationImpl()
		 * @generated
		 */
		public static final EClass XML_TRANSFORMATION_IMPL = eINSTANCE.getXmlTransformationImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty <em>Xml Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlProperty()
		 * @generated
		 */
		public static final EClass XML_PROPERTY = eINSTANCE.getXmlProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PROPERTY__NAME = eINSTANCE.getXmlProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PROPERTY__VALUE = eINSTANCE.getXmlProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PROPERTY__VALUE_TYPE = eINSTANCE.getXmlProperty_ValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne <em>Xml Variable One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOne
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVariableOneToOne()
		 * @generated
		 */
		public static final EClass XML_VARIABLE_ONE_TO_ONE = eINSTANCE.getXmlVariableOneToOne();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_VARIABLE_ONE_TO_ONE__PROPERTIES = eINSTANCE.getXmlVariableOneToOne_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl <em>Xml Variable One To One Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlVariableOneToOneImpl
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlVariableOneToOneImpl()
		 * @generated
		 */
		public static final EClass XML_VARIABLE_ONE_TO_ONE_IMPL = eINSTANCE.getXmlVariableOneToOneImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection <em>Xml Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlDirection
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlDirection()
		 * @generated
		 */
		public static final EEnum XML_DIRECTION = eINSTANCE.getXmlDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType <em>Xml Change Tracking Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlChangeTrackingType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlChangeTrackingType()
		 * @generated
		 */
		public static final EEnum XML_CHANGE_TRACKING_TYPE = eINSTANCE.getXmlChangeTrackingType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter <em>Xml Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConverter()
		 * @generated
		 */
		public static final EClass XML_CONVERTER = eINSTANCE.getXmlConverter();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERTER__CLASS_NAME = eINSTANCE.getXmlConverter_ClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter <em>Xml Type Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlTypeConverter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlTypeConverter()
		 * @generated
		 */
		public static final EClass XML_TYPE_CONVERTER = eINSTANCE.getXmlTypeConverter();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_CONVERTER__DATA_TYPE = eINSTANCE.getXmlTypeConverter_DataType();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_CONVERTER__OBJECT_TYPE = eINSTANCE.getXmlTypeConverter_ObjectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue <em>Xml Conversion Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConversionValue()
		 * @generated
		 */
		public static final EClass XML_CONVERSION_VALUE = eINSTANCE.getXmlConversionValue();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERSION_VALUE__DATA_VALUE = eINSTANCE.getXmlConversionValue_DataValue();

		/**
		 * The meta object literal for the '<em><b>Object Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERSION_VALUE__OBJECT_VALUE = eINSTANCE.getXmlConversionValue_ObjectValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter <em>Xml Object Type Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlObjectTypeConverter()
		 * @generated
		 */
		public static final EClass XML_OBJECT_TYPE_CONVERTER = eINSTANCE.getXmlObjectTypeConverter();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_OBJECT_TYPE_CONVERTER__DATA_TYPE = eINSTANCE.getXmlObjectTypeConverter_DataType();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_OBJECT_TYPE_CONVERTER__OBJECT_TYPE = eINSTANCE.getXmlObjectTypeConverter_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Conversion Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_OBJECT_TYPE_CONVERTER__CONVERSION_VALUES = eINSTANCE.getXmlObjectTypeConverter_ConversionValues();

		/**
		 * The meta object literal for the '<em><b>Default Object Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_OBJECT_TYPE_CONVERTER__DEFAULT_OBJECT_VALUE = eINSTANCE.getXmlObjectTypeConverter_DefaultObjectValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter <em>Xml Struct Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlStructConverter
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlStructConverter()
		 * @generated
		 */
		public static final EClass XML_STRUCT_CONVERTER = eINSTANCE.getXmlStructConverter();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_STRUCT_CONVERTER__CONVERTER = eINSTANCE.getXmlStructConverter_Converter();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder <em>Xml Converter Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlConverterHolder
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlConverterHolder()
		 * @generated
		 */
		public static final EClass XML_CONVERTER_HOLDER = eINSTANCE.getXmlConverterHolder();

		/**
		 * The meta object literal for the '<em><b>Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTER_HOLDER__CONVERTER = eINSTANCE.getXmlConverterHolder_Converter();

		/**
		 * The meta object literal for the '<em><b>Type Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTER_HOLDER__TYPE_CONVERTER = eINSTANCE.getXmlConverterHolder_TypeConverter();

		/**
		 * The meta object literal for the '<em><b>Object Type Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTER_HOLDER__OBJECT_TYPE_CONVERTER = eINSTANCE.getXmlConverterHolder_ObjectTypeConverter();

		/**
		 * The meta object literal for the '<em><b>Struct Converter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_CONVERTER_HOLDER__STRUCT_CONVERTER = eINSTANCE.getXmlConverterHolder_StructConverter();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getCacheType()
		 * @generated
		 */
		public static final EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType <em>Cache Coordination Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.CacheCoordinationType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getCacheCoordinationType()
		 * @generated
		 */
		public static final EEnum CACHE_COORDINATION_TYPE = eINSTANCE.getCacheCoordinationType();

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
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType <em>Existence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.ExistenceType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getExistenceType()
		 * @generated
		 */
		public static final EEnum EXISTENCE_TYPE = eINSTANCE.getExistenceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType <em>Xml Optimistic Locking Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.XmlOptimisticLockingType
		 * @see org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmPackage#getXmlOptimisticLockingType()
		 * @generated
		 */
		public static final EEnum XML_OPTIMISTIC_LOCKING_TYPE = eINSTANCE.getXmlOptimisticLockingType();

	}

} //EclipseLinkOrmPackage
