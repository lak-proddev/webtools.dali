/*******************************************************************************
 * Copyright (c) 2026 Lakshminarayana Nekkanti and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Lakshminarayana Nekkanti - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.tests.internal.platform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import junit.framework.TestCase;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.jpa.core.JpaPlatform;
import org.eclipse.jpt.jpa.core.JpaPlatformProvider;
import org.eclipse.jpt.jpa.core.JpaResourceDefinition;
import org.eclipse.jpt.jpa.core.JpaWorkspace;
import org.eclipse.jpt.jpa.core.context.java.DefaultJavaAttributeMappingDefinition;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMappingDefinition;
import org.eclipse.jpt.jpa.core.context.java.JavaManagedTypeDefinition;
import org.eclipse.jpt.jpa.core.context.java.JavaTypeMappingDefinition;
import org.eclipse.jpt.jpa.core.internal.context.java.JavaPersistentTypeDefinition;
import org.eclipse.jpt.jpa.core.internal.jpa2_1.context.orm.GenericOrmXmlDefinition2_1;
import org.eclipse.jpt.jpa.core.internal.jpa2_1.context.persistence.GenericPersistenceXmlDefinition2_1;
import org.eclipse.jpt.jpa.core.internal.jpa2_2.context.orm.GenericOrmXmlDefinition2_2;
import org.eclipse.jpt.jpa.core.internal.jpa2_2.context.persistence.GenericPersistenceXmlDefinition2_2;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.JakartaJavaAttributeMappingDefinitionAdapter;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.JavaConverterTypeDefinition3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.orm.GenericOrmXmlDefinition3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.persistence.GenericPersistenceXmlDefinition3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_1.context.orm.GenericOrmXmlDefinition3_1;
import org.eclipse.jpt.jpa.core.internal.jpa3_1.context.persistence.GenericPersistenceXmlDefinition3_1;
import org.eclipse.jpt.jpa.core.internal.jpa3_2.context.orm.GenericOrmXmlDefinition3_2;
import org.eclipse.jpt.jpa.core.internal.jpa3_2.context.persistence.GenericPersistenceXmlDefinition3_2;
import org.eclipse.jpt.jpa.core.resource.persistence.XmlPersistence;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory.EclipseLinkJpaPlatformVersion;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_1;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_4;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_5;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_6;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_7;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory4_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory5_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformProvider2_6;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformProvider2_7;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformProvider3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformProvider4_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformProvider5_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.java.EclipseLinkJavaIdMappingDefinition3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition2_5;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition3_1;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition5_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.persistence.EclipseLinkPersistenceXmlDefinition2_5;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.persistence.EclipseLinkPersistenceXmlDefinition2_7;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.persistence.EclipseLinkPersistenceXmlDefinition3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.persistence.EclipseLinkPersistenceXmlDefinition3_1;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.persistence.EclipseLinkPersistenceXmlDefinition5_0;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.XmlEntityMappings;
import org.eclipse.persistence.jpa.jpql.parser.EclipseLinkJPQLGrammar2_5;
import org.eclipse.persistence.jpa.jpql.parser.EclipseLinkJPQLGrammar2_6;

/**
 * Tests for the EclipseLink 2.6, 2.7, 3.0, 4.0 and 5.0 JPA platforms: their
 * registration, versions, resource types and Java mapping definitions. None of
 * these tests needs a JPA project, so they run without the persistence jars.
 */
