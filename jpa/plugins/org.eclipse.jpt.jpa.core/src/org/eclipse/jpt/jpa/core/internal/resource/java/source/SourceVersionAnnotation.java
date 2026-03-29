/*******************************************************************************
 * Copyright (c) 2007, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0, which accompanies this distribution
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *     Lakshminarayana Nekkanti - JPA 3.x jakarta namespace support
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.resource.java.source;

import org.eclipse.jpt.common.core.internal.resource.java.source.SourceAnnotation;

import org.eclipse.jpt.common.core.internal.utility.jdt.JakartaAwareDeclarationAnnotationAdapter;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.common.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.jpa.core.resource.java.VersionAnnotation;

/**
 * javax.persistence.Version
 */
public final class SourceVersionAnnotation
	extends SourceAnnotation
	implements VersionAnnotation
{
	private static final DeclarationAnnotationAdapter DECLARATION_ANNOTATION_ADAPTER = JakartaAwareDeclarationAnnotationAdapter.forJavax(ANNOTATION_NAME);

	/**
	 * The effective annotation FQN for this instance — either
	 * {@code javax.persistence.Version} (default) or
	 * {@code jakarta.persistence.Version} (when built with a Jakarta adapter).
	 */
	private final String annotationName;


	public SourceVersionAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement element) {
		super(parent, element, DECLARATION_ANNOTATION_ADAPTER);
		this.annotationName = ANNOTATION_NAME;
	}

	public SourceVersionAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement element, DeclarationAnnotationAdapter daa) {
		super(parent, element, daa);
		this.annotationName = (daa instanceof JakartaAwareDeclarationAnnotationAdapter)
				? ((JakartaAwareDeclarationAnnotationAdapter) daa).getAnnotationName()
				: ANNOTATION_NAME;
	}

	public String getAnnotationName() {
		return this.annotationName;
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append(this.getAnnotationName());
	}
}
