/*******************************************************************************
 * Copyright (c) 2011, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.wizards.orm;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jpt.jpa.core.internal.operations.OrmFileCreationDataModelProvider;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;

/**
 * This wizard will create a new mapping file without open it afterwards.
 * It is used within other wizards where opening mapping file is unnecessary,
 * therefore, making the whole process more smooth.
 * This wizard has one more attribute called <code> DEFAULT_XML_FILE_NAME </code>
 * used when the given XML file name is null to avoid NullPointerException.
 */

public class EmbeddedMappingFileWizard extends MappingFileWizard {
	
	
	public static final String DEFAULT_XML_FILE_NAME = "orm.xml";

	public EmbeddedMappingFileWizard() {
	}

	public EmbeddedMappingFileWizard(IDataModel dataModel) {
		super(dataModel);
	}

	@Override
	public final boolean performFinish() {
		return this.createMappingFile();
	}
	
	public static IPath createNewMappingFile(IStructuredSelection selection, String xmlFileName) {
		if (xmlFileName == null) {xmlFileName = DEFAULT_XML_FILE_NAME;} 
		EmbeddedMappingFileWizard wizard = new EmbeddedMappingFileWizard(DataModelFactory.createDataModel(new OrmFileCreationDataModelProvider()));
		return MappingFileWizard.createMappingFile(selection, xmlFileName, wizard);
	}
}