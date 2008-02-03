/*******************************************************************************
 *  Copyright (c) 2007 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.tests.internal.context.java;

import java.util.Iterator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.core.internal.context.base.IEntity;
import org.eclipse.jpt.core.internal.context.base.IQueryHint;
import org.eclipse.jpt.core.internal.resource.java.JPA;
import org.eclipse.jpt.core.internal.resource.java.JavaPersistentTypeResource;
import org.eclipse.jpt.core.internal.resource.java.NamedQuery;
import org.eclipse.jpt.core.internal.resource.java.QueryHint;
import org.eclipse.jpt.core.tests.internal.context.ContextModelTestCase;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class JavaQueryHintTests extends ContextModelTestCase
{
	private static final String QUERY_NAME = "QUERY_NAME";

	private void createEntityAnnotation() throws Exception{
		this.createAnnotationAndMembers("Entity", "String name() default \"\";");		
	}
	
	private void createNamedQueryAnnotation() throws Exception {
		createQueryHintAnnotation();
		this.createAnnotationAndMembers("NamedQuery", 
			"String name();" +
			"String query();" +
			"QueryHint[] hints() default {};");		
	}
	
	private void createQueryHintAnnotation() throws Exception {
		this.createAnnotationAndMembers("QueryHint", 
			"String name();" +
			"String value();");		
	}
		
	private IType createTestEntityWithNamedQuery() throws Exception {
		createEntityAnnotation();
		createNamedQueryAnnotation();
	
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.ENTITY, JPA.NAMED_QUERY, JPA.QUERY_HINT);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@Entity").append(CR);
				sb.append("@NamedQuery(name=\"" + QUERY_NAME + "\", hints=@QueryHint())");
			}
		});
	}


		
	public JavaQueryHintTests(String name) {
		super(name);
	}
	
	public void testUpdateName() throws Exception {
		createTestEntityWithNamedQuery();
		addXmlClassRef(FULLY_QUALIFIED_TYPE_NAME);
		
		IEntity entity = javaEntity();
		IQueryHint queryHint = entity.namedQueries().next().hints().next();

		JavaPersistentTypeResource typeResource = jpaProject().javaPersistentTypeResource(FULLY_QUALIFIED_TYPE_NAME);
		QueryHint javaQueryHint = ((NamedQuery) typeResource.annotation(NamedQuery.ANNOTATION_NAME)).hints().next();
		
		assertNull(javaQueryHint.getName());
		assertNull(queryHint.getName());

		//set name in the resource model, verify context model updated
		javaQueryHint.setName("foo");
		assertEquals("foo", javaQueryHint.getName());
		assertEquals("foo", queryHint.getName());
		
		//set name to null in the resource model
		javaQueryHint.setName(null);
		assertNull(javaQueryHint.getName());
		assertEquals(0, entity.namedQueries().next().hintsSize());
	}
	
	public void testModifyName() throws Exception {
		createTestEntityWithNamedQuery();
		addXmlClassRef(FULLY_QUALIFIED_TYPE_NAME);
		
		IEntity entity = javaEntity();
		IQueryHint queryHint = entity.namedQueries().next().hints().next();

		JavaPersistentTypeResource typeResource = jpaProject().javaPersistentTypeResource(FULLY_QUALIFIED_TYPE_NAME);
		QueryHint javaQueryhint = ((NamedQuery) typeResource.annotation(NamedQuery.ANNOTATION_NAME)).hints().next();
		
		assertNull(javaQueryhint.getName());
		assertNull(queryHint.getName());

		//set name in the context model, verify resource model updated
		queryHint.setName("foo");
		assertEquals("foo", javaQueryhint.getName());
		assertEquals("foo", queryHint.getName());
		
		//set name to null in the context model
		queryHint.setName(null);
		assertNull(javaQueryhint.getName());
		assertNull(queryHint.getName());
	}
	
	public void testUpdateValue() throws Exception {
		createTestEntityWithNamedQuery();
		addXmlClassRef(FULLY_QUALIFIED_TYPE_NAME);
		
		IEntity entity = javaEntity();
		IQueryHint queryHint = entity.namedQueries().next().hints().next();

		JavaPersistentTypeResource typeResource = jpaProject().javaPersistentTypeResource(FULLY_QUALIFIED_TYPE_NAME);
		QueryHint javaQueryhint = ((NamedQuery) typeResource.annotation(NamedQuery.ANNOTATION_NAME)).hints().next();
		
		assertNull(javaQueryhint.getValue());
		assertNull(queryHint.getValue());

		//set name in the resource model, verify context model updated
		javaQueryhint.setValue("foo");
		assertEquals("foo", javaQueryhint.getValue());
		assertEquals("foo", queryHint.getValue());
		
		//set name to null in the resource model
		javaQueryhint.setValue(null);
		assertNull(javaQueryhint.getValue());
		assertEquals(0, entity.namedQueries().next().hintsSize());
	}
	
	public void testModifyValue() throws Exception {
		createTestEntityWithNamedQuery();
		addXmlClassRef(FULLY_QUALIFIED_TYPE_NAME);
		
		IEntity entity = javaEntity();
		IQueryHint queryHint = entity.namedQueries().next().hints().next();

		JavaPersistentTypeResource typeResource = jpaProject().javaPersistentTypeResource(FULLY_QUALIFIED_TYPE_NAME);
		QueryHint javaQueryhint = ((NamedQuery) typeResource.annotation(NamedQuery.ANNOTATION_NAME)).hints().next();
		
		assertNull(javaQueryhint.getValue());
		assertNull(queryHint.getValue());

		//set name in the context model, verify resource model updated
		queryHint.setValue("foo");
		assertEquals("foo", javaQueryhint.getValue());
		assertEquals("foo", queryHint.getValue());
		
		//set name to null in the context model
		queryHint.setValue(null);
		assertNull(javaQueryhint.getValue());
		assertNull(queryHint.getValue());
	}
}
