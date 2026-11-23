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

import junit.framework.TestCase;
import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.orm.GenericOrmXmlDefinition3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_1.context.orm.GenericOrmXmlDefinition3_1;
import org.eclipse.jpt.jpa.core.internal.jpa3_2.context.orm.GenericOrmXmlDefinition3_2;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition2_1;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition2_5;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition3_1;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.orm.EclipseLinkOrmXmlDefinition5_0;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.EclipseLink;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.XmlEntityMappings;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v2_5.EclipseLink2_5;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v3_0.EclipseLink3_0;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v3_1.EclipseLink3_1;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v5_0.EclipseLink5_0;

/**
 * Tests for the EclipseLink 3.0, 3.1 and 5.0 <code>eclipselink-orm.xml</code>
 * resource types and schema constants.
 */
@SuppressWarnings("nls")
public class EclipseLinkOrmResourceTypeTests
	extends TestCase
{
	public EclipseLinkOrmResourceTypeTests(String name) {
		super(name);
	}

	private static JptResourceType orm2_1() {
		return EclipseLinkOrmXmlDefinition2_1.instance().getResourceType();
	}

	private static JptResourceType orm2_5() {
		return EclipseLinkOrmXmlDefinition2_5.instance().getResourceType();
	}

	private static JptResourceType orm3_0() {
		return EclipseLinkOrmXmlDefinition3_0.instance().getResourceType();
	}

	private static JptResourceType orm3_1() {
		return EclipseLinkOrmXmlDefinition3_1.instance().getResourceType();
	}

	private static JptResourceType orm5_0() {
		return EclipseLinkOrmXmlDefinition5_0.instance().getResourceType();
	}

	public void testResourceTypesAreRegistered() {
		this.verifyResourceType(orm3_0(), EclipseLink3_0.SCHEMA_VERSION);
		this.verifyResourceType(orm3_1(), EclipseLink3_1.SCHEMA_VERSION);
		this.verifyResourceType(orm5_0(), EclipseLink5_0.SCHEMA_VERSION);
	}

	private void verifyResourceType(JptResourceType resourceType, String version) {
		assertNotNull("missing resource type for version " + version, resourceType);
		assertEquals(XmlEntityMappings.CONTENT_TYPE, resourceType.getContentType());
		assertEquals(version, resourceType.getVersion());
	}

	public void testSchemaVersions() {
		assertEquals("3.0", EclipseLink3_0.SCHEMA_VERSION);
		assertEquals("3.1", EclipseLink3_1.SCHEMA_VERSION);
		assertEquals("5.0", EclipseLink5_0.SCHEMA_VERSION);
	}

	/**
	 * Being a kind of EclipseLink orm 2.1 is what gives a mapping file the
	 * EclipseLink access types.
	 */
	public void testKindOfEclipseLinkOrm2_1() {
		assertTrue(orm3_0().isKindOf(orm2_1()));
		assertTrue(orm3_1().isKindOf(orm2_1()));
		assertTrue(orm5_0().isKindOf(orm2_1()));
	}

	public void testKindOfGenericOrm() {
		assertTrue(orm3_0().isKindOf(GenericOrmXmlDefinition3_0.instance().getResourceType()));
		assertTrue(orm3_1().isKindOf(GenericOrmXmlDefinition3_1.instance().getResourceType()));
		assertTrue(orm5_0().isKindOf(GenericOrmXmlDefinition3_2.instance().getResourceType()));

		assertFalse(orm3_0().isKindOf(GenericOrmXmlDefinition3_1.instance().getResourceType()));
		assertFalse(orm2_5().isKindOf(GenericOrmXmlDefinition3_0.instance().getResourceType()));
	}

	public void testVersionOrdering() {
		assertTrue(orm3_1().isKindOf(orm3_0()));
		assertTrue(orm5_0().isKindOf(orm3_1()));
		assertTrue(orm5_0().isKindOf(orm2_5()));

		assertFalse(orm2_5().isKindOf(orm3_0()));
		assertFalse(orm3_0().isKindOf(orm3_1()));
		assertFalse(orm3_1().isKindOf(orm5_0()));
	}

	/**
	 * New and upgraded mapping files get their xsi:schemaLocation from this map.
	 */
	public void testSchemaLocations() {
		assertEquals(EclipseLink2_5.SCHEMA_LOCATION, XmlEntityMappings.SCHEMA_LOCATIONS.get(EclipseLink2_5.SCHEMA_VERSION));
		assertEquals(EclipseLink3_0.SCHEMA_LOCATION, XmlEntityMappings.SCHEMA_LOCATIONS.get(EclipseLink3_0.SCHEMA_VERSION));
		assertEquals(EclipseLink3_1.SCHEMA_LOCATION, XmlEntityMappings.SCHEMA_LOCATIONS.get(EclipseLink3_1.SCHEMA_VERSION));
		assertEquals(EclipseLink5_0.SCHEMA_LOCATION, XmlEntityMappings.SCHEMA_LOCATIONS.get(EclipseLink5_0.SCHEMA_VERSION));

		assertEquals("http://www.eclipse.org/eclipselink/xsds/eclipselink_orm_3_0.xsd", EclipseLink3_0.SCHEMA_LOCATION);
		assertEquals("http://www.eclipse.org/eclipselink/xsds/eclipselink_orm_3_1.xsd", EclipseLink3_1.SCHEMA_LOCATION);
		assertEquals("http://www.eclipse.org/eclipselink/xsds/eclipselink_orm_5_0.xsd", EclipseLink5_0.SCHEMA_LOCATION);
	}

	/**
	 * The EclipseLink mapping file kept its own namespace across the Jakarta move.
	 */
	public void testSchemaNamespaces() {
		assertEquals(EclipseLink.SCHEMA_NAMESPACE, EclipseLink3_0.SCHEMA_NAMESPACE);
		assertEquals(EclipseLink.SCHEMA_NAMESPACE, EclipseLink3_1.SCHEMA_NAMESPACE);
		assertEquals(EclipseLink.SCHEMA_NAMESPACE, EclipseLink5_0.SCHEMA_NAMESPACE);
	}
}
