/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt2_0.core.resource.orm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jpt.core.internal.resource.xml.translators.SimpleTranslator;
import org.eclipse.wst.common.internal.emf.resource.Translator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.jpt2_0.core.resource.orm.Orm2_0Package#getXmlEmbeddable()
 * @model kind="class"
 * @generated
 */
public class XmlEmbeddable extends org.eclipse.jpt.core.resource.orm.XmlEmbeddable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlEmbeddable()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Orm2_0Package.Literals.XML_EMBEDDABLE;
	}
	// ********** translators **********

	public static Translator buildTranslator(String elementName, EStructuralFeature structuralFeature) {
		return new SimpleTranslator(
			elementName, 
			structuralFeature, 
			Orm2_0Package.eINSTANCE.getXmlEmbeddable(), 
			buildTranslatorChildren());
	}

	private static Translator[] buildTranslatorChildren() {
		return new Translator[] {
			buildClassTranslator(),
			buildAccessTranslator(),
			buildMetadataCompleteTranslator(),
			buildDescriptionTranslator(),
			Attributes.buildTranslator()
		};
	}

} // XmlEmbeddable
