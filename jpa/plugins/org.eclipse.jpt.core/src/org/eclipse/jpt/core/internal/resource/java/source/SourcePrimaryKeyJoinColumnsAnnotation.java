/*******************************************************************************
 * Copyright (c) 2007, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java.source;

import java.util.Vector;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.utility.jdt.SimpleDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.NestablePrimaryKeyJoinColumnAnnotation;
import org.eclipse.jpt.core.resource.java.PrimaryKeyJoinColumnAnnotation;
import org.eclipse.jpt.core.resource.java.PrimaryKeyJoinColumnsAnnotation;
import org.eclipse.jpt.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.Member;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterables.LiveCloneIterable;

/**
 * javax.persistence.PrimaryKeyJoinColumns
 */
public final class SourcePrimaryKeyJoinColumnsAnnotation
	extends SourceAnnotation<Member>
	implements PrimaryKeyJoinColumnsAnnotation
{
	public static final DeclarationAnnotationAdapter DECLARATION_ANNOTATION_ADAPTER = new SimpleDeclarationAnnotationAdapter(ANNOTATION_NAME);

	private final Vector<NestablePrimaryKeyJoinColumnAnnotation> pkJoinColumns = new Vector<NestablePrimaryKeyJoinColumnAnnotation>();


	public SourcePrimaryKeyJoinColumnsAnnotation(JavaResourceNode parent, Member member) {
		super(parent, member, DECLARATION_ANNOTATION_ADAPTER);
	}

	public String getAnnotationName() {
		return ANNOTATION_NAME;
	}

	public void initialize(CompilationUnit astRoot) {
		AnnotationContainerTools.initialize(this, astRoot);
	}

	public void synchronizeWith(CompilationUnit astRoot) {
		AnnotationContainerTools.synchronize(this, astRoot);
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append(this.pkJoinColumns);
	}


	// ********** AnnotationContainer Implementation **********

	public String getElementName() {
		return JPA.PRIMARY_KEY_JOIN_COLUMNS__VALUE;
	}

	public String getNestedAnnotationName() {
		return PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME;
	}

	public Iterable<NestablePrimaryKeyJoinColumnAnnotation> getNestedAnnotations() {
		return new LiveCloneIterable<NestablePrimaryKeyJoinColumnAnnotation>(this.pkJoinColumns);
	}

	public int getNestedAnnotationsSize() {
		return this.pkJoinColumns.size();
	}

	public NestablePrimaryKeyJoinColumnAnnotation addNestedAnnotation() {
		return this.addNestedAnnotation(this.pkJoinColumns.size());
	}

	private NestablePrimaryKeyJoinColumnAnnotation addNestedAnnotation(int index) {
		NestablePrimaryKeyJoinColumnAnnotation pkJoinColumn = this.buildPrimaryKeyJoinColumn(index);
		this.pkJoinColumns.add(pkJoinColumn);
		return pkJoinColumn;
	}

	public void syncAddNestedAnnotation(Annotation astAnnotation) {
		int index = this.pkJoinColumns.size();
		NestablePrimaryKeyJoinColumnAnnotation pkJoinColumn = this.addNestedAnnotation(index);
		pkJoinColumn.initialize((CompilationUnit) astAnnotation.getRoot());
		this.fireItemAdded(PK_JOIN_COLUMNS_LIST, index, pkJoinColumn);
	}

	private NestablePrimaryKeyJoinColumnAnnotation buildPrimaryKeyJoinColumn(int index) {
		return SourcePrimaryKeyJoinColumnAnnotation.createNestedPrimaryKeyJoinColumn(this, this.annotatedElement, index, this.daa);
	}

	public NestablePrimaryKeyJoinColumnAnnotation moveNestedAnnotation(int targetIndex, int sourceIndex) {
		return CollectionTools.move(this.pkJoinColumns, targetIndex, sourceIndex).get(targetIndex);
	}

	public NestablePrimaryKeyJoinColumnAnnotation removeNestedAnnotation(int index) {
		return this.pkJoinColumns.remove(index);
	}

	public void syncRemoveNestedAnnotations(int index) {
		this.removeItemsFromList(index, this.pkJoinColumns, PK_JOIN_COLUMNS_LIST);
	}

}
