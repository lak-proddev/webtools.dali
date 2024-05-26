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
package org.eclipse.jpt.jpa.core.jpa3_0;

import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.jpa.core.JpaDataSource;
import org.eclipse.jpt.jpa.core.JpaFactory;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.context.Orderable;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedColumn;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedPersistentAttribute;
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
import org.eclipse.jpt.jpa.db.DatabaseIdentifierAdapter;

/**
 * JPA 3.0 factory
 * <p>
 * Provisional API: This interface is part of an interim API that is still under
 * development and expected to change significantly before reaching stability.
 * It is available at this early stage to solicit feedback from pioneering
 * adopters on the understanding that any code that uses this API will almost
 * certainly be broken (repeatedly) as the API evolves.
 */
public interface JpaFactory3_0 extends JpaFactory {

	// ********** Core Model **********

	/**
	 * Return an identifier adapter that can be used to convert database identifiers
	 * to names and vice versa, respecting the <code>delimited-identifiers</code> in
	 * <code>persistence.xml</code>.
	 */
	DatabaseIdentifierAdapter buildDatabaseIdentifierAdapter(JpaDataSource dataSource);

	MetamodelSourceType3_0.Synchronizer buildMetamodelSynchronizer(MetamodelSourceType3_0 sourceType);

	// ********** Java Context Model **********

	JavaDerivedIdentity3_0 buildJavaDerivedIdentity(JavaSingleRelationshipMapping3_0 parent);

	JavaElementCollectionMapping3_0 buildJavaElementCollectionMapping(JavaSpecifiedPersistentAttribute parent);

	Cacheable3_0 buildJavaCacheable(JavaCacheableReference3_0 parent);

	OrphanRemovable3_0 buildJavaOrphanRemoval(OrphanRemovalMapping3_0 parent);

	JavaSpecifiedOrderColumn3_0 buildJavaOrderColumn(JavaSpecifiedOrderColumn3_0.ParentAdapter parentAdapter);

	JavaCollectionTable3_0 buildJavaCollectionTable(JavaCollectionTable3_0.ParentAdapter parentAdapter);

	JavaSpecifiedColumn buildJavaMapKeyColumn(JavaSpecifiedColumn.ParentAdapter parentAdapter);

	JavaOrderable3_0 buildJavaOrderable(JavaOrderable3_0.ParentAdapter parentAdapter);

	Orderable buildJavaOrderable(JavaAttributeMapping parent);

	JavaConverterType3_0 buildJavaConverterType(JpaContextModel parent, JavaResourceType jrt);

	JavaNamedStoredProcedureQuery3_0 buildJavaNamedStoredProcedureQuery(JavaQueryContainer3_0 parent,
			NamedStoredProcedureQueryAnnotation3_0 namedStoredProcedureQueryAnnotation);

	JavaStoredProcedureParameter3_0 buildJavaStoredProcedureParameter(JavaNamedStoredProcedureQuery3_0 parent,
			StoredProcedureParameterAnnotation3_0 parameterAnnotation);

}
