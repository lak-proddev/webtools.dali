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

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import junit.framework.TestCase;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.EclipseLink;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v2_5.EclipseLink2_5;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v3_0.EclipseLink3_0;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v3_1.EclipseLink3_1;
import org.eclipse.jpt.jpa.eclipselink.core.resource.orm.v5_0.EclipseLink5_0;
import org.eclipse.wst.xml.core.internal.XMLCorePlugin;
import org.eclipse.wst.xml.core.internal.catalog.provisional.ICatalog;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Checks the bundled <code>eclipselink_orm_*.xsd</code> files against the
 * schema constants Dali writes into mapping files, and against the model
 * decisions that depend on what each schema allows.
 */
@SuppressWarnings("nls")
public class EclipseLinkOrmSchemaTests
	extends TestCase
{
	private static final String SCHEMA_BUNDLE = "org.eclipse.jpt.common.eclipselink.core";
	private static final String XSD = XMLConstants.W3C_XML_SCHEMA_NS_URI;

	public EclipseLinkOrmSchemaTests(String name) {
		super(name);
	}


	// ********** version, namespace and location **********

	public void testSchema2_5() throws Exception {
		this.verifySchema("eclipselink_orm_2_5.xsd", EclipseLink2_5.SCHEMA_VERSION, EclipseLink2_5.SCHEMA_LOCATION);
	}

	public void testSchema3_0() throws Exception {
		this.verifySchema("eclipselink_orm_3_0.xsd", EclipseLink3_0.SCHEMA_VERSION, EclipseLink3_0.SCHEMA_LOCATION);
	}

	public void testSchema3_1() throws Exception {
		this.verifySchema("eclipselink_orm_3_1.xsd", EclipseLink3_1.SCHEMA_VERSION, EclipseLink3_1.SCHEMA_LOCATION);
	}

	public void testSchema5_0() throws Exception {
		this.verifySchema("eclipselink_orm_5_0.xsd", EclipseLink5_0.SCHEMA_VERSION, EclipseLink5_0.SCHEMA_LOCATION);
	}

	private void verifySchema(String fileName, String version, String schemaLocation) throws Exception {
		Element schema = loadSchema(fileName).getDocumentElement();
		assertEquals(fileName, EclipseLink.SCHEMA_NAMESPACE, schema.getAttribute("targetNamespace"));
		assertEquals(fileName, version, schema.getAttribute("version"));
		assertEquals(fileName, schemaLocation.substring(schemaLocation.lastIndexOf('/') + 1), fileName);

		// a mapping file Dali writes with this version must validate
		assertTrue(fileName, enumeration(schema, "supported-versions-type").contains(version));

		// <entity-mappings version="..."> defaults to the schema's own version
		Element entityMappings = namedChild(schema, "element", "entity-mappings");
		assertNotNull(fileName, entityMappings);
		Element versionAttribute = namedDescendant(entityMappings, "attribute", "version");
		assertNotNull(fileName, versionAttribute);
		assertEquals(fileName, version, versionAttribute.getAttribute("default"));
	}

	/**
	 * Every schema location Dali writes must resolve to the bundled copy
	 * through the XML catalog, so validation works offline.
	 */
	public void testCatalogResolvesSchemaLocations() throws Exception {
		ICatalog catalog = XMLCorePlugin.getDefault().getDefaultXMLCatalog();
		this.verifyCatalog(catalog, EclipseLink2_5.SCHEMA_LOCATION, "eclipselink_orm_2_5.xsd");
		this.verifyCatalog(catalog, EclipseLink3_0.SCHEMA_LOCATION, "eclipselink_orm_3_0.xsd");
		this.verifyCatalog(catalog, EclipseLink3_1.SCHEMA_LOCATION, "eclipselink_orm_3_1.xsd");
		this.verifyCatalog(catalog, EclipseLink5_0.SCHEMA_LOCATION, "eclipselink_orm_5_0.xsd");
	}

	private void verifyCatalog(ICatalog catalog, String schemaLocation, String fileName) throws Exception {
		String resolved = catalog.resolveURI(schemaLocation);
		assertNotNull("not in the XML catalog: " + schemaLocation, resolved);
		assertTrue(resolved, resolved.endsWith("schemas/" + fileName));
	}


	// ********** content that Dali's model depends on **********

	/**
	 * EclipseLink 3.0 removed the deprecated <code>&lt;cache shared&gt;</code>
	 * attribute; the caching UI hides it from EclipseLink 3.0 on.
	 */
	public void testCacheSharedAttribute() throws Exception {
		assertTrue(cacheHasSharedAttribute("eclipselink_orm_2_5.xsd"));
		assertFalse(cacheHasSharedAttribute("eclipselink_orm_3_0.xsd"));
		assertFalse(cacheHasSharedAttribute("eclipselink_orm_3_1.xsd"));
		assertFalse(cacheHasSharedAttribute("eclipselink_orm_5_0.xsd"));
	}

	private static boolean cacheHasSharedAttribute(String fileName) throws Exception {
		Element cache = namedChild(loadSchema(fileName).getDocumentElement(), "complexType", "cache");
		assertNotNull(fileName, cache);
		return namedDescendant(cache, "attribute", "shared") != null;
	}

	/**
	 * The UUID generation type arrived with the 3.1 schema (Jakarta Persistence 3.1).
	 */
	public void testUuidGenerationType() throws Exception {
		assertFalse(generationTypes("eclipselink_orm_2_5.xsd").contains("UUID"));
		assertFalse(generationTypes("eclipselink_orm_3_0.xsd").contains("UUID"));
		assertTrue(generationTypes("eclipselink_orm_3_1.xsd").contains("UUID"));
		assertTrue(generationTypes("eclipselink_orm_5_0.xsd").contains("UUID"));
	}

	private static List<String> generationTypes(String fileName) throws Exception {
		return enumeration(loadSchema(fileName).getDocumentElement(), "generation-type");
	}

	/**
	 * EclipseLink publishes no 4.0 mapping file schema, which is why the
	 * EclipseLink 4.0 platform uses the 3.1 schema.
	 */
	public void testNoEclipseLink4_0Schema() throws Exception {
		assertNull(getSchemaBundle().getEntry("schemas/eclipselink_orm_4_0.xsd"));
		assertFalse(enumeration(loadSchema("eclipselink_orm_5_0.xsd").getDocumentElement(), "supported-versions-type").contains("4.0"));
	}


	// ********** DOM helpers **********

	private static Bundle getSchemaBundle() {
		Bundle bundle = Platform.getBundle(SCHEMA_BUNDLE);
		assertNotNull(SCHEMA_BUNDLE, bundle);
		return bundle;
	}

	private static Document loadSchema(String fileName) throws Exception {
		URL url = getSchemaBundle().getEntry("schemas/" + fileName);
		assertNotNull("missing schema: " + fileName, url);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputStream stream = url.openStream();
		try {
			return builder.parse(stream);
		} finally {
			stream.close();
		}
	}

	/**
	 * Return the top-level <code>xsd:{localName}</code> with the specified name.
	 */
	private static Element namedChild(Element schema, String localName, String name) {
		NodeList nodes = schema.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			if (nodes.item(i) instanceof Element) {
				Element element = (Element) nodes.item(i);
				if (XSD.equals(element.getNamespaceURI()) && localName.equals(element.getLocalName()) && name.equals(element.getAttribute("name"))) {
					return element;
				}
			}
		}
		return null;
	}

	private static Element namedDescendant(Element parent, String localName, String name) {
		NodeList nodes = parent.getElementsByTagNameNS(XSD, localName);
		for (int i = 0; i < nodes.getLength(); i++) {
			Element element = (Element) nodes.item(i);
			if (name.equals(element.getAttribute("name"))) {
				return element;
			}
		}
		return null;
	}

	private static List<String> enumeration(Element schema, String simpleTypeName) {
		Element simpleType = namedChild(schema, "simpleType", simpleTypeName);
		assertNotNull(simpleTypeName, simpleType);
		List<String> values = new ArrayList<String>();
		NodeList nodes = simpleType.getElementsByTagNameNS(XSD, "enumeration");
		for (int i = 0; i < nodes.getLength(); i++) {
			values.add(((Element) nodes.item(i)).getAttribute("value"));
		}
		return values;
	}
}