@SuppressWarnings("nls")
public class EclipseLinkJpaPlatformTests
	extends TestCase
{
	private static final String[] NEW_PLATFORM_IDS = {
		EclipseLinkJpaPlatformFactory2_6.ID,
		EclipseLinkJpaPlatformFactory2_7.ID,
		EclipseLinkJpaPlatformFactory3_0.ID,
		EclipseLinkJpaPlatformFactory4_0.ID,
		EclipseLinkJpaPlatformFactory5_0.ID
	};

	private static final String[] JAKARTA_PLATFORM_IDS = {
		EclipseLinkJpaPlatformFactory3_0.ID,
		EclipseLinkJpaPlatformFactory4_0.ID,
		EclipseLinkJpaPlatformFactory5_0.ID
	};

	public EclipseLinkJpaPlatformTests(String name) {
		super(name);
	}


	// ********** registration **********

	public void testPlatformConfigs() {
		this.verifyConfig(EclipseLinkJpaPlatformFactory2_6.ID, "EclipseLink 2.6.x", "2.1");
		this.verifyConfig(EclipseLinkJpaPlatformFactory2_7.ID, "EclipseLink 2.7.x", "2.2");
		this.verifyConfig(EclipseLinkJpaPlatformFactory3_0.ID, "EclipseLink 3.0.x", "3.0");
		this.verifyConfig(EclipseLinkJpaPlatformFactory4_0.ID, "EclipseLink 4.0.x", "3.1");
		this.verifyConfig(EclipseLinkJpaPlatformFactory5_0.ID, "EclipseLink 5.0.x", "3.2");
	}

	public void testEclipseLink2_4LabelNoLongerClaims2_5() {
		assertEquals("EclipseLink 2.4.x", getConfig(EclipseLinkJpaPlatformFactory2_4.ID).getLabel());
		assertEquals("EclipseLink 2.5.x", getConfig(EclipseLinkJpaPlatformFactory2_5.ID).getLabel());
	}

	private void verifyConfig(String id, String label, String jpaFacetVersion) {
		JpaPlatform.Config config = getConfig(id);
		assertEquals(id, config.getId());
		assertEquals(label, config.getLabel());
		assertEquals(jpaFacetVersion, config.getJpaFacetVersion().getVersionString());
		assertEquals("eclipselink", config.getGroupConfig().getId());
		assertEquals("org.eclipse.jpt.jpa.eclipselink.core", config.getPluginId());
		assertNotNull(config.getJpaPlatform());
	}


	// ********** versions **********

	public void testPlatformVersions() {
		this.verifyVersion(EclipseLinkJpaPlatformFactory2_6.ID, EclipseLinkJpaPlatformFactory2_6.VERSION, "2.1");
		this.verifyVersion(EclipseLinkJpaPlatformFactory2_7.ID, EclipseLinkJpaPlatformFactory2_7.VERSION, "2.2");
		this.verifyVersion(EclipseLinkJpaPlatformFactory3_0.ID, EclipseLinkJpaPlatformFactory3_0.VERSION, "3.0");
		this.verifyVersion(EclipseLinkJpaPlatformFactory4_0.ID, EclipseLinkJpaPlatformFactory4_0.VERSION, "3.1");
		this.verifyVersion(EclipseLinkJpaPlatformFactory5_0.ID, EclipseLinkJpaPlatformFactory5_0.VERSION, "3.2");
	}

	private void verifyVersion(String id, String eclipseLinkVersion, String jpaVersion) {
		JpaPlatform.Version version = getPlatform(id).getJpaVersion();
		assertTrue(version instanceof EclipseLinkJpaPlatformVersion);
		assertEquals(eclipseLinkVersion, version.getVersion());
		assertEquals(jpaVersion, version.getJpaVersion());
		// the 2.x features (multitenancy etc.) are keyed off these checks
		assertTrue(((EclipseLinkJpaPlatformVersion) version).isCompatibleWithEclipseLinkVersion(EclipseLinkJpaPlatformFactory2_5.VERSION));
		assertTrue(((EclipseLinkJpaPlatformVersion) version).isCompatibleWithEclipseLinkVersion(eclipseLinkVersion));
	}

	/**
	 * The caching UI hides the "shared" setting, which EclipseLink 3.0 removed,
	 * when the platform is compatible with EclipseLink 3.0.
	 */
	public void testEclipseLink3_0Compatibility() {
		assertFalse(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory2_5.ID));
		assertFalse(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory2_6.ID));
		assertFalse(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory2_7.ID));
		assertTrue(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory3_0.ID));
		assertTrue(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory4_0.ID));
		assertTrue(isCompatibleWithEclipseLink3_0(EclipseLinkJpaPlatformFactory5_0.ID));
	}

	private static boolean isCompatibleWithEclipseLink3_0(String id) {
		EclipseLinkJpaPlatformVersion version = (EclipseLinkJpaPlatformVersion) getPlatform(id).getJpaVersion();
		return version.isCompatibleWithEclipseLinkVersion(EclipseLinkJpaPlatformFactory3_0.VERSION);
	}

	public void testJpqlGrammar() {
		assertSame(EclipseLinkJPQLGrammar2_5.instance(), getPlatform(EclipseLinkJpaPlatformFactory2_5.ID).getJpqlGrammar());
		for (String id : NEW_PLATFORM_IDS) {
			assertSame(id, EclipseLinkJPQLGrammar2_6.instance(), getPlatform(id).getJpqlGrammar());
		}
	}


	// ********** resource types **********

	public void testMostRecentSupportedResourceTypes() {
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory2_5.ID,
				EclipseLinkOrmXmlDefinition2_5.instance().getResourceType(),
				GenericOrmXmlDefinition2_1.instance().getResourceType(),
				GenericPersistenceXmlDefinition2_1.instance().getResourceType());
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory2_6.ID,
				EclipseLinkOrmXmlDefinition2_5.instance().getResourceType(),
				GenericOrmXmlDefinition2_1.instance().getResourceType(),
				GenericPersistenceXmlDefinition2_1.instance().getResourceType());
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory2_7.ID,
				EclipseLinkOrmXmlDefinition2_5.instance().getResourceType(),
				GenericOrmXmlDefinition2_2.instance().getResourceType(),
				GenericPersistenceXmlDefinition2_2.instance().getResourceType());
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory3_0.ID,
				EclipseLinkOrmXmlDefinition3_0.instance().getResourceType(),
				GenericOrmXmlDefinition3_0.instance().getResourceType(),
				GenericPersistenceXmlDefinition3_0.instance().getResourceType());
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory4_0.ID,
				EclipseLinkOrmXmlDefinition3_1.instance().getResourceType(),
				GenericOrmXmlDefinition3_1.instance().getResourceType(),
				GenericPersistenceXmlDefinition3_1.instance().getResourceType());
		this.verifyMostRecent(EclipseLinkJpaPlatformFactory5_0.ID,
				EclipseLinkOrmXmlDefinition5_0.instance().getResourceType(),
				GenericOrmXmlDefinition3_2.instance().getResourceType(),
				GenericPersistenceXmlDefinition3_2.instance().getResourceType());
	}

	private void verifyMostRecent(String id, JptResourceType eclipseLinkOrm, JptResourceType genericOrm, JptResourceType persistence) {
		JpaPlatform platform = getPlatform(id);
		assertEquals(id, eclipseLinkOrm, platform.getMostRecentSupportedResourceType(XmlEntityMappings.CONTENT_TYPE));
		assertEquals(id, genericOrm, platform.getMostRecentSupportedResourceType(org.eclipse.jpt.jpa.core.resource.orm.XmlEntityMappings.CONTENT_TYPE));
		assertEquals(id, persistence, platform.getMostRecentSupportedResourceType(XmlPersistence.CONTENT_TYPE));
		// every most recent resource type must also be supported
		for (IContentType contentType : new IContentType[] {XmlEntityMappings.CONTENT_TYPE, org.eclipse.jpt.jpa.core.resource.orm.XmlEntityMappings.CONTENT_TYPE, XmlPersistence.CONTENT_TYPE}) {
			assertTrue(id, platform.supportsResourceType(platform.getMostRecentSupportedResourceType(contentType)));
		}
	}

	/**
	 * Each persistence.xml version must resolve to the EclipseLink definition,
	 * so the persistence unit keeps the EclipseLink properties.
	 */
	public void testPersistenceXmlDefinitions() {
		assertSame(EclipseLinkPersistenceXmlDefinition2_5.instance(), getPlatform(EclipseLinkJpaPlatformFactory2_6.ID).getResourceDefinition(GenericPersistenceXmlDefinition2_1.instance().getResourceType()));
		assertSame(EclipseLinkPersistenceXmlDefinition2_7.instance(), getPlatform(EclipseLinkJpaPlatformFactory2_7.ID).getResourceDefinition(GenericPersistenceXmlDefinition2_2.instance().getResourceType()));
		assertSame(EclipseLinkPersistenceXmlDefinition3_0.instance(), getPlatform(EclipseLinkJpaPlatformFactory3_0.ID).getResourceDefinition(GenericPersistenceXmlDefinition3_0.instance().getResourceType()));
		assertSame(EclipseLinkPersistenceXmlDefinition3_1.instance(), getPlatform(EclipseLinkJpaPlatformFactory4_0.ID).getResourceDefinition(GenericPersistenceXmlDefinition3_1.instance().getResourceType()));
		assertSame(EclipseLinkPersistenceXmlDefinition5_0.instance(), getPlatform(EclipseLinkJpaPlatformFactory5_0.ID).getResourceDefinition(GenericPersistenceXmlDefinition3_2.instance().getResourceType()));
	}

	/**
	 * A provider must list each resource type once. A JPA 3.1 persistence.xml
	 * declares version="3.0", so the 3.0 and 3.1 persistence definitions share
	 * a resource type; listing both logs "Duplicate resource definitions".
	 */
	public void testNoDuplicateResourceDefinitions() {
		JpaPlatformProvider[] providers = {
			EclipseLinkJpaPlatformProvider2_6.instance(),
			EclipseLinkJpaPlatformProvider2_7.instance(),
			EclipseLinkJpaPlatformProvider3_0.instance(),
			EclipseLinkJpaPlatformProvider4_0.instance(),
			EclipseLinkJpaPlatformProvider5_0.instance()
		};
		for (JpaPlatformProvider provider : providers) {
			HashSet<JptResourceType> seen = new HashSet<JptResourceType>();
			for (JpaResourceDefinition definition : provider.getResourceDefinitions()) {
				assertTrue(provider.getClass().getSimpleName() + " lists " + definition.getResourceType() + " twice",
						seen.add(definition.getResourceType()));
			}
		}
		assertSame(EclipseLinkPersistenceXmlDefinition3_1.instance(), getPlatform(EclipseLinkJpaPlatformFactory5_0.ID).getResourceDefinition(GenericPersistenceXmlDefinition3_1.instance().getResourceType()));
	}

	public void testEclipseLinkOrmXmlDefinitions() {
		assertSame(EclipseLinkOrmXmlDefinition3_0.instance(), getPlatform(EclipseLinkJpaPlatformFactory3_0.ID).getResourceDefinition(EclipseLinkOrmXmlDefinition3_0.instance().getResourceType()));
		assertSame(EclipseLinkOrmXmlDefinition3_1.instance(), getPlatform(EclipseLinkJpaPlatformFactory4_0.ID).getResourceDefinition(EclipseLinkOrmXmlDefinition3_1.instance().getResourceType()));
		assertSame(EclipseLinkOrmXmlDefinition5_0.instance(), getPlatform(EclipseLinkJpaPlatformFactory5_0.ID).getResourceDefinition(EclipseLinkOrmXmlDefinition5_0.instance().getResourceType()));
	}

	/**
	 * Newer platforms still read older mapping files; older platforms do not
	 * claim the newer ones.
	 */
	public void testSupportedEclipseLinkOrmVersions() {
		JptResourceType orm1_0 = EclipseLinkOrmXmlDefinition.instance().getResourceType();
		JptResourceType orm2_5 = EclipseLinkOrmXmlDefinition2_5.instance().getResourceType();
		JptResourceType orm3_0 = EclipseLinkOrmXmlDefinition3_0.instance().getResourceType();
		JptResourceType orm3_1 = EclipseLinkOrmXmlDefinition3_1.instance().getResourceType();
		JptResourceType orm5_0 = EclipseLinkOrmXmlDefinition5_0.instance().getResourceType();

		this.verifySupports(EclipseLinkJpaPlatformFactory2_5.ID, new JptResourceType[] {orm1_0, orm2_5}, new JptResourceType[] {orm3_0, orm3_1, orm5_0});
		this.verifySupports(EclipseLinkJpaPlatformFactory2_6.ID, new JptResourceType[] {orm1_0, orm2_5}, new JptResourceType[] {orm3_0, orm3_1, orm5_0});
		this.verifySupports(EclipseLinkJpaPlatformFactory2_7.ID, new JptResourceType[] {orm1_0, orm2_5}, new JptResourceType[] {orm3_0, orm3_1, orm5_0});
		this.verifySupports(EclipseLinkJpaPlatformFactory3_0.ID, new JptResourceType[] {orm1_0, orm2_5, orm3_0}, new JptResourceType[] {orm3_1, orm5_0});
		this.verifySupports(EclipseLinkJpaPlatformFactory4_0.ID, new JptResourceType[] {orm1_0, orm2_5, orm3_0, orm3_1}, new JptResourceType[] {orm5_0});
		this.verifySupports(EclipseLinkJpaPlatformFactory5_0.ID, new JptResourceType[] {orm1_0, orm2_5, orm3_0, orm3_1, orm5_0}, new JptResourceType[0]);
	}

	private void verifySupports(String id, JptResourceType[] supported, JptResourceType[] unsupported) {
		JpaPlatform platform = getPlatform(id);
		for (JptResourceType resourceType : supported) {
			assertTrue(id + " should support " + resourceType, platform.supportsResourceType(resourceType));
		}
		for (JptResourceType resourceType : unsupported) {
			assertFalse(id + " should not support " + resourceType, platform.supportsResourceType(resourceType));
		}
	}

	/**
	 * The EclipseLink access types (including VIRTUAL) apply to every
	 * EclipseLink mapping file from 2.1 on, including the new ones.
	 */
	public void testSupportedAccessTypes() {
		assertSame(EclipseLinkJpaPlatformFactory2_1.SUPPORTED_ACCESS_TYPES, getPlatform(EclipseLinkJpaPlatformFactory3_0.ID).getJpaVariation().getSupportedAccessTypes(EclipseLinkOrmXmlDefinition3_0.instance().getResourceType()));
		assertSame(EclipseLinkJpaPlatformFactory2_1.SUPPORTED_ACCESS_TYPES, getPlatform(EclipseLinkJpaPlatformFactory4_0.ID).getJpaVariation().getSupportedAccessTypes(EclipseLinkOrmXmlDefinition3_1.instance().getResourceType()));
		assertSame(EclipseLinkJpaPlatformFactory2_1.SUPPORTED_ACCESS_TYPES, getPlatform(EclipseLinkJpaPlatformFactory5_0.ID).getJpaVariation().getSupportedAccessTypes(EclipseLinkOrmXmlDefinition5_0.instance().getResourceType()));
	}


	// ********** Java definitions **********

	/**
	 * EclipseLink 2.6 and 2.7 use javax.persistence, so their Java
	 * definitions are exactly those of EclipseLink 2.5.
	 */
	public void testJavaDefinitions2_6And2_7MatchEclipseLink2_5() {
		JpaPlatform platform2_5 = getPlatform(EclipseLinkJpaPlatformFactory2_5.ID);
		for (String id : new String[] {EclipseLinkJpaPlatformFactory2_6.ID, EclipseLinkJpaPlatformFactory2_7.ID}) {
			JpaPlatform platform = getPlatform(id);
			assertEquals(id, list(platform2_5.getJavaManagedTypeDefinitions()), list(platform.getJavaManagedTypeDefinitions()));
			assertEquals(id, list(platform2_5.getJavaTypeMappingDefinitions()), list(platform.getJavaTypeMappingDefinitions()));
			assertEquals(id, list(platform2_5.getDefaultJavaAttributeMappingDefinitions()), list(platform.getDefaultJavaAttributeMappingDefinitions()));
			assertEquals(id, list(platform2_5.getSpecifiedJavaAttributeMappingDefinitions()), list(platform.getSpecifiedJavaAttributeMappingDefinitions()));
		}
	}

	public void testJakartaManagedTypeDefinitions() {
		for (String id : JAKARTA_PLATFORM_IDS) {
			List<JavaManagedTypeDefinition> definitions = list(getPlatform(id).getJavaManagedTypeDefinitions());
			assertEquals(id, 2, definitions.size());
			assertSame(id, JavaPersistentTypeDefinition.instance(), definitions.get(0));
			assertSame(id, JavaConverterTypeDefinition3_0.instance(), definitions.get(1));
		}
	}

	public void testJakartaTypeMappingDefinitions() {
		List<JavaTypeMappingDefinition> definitions2_5 = list(getPlatform(EclipseLinkJpaPlatformFactory2_5.ID).getJavaTypeMappingDefinitions());
		for (String id : JAKARTA_PLATFORM_IDS) {
			List<JavaTypeMappingDefinition> definitions = list(getPlatform(id).getJavaTypeMappingDefinitions());
			assertEquals(id, definitions2_5.size(), definitions.size());
			assertEquals(id, "jakarta.persistence.Entity", definitions.get(0).getAnnotationName());
			assertEquals(id, "jakarta.persistence.Embeddable", definitions.get(1).getAnnotationName());
			assertEquals(id, "jakarta.persistence.MappedSuperclass", definitions.get(2).getAnnotationName());
			for (int i = 0; i < definitions.size(); i++) {
				JavaTypeMappingDefinition definition = definitions.get(i);
				JavaTypeMappingDefinition definition2_5 = definitions2_5.get(i);
				assertEquals(id, definition2_5.getKey(), definition.getKey());
				verifyJakartaNames(id, definition2_5.getSupportingAnnotationNames(), definition.getSupportingAnnotationNames());
			}
		}
	}

	public void testJakartaDefaultAttributeMappingDefinitions() {
		List<DefaultJavaAttributeMappingDefinition> definitions2_5 = list(getPlatform(EclipseLinkJpaPlatformFactory2_5.ID).getDefaultJavaAttributeMappingDefinitions());
		for (String id : JAKARTA_PLATFORM_IDS) {
			List<DefaultJavaAttributeMappingDefinition> definitions = list(getPlatform(id).getDefaultJavaAttributeMappingDefinitions());
			assertEquals(id, definitions2_5.size(), definitions.size());
			for (int i = 0; i < definitions.size(); i++) {
				verifyJakartaDefinition(id, definitions2_5.get(i), definitions.get(i));
			}
		}
	}

	public void testJakartaSpecifiedAttributeMappingDefinitions() {
		List<JavaAttributeMappingDefinition> definitions2_5 = list(getPlatform(EclipseLinkJpaPlatformFactory2_5.ID).getSpecifiedJavaAttributeMappingDefinitions());
		for (String id : JAKARTA_PLATFORM_IDS) {
			List<JavaAttributeMappingDefinition> definitions = list(getPlatform(id).getSpecifiedJavaAttributeMappingDefinitions());
			assertEquals(id, definitions2_5.size(), definitions.size());
			for (int i = 0; i < definitions.size(); i++) {
				verifyJakartaDefinition(id, definitions2_5.get(i), definitions.get(i));
			}
			// the Id definition keeps EclipseLink's "default derived id" rule
			assertTrue(id, definitions.contains(EclipseLinkJavaIdMappingDefinition3_0.instance()));
		}
	}

	/**
	 * EclipseLink 4.0 and 5.0 share the EclipseLink 3.0 Java definitions.
	 */
	public void testJakartaPlatformsShareJavaDefinitions() {
		JpaPlatform platform3_0 = getPlatform(EclipseLinkJpaPlatformFactory3_0.ID);
		for (String id : new String[] {EclipseLinkJpaPlatformFactory4_0.ID, EclipseLinkJpaPlatformFactory5_0.ID}) {
			JpaPlatform platform = getPlatform(id);
			assertEquals(id, list(platform3_0.getJavaTypeMappingDefinitions()), list(platform.getJavaTypeMappingDefinitions()));
			assertEquals(id, list(platform3_0.getDefaultJavaAttributeMappingDefinitions()), list(platform.getDefaultJavaAttributeMappingDefinitions()));
			assertEquals(id, list(platform3_0.getSpecifiedJavaAttributeMappingDefinitions()), list(platform.getSpecifiedJavaAttributeMappingDefinitions()));
		}
	}

	private static void verifyJakartaDefinition(String id, JavaAttributeMappingDefinition definition2_5, JavaAttributeMappingDefinition definition) {
		assertEquals(id, definition2_5.getKey(), definition.getKey());
		assertEquals(id, JakartaJavaAttributeMappingDefinitionAdapter.toJakarta(definition2_5.getAnnotationName()), definition.getAnnotationName());
		assertFalse(id + ": " + definition.getAnnotationName(), isJavax(definition.getAnnotationName()));
		verifyJakartaNames(id, definition2_5.getSupportingAnnotationNames(), definition.getSupportingAnnotationNames());
	}

	/**
	 * javax.persistence names are translated, EclipseLink's own
	 * org.eclipse.persistence.annotations names are passed through, and the
	 * order is kept.
	 */
	private static void verifyJakartaNames(String id, Iterable<String> names2_5, Iterable<String> names) {
		List<String> expected = new ArrayList<String>();
		for (String name : names2_5) {
			expected.add(JakartaJavaAttributeMappingDefinitionAdapter.toJakarta(name));
		}
		List<String> actual = list(names);
		assertEquals(id, expected, actual);
		for (String name : actual) {
			assertFalse(id + ": " + name, isJavax(name));
		}
	}

	private static boolean isJavax(String annotationName) {
		return (annotationName != null) && annotationName.startsWith("javax.persistence.");
	}


	// ********** annotations **********

	public void testAnnotationProvider() {
		List<String> names2_7 = list(getPlatform(EclipseLinkJpaPlatformFactory2_7.ID).getAnnotationProvider().getAnnotationNames());
		assertTrue(names2_7.contains("javax.persistence.Entity"));
		assertFalse(names2_7.contains("jakarta.persistence.Entity"));
		assertTrue(names2_7.contains("org.eclipse.persistence.annotations.Cache"));

		for (String id : JAKARTA_PLATFORM_IDS) {
			List<String> names = list(getPlatform(id).getAnnotationProvider().getAnnotationNames());
			assertTrue(id, names.contains("jakarta.persistence.Entity"));
			assertFalse(id, names.contains("javax.persistence.Entity"));
			// EclipseLink's own annotations did not move to jakarta
			assertTrue(id, names.contains("org.eclipse.persistence.annotations.Cache"));
		}
	}


	// ********** misc **********

	private static JpaPlatform.Config getConfig(String id) {
		JpaWorkspace jpaWorkspace = (JpaWorkspace) ResourcesPlugin.getWorkspace().getAdapter(JpaWorkspace.class);
		JpaPlatform.Config config = jpaWorkspace.getJpaPlatformManager().getJpaPlatformConfig(id);
		assertNotNull("missing JPA platform: " + id, config);
		return config;
	}

	private static JpaPlatform getPlatform(String id) {
		JpaPlatform platform = getConfig(id).getJpaPlatform();
		assertNotNull("JPA platform not built: " + id, platform);
		return platform;
	}

	private static <E> List<E> list(Iterable<? extends E> iterable) {
		ArrayList<E> list = new ArrayList<E>();
		for (E element : iterable) {
			list.add(element);
		}
		return list;
	}
}
