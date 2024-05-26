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

import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.internal.jpa2_1.context.java.GenericJavaStoredProcedureParameter2_1;
import org.eclipse.jpt.jpa.core.internal.jpa2_2.GenericJpaFactory2_2;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaConverterType3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaNamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.internal.jpa3_0.context.java.GenericJavaStoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.JpaFactory3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaConverterType3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaNamedStoredProcedureQuery3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaQueryContainer3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.context.java.JavaStoredProcedureParameter3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.NamedStoredProcedureQueryAnnotation3_0;
import org.eclipse.jpt.jpa.core.jpa3_0.resource.java.StoredProcedureParameterAnnotation3_0;

/**
 * Central class that allows extenders to easily replace implementations of
 * various Dali interfaces.
 */
public class GenericJpaFactory3_0 extends GenericJpaFactory2_2 implements JpaFactory3_0 {

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
