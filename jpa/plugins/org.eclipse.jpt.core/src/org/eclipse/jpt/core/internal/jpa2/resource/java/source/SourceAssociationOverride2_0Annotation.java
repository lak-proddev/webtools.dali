/*******************************************************************************
* Copyright (c) 2009, 2010 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.core.internal.jpa2.resource.java.source;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.jpa2.resource.java.NullAssociationOverrideJoinTableAnnotation;
import org.eclipse.jpt.core.internal.resource.java.source.SourceAssociationOverrideAnnotation;
import org.eclipse.jpt.core.internal.resource.java.source.SourceJoinTableAnnotation;
import org.eclipse.jpt.core.internal.utility.jdt.ElementAnnotationAdapter;
import org.eclipse.jpt.core.internal.utility.jdt.ElementIndexedAnnotationAdapter;
import org.eclipse.jpt.core.internal.utility.jdt.NestedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.utility.jdt.NestedIndexedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.jpa2.resource.java.AssociationOverride2_0Annotation;
import org.eclipse.jpt.core.jpa2.resource.java.JPA2_0;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.JoinTableAnnotation;
import org.eclipse.jpt.core.resource.java.NestableJoinTableAnnotation;
import org.eclipse.jpt.core.utility.jdt.AnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.IndexedAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.IndexedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.Member;

/**
 *  SourceSequenceGenerator2_0Annotation
 */
public final class SourceAssociationOverride2_0Annotation
	extends SourceAssociationOverrideAnnotation
	implements AssociationOverride2_0Annotation
{
	private final ElementAnnotationAdapter joinTableAdapter;
	private NestableJoinTableAnnotation joinTable;


	// ********** constructor **********
	public SourceAssociationOverride2_0Annotation(JavaResourceNode parent, Member member, DeclarationAnnotationAdapter daa, AnnotationAdapter annotationAdapter) {
		super(parent, member, daa, annotationAdapter);
		this.joinTableAdapter = new ElementAnnotationAdapter(this.annotatedElement, buildJoinTableAnnotationAdapter(this.daa));
	}

	@Override
	public void initialize(CompilationUnit astRoot) {
		super.initialize(astRoot);
		if (this.joinTableAdapter.getAnnotation(astRoot) != null) {
			this.joinTable = buildJoinTableAnnotation(this, this.annotatedElement, this.daa);
			this.joinTable.initialize(astRoot);
		}
	}

	@Override
	public void synchronizeWith(CompilationUnit astRoot) {
		super.synchronizeWith(astRoot);
		this.syncJoinTable(astRoot);
	}

	//************ AssociationOverride2_0Annotation implementation ****************

	// ***** joinTable
	public JoinTableAnnotation getJoinTable() {
		return this.joinTable;
	}

	public JoinTableAnnotation getNonNullJoinTable() {
		return (this.joinTable != null) ? this.joinTable : new NullAssociationOverrideJoinTableAnnotation(this);
	}
	
	public NestableJoinTableAnnotation addJoinTable() {
		if (this.joinTable != null) {
			throw new IllegalStateException("'joinTable' element already exists: " + this.joinTable); //$NON-NLS-1$
		}
		this.joinTable = buildJoinTableAnnotation(this, this.annotatedElement, this.daa);
		this.joinTable.newAnnotation();
		return this.joinTable;
	}

	public void removeJoinTable() {
		if (this.joinTable == null) {
			throw new IllegalStateException("'joinTable' element does not exist"); //$NON-NLS-1$
		}
		this.joinTable.removeAnnotation();
		this.joinTable = null;
	}

	private void syncJoinTable(CompilationUnit astRoot) {
		if (this.joinTableAdapter.getAnnotation(astRoot) == null) {
			this.syncJoinTable_(null);
		} else {
			if (this.joinTable == null) {
				NestableJoinTableAnnotation table = buildJoinTableAnnotation(this, this.annotatedElement, this.daa);
				table.initialize(astRoot);
				this.syncJoinTable_(table);
			} else {
				this.joinTable.synchronizeWith(astRoot);
			}
		}
	}
	
	private void syncJoinTable_(NestableJoinTableAnnotation astJoinTable) {
		JoinTableAnnotation old = this.joinTable;
		this.joinTable = astJoinTable;
		this.firePropertyChanged(JOIN_TABLE_PROPERTY, old, astJoinTable);
	}

	
	// ********** static methods **********

	public static SourceAssociationOverride2_0Annotation buildAssociationOverride(JavaResourceNode parent, Member member) {
		return new SourceAssociationOverride2_0Annotation(parent, member, DECLARATION_ANNOTATION_ADAPTER, new ElementAnnotationAdapter(member, DECLARATION_ANNOTATION_ADAPTER));
	}

	static NestableJoinTableAnnotation buildJoinTableAnnotation(JavaResourceNode parent, Member member, DeclarationAnnotationAdapter associationOverrideAnnotationAdapter) {
		return new SourceJoinTableAnnotation(parent, member, buildJoinTableAnnotationAdapter(associationOverrideAnnotationAdapter));
	}

	static DeclarationAnnotationAdapter buildJoinTableAnnotationAdapter(DeclarationAnnotationAdapter associationOverrideAnnotationAdapter) {
		return new NestedDeclarationAnnotationAdapter(associationOverrideAnnotationAdapter, JPA2_0.ASSOCIATION_OVERRIDE__JOIN_TABLE, org.eclipse.jpt.core.resource.java.JPA.JOIN_TABLE);
	}

	
	static SourceAssociationOverrideAnnotation buildNestedAssociationOverride(JavaResourceNode parent, Member member, int index, DeclarationAnnotationAdapter attributeOverridesAdapter) {
		IndexedDeclarationAnnotationAdapter idaa = buildNestedDeclarationAnnotationAdapter(index, attributeOverridesAdapter);
		IndexedAnnotationAdapter annotationAdapter = new ElementIndexedAnnotationAdapter(member, idaa);
		return new SourceAssociationOverride2_0Annotation(parent, member, idaa, annotationAdapter);
	}

	protected static IndexedDeclarationAnnotationAdapter buildNestedDeclarationAnnotationAdapter(int index, DeclarationAnnotationAdapter attributeOverridesAdapter) {
		return new NestedIndexedDeclarationAnnotationAdapter(attributeOverridesAdapter, index, org.eclipse.jpt.core.resource.java.JPA.ASSOCIATION_OVERRIDE);
	}

}