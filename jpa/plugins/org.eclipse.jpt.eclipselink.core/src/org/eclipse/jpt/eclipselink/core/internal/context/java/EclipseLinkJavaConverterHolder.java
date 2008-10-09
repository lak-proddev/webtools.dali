/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.context.java;

import java.util.List;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.context.java.JavaTypeMapping;
import org.eclipse.jpt.core.internal.context.java.AbstractJavaJpaContextNode;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.eclipselink.core.EclipseLinkJpaFactory;
import org.eclipse.jpt.eclipselink.core.context.java.JavaConverter;
import org.eclipse.jpt.eclipselink.core.context.java.JavaObjectTypeConverter;
import org.eclipse.jpt.eclipselink.core.context.java.JavaStructConverter;
import org.eclipse.jpt.eclipselink.core.context.java.JavaTypeConverter;
import org.eclipse.jpt.eclipselink.core.context.java.JavaConverterHolder;
import org.eclipse.jpt.eclipselink.core.resource.java.ConverterAnnotation;
import org.eclipse.jpt.eclipselink.core.resource.java.ObjectTypeConverterAnnotation;
import org.eclipse.jpt.eclipselink.core.resource.java.StructConverterAnnotation;
import org.eclipse.jpt.eclipselink.core.resource.java.TypeConverterAnnotation;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

public class EclipseLinkJavaConverterHolder extends AbstractJavaJpaContextNode implements JavaConverterHolder
{
	protected JavaResourcePersistentType resourcePersistentType;
	
	protected JavaConverter converter;
	protected JavaObjectTypeConverter objectTypeConverter;
	protected JavaStructConverter structConverter;
	protected JavaTypeConverter typeConverter;
	
	public EclipseLinkJavaConverterHolder(JavaTypeMapping parent) {
		super(parent);
	}
	
	@Override
	protected EclipseLinkJpaFactory getJpaFactory() {
		return (EclipseLinkJpaFactory) super.getJpaFactory();
	}	
	
	//************** converter *************
	public JavaConverter getConverter() {
		return this.converter;
	}
	
	public JavaConverter addConverter() {
		if (this.converter != null) {
			throw new IllegalStateException("converter already exists"); //$NON-NLS-1$
		}
		this.converter = getJpaFactory().buildJavaConverter(this, this.resourcePersistentType);
		this.addResourceConverter();
		firePropertyChanged(CONVERTER_PROPERTY, null, this.converter);
		return this.converter;
	}
	
	protected void addConverter_() {
		this.converter = getJpaFactory().buildJavaConverter(this, this.resourcePersistentType);			
		firePropertyChanged(CONVERTER_PROPERTY, null, this.converter);
	}
	
