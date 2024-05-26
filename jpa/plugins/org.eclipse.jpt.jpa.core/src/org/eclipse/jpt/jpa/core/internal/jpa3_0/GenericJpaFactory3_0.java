/*******************************************************************************
 * Copyright (c) 2024 Lakshminarayana Nekkanti. All rights reserved.
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
package org.eclipse.jpt.jpa.core.internal.jpa3_0;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.jpa.core.JpaDataSource;
import org.eclipse.jpt.jpa.core.JpaProject;
import org.eclipse.jpt.jpa.core.JpaProject.Config;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.context.Orderable;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaEmbeddable;
import org.eclipse.jpt.jpa.core.context.java.JavaGeneratorContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaPersistentType;
import org.eclipse.jpt.jpa.core.context.java.JavaSequenceGenerator;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedColumn;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedPersistentAttribute;
import org.eclipse.jpt.jpa.core.internal.jpa1.GenericJpaFactory;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.java.GenericJavaColumn;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.java.GenericJavaOrderable;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaConverterType3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaNamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaStoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.JpaFactory3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.JpaProject3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.Cacheable3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.MetamodelSourceType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.OrphanRemovable3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.OrphanRemovalMapping3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaCacheableReference3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaCollectionTable3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaDerivedIdentity3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaElementCollectionMapping3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaNamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaOrderable3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaQueryContainer3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaSingleRelationshipMapping3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaSpecifiedOrderColumn3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaStoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.NamedStoredProcedureQueryAnnotation3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.StoredProcedureParameterAnnotation3_0;
import org.eclipse.jpt.jpa.core.resource.java.EmbeddableAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.SequenceGeneratorAnnotation;
import org.eclipse.jpt.jpa.db.DatabaseIdentifierAdapter;

/**
 * Central class that allows extenders to easily replace implementations of
 * various Dali interfaces.
 */
public class GenericJpaFactory3_0 extends GenericJpaFactory implements JpaFactory3_0 {
	
	// ********** Core Model **********

	@Override
	public JpaProject buildJpaProject(Config config, IProgressMonitor monitor) {
		if (!(config instanceof JpaProject3_0.Config)) {
			throw new IllegalArgumentException("config must be 3.0-compatible: " + config); //$NON-NLS-1$
		}
		return super.buildJpaProject(config, monitor);
	}

	public MetamodelSourceType3_0.Synchronizer buildMetamodelSynchronizer(MetamodelSourceType3_0 sourceType) {
		return new GenericMetamodelSynchronizer3_0(sourceType);
	}

	public DatabaseIdentifierAdapter buildDatabaseIdentifierAdapter(JpaDataSource dataSource) {
		return new GenericJpaDatabaseIdentifierAdapter3_0(dataSource);
	}

	// ********** Java Context Model **********

	@Override
	public JavaPersistentType buildJavaPersistentType(JavaPersistentType.Parent parent, JavaResourceType jrt) {
		return new GenericJavaPersistentType3_0(parent, jrt);
	}

	@Override
	public JavaEmbeddable buildJavaEmbeddable(JavaPersistentType parent, EmbeddableAnnotation embeddableAnnotation) {
		return new GenericJavaEmbeddable3_0(parent, embeddableAnnotation);
	}

	@Override
	public JavaSequenceGenerator buildJavaSequenceGenerator(JavaGeneratorContainer parent,
			SequenceGeneratorAnnotation annotation) {
		return new GenericJavaSequenceGenerator3_0(parent, (SequenceGeneratorAnnotation3_0) annotation);
	}

	public JavaDerivedIdentity3_0 buildJavaDerivedIdentity(JavaSingleRelationshipMapping3_0 parent) {
		return new GenericJavaDerivedIdentity3_0(parent);
	}

	public JavaElementCollectionMapping3_0 buildJavaElementCollectionMapping(JavaSpecifiedPersistentAttribute parent) {
		return new GenericJavaElementCollectionMapping3_0(parent);
	}

	public Cacheable3_0 buildJavaCacheable(JavaCacheableReference3_0 parent) {
		return new GenericJavaCacheable3_0(parent);
	}

	public OrphanRemovable3_0 buildJavaOrphanRemoval(OrphanRemovalMapping3_0 parent) {
		return new GenericJavaOrphanRemoval3_0(parent);
	}

	public JavaCollectionTable3_0 buildJavaCollectionTable(JavaCollectionTable3_0.ParentAdapter parentAdapter) {
		return new GenericJavaCollectionTable3_0(parentAdapter);
	}

	public JavaSpecifiedOrderColumn3_0 buildJavaOrderColumn(JavaSpecifiedOrderColumn3_0.ParentAdapter parentAdapter) {
		return new GenericJavaOrderColumn3_0(parentAdapter);
	}

	public JavaSpecifiedColumn buildJavaMapKeyColumn(JavaSpecifiedColumn.ParentAdapter parentAdapter) {
		return new GenericJavaColumn(parentAdapter);
	}

	public JavaOrderable3_0 buildJavaOrderable(JavaOrderable3_0.ParentAdapter parentAdapter) {
		return new GenericJavaOrderable(parentAdapter);
	}

	@Override
	public Orderable buildJavaOrderable(JavaAttributeMapping parent) {
		throw new UnsupportedOperationException();
	}

	public JavaConverterType3_0 buildJavaConverterType(JpaContextModel parent, JavaResourceType jrt) {
		return new GenericJavaConverterType3_0(parent, jrt);
	}

	public JavaNamedStoredProcedureQuery3_0 buildJavaNamedStoredProcedureQuery(JavaQueryContainer3_0 parent,
			NamedStoredProcedureQueryAnnotation3_0 namedStoredProcedureQueryAnnotation) {
		return new GenericJavaNamedStoredProcedureQuery3_0(parent, namedStoredProcedureQueryAnnotation);
	}

	public JavaStoredProcedureParameter3_0 buildJavaStoredProcedureParameter(JavaNamedStoredProcedureQuery3_0 parent,
			StoredProcedureParameterAnnotation3_0 parameterAnnotation) {
		return new GenericJavaStoredProcedureParameter3_0(parent, parameterAnnotation);
	}
}
