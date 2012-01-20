/*******************************************************************************
 *  Copyright (c) 2010, 2012  Oracle.
 *  All rights reserved.  This program and the accompanying materials are
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal;

import org.eclipse.jpt.common.core.AnnotationProvider;
import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.jpa.core.JpaFacet;
import org.eclipse.jpt.jpa.core.JpaPlatform;
import org.eclipse.jpt.jpa.core.JpaPlatformVariation;
import org.eclipse.jpt.jpa.core.JptJpaCorePlugin;
import org.eclipse.jpt.jpa.core.context.AccessType;
import org.eclipse.jpt.jpa.core.internal.GenericJpaPlatform;
import org.eclipse.jpt.jpa.core.internal.JpaAnnotationProvider;
import org.eclipse.jpt.jpa.core.internal.jpa2.Generic2_0JpaAnnotationDefinitionProvider;
import org.eclipse.jpt.jpa.eclipselink.core.JptJpaEclipseLinkCorePlugin;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkAccessType;
import org.eclipse.jpt.jpa.eclipselink.core.internal.EclipseLinkJpaPlatformFactory.EclipseLinkVersion;

public class EclipseLink2_1JpaPlatformFactory
	extends EclipseLink2_0JpaPlatformFactory
{
	/**
	 * zero-argument constructor
	 */
	public EclipseLink2_1JpaPlatformFactory() {
		super();
	}


	@Override
	public JpaPlatform buildJpaPlatform(String id) {
		return new GenericJpaPlatform(
			id,
			buildJpaVersion(),
			new EclipseLink2_0JpaFactory(),
			this.buildAnnotationProvider(),
			EclipseLink2_1JpaPlatformProvider.instance(),
			this.buildJpaVariation(),
			EclipseLink2_1JpaJpqlQueryHelper.instance());
	}

	@Override
	protected JpaPlatform.Version buildJpaVersion() {
		return new EclipseLinkVersion(
				JptJpaEclipseLinkCorePlugin.ECLIPSELINK_PLATFORM_VERSION_2_1,
				JpaFacet.VERSION_2_0.getVersionString());
	}

	@Override
	protected AnnotationProvider buildAnnotationProvider() {
		return new JpaAnnotationProvider(
			Generic2_0JpaAnnotationDefinitionProvider.instance(),
			EclipseLink2_1JpaAnnotationDefinitionProvider.instance());
	}

	@Override
	protected JpaPlatformVariation buildJpaVariation() {
		return new JpaPlatformVariation() {
			public Supported getTablePerConcreteClassInheritanceIsSupported() {
				return Supported.YES;
			}
			public boolean isJoinTableOverridable() {
				return true;
			}
			public AccessType[] getSupportedAccessTypes(JptResourceType resourceType) {
				if (resourceType.getContentType() == JptJpaEclipseLinkCorePlugin.ECLIPSELINK_ORM_XML_CONTENT_TYPE) {
					if (this.versionIsEclipseLink2_1Compatibile(resourceType)) {
						return ECLIPSELINK_SUPPORTED_ACCESS_TYPES;
					}
				}
				return GENERIC_SUPPORTED_ACCESS_TYPES;
			}
			protected boolean versionIsEclipseLink2_1Compatibile(JptResourceType resourceType) {
				return JptJpaCorePlugin.resourceTypeIsCompatible(resourceType, JptJpaEclipseLinkCorePlugin.ECLIPSELINK_ORM_XML_2_1_RESOURCE_TYPE.getVersion());
			}
		};
	}

	public static final AccessType[] ECLIPSELINK_SUPPORTED_ACCESS_TYPES = new AccessType[] {AccessType.FIELD, AccessType.PROPERTY, EclipseLinkAccessType.VIRTUAL};

}