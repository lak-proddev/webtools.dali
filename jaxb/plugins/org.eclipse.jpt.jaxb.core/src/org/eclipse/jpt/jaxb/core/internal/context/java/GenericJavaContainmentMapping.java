/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.context.java;

import java.util.List;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.utility.Filter;
import org.eclipse.jpt.common.utility.internal.CollectionTools;
import org.eclipse.jpt.common.utility.internal.iterables.EmptyIterable;
import org.eclipse.jpt.jaxb.core.context.JaxbContainmentMapping;
import org.eclipse.jpt.jaxb.core.context.JaxbPersistentAttribute;
import org.eclipse.jpt.jaxb.core.context.JaxbSchemaComponentRef;
import org.eclipse.jpt.jaxb.core.context.XmlAdaptable;
import org.eclipse.jpt.jaxb.core.context.XmlAttachmentRef;
import org.eclipse.jpt.jaxb.core.context.XmlID;
import org.eclipse.jpt.jaxb.core.context.XmlIDREF;
import org.eclipse.jpt.jaxb.core.context.XmlJavaTypeAdapter;
import org.eclipse.jpt.jaxb.core.context.XmlList;
import org.eclipse.jpt.jaxb.core.context.XmlSchemaType;
import org.eclipse.jpt.jaxb.core.context.java.JavaContextNode;
import org.eclipse.jpt.jaxb.core.resource.java.JaxbContainmentAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.SchemaComponentRefAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlAttachmentRefAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlIDAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlIDREFAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlJavaTypeAdapterAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlListAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlSchemaTypeAnnotation;
import org.eclipse.jpt.jaxb.core.xsd.XsdSchema;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public abstract class GenericJavaContainmentMapping<A extends JaxbContainmentAnnotation>
		extends AbstractJavaAttributeMapping<A>
		implements JaxbContainmentMapping {
	
	protected final JaxbSchemaComponentRef schemaComponentRef;
	
	protected Boolean specifiedRequired;
	
	protected final XmlAdaptable xmlAdaptable;
	
	protected XmlSchemaType xmlSchemaType;
	
	protected XmlList xmlList;
	
	protected XmlID xmlID;
	
	protected XmlIDREF xmlIDREF;
	
	protected XmlAttachmentRef xmlAttachmentRef;
	
	
	public GenericJavaContainmentMapping(JaxbPersistentAttribute parent) {
		super(parent);
		this.schemaComponentRef = buildSchemaComponentRef();
		this.specifiedRequired = buildSpecifiedRequired();
		this.xmlAdaptable = buildXmlAdaptable();
		this.initializeXmlSchemaType();
		this.initializeXmlList();
		this.initializeXmlID();
		this.initializeXmlIDREF();
		this.initializeXmlAttachmentRef();
	}
	
	
	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		this.schemaComponentRef.synchronizeWithResourceModel();
		setSpecifiedRequired_(buildSpecifiedRequired());
		this.xmlAdaptable.synchronizeWithResourceModel();
		this.syncXmlSchemaType();
		this.syncXmlList();
		this.syncXmlID();
		this.syncXmlIDREF();
		this.syncXmlAttachmentRef();
	}
	
	@Override
	public void update() {
		super.update();
		this.schemaComponentRef.update();
		this.xmlAdaptable.update();
		this.updateXmlSchemaType();
		this.updateXmlList();
		this.updateXmlID();
		this.updateXmlIDREF();
		this.updateXmlAttachmentRef();
	}
	
	protected abstract JaxbSchemaComponentRef buildSchemaComponentRef();
	
	public JaxbSchemaComponentRef getSchemaComponentRef() {
		return this.schemaComponentRef;
	}
	
	//************ required ***************

	public boolean isRequired() {
		return (this.getSpecifiedRequired() == null) ? this.isDefaultRequired() : this.getSpecifiedRequired().booleanValue();
	}

	public boolean isDefaultRequired() {
		return DEFAULT_REQUIRED;
	}

	public Boolean getSpecifiedRequired() {
		return this.specifiedRequired;
	}

	public void setSpecifiedRequired(Boolean newSpecifiedRequired) {
		this.getOrCreateAnnotation().setRequired(newSpecifiedRequired);
		this.setSpecifiedRequired_(newSpecifiedRequired);
	}

	protected void setSpecifiedRequired_(Boolean newSpecifiedRequired) {
		Boolean oldRequired = this.specifiedRequired;
		this.specifiedRequired = newSpecifiedRequired;
		firePropertyChanged(SPECIFIED_REQUIRED_PROPERTY, oldRequired, newSpecifiedRequired);
	}

	protected Boolean buildSpecifiedRequired() {
		return getAnnotation() == null ? null : getAnnotation().getRequired();
	}


	//****************** XmlJavaTypeAdapter *********************

	public XmlAdaptable buildXmlAdaptable() {
		return new GenericJavaXmlAdaptable(this, new XmlAdaptable.Owner() {
			public JavaResourceAnnotatedElement getResource() {
				return getJavaResourceAttribute();
			}
			public XmlJavaTypeAdapter buildXmlJavaTypeAdapter(XmlJavaTypeAdapterAnnotation adapterAnnotation) {
				return GenericJavaContainmentMapping.this.buildXmlJavaTypeAdapter(adapterAnnotation);
			}
			public void fireXmlAdapterChanged(XmlJavaTypeAdapter oldAdapter, XmlJavaTypeAdapter newAdapter) {
				GenericJavaContainmentMapping.this.firePropertyChanged(XML_JAVA_TYPE_ADAPTER_PROPERTY, oldAdapter, newAdapter);
			}
		});
	}

	public XmlJavaTypeAdapter getXmlJavaTypeAdapter() {
		return this.xmlAdaptable.getXmlJavaTypeAdapter();
	}

	public XmlJavaTypeAdapter addXmlJavaTypeAdapter() {
		return this.xmlAdaptable.addXmlJavaTypeAdapter();
	}

	protected XmlJavaTypeAdapter buildXmlJavaTypeAdapter(XmlJavaTypeAdapterAnnotation xmlJavaTypeAdapterAnnotation) {
		return new GenericJavaAttributeXmlJavaTypeAdapter(this, xmlJavaTypeAdapterAnnotation);
	}

	public void removeXmlJavaTypeAdapter() {
		this.xmlAdaptable.removeXmlJavaTypeAdapter();
	}

	//****************** XmlSchemaType *********************

	public XmlSchemaType getXmlSchemaType() {
		return this.xmlSchemaType;
	}

	protected void setXmlSchemaType_(XmlSchemaType xmlSchemaType) {
		XmlSchemaType oldXmlSchemaType = this.xmlSchemaType;
		this.xmlSchemaType = xmlSchemaType;
		this.firePropertyChanged(XML_SCHEMA_TYPE, oldXmlSchemaType, xmlSchemaType);
	}

	public boolean hasXmlSchemaType() {
		return this.xmlSchemaType != null;
	}

	public XmlSchemaType addXmlSchemaType() {
		if (this.xmlSchemaType != null) {
			throw new IllegalStateException();
		}
		XmlSchemaTypeAnnotation annotation = (XmlSchemaTypeAnnotation) this.getJavaResourceAttribute().addAnnotation(0, XmlSchemaTypeAnnotation.ANNOTATION_NAME);

		XmlSchemaType xmlJavaTypeAdapter = this.buildXmlSchemaType(annotation);
		this.setXmlSchemaType_(xmlJavaTypeAdapter);
		return xmlJavaTypeAdapter;
	}

	public void removeXmlSchemaType() {
		if (this.xmlSchemaType == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(XmlSchemaTypeAnnotation.ANNOTATION_NAME);
		this.setXmlSchemaType_(null);
	}

	protected XmlSchemaType buildXmlSchemaType(XmlSchemaTypeAnnotation annotation) {
		return new GenericJavaContainmentMappingXmlSchemaType(this, annotation);
	}

	protected XmlSchemaTypeAnnotation getXmlSchemaTypeAnnotation() {
		return (XmlSchemaTypeAnnotation) this.getJavaResourceAttribute().getAnnotation(0, XmlSchemaTypeAnnotation.ANNOTATION_NAME);
	}

	protected void initializeXmlSchemaType() {
		XmlSchemaTypeAnnotation annotation = this.getXmlSchemaTypeAnnotation();
		if (annotation != null) {
			this.xmlSchemaType = this.buildXmlSchemaType(annotation);
		}		
	}

	protected void updateXmlSchemaType() {
		if (this.xmlSchemaType != null) {
			this.xmlSchemaType.update();
		}
	}

	protected void syncXmlSchemaType() {
		XmlSchemaTypeAnnotation annotation = this.getXmlSchemaTypeAnnotation();
		if (annotation != null) {
			if (this.getXmlSchemaType() != null) {
				this.getXmlSchemaType().synchronizeWithResourceModel();
			}
			else {
				this.setXmlSchemaType_(this.buildXmlSchemaType(annotation));
			}
		}
		else {
			this.setXmlSchemaType_(null);
		}
	}

	//************  XmlList ***************

	public XmlList getXmlList() {
		return this.xmlList;
	}

	public XmlList addXmlList() {
		if (this.xmlList != null) {
			throw new IllegalStateException();
		}
		XmlListAnnotation annotation = (XmlListAnnotation) this.getJavaResourceAttribute().addAnnotation(XmlListAnnotation.ANNOTATION_NAME);

		XmlList xmlList = this.buildXmlList(annotation);
		this.setXmlList_(xmlList);
		return xmlList;
	}

	protected XmlList buildXmlList(XmlListAnnotation xmlListAnnotation) {
		return new GenericJavaXmlList(this, xmlListAnnotation);
	}

	public void removeXmlList() {
		if (this.xmlList == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(XmlListAnnotation.ANNOTATION_NAME);
		this.setXmlList_(null);
	}

	protected void initializeXmlList() {
		XmlListAnnotation annotation = this.getXmlListAnnotation();
		if (annotation != null) {
			this.xmlList = this.buildXmlList(annotation);
		}
	}

	protected XmlListAnnotation getXmlListAnnotation() {
		return (XmlListAnnotation) this.getJavaResourceAttribute().getAnnotation(XmlListAnnotation.ANNOTATION_NAME);
	}

	protected void syncXmlList() {
		XmlListAnnotation annotation = this.getXmlListAnnotation();
		if (annotation != null) {
			if (this.getXmlList() != null) {
				this.getXmlList().synchronizeWithResourceModel();
			}
			else {
				this.setXmlList_(this.buildXmlList(annotation));
			}
		}
		else {
			this.setXmlList_(null);
		}
	}

	protected void updateXmlList() {
		if (this.getXmlList() != null) {
			this.getXmlList().update();
		}
	}

	protected void setXmlList_(XmlList xmlList) {
		XmlList oldXmlList = this.xmlList;
		this.xmlList = xmlList;
		firePropertyChanged(XML_LIST_PROPERTY, oldXmlList, xmlList);
	}


	//************  XmlID ***************

	public XmlID getXmlID() {
		return this.xmlID;
	}

	public XmlID addXmlID() {
		if (this.xmlID != null) {
			throw new IllegalStateException();
		}
		XmlIDAnnotation annotation = (XmlIDAnnotation) this.getJavaResourceAttribute().addAnnotation(XmlIDAnnotation.ANNOTATION_NAME);

		XmlID xmlID = this.buildXmlID(annotation);
		this.setXmlID_(xmlID);
		return xmlID;
	}

	protected XmlID buildXmlID(XmlIDAnnotation xmlIDAnnotation) {
		return new GenericJavaXmlID(this, xmlIDAnnotation);
	}

	public void removeXmlID() {
		if (this.xmlID == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(XmlIDAnnotation.ANNOTATION_NAME);
		this.setXmlID_(null);
	}

	protected void initializeXmlID() {
		XmlIDAnnotation annotation = this.getXmlIDAnnotation();
		if (annotation != null) {
			this.xmlID = this.buildXmlID(annotation);
		}
	}

	protected XmlIDAnnotation getXmlIDAnnotation() {
		return (XmlIDAnnotation) this.getJavaResourceAttribute().getAnnotation(XmlIDAnnotation.ANNOTATION_NAME);
	}

	protected void syncXmlID() {
		XmlIDAnnotation annotation = this.getXmlIDAnnotation();
		if (annotation != null) {
			if (this.getXmlID() != null) {
				this.getXmlID().synchronizeWithResourceModel();
			}
			else {
				this.setXmlID_(this.buildXmlID(annotation));
			}
		}
		else {
			this.setXmlID_(null);
		}
	}

	protected void updateXmlID() {
		if (this.getXmlID() != null) {
			this.getXmlID().update();
		}
	}

	protected void setXmlID_(XmlID xmlID) {
		XmlID oldXmlID = this.xmlID;
		this.xmlID = xmlID;
		firePropertyChanged(XML_ID_PROPERTY, oldXmlID, xmlID);
	}

	
	//************  XmlIDREF ***************

	public XmlIDREF getXmlIDREF() {
		return this.xmlIDREF;
	}

	public XmlIDREF addXmlIDREF() {
		if (this.xmlIDREF != null) {
			throw new IllegalStateException();
		}
		XmlIDREFAnnotation annotation = (XmlIDREFAnnotation) this.getJavaResourceAttribute().addAnnotation(XmlIDREFAnnotation.ANNOTATION_NAME);

		XmlIDREF xmlIDREF = this.buildXmlIDREF(annotation);
		this.setXmlIDREF_(xmlIDREF);
		return xmlIDREF;
	}

	protected XmlIDREF buildXmlIDREF(XmlIDREFAnnotation xmlIDREFAnnotation) {
		return new GenericJavaXmlIDREF(this, xmlIDREFAnnotation);
	}

	public void removeXmlIDREF() {
		if (this.xmlIDREF == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(XmlIDREFAnnotation.ANNOTATION_NAME);
		this.setXmlIDREF_(null);
	}

	protected void initializeXmlIDREF() {
		XmlIDREFAnnotation annotation = this.getXmlIDREFAnnotation();
		if (annotation != null) {
			this.xmlIDREF = this.buildXmlIDREF(annotation);
		}
	}

	protected XmlIDREFAnnotation getXmlIDREFAnnotation() {
		return (XmlIDREFAnnotation) this.getJavaResourceAttribute().getAnnotation(XmlIDREFAnnotation.ANNOTATION_NAME);
	}

	protected void syncXmlIDREF() {
		XmlIDREFAnnotation annotation = this.getXmlIDREFAnnotation();
		if (annotation != null) {
			if (this.getXmlIDREF() != null) {
				this.getXmlIDREF().synchronizeWithResourceModel();
			}
			else {
				this.setXmlIDREF_(this.buildXmlIDREF(annotation));
			}
		}
		else {
			this.setXmlIDREF_(null);
		}
	}

	protected void updateXmlIDREF() {
		if (this.getXmlIDREF() != null) {
			this.getXmlIDREF().update();
		}
	}

	protected void setXmlIDREF_(XmlIDREF xmlIDREF) {
		XmlIDREF oldXmlIDREF = this.xmlIDREF;
		this.xmlIDREF = xmlIDREF;
		firePropertyChanged(XML_IDREF_PROPERTY, oldXmlIDREF, xmlIDREF);
	}


	//************  XmlAttachmentRef ***************

	public XmlAttachmentRef getXmlAttachmentRef() {
		return this.xmlAttachmentRef;
	}

	public XmlAttachmentRef addXmlAttachmentRef() {
		if (this.xmlAttachmentRef != null) {
			throw new IllegalStateException();
		}
		XmlAttachmentRefAnnotation annotation = (XmlAttachmentRefAnnotation) this.getJavaResourceAttribute().addAnnotation(XmlAttachmentRefAnnotation.ANNOTATION_NAME);

		XmlAttachmentRef xmlAttachmentRef = this.buildXmlAttachmentRef(annotation);
		this.setXmlAttachmentRef_(xmlAttachmentRef);
		return xmlAttachmentRef;
	}

	protected XmlAttachmentRef buildXmlAttachmentRef(XmlAttachmentRefAnnotation xmlAttachmentRefAnnotation) {
		return new GenericJavaXmlAttachmentRef(this, xmlAttachmentRefAnnotation);
	}

	public void removeXmlAttachmentRef() {
		if (this.xmlAttachmentRef == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(XmlAttachmentRefAnnotation.ANNOTATION_NAME);
		this.setXmlAttachmentRef_(null);
	}

	protected void initializeXmlAttachmentRef() {
		XmlAttachmentRefAnnotation annotation = this.getXmlAttachmentRefAnnotation();
		if (annotation != null) {
			this.xmlAttachmentRef = this.buildXmlAttachmentRef(annotation);
		}
	}

	protected XmlAttachmentRefAnnotation getXmlAttachmentRefAnnotation() {
		return (XmlAttachmentRefAnnotation) this.getJavaResourceAttribute().getAnnotation(XmlAttachmentRefAnnotation.ANNOTATION_NAME);
	}

	protected void syncXmlAttachmentRef() {
		XmlAttachmentRefAnnotation annotation = this.getXmlAttachmentRefAnnotation();
		if (annotation != null) {
			if (this.getXmlAttachmentRef() != null) {
				this.getXmlAttachmentRef().synchronizeWithResourceModel();
			}
			else {
				this.setXmlAttachmentRef_(this.buildXmlAttachmentRef(annotation));
			}
		}
		else {
			this.setXmlAttachmentRef_(null);
		}
	}

	protected void updateXmlAttachmentRef() {
		if (this.getXmlAttachmentRef() != null) {
			this.getXmlAttachmentRef().update();
		}
	}

	protected void setXmlAttachmentRef_(XmlAttachmentRef xmlAttachmentRef) {
		XmlAttachmentRef oldXmlAttachmentRef = this.xmlAttachmentRef;
		this.xmlAttachmentRef = xmlAttachmentRef;
		firePropertyChanged(XML_ATTACHMENT_REF_PROPERTY, oldXmlAttachmentRef, xmlAttachmentRef);
	}
	
	
	// **************** content assist **************

	@Override
	public Iterable<String> getJavaCompletionProposals(int pos, Filter<String> filter, CompilationUnit astRoot) {
		Iterable<String> result = super.getJavaCompletionProposals(pos, filter, astRoot);
		if (! CollectionTools.isEmpty(result)) {
			return result;
		}
		
		result = this.schemaComponentRef.getJavaCompletionProposals(pos, filter, astRoot);
		if (! CollectionTools.isEmpty(result)) {
			return result;
		}
		
		if (this.xmlSchemaType != null) {
			result = this.xmlSchemaType.getJavaCompletionProposals(pos, filter, astRoot);
			if (! CollectionTools.isEmpty(result)) {
				return result;
			}
		}
		
		return EmptyIterable.instance();
	}
	

	// ********** validation **********

	@Override
	public void validate(List<IMessage> messages, IReporter reporter, CompilationUnit astRoot) {
		super.validate(messages, reporter, astRoot);
		
		this.schemaComponentRef.validate(messages, reporter, astRoot);
		
		this.xmlAdaptable.validate(messages, reporter, astRoot);
		
		if (this.xmlSchemaType != null) {
			this.xmlSchemaType.validate(messages, reporter, astRoot);
		}
		
		if (this.xmlList != null) {
			this.xmlList.validate(messages, reporter, astRoot);
		}
		
		if (this.xmlID != null) {
			this.xmlID.validate(messages, reporter, astRoot);
		}
		
		if (this.xmlIDREF != null) {
			this.xmlIDREF.validate(messages, reporter, astRoot);
		}
		
		if (this.xmlAttachmentRef != null) {
			this.xmlAttachmentRef.validate(messages, reporter, astRoot);
		}
	}
	
	
	protected abstract class ContainmentMappingSchemaComponentRef
			extends AbstractJavaSchemaComponentRef {
		
		protected ContainmentMappingSchemaComponentRef(JavaContextNode parent) {
			super(parent);
		}
		
		
		@Override
		protected SchemaComponentRefAnnotation getAnnotation(boolean createIfNull) {
			if (createIfNull) {
				return GenericJavaContainmentMapping.this.getOrCreateAnnotation();
			}
			else {
				return GenericJavaContainmentMapping.this.getAnnotation();
			}
		}
		
		@Override
		public String getDefaultName() {
			return GenericJavaContainmentMapping.this.getJavaResourceAttribute().getName();
		}
		
		@Override
		public Iterable<String> getNamespaceProposals(Filter<String> filter) {
			XsdSchema schema = GenericJavaContainmentMapping.this.getJaxbPackage().getXsdSchema();
			return (schema == null) ? EmptyIterable.<String>instance() : schema.getNamespaceProposals(filter);
		}
	}
}
