/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.ITextRange;
import org.eclipse.jpt.core.internal.jdtutility.AnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.EnumDeclarationAnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.Member;
import org.eclipse.jpt.core.internal.jdtutility.ShortCircuitAnnotationElementAdapter;
import org.eclipse.jpt.core.internal.jdtutility.SimpleDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.Type;

public class InheritanceImpl extends AbstractAnnotationResource<Type> implements Inheritance
{
	private static final DeclarationAnnotationAdapter DECLARATION_ANNOTATION_ADAPTER = new SimpleDeclarationAnnotationAdapter(ANNOTATION_NAME);
	private static final DeclarationAnnotationElementAdapter<String> STRATEGY_ADAPTER = buildStrategyAdapter();

	private final AnnotationElementAdapter<String> strategyAdapter;

	private InheritanceType strategy;
	
	protected InheritanceImpl(JavaResource parent, Type type) {
		super(parent, type, DECLARATION_ANNOTATION_ADAPTER);
		this.strategyAdapter = new ShortCircuitAnnotationElementAdapter<String>(type, STRATEGY_ADAPTER);
	}
	
	public void initialize(CompilationUnit astRoot) {
		this.strategy = this.strategy(astRoot);
	}

	public String getAnnotationName() {
		return ANNOTATION_NAME;
	}
	
	public InheritanceType getStrategy() {
		return this.strategy;
	}
	
	public void setStrategy(InheritanceType newStrategy) {
		InheritanceType oldStrategy = this.strategy;
		this.strategy = newStrategy;
		this.strategyAdapter.setValue(InheritanceType.toJavaAnnotationValue(newStrategy));
		firePropertyChanged(STRATEGY_PROPERTY, oldStrategy, newStrategy);
	}

	public ITextRange strategyTextRange(CompilationUnit astRoot) {
		return this.elementTextRange(STRATEGY_ADAPTER, astRoot);
	}
	
	public void updateFromJava(CompilationUnit astRoot) {
		this.setStrategy(this.strategy(astRoot));
	}
	
	protected InheritanceType strategy(CompilationUnit astRoot) {
		return InheritanceType.fromJavaAnnotationValue(this.strategyAdapter.getValue(astRoot));
	}
	
	// ********** static methods **********
	private static DeclarationAnnotationElementAdapter<String> buildStrategyAdapter() {
		return new EnumDeclarationAnnotationElementAdapter(DECLARATION_ANNOTATION_ADAPTER, JPA.INHERITANCE__STRATEGY);
	}
	
	public static class InheritanceAnnotationDefinition implements AnnotationDefinition
	{
		// singleton
		private static final InheritanceAnnotationDefinition INSTANCE = new InheritanceAnnotationDefinition();

		/**
		 * Return the singleton.
		 */
		public static AnnotationDefinition instance() {
			return INSTANCE;
		}

		/**
		 * Ensure non-instantiability.
		 */
		private InheritanceAnnotationDefinition() {
			super();
		}

		public Annotation buildAnnotation(JavaResource parent, Member member) {
			return new InheritanceImpl(parent, (Type) member);
		}
		
		public Annotation buildNullAnnotation(JavaResource parent, Member member) {
			return new NullInheritance(parent);
		}

		public String getAnnotationName() {
			return ANNOTATION_NAME;
		}
	}

}