	public void removeConverter() {
		if (this.converter == null) {
			throw new IllegalStateException("converter is null"); //$NON-NLS-1$			
		}
		JavaConverter oldConverter = this.converter;
		this.converter = null;
		removeResourceConverter();
		firePropertyChanged(CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected void removeConverter_() {
		this.converter = null;
		firePropertyChanged(CONVERTER_PROPERTY, this.converter, null);
	}
	
	protected String getConverterAnnotationName() {
		return ConverterAnnotation.ANNOTATION_NAME;
	}
	
	protected ConverterAnnotation getResourceConverter() {
		return (ConverterAnnotation) this.resourcePersistentType.getAnnotation(getConverterAnnotationName());
	}
	
	protected void removeResourceConverter() {
		this.resourcePersistentType.removeAnnotation(getConverterAnnotationName());
	}
	
	protected void addResourceConverter() {
		this.resourcePersistentType.addAnnotation(getConverterAnnotationName());
	}
	
	
	//************** object type converter *************
	public JavaObjectTypeConverter getObjectTypeConverter() {
		return this.objectTypeConverter;
	}
	
	public JavaObjectTypeConverter addObjectTypeConverter() {
		if (this.objectTypeConverter != null) {
			throw new IllegalStateException("object type converter already exists"); //$NON-NLS-1$
		}
		this.objectTypeConverter = getJpaFactory().buildJavaObjectTypeConverter(this, this.resourcePersistentType);
		this.addResourceObjectTypeConverter();
		firePropertyChanged(OBJECT_TYPE_CONVERTER_PROPERTY, null, this.objectTypeConverter);
		return this.objectTypeConverter;
	}
	
	protected void addObjectTypeConverter_() {
		this.objectTypeConverter = getJpaFactory().buildJavaObjectTypeConverter(this, this.resourcePersistentType);			
		firePropertyChanged(OBJECT_TYPE_CONVERTER_PROPERTY, null, this.objectTypeConverter);
	}
	
	public void removeObjectTypeConverter() {
		if (this.objectTypeConverter == null) {
			throw new IllegalStateException("object type converter is null"); //$NON-NLS-1$			
		}
		JavaObjectTypeConverter oldConverter = this.objectTypeConverter;
		this.objectTypeConverter = null;
		removeResourceObjectTypeConverter();
		firePropertyChanged(OBJECT_TYPE_CONVERTER_PROPERTY, oldConverter, null);
	}

	protected void removeObjectTypeConverter_() {
		JavaObjectTypeConverter oldConverter = this.objectTypeConverter;
		this.objectTypeConverter = null;
		firePropertyChanged(OBJECT_TYPE_CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected String getObjectTypeConverterAnnotationName() {
		return ObjectTypeConverterAnnotation.ANNOTATION_NAME;
	}
	
	protected ObjectTypeConverterAnnotation getResourceObjectTypeConverter() {
		return (ObjectTypeConverterAnnotation) this.resourcePersistentType.getAnnotation(getObjectTypeConverterAnnotationName());
	}
	
	protected void removeResourceObjectTypeConverter() {
		this.resourcePersistentType.removeAnnotation(getObjectTypeConverterAnnotationName());
	}
	
	protected void addResourceObjectTypeConverter() {
		this.resourcePersistentType.addAnnotation(getObjectTypeConverterAnnotationName());
	}
	
	
	//************** type converter *************
	public JavaTypeConverter getTypeConverter() {
		return this.typeConverter;
	}
	
	public JavaTypeConverter addTypeConverter() {
		if (this.typeConverter != null) {
			throw new IllegalStateException("type converter already exists"); //$NON-NLS-1$
		}
		this.typeConverter = getJpaFactory().buildJavaTypeConverter(this, this.resourcePersistentType);
		this.addResourceTypeConverter();
		firePropertyChanged(TYPE_CONVERTER_PROPERTY, null, this.typeConverter);
		return this.typeConverter;
	}
	
	protected void addTypeConverter_() {
		this.typeConverter = getJpaFactory().buildJavaTypeConverter(this, this.resourcePersistentType);			
		firePropertyChanged(TYPE_CONVERTER_PROPERTY, null, this.typeConverter);
	}
	
	public void removeTypeConverter() {
		if (this.typeConverter == null) {
			throw new IllegalStateException("type converter is null"); //$NON-NLS-1$			
		}
		JavaTypeConverter oldConverter = this.typeConverter;
		this.typeConverter = null;
		removeResourceTypeConverter();
		firePropertyChanged(TYPE_CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected void removeTypeConverter_() {
		JavaTypeConverter oldConverter = this.typeConverter;
		this.typeConverter = null;
		firePropertyChanged(TYPE_CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected String getTypeConverterAnnotationName() {
		return TypeConverterAnnotation.ANNOTATION_NAME;
	}
	
	protected TypeConverterAnnotation getResourceTypeConverter() {
		return (TypeConverterAnnotation) this.resourcePersistentType.getAnnotation(getTypeConverterAnnotationName());
	}
	
	protected void removeResourceTypeConverter() {
		this.resourcePersistentType.removeAnnotation(getTypeConverterAnnotationName());
	}
	
	protected void addResourceTypeConverter() {
		this.resourcePersistentType.addAnnotation(getTypeConverterAnnotationName());
	}
	
	
	//************** struct converter *************
	public JavaStructConverter getStructConverter() {
		return this.structConverter;
	}
	
	public JavaStructConverter addStructConverter() {
		if (this.structConverter != null) {
			throw new IllegalStateException("struct converter already exists"); //$NON-NLS-1$
		}
		this.structConverter = getJpaFactory().buildJavaStructConverter(this, this.resourcePersistentType);
		this.addResourceStructConverter();
		firePropertyChanged(STRUCT_CONVERTER_PROPERTY, null, this.structConverter);
		return this.structConverter;
	}
	
	protected void addStructConverter_() {
		this.structConverter = getJpaFactory().buildJavaStructConverter(this, this.resourcePersistentType);			
		firePropertyChanged(STRUCT_CONVERTER_PROPERTY, null, this.structConverter);
	}
	
	public void removeStructConverter() {
		if (this.structConverter == null) {
			throw new IllegalStateException("struct converter is null"); //$NON-NLS-1$			
		}
		JavaStructConverter oldConverter = this.structConverter;
		this.structConverter = null;
		removeResourceStructConverter();
		firePropertyChanged(STRUCT_CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected void removeStructConverter_() {
		JavaStructConverter oldConverter = this.structConverter;
		this.structConverter = null;
		firePropertyChanged(STRUCT_CONVERTER_PROPERTY, oldConverter, null);
	}
	
	protected String getStructConverterAnnotationName() {
		return StructConverterAnnotation.ANNOTATION_NAME;
	}
	
	protected StructConverterAnnotation getResourceStructConverter() {
		return (StructConverterAnnotation) this.resourcePersistentType.getAnnotation(getStructConverterAnnotationName());
	}
	
	protected void removeResourceStructConverter() {
		this.resourcePersistentType.removeAnnotation(getStructConverterAnnotationName());
	}
	
	protected void addResourceStructConverter() {
		this.resourcePersistentType.addAnnotation(getStructConverterAnnotationName());
	}
	
	public void update(JavaResourcePersistentType jrpt) {
		this.resourcePersistentType = jrpt;
		this.updateConverter();
		this.updateObjectTypeConverter();
		this.updateTypeConverter();
		this.updateStructConverter();
	}
	
	protected void updateConverter() {
		if (getResourceConverter() != null) {
			if (this.converter != null) {
				this.converter.update(this.resourcePersistentType);
			}
			else {
				addConverter_();
			}
		}
		else {
			if (this.converter != null) {
				removeConverter_();
			}
		}	
	}
	
	protected void updateObjectTypeConverter() {
		if (getResourceObjectTypeConverter() != null) {
			if (this.objectTypeConverter != null) {
				this.objectTypeConverter.update(this.resourcePersistentType);
			}
			else {
				addObjectTypeConverter_();
			}
		}
		else {
			if (this.objectTypeConverter != null) {
				removeObjectTypeConverter_();
			}
		}	
	}
	
	protected void updateTypeConverter() {
		if (getResourceTypeConverter() != null) {
			if (this.typeConverter != null) {
				this.typeConverter.update(this.resourcePersistentType);
			}
			else {
				addTypeConverter_();
			}
		}
		else {
			if (this.typeConverter != null) {
				removeTypeConverter();
			}
		}	
	}
	
	protected void updateStructConverter() {
		if (getResourceStructConverter() != null) {
			if (this.structConverter != null) {
				this.structConverter.update(this.resourcePersistentType);
			}
			else {
				addStructConverter_();
			}
		}
		else {
			if (this.structConverter != null) {
				removeStructConverter_();
			}
		}	
	}
	
	public void initialize(JavaResourcePersistentType jrpt) {
		this.resourcePersistentType = jrpt;
		this.initializeConverter();
		this.initializeObjectTypeConverter();
		this.initializeTypeConverter();
		this.initializeStructConverter();
	}
	
	protected void initializeConverter() {
		if (getResourceConverter() != null) {
			this.converter = getJpaFactory().buildJavaConverter(this, this.resourcePersistentType);
		}		
	}
	
	protected void initializeObjectTypeConverter() {
		if (getResourceObjectTypeConverter() != null) {
			this.objectTypeConverter = getJpaFactory().buildJavaObjectTypeConverter(this, this.resourcePersistentType);
		}		
	}
	
	protected void initializeTypeConverter() {
		if (getResourceTypeConverter() != null) {
			this.typeConverter = getJpaFactory().buildJavaTypeConverter(this, this.resourcePersistentType);
		}		
	}
	
	protected void initializeStructConverter() {
		if (getResourceStructConverter() != null) {
			this.structConverter = getJpaFactory().buildJavaStructConverter(this, this.resourcePersistentType);
		}		
	}

	public TextRange getValidationTextRange(CompilationUnit astRoot) {
		return this.resourcePersistentType.getTextRange(astRoot);
	}
	
	@Override
	public void validate(List<IMessage> messages, CompilationUnit astRoot) {
		super.validate(messages, astRoot);
		if (this.converter != null) {
			this.converter.validate(messages, astRoot);
		}
		if (this.objectTypeConverter != null) {
			this.objectTypeConverter.validate(messages, astRoot);
		}
		if (this.typeConverter != null) {
			this.typeConverter.validate(messages, astRoot);
		}
		if (this.structConverter != null) {
			this.structConverter.validate(messages, astRoot);
		}
	}
	
}
