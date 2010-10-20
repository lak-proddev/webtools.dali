/*******************************************************************************
 *  Copyright (c) 2010  Oracle. All rights reserved.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v1.0, which accompanies this distribution
 *  and is available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jaxb.core.resource.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.resource.java.NestableAnnotation;
import org.eclipse.jpt.core.utility.TextRange;

/**
 * Corresponds to the JAXB annotation
 * javax.xml.bind.annotation.XmlSchemaType
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.0
 * @since 3.0
 */
public interface XmlSchemaTypeAnnotation
		extends NestableAnnotation {
	
	String ANNOTATION_NAME = JAXB.XML_SCHEMA_TYPE;
	
	/**
	 * Corresponds to the 'name' element of the XmlSchemaType annotation.
	 * Return null if the element does not exist in Java.
	 */
	String getName();
		String NAME_PROPERTY = "name"; //$NON-NLS-1$
	
	/**
	 * Corresponds to the 'name' element of the XmlSchemaType annotation.
	 * Set to null to remove the element.
	 */
	void setName(String name);
	
	/**
	 * Return the {@link TextRange} for the 'name' element. If the element 
	 * does not exist return the {@link TextRange} for the XmlSchemaType annotation.
	 */
	TextRange getNameTextRange(CompilationUnit astRoot);
	
	/**
	 * Corresponds to the 'namespace' element of the XmlSchemaType annotation.
	 * Return null if the element does not exist in Java.
	 */
	String getNamespace();
		String NAMESPACE_PROPERTY = "namespace"; //$NON-NLS-1$
	
	/**
	 * Corresponds to the 'namespace' element of the XmlSchemaType annotation.
	 * Set to null to remove the element.
	 */
	void setNamespace(String namespace);
	
	/**
	 * Return the {@link TextRange} for the 'namespace' element. If the element 
	 * does not exist return the {@link TextRange} for the XmlSchemaType annotation.
	 */
	TextRange getNamespaceTextRange(CompilationUnit astRoot);
	
	/**
	 * Corresponds to the 'type' element of the XmlSchemaType annotation.
	 * Return null if the element does not exist in Java.
	 * Return the portion of the value preceding ".class".
	 * <pre>
	 *     &#64;XmlSchemaType(name="date", type=XMLGregorianCalendar.class)
	 * </pre>
	 * will return "XMLGregorianCalendar"
	 */
	String getType();
		String TYPE_PROPERTY = "type"; //$NON-NLS-1$

	/**
	 * Corresponds to the 'type' element of the XmlSchemaType annotation.
	 * Set to null to remove the element.
	 */
	void setType(String type);
	/**
	 * Return the {@link TextRange} for the 'type' element. If the element 
	 * does not exist return the {@link TextRange} for the XmlSchemaType annotation.
	 */
	TextRange getTypeTextRange(CompilationUnit astRoot);

	/**
	 * Return the fully-qualified type name as resolved by the AST's bindings.
	 * <pre>
	 *     &#64;XmlSchemaType(name="date", type=XMLGregorianCalendar.class)
	 * </pre>
	 * will return "javax.xml.datatype.XMLGregorianCalendar" if there is an import for 
	 * javax.xml.datatype.XMLGregorianCalendar.
	 * @return
	 */
	String getFullyQualifiedTypeName();
		String FULLY_QUALIFIED_TYPE_NAME_PROPERTY = "fullyQualifiedTypeName"; //$NON-NLS-1$
}