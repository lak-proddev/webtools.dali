/*******************************************************************************
 * Copyright (c) 2010, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.context.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.jpa.core.context.java.JavaReadOnlyTable;
import org.eclipse.jpt.jpa.core.internal.context.TableTextRangeResolver;

public class JavaTableTextRangeResolver
	implements TableTextRangeResolver
{
	protected final JavaReadOnlyTable table;

	protected final CompilationUnit astRoot;


	public JavaTableTextRangeResolver(JavaReadOnlyTable table, CompilationUnit astRoot) {
		super();
		this.table = table;
		this.astRoot = astRoot;
	}

	public TextRange getNameTextRange() {
		return this.table.getNameTextRange(this.astRoot);
	}

	public TextRange getCatalogTextRange() {
		return this.table.getCatalogTextRange(this.astRoot);
	}

	public TextRange getSchemaTextRange() {
		return this.table.getSchemaTextRange(this.astRoot);
	}
}
