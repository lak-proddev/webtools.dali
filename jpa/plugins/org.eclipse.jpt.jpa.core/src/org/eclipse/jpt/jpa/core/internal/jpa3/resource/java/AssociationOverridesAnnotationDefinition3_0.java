package org.eclipse.jpt.jpa.core.internal.jpa3.resource.java;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.common.core.internal.resource.java.binary.BinaryNamedAnnotation;
import org.eclipse.jpt.common.core.internal.resource.java.source.SourceNamedAnnotation;
import org.eclipse.jpt.common.core.resource.java.Annotation;
import org.eclipse.jpt.common.core.resource.java.AnnotationDefinition;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.jdt.AnnotatedElement;
import org.eclipse.jpt.jpa.core.internal.resource.java.AssociationOverridesAnnotationDefinition;
import org.eclipse.jpt.jpa.core.resource.java.JPA;
import org.eclipse.jpt.jpa.core.resource.persistence.v3_0.JPA3_0;

/**
 * javax.persistence.AssociationOverrides
 */
public final class AssociationOverridesAnnotationDefinition3_0 implements AnnotationDefinition {
	// singleton
	private static final AnnotationDefinition INSTANCE = new AssociationOverridesAnnotationDefinition3_0();

	/**
	 * Return the singleton.
	 */
	public static AnnotationDefinition instance() {
		return INSTANCE;
	}

	/**
	 * Ensure single instance.
	 */
	private AssociationOverridesAnnotationDefinition3_0() {
		super();
	}

	public Annotation buildAnnotation(JavaResourceAnnotatedElement parent, AnnotatedElement annotatedElement) {
		return new SourceNamedAnnotation(parent, annotatedElement, getAnnotationName());
	}

	public Annotation buildNullAnnotation(JavaResourceAnnotatedElement parent) {
		throw new UnsupportedOperationException();
	}

	public Annotation buildAnnotation(JavaResourceAnnotatedElement parent, IAnnotation jdtAnnotation) {
		return new BinaryNamedAnnotation(parent, jdtAnnotation, getAnnotationName());
	}

	public String getAnnotationName() {
		return JPA3_0.ASSOCIATION_OVERRIDES;
	}
}
