/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa2.resource.java.source;

import org.eclipse.jpt.common.core.internal.utility.jdt.SimpleDeclarationAnnotationAdapter;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.common.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.jpa.core.internal.resource.java.source.SourceBaseEnumeratedAnnotation;
import org.eclipse.jpt.jpa.core.jpa2.resource.java.JPA2_0;
import org.eclipse.jpt.jpa.core.jpa2.resource.java.MapKeyEnumeratedAnnotation2_0;

/**
 * <code>javax.persistence.MapKeyEnumerated</code>
 */
public final class SourceMapKeyEnumerated2_0Annotation
	extends SourceBaseEnumeratedAnnotation
	implements MapKeyEnumeratedAnnotation2_0
{
	private static final DeclarationAnnotationAdapter DECLARATION_ANNOTATION_ADAPTER = new SimpleDeclarationAnnotationAdapter(MapKeyEnumeratedAnnotation2_0.ANNOTATION_NAME);	

	public SourceMapKeyEnumerated2_0Annotation(JavaResourceAnnotatedElement parent, AnnotatedElement element) {
		super(parent, element, DECLARATION_ANNOTATION_ADAPTER);
	}

	public String getAnnotationName() {
		return MapKeyEnumeratedAnnotation2_0.ANNOTATION_NAME;
	}

	@Override
	protected String getValueElementName() {
		return JPA2_0.MAP_KEY_ENUMERATED__VALUE;
	}
}
