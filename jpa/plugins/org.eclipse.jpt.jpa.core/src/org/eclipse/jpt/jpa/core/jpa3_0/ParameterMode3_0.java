/*******************************************************************************
* Copyright (c) 2013 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License 2.0, which accompanies this distribution
* and is available at https://www.eclipse.org/legal/epl-2.0/.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.jpa.core.jpa3_0;


/**
 * parameter mode
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.3
 * @since 3.3
 */
public enum ParameterMode3_0
{
	IN(
		org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0.IN,
		org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0.IN
		),
	INOUT(
			org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0.INOUT,
			org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0.INOUT
		),
	OUT(
			org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0.OUT,
			org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0.OUT
		),
	REF_CURSOR(
			org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0.REF_CURSOR,
			org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0.REF_CURSOR
		);


	private org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 javaParameterMode;
	private org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 ormParameterMode;

	ParameterMode3_0(
			org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 javaParameterMode,
			org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 ormParameterMode) {
		if (javaParameterMode == null) {
			throw new NullPointerException();
		}
		if (ormParameterMode == null) {
			throw new NullPointerException();
		}
		this.javaParameterMode = javaParameterMode;
		this.ormParameterMode = ormParameterMode;
	}

	public org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 getJavaParameterMode() {
		return this.javaParameterMode;
	}

	public org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 getOrmParameterMode() {
		return this.ormParameterMode;
	}


	// ********** static methods **********

	public static ParameterMode3_0 fromJavaResourceModel(org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 javaParameterMode) {
		return (javaParameterMode == null) ? null : fromJavaResourceModel_(javaParameterMode);
	}

	private static ParameterMode3_0 fromJavaResourceModel_(org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 javaParameterMode) {
		for (ParameterMode3_0 parameterMode : ParameterMode3_0.values()) {
			if (parameterMode.getJavaParameterMode() == javaParameterMode) {
				return parameterMode;
			}
		}
		return null;
	}

	public static org.eclipse.jpt.jpa.core.jpa3_0.resource.java.ParameterMode_3_0 toJavaResourceModel(ParameterMode3_0 parameterMode) {
		return (parameterMode == null) ? null : parameterMode.getJavaParameterMode();
	}


	public static ParameterMode3_0 fromOrmResourceModel(org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 ormParameterMode) {
		return (ormParameterMode == null) ? null : fromOrmResourceModel_(ormParameterMode);
	}

	private static ParameterMode3_0 fromOrmResourceModel_(org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 ormParameterMode) {
		for (ParameterMode3_0 parameterMode : ParameterMode3_0.values()) {
			if (parameterMode.getOrmParameterMode() == ormParameterMode) {
				return parameterMode;
			}
		}
		return null;
	}

	public static org.eclipse.jpt.jpa.core.resource.orm.v3_0.ParameterMode_3_0 toOrmResourceModel(ParameterMode3_0 parameterMode) {
		return (parameterMode == null) ? null : parameterMode.getOrmParameterMode();
	}
}
