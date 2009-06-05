/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.context.orm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.jpt.core.context.XmlContextNode;
import org.eclipse.jpt.eclipselink.core.context.ConversionValue;
import org.eclipse.jpt.eclipselink.core.context.EclipseLinkConverter;
import org.eclipse.jpt.eclipselink.core.context.ObjectTypeConverter;
import org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmFactory;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlConversionValue;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlObjectTypeConverter;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterators.CloneIterator;
import org.eclipse.jpt.utility.internal.iterators.CloneListIterator;
import org.eclipse.jpt.utility.internal.iterators.TransformationListIterator;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public class EclipseLinkOrmObjectTypeConverter extends EclipseLinkOrmConverter<XmlObjectTypeConverter>
	implements ObjectTypeConverter
{	
	private String dataType;
	
	private String objectType;
	
	private final List<EclipseLinkOrmConversionValue> conversionValues;
	
	private String defaultObjectValue;
	
	
	public EclipseLinkOrmObjectTypeConverter(XmlContextNode parent) {
		super(parent);
		this.conversionValues = new ArrayList<EclipseLinkOrmConversionValue>();
	}
	
	public String getType() {
		return EclipseLinkConverter.OBJECT_TYPE_CONVERTER;
	}	
	
	// **************** data type **********************************************
	
	public String getDataType() {
		return this.dataType;
	}
	
	public void setDataType(String newDataType) {
		String oldDataType = this.dataType;
		this.dataType = newDataType;
		getXmlResource().setDataType(newDataType);
		firePropertyChanged(DATA_TYPE_PROPERTY, oldDataType, newDataType);
	}
	
	protected void setDataType_(String newDataType) {
		String oldDataType = this.dataType;
		this.dataType = newDataType;
		firePropertyChanged(DATA_TYPE_PROPERTY, oldDataType, newDataType);
	}
	
	
	// **************** object type ********************************************
	
	public String getObjectType() {
		return this.objectType;
	}
	
	public void setObjectType(String newObjectType) {
		String oldObjectType = this.objectType;
		this.objectType = newObjectType;
		getXmlResource().setObjectType(newObjectType);
		firePropertyChanged(OBJECT_TYPE_PROPERTY, oldObjectType, newObjectType);
	}
	
	protected void setObjectType_(String newObjectType) {
		String oldObjectType = this.objectType;
		this.objectType = newObjectType;
		firePropertyChanged(OBJECT_TYPE_PROPERTY, oldObjectType, newObjectType);
	}
	
	
	// **************** conversion values **************************************
	
	public ListIterator<EclipseLinkOrmConversionValue> conversionValues() {
		return new CloneListIterator<EclipseLinkOrmConversionValue>(this.conversionValues);
	}
	
	public int conversionValuesSize() {
		return this.conversionValues.size();
	}
	
	public EclipseLinkOrmConversionValue addConversionValue(int index) {
		XmlConversionValue resourceConversionValue = EclipseLinkOrmFactory.eINSTANCE.createXmlConversionValue();
		EclipseLinkOrmConversionValue contextConversionValue = buildConversionValue(resourceConversionValue);
		this.conversionValues.add(index, contextConversionValue);
		getXmlResource().getConversionValues().add(index, resourceConversionValue);
		fireItemAdded(CONVERSION_VALUES_LIST, index, contextConversionValue);
		return contextConversionValue;
	}
	
	public EclipseLinkOrmConversionValue addConversionValue() {
		return this.addConversionValue(this.conversionValues.size());
	}
	
	protected void addConversionValue(int index, EclipseLinkOrmConversionValue conversionValue) {
		addItemToList(index, conversionValue, this.conversionValues, CONVERSION_VALUES_LIST);
	}
	
	protected void addConversionValue(EclipseLinkOrmConversionValue conversionValue) {
		this.addConversionValue(this.conversionValues.size(), conversionValue);
	}
	
	public void removeConversionValue(int index) {
		EclipseLinkOrmConversionValue removedJoinColumn = this.conversionValues.remove(index);
		getXmlResource().getConversionValues().remove(index);
		fireItemRemoved(CONVERSION_VALUES_LIST, index, removedJoinColumn);
	}
	
	public void removeConversionValue(ConversionValue conversionValue) {
		this.removeConversionValue(this.conversionValues.indexOf(conversionValue));
	}
	
	protected void removeConversionValue_(ConversionValue conversionValue) {
		removeItemFromList(conversionValue, this.conversionValues, CONVERSION_VALUES_LIST);
	}
	
	public void moveConversionValue(int targetIndex, int sourceIndex) {
		CollectionTools.move(this.conversionValues, targetIndex, sourceIndex);
		getXmlResource().getConversionValues().move(targetIndex, sourceIndex);
		fireItemMoved(CONVERSION_VALUES_LIST, targetIndex, sourceIndex);		
	}
	
	public ListIterator<String> dataValues() {
		return new TransformationListIterator<EclipseLinkOrmConversionValue, String>(conversionValues()) {
			@Override
			protected String transform(EclipseLinkOrmConversionValue next) {
				return next.getDataValue();
			}
		};
	}
	
	
	// **************** default object value ***********************************
	
	public String getDefaultObjectValue() {
		return this.defaultObjectValue;
	}
	
	public void setDefaultObjectValue(String newDefaultObjectValue) {
		String oldDefaultObjectValue = this.defaultObjectValue;
		this.defaultObjectValue = newDefaultObjectValue;
		getXmlResource().setDefaultObjectValue(newDefaultObjectValue);
		firePropertyChanged(DEFAULT_OBJECT_VALUE_PROPERTY, oldDefaultObjectValue, newDefaultObjectValue);
	}
	
	protected void setDefaultObjectValue_(String newDefaultObjectValue) {
		String oldDefaultObjectValue = this.defaultObjectValue;
		this.defaultObjectValue = newDefaultObjectValue;
		firePropertyChanged(DEFAULT_OBJECT_VALUE_PROPERTY, oldDefaultObjectValue, newDefaultObjectValue);
	}
	
	
	// **************** resource interaction ***********************************
	
	@Override
	protected void initialize(XmlObjectTypeConverter xmlResource) {
		super.initialize(xmlResource);
		this.dataType = this.getResourceDataType();
		this.objectType = this.getResourceObjectType();
		this.defaultObjectValue = this.getResourceDefaultObjectValue();
		this.initializeConversionValues();
	}
	
	protected void initializeConversionValues() {	
		for (XmlConversionValue resourceConversionValue : getXmlResource().getConversionValues()) {
			this.conversionValues.add(buildConversionValue(resourceConversionValue));
		}
	}
	
	@Override
	public void update() {
		super.update();
		setDataType_(getResourceDataType());
		setObjectType_(getResourceObjectType());
		setDefaultObjectValue_(getResourceDefaultObjectValue());
		updateConversionValues();
	}
	
	protected void updateConversionValues( ) {
		// make a copy of the XML conversion values (to prevent ConcurrentModificationException)
		Iterator<XmlConversionValue> xmlConversionValues = new CloneIterator<XmlConversionValue>(this.getXmlResource().getConversionValues());
		
		for (Iterator<EclipseLinkOrmConversionValue> contextConversionValues = this.conversionValues(); contextConversionValues.hasNext(); ) {
			EclipseLinkOrmConversionValue contextConversionValue = contextConversionValues.next();
			if (xmlConversionValues.hasNext()) {
				contextConversionValue.update(xmlConversionValues.next());
			}
			else {
				removeConversionValue_(contextConversionValue);
			}
		}
		
		while (xmlConversionValues.hasNext()) {
			addConversionValue(buildConversionValue(xmlConversionValues.next()));
		}
	}
	
	protected EclipseLinkOrmConversionValue buildConversionValue(XmlConversionValue resourceConversionValue) {
		EclipseLinkOrmConversionValue conversionValue = new EclipseLinkOrmConversionValue(this);
		conversionValue.initialize(resourceConversionValue);
		return conversionValue;
	}
	
	protected String getResourceDataType() {
		return this.resourceConverter.getDataType();
	}

	protected String getResourceObjectType() {
		return this.resourceConverter.getObjectType();
	}

	protected String getResourceDefaultObjectValue() {
		return this.resourceConverter.getDefaultObjectValue();
	}
	
	
	// **************** validation *********************************************
	
	@Override
	public void validate(List<IMessage> messages, IReporter reporter) {
		super.validate(messages, reporter);
		for (Iterator<EclipseLinkOrmConversionValue> stream = conversionValues(); stream.hasNext();) {
			stream.next().validate(messages, reporter);
		}
	}
}