/*******************************************************************************
 * Copyright (c) 2011, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal;

import org.eclipse.jpt.jpa.core.context.AttributeMapping;
import org.eclipse.jpt.jpa.core.jpql.JpaJpqlQueryHelper;
import org.eclipse.jpt.jpa.core.jpql.spi.IManagedTypeBuilder;
import org.eclipse.jpt.jpa.eclipselink.core.jpql.spi.EclipseLinkManagedTypeBuilder;
import org.eclipse.jpt.jpa.eclipselink.core.jpql.spi.EclipseLinkMappingBuilder;
import org.eclipse.persistence.jpa.jpql.AbstractContentAssistVisitor;
import org.eclipse.persistence.jpa.jpql.AbstractGrammarValidator;
import org.eclipse.persistence.jpa.jpql.AbstractSemanticValidator;
import org.eclipse.persistence.jpa.jpql.EclipseLinkContentAssistVisitor;
import org.eclipse.persistence.jpa.jpql.EclipseLinkGrammarValidator;
import org.eclipse.persistence.jpa.jpql.EclipseLinkJPQLQueryContext;
import org.eclipse.persistence.jpa.jpql.EclipseLinkSemanticValidator;
import org.eclipse.persistence.jpa.jpql.JPQLQueryContext;
import org.eclipse.persistence.jpa.jpql.parser.JPQLGrammar;
import org.eclipse.persistence.jpa.jpql.spi.IMappingBuilder;

/**
 * The abstract implementation of {@link JpaJpqlQueryHelper} that supports EclipseLink.
 *
 * @version 3.2
 * @since 3.1
 * @author Pascal Filion
 */
public class EclipseLinkJpaJpqlQueryHelper extends JpaJpqlQueryHelper {

	/**
	 * Creates a new <code>EclipseLinkJpaJpqlQueryHelper</code>.
	 *
	 * @param jpqlGrammar The grammar that defines how to parse a JPQL query
	 */
	public EclipseLinkJpaJpqlQueryHelper(JPQLGrammar jpqlGrammar) {
		super(jpqlGrammar);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected AbstractContentAssistVisitor buildContentAssistVisitor(JPQLQueryContext queryContext) {
		return new EclipseLinkContentAssistVisitor(queryContext);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected AbstractGrammarValidator buildGrammarValidator(JPQLQueryContext queryContext) {
		return new EclipseLinkGrammarValidator(queryContext);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected JPQLQueryContext buildJPQLQueryContext(JPQLGrammar jpqlGrammar) {
		return new EclipseLinkJPQLQueryContext(jpqlGrammar);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IManagedTypeBuilder buildManagedTypeBuilder() {
		return new EclipseLinkManagedTypeBuilder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IMappingBuilder<AttributeMapping> buildMappingBuilder() {
		return new EclipseLinkMappingBuilder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected AbstractSemanticValidator buildSemanticValidator(JPQLQueryContext queryContext) {
		return new EclipseLinkSemanticValidator(queryContext);
	}
}