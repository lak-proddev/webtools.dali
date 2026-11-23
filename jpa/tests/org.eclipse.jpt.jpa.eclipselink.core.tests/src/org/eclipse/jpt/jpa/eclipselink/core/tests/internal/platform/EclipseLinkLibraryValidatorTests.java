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

import java.lang.reflect.Field;
import java.util.Map;
import junit.framework.TestCase;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jpt.jpa.core.JpaPlatform;
import org.eclipse.jpt.jpa.core.JpaWorkspace;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_5;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_6;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory2_7;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory3_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory4_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory5_0;
import org.eclipse.jpt.jpa.eclipselink.core.internal.libval.EclipseLinkEclipseLinkBundlesLibraryValidator;
import org.eclipse.jpt.jpa.eclipselink.core.internal.libval.EclipseLinkUserLibraryValidator;
import org.eclipse.osgi.service.resolver.VersionRange;
import org.osgi.framework.Version;

/**
 * Tests for the version ranges the EclipseLink library validators accept for
 * each platform. The validators keep their ranges in private tables, which
 * these tests read reflectively so that no real library has to be built.
 */
@SuppressWarnings("nls")
public class EclipseLinkLibraryValidatorTests
	extends TestCase
{
	public EclipseLinkLibraryValidatorTests(String name) {
		super(name);
	}

	/**
	 * A platform without a range would reject (or fail on) every library.
	 */
	public void testEveryEclipseLinkPlatformHasRanges() throws Exception {
		Map<String, VersionRange> userRanges = userLibraryRanges();
		Map<String, Map<String, VersionRange>> bundleRanges = bundleRanges();
		JpaWorkspace jpaWorkspace = (JpaWorkspace) ResourcesPlugin.getWorkspace().getAdapter(JpaWorkspace.class);
		JpaPlatform.GroupConfig group = jpaWorkspace.getJpaPlatformManager().getJpaPlatformGroupConfig("eclipselink");
		assertNotNull(group);
		int count = 0;
		for (JpaPlatform.Config config : group.getJpaPlatformConfigs()) {
			assertNotNull("no user library range: " + config.getId(), userRanges.get(config.getId()));
			assertNotNull("no bundle ranges: " + config.getId(), bundleRanges.get(config.getId()));
			count++;
		}
		assertEquals(14, count);
	}

	public void testUserLibraryRanges() throws Exception {
		Map<String, VersionRange> ranges = userLibraryRanges();

		// unchanged
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory2_5.ID), new String[] {"2.5.0", "2.7.15"}, new String[] {"2.4.2", "3.0.0"});

		this.verify(ranges.get(EclipseLinkJpaPlatformFactory2_6.ID), new String[] {"2.6.0", "2.7.15"}, new String[] {"2.5.2", "3.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory2_7.ID), new String[] {"2.7.0", "2.7.15"}, new String[] {"2.6.9", "3.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory3_0.ID), new String[] {"3.0.4", "4.0.2", "5.0.2"}, new String[] {"2.7.15", "6.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory4_0.ID), new String[] {"4.0.2", "5.0.2"}, new String[] {"3.0.4", "6.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory5_0.ID), new String[] {"5.0.0", "5.0.2"}, new String[] {"4.0.2", "6.0.0"});
	}

	/**
	 * From 2.6 on, only the core and JPA bundles carry the EclipseLink version;
	 * ASM and ANTLR carry their upstream versions and must not be constrained.
	 */
	public void testBundleRanges() throws Exception {
		Map<String, Map<String, VersionRange>> ranges = bundleRanges();

		// unchanged: 2.5 still constrains all four bundles
		assertEquals(4, ranges.get(EclipseLinkJpaPlatformFactory2_5.ID).size());

		String[] ids = {
			EclipseLinkJpaPlatformFactory2_6.ID,
			EclipseLinkJpaPlatformFactory2_7.ID,
			EclipseLinkJpaPlatformFactory3_0.ID,
			EclipseLinkJpaPlatformFactory4_0.ID,
			EclipseLinkJpaPlatformFactory5_0.ID
		};
		for (String id : ids) {
			Map<String, VersionRange> bundleRanges = ranges.get(id);
			assertEquals(id, 2, bundleRanges.size());
			assertEquals(id, bundleRanges.get("org.eclipse.persistence.core"), bundleRanges.get("org.eclipse.persistence.jpa"));
			assertFalse(id, bundleRanges.containsKey("org.eclipse.persistence.asm"));
			assertFalse(id, bundleRanges.containsKey("org.eclipse.persistence.antlr"));
		}

		this.verify(ranges.get(EclipseLinkJpaPlatformFactory2_7.ID).get("org.eclipse.persistence.core"), new String[] {"2.7.3"}, new String[] {"2.6.9", "3.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory3_0.ID).get("org.eclipse.persistence.core"), new String[] {"3.0.4", "5.0.2"}, new String[] {"2.7.3", "6.0.0"});
		this.verify(ranges.get(EclipseLinkJpaPlatformFactory5_0.ID).get("org.eclipse.persistence.jpa"), new String[] {"5.0.2"}, new String[] {"4.0.2"});
	}

	private void verify(VersionRange range, String[] included, String[] excluded) {
		assertNotNull(range);
		for (String version : included) {
			assertTrue(range + " should include " + version, range.isIncluded(new Version(version)));
		}
		for (String version : excluded) {
			assertFalse(range + " should exclude " + version, range.isIncluded(new Version(version)));
		}
	}

	@SuppressWarnings("unchecked")
	private static Map<String, VersionRange> userLibraryRanges() throws Exception {
		return (Map<String, VersionRange>) staticField(EclipseLinkUserLibraryValidator.class, "PLATFORM_VERSION_RANGES");
	}

	@SuppressWarnings("unchecked")
	private static Map<String, Map<String, VersionRange>> bundleRanges() throws Exception {
		return (Map<String, Map<String, VersionRange>>) staticField(EclipseLinkEclipseLinkBundlesLibraryValidator.class, "PLATFORM_BUNDLE_VERSION_RANGES");
	}

	private static Object staticField(Class<?> clazz, String fieldName) throws Exception {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		return field.get(null);
	}
}
