/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.resource.java;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.JpaAnnotationProvider;
import org.eclipse.jpt.core.JpaResourceModel;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.utility.model.Model;

/**
 * Common interface for Java resource nodes (source code or binary).
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface JavaResourceNode
	extends Model
{

	/**
	 * Return the Eclipse file that contains the Java resource node
	 * (typically either a Java source code file or a JAR).
	 */
	IFile getFile();

	/**
	 * Return the root of the Java resource containment hierarchy
	 * (typically either a compilation unit or a package fragment root).
	 */
	Root getRoot();

	/**
	 * Return the [source] node's root (the compilation unit).
	 */
	JavaResourceCompilationUnit getJavaResourceCompilationUnit();

	/**
	 * Return the [source] node's text range in the compilation unit's file.
	 */
	TextRange getTextRange(CompilationUnit astRoot);

	/**
	 * Initialize the [source] with the specified AST.
	 */
	void initialize(CompilationUnit astRoot);

	/**
	 * Update the [source] with the specified AST.
	 */
	void update(CompilationUnit astRoot);


	/**
	 * root of Java resource containment hierarchy
	 */
	interface Root extends JavaResourceNode, JpaResourceModel {

		/**
		 * Return the root's Java resource persistent types.
		 */
		Iterator<JavaResourcePersistentType> persistentTypes();

		/**
		 * Called (via a hook in change notification) whenever anything in the
		 * Java resource model changes. Forwarded to listeners.
		 */
		void resourceModelChanged();

		/**
		 * Return the annotation provider that supplies the annotations found
		 * in the Java resource model.
		 */
		JpaAnnotationProvider getAnnotationProvider();

	}

}
