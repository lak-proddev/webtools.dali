/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal.context.java;

import java.util.Arrays;
import org.eclipse.jpt.common.core.resource.java.Annotation;
import org.eclipse.jpt.common.utility.internal.StringTools;
import org.eclipse.jpt.common.utility.internal.iterables.CompositeIterable;
import org.eclipse.jpt.jpa.core.JpaFactory;
import org.eclipse.jpt.jpa.core.context.Converter;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaConverter;
import org.eclipse.jpt.jpa.core.internal.context.JptValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.java.AbstractJavaConverter;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkConvert;
import org.eclipse.jpt.jpa.eclipselink.core.context.persistence.EclipseLinkPersistenceUnit;
import org.eclipse.jpt.jpa.eclipselink.core.internal.context.EclipseLinkConvertValidator;
import org.eclipse.jpt.jpa.eclipselink.core.resource.java.EclipseLinkConvertAnnotation;

public class JavaEclipseLinkConvert
	extends AbstractJavaConverter
	implements EclipseLinkConvert
{
	private final EclipseLinkConvertAnnotation convertAnnotation;

	private String specifiedConverterName;
	private String defaultConverterName;


	public JavaEclipseLinkConvert(JavaAttributeMapping parent, EclipseLinkConvertAnnotation convertAnnotation, JavaConverter.Owner owner) {
		super(parent, owner);
		this.convertAnnotation = convertAnnotation;
		this.specifiedConverterName = convertAnnotation.getValue();
	}

	public EclipseLinkConvertAnnotation getConverterAnnotation() {
		return this.convertAnnotation;
	}

	// ********** synchronize/update **********

	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		this.setSpecifiedConverterName_(this.convertAnnotation.getValue());
	}

	@Override
	public void update() {
		super.update();
		this.setDefaultConverterName(this.buildDefaultConverterName());
	}


	// ********** converter name **********

	public String getConverterName() {
		return (this.specifiedConverterName != null) ? this.specifiedConverterName : this.defaultConverterName;
	}

	public String getSpecifiedConverterName() {
		return this.specifiedConverterName;
	}

	public void setSpecifiedConverterName(String name) {
		this.convertAnnotation.setValue(name);
		this.setSpecifiedConverterName_(name);
	}

	protected void setSpecifiedConverterName_(String name) {
		String old = this.specifiedConverterName;
		this.specifiedConverterName = name;
		this.firePropertyChanged(SPECIFIED_CONVERTER_NAME_PROPERTY, old, name);
	}

	public String getDefaultConverterName() {
		return this.defaultConverterName;
	}

	protected void setDefaultConverterName(String name) {
		String old = this.defaultConverterName;
		this.defaultConverterName = name;
		this.firePropertyChanged(DEFAULT_CONVERTER_NAME_PROPERTY, old, name);
	}

	protected String buildDefaultConverterName() {
		return DEFAULT_CONVERTER_NAME;
	}


	// ********** misc **********

	public Class<? extends Converter> getType() {
		return EclipseLinkConvert.class;
	}

	/**
	 * Return whether the convert is <em>virtual</em> and, as a result, does
	 * not have a converter.
	 */
	protected boolean isVirtual() {
		return this.getAttributeMapping().getPersistentAttribute().isVirtual();
	}


	// ********** Java completion proposals **********

	@Override
	public Iterable<String> getCompletionProposals(int pos) {
		Iterable<String> result = super.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		if (this.convertValueTouches(pos)) {
			result = this.getJavaCandidateConverterNames();
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	protected boolean convertValueTouches(int pos) {
		return this.convertAnnotation.valueTouches(pos);
	}

	protected Iterable<String> getJavaCandidateConverterNames() {
		return StringTools.convertToJavaStringLiterals(this.getConverterNames());
	}

	/**
	 * @return names of the user-defined converters and of reserved converters
	 */
	@SuppressWarnings("unchecked")
	protected Iterable<String> getConverterNames() {
		return new CompositeIterable<String>(
				this.getPersistenceUnit().getUniqueConverterNames(),
				Arrays.asList(EclipseLinkConvert.RESERVED_CONVERTER_NAMES)
				);
	}

	@Override
	public EclipseLinkPersistenceUnit getPersistenceUnit() {
		return (EclipseLinkPersistenceUnit) super.getPersistenceUnit();
	}


	// ********** adapter **********

	public static class Adapter
		extends JavaConverter.AbstractAdapter
	{
		private static final Adapter INSTANCE = new Adapter();
		public static Adapter instance() {
			return INSTANCE;
		}

		private Adapter() {
			super();
		}

		public Class<? extends Converter> getConverterType() {
			return EclipseLinkConvert.class;
		}

		@Override
		protected String getAnnotationName() {
			return EclipseLinkConvertAnnotation.ANNOTATION_NAME;
		}

		public JavaConverter buildConverter(Annotation converterAnnotation, JavaAttributeMapping parent, JpaFactory factory) {
			return new JavaEclipseLinkConvert(parent, (EclipseLinkConvertAnnotation) converterAnnotation, this.buildOwner());
		}
		
		@Override
		protected Owner buildOwner() {
			return new Owner() {
				public JptValidator buildValidator(Converter converter) {
					return new EclipseLinkConvertValidator((EclipseLinkConvert) converter);
				}
			};
		}
	}
}
