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
package org.eclipse.jpt.core.tests.internal.context.orm;

import java.util.Iterator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.core.internal.JptCorePlugin;
import org.eclipse.jpt.core.internal.context.orm.XmlGeneratedValue;
import org.eclipse.jpt.core.internal.context.orm.XmlIdMapping;
import org.eclipse.jpt.core.internal.context.orm.XmlPersistentAttribute;
import org.eclipse.jpt.core.internal.context.orm.XmlPersistentType;
import org.eclipse.jpt.core.internal.resource.java.JPA;
import org.eclipse.jpt.core.internal.resource.orm.GeneratedValue;
import org.eclipse.jpt.core.internal.resource.orm.Id;
import org.eclipse.jpt.core.internal.resource.persistence.PersistenceFactory;
import org.eclipse.jpt.core.internal.resource.persistence.XmlMappingFileRef;
import org.eclipse.jpt.core.tests.internal.context.ContextModelTestCase;
import org.eclipse.jpt.core.tests.internal.projects.TestJavaProject.SourceWriter;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class XmlGeneratedValueTests extends ContextModelTestCase
{
	public XmlGeneratedValueTests(String name) {
		super(name);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		XmlMappingFileRef mappingFileRef = PersistenceFactory.eINSTANCE.createXmlMappingFileRef();
		mappingFileRef.setFileName(JptCorePlugin.DEFAULT_ORM_XML_FILE_PATH);
		xmlPersistenceUnit().getMappingFiles().add(mappingFileRef);
		persistenceResource().save(null);
	}
	
	private void createEntityAnnotation() throws Exception {
		this.createAnnotationAndMembers("Entity", "String name() default \"\";");		
	}
	
	private void createIdAnnotation() throws Exception {
		this.createAnnotationAndMembers("Id", "");		
	}
	
	private IType createTestEntity() throws Exception {
		createEntityAnnotation();
		createIdAnnotation();
	
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.ENTITY, JPA.ID);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@Entity");
			}
			@Override
			public void appendIdFieldAnnotationTo(StringBuilder sb) {
				sb.append("@Id");
			}
		});
	}
	
	private IType createTestSubType() throws Exception {
		SourceWriter sourceWriter = new SourceWriter() {
			public void appendSourceTo(StringBuilder sb) {
				sb.append(CR);
					sb.append("import ");
					sb.append(JPA.ENTITY);
					sb.append(";");
					sb.append(CR);
				sb.append("@Entity");
				sb.append(CR);
				sb.append("public class ").append("AnnotationTestTypeChild").append(" ");
				sb.append("extends " + TYPE_NAME + " ");
				sb.append("{}").append(CR);
			}
		};
		return this.javaProject.createType(PACKAGE_NAME, "AnnotationTestTypeChild.java", sourceWriter);
	}
	
	public void testUpdateSpecifiedName() throws Exception {
		XmlPersistentType xmlPersistentType = entityMappings().addXmlPersistentType(IMappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		XmlPersistentAttribute xmlPersistentAttribute = xmlPersistentType.addSpecifiedPersistentAttribute(IMappingKeys.ID_ATTRIBUTE_MAPPING_KEY, "idMapping");
		XmlIdMapping xmlIdMapping = (XmlIdMapping) xmlPersistentAttribute.getMapping();
		XmlGeneratedValue xmlGeneratedValue = xmlIdMapping.addGeneratedValue();
		Id idResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getIds().get(0);
		GeneratedValue generatedValueResource = idResource.getGeneratedValue();
		
		//set generator in the resource model, verify context model updated
		generatedValueResource.setGenerator("FOO");
		assertEquals("FOO", xmlGeneratedValue.getSpecifiedGenerator());
		assertEquals("FOO", generatedValueResource.getGenerator());
	
		//set name to null in the resource model
		generatedValueResource.setGenerator(null);
		assertNull(xmlGeneratedValue.getSpecifiedGenerator());
		assertNull(generatedValueResource.getGenerator());
	}
	
	public void testModifySpecifiedName() throws Exception {
		XmlPersistentType xmlPersistentType = entityMappings().addXmlPersistentType(IMappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		XmlPersistentAttribute xmlPersistentAttribute = xmlPersistentType.addSpecifiedPersistentAttribute(IMappingKeys.ID_ATTRIBUTE_MAPPING_KEY, "idMapping");
		XmlIdMapping xmlIdMapping = (XmlIdMapping) xmlPersistentAttribute.getMapping();
		XmlGeneratedValue xmlGeneratedValue = xmlIdMapping.addGeneratedValue();
		Id idResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getIds().get(0);
		GeneratedValue generatedValueResource = idResource.getGeneratedValue();
		
		//set name in the context model, verify resource model modified
		xmlGeneratedValue.setSpecifiedGenerator("FOO");
		assertEquals("FOO", generatedValueResource.getGenerator());
		assertEquals("FOO", xmlGeneratedValue.getSpecifiedGenerator());
		
		//set name to null in the context model
		xmlGeneratedValue.setSpecifiedGenerator(null);
		assertNull(generatedValueResource.getGenerator());
		assertNull(xmlGeneratedValue.getSpecifiedGenerator());
	}

}