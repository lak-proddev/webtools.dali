/*******************************************************************************
 * Copyright (c) 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.resource.java.source;

import java.util.Vector;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.resource.java.source.AnnotationContainerTools;
import org.eclipse.jpt.core.internal.resource.java.source.SourceAnnotation;
import org.eclipse.jpt.core.internal.utility.jdt.SimpleDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.jaxb.core.resource.java.JAXB;
import org.eclipse.jpt.jaxb.core.resource.java.NestableXmlJavaTypeAdapterAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlJavaTypeAdapterAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlJavaTypeAdaptersAnnotation;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterables.LiveCloneIterable;

/**
 * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters
 */
public class SourceXmlJavaTypeAdaptersAnnotation
	extends SourceAnnotation<AnnotatedElement>
	implements XmlJavaTypeAdaptersAnnotation
{
	public static final DeclarationAnnotationAdapter DECLARATION_ANNOTATION_ADAPTER = new SimpleDeclarationAnnotationAdapter(ANNOTATION_NAME);

	private final Vector<NestableXmlJavaTypeAdapterAnnotation> adapters = new Vector<NestableXmlJavaTypeAdapterAnnotation>();


	public SourceXmlJavaTypeAdaptersAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement annotatedElement) {
		super(parent, annotatedElement, DECLARATION_ANNOTATION_ADAPTER);
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
		sb.append(this.adapters);
	}


	// ********** AnnotationContainer implementation **********

	public String getElementName() {
		return JAXB.XML_JAVA_TYPE_ADAPTERS__VALUE;
	}

	public String getNestedAnnotationName() {
		return XmlJavaTypeAdapterAnnotation.ANNOTATION_NAME;
	}

	public Iterable<NestableXmlJavaTypeAdapterAnnotation> getNestedAnnotations() {
		return new LiveCloneIterable<NestableXmlJavaTypeAdapterAnnotation>(this.adapters);
	}

	public int getNestedAnnotationsSize() {
		return this.adapters.size();
	}

	public NestableXmlJavaTypeAdapterAnnotation addNestedAnnotation() {
		return this.addNestedAnnotation(this.adapters.size());
	}

	private NestableXmlJavaTypeAdapterAnnotation addNestedAnnotation(int index) {
		NestableXmlJavaTypeAdapterAnnotation adapter = this.buildXmlJavaTypeAdapterAnnotation(index);
		this.adapters.add(adapter);
		return adapter;
	}

	public void syncAddNestedAnnotation(Annotation astAnnotation) {
		int index = this.adapters.size();
		NestableXmlJavaTypeAdapterAnnotation namedQuery = this.addNestedAnnotation(index);
		namedQuery.initialize((CompilationUnit) astAnnotation.getRoot());
		this.fireItemAdded(XML_JAVA_TYPE_ADAPTERS_LIST, index, namedQuery);
	}

	protected NestableXmlJavaTypeAdapterAnnotation buildXmlJavaTypeAdapterAnnotation(int index) {
		return SourceXmlJavaTypeAdapterAnnotation.createNestedXmlJavaTypeAdapterAnnotation(this, this.annotatedElement, index, this.daa);
	}

	public NestableXmlJavaTypeAdapterAnnotation moveNestedAnnotation(int targetIndex, int sourceIndex) {
		return CollectionTools.move(this.adapters, targetIndex, sourceIndex).get(targetIndex);
	}

	public NestableXmlJavaTypeAdapterAnnotation removeNestedAnnotation(int index) {
		return this.adapters.remove(index);
	}

	public void syncRemoveNestedAnnotations(int index) {
		this.removeItemsFromList(index, this.adapters, XML_JAVA_TYPE_ADAPTERS_LIST);
	}

}