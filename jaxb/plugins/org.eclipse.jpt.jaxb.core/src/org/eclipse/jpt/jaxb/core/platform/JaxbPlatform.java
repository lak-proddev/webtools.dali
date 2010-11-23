/*******************************************************************************
 *  Copyright (c) 2010  Oracle. All rights reserved.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v1.0, which accompanies this distribution
 *  and is available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jaxb.core.platform;

import org.eclipse.core.resources.IFile;
import org.eclipse.jpt.core.utility.jdt.AnnotationEditFormatter;
import org.eclipse.jpt.jaxb.core.AnnotationProvider;
import org.eclipse.jpt.jaxb.core.JaxbFactory;
import org.eclipse.jpt.jaxb.core.JaxbFile;
import org.eclipse.jpt.jaxb.core.JaxbProject;

/**
 * Provisional API: This class is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 3.0
 * @since 3.0
 */
public interface JaxbPlatform {
	
	JaxbPlatformDescription getDescription();
	
	// ********** factory **********

	/**
	 * Return a factory responsible for creating core (e.g. JaxbProject), resource
	 * (e.g. PersistenceResource), and context (e.g. PersistenceUnit) model
	 * objects
	 */
	JaxbFactory getFactory();


	// ********** JAXB files **********

	/**
	 * Return a JAXB file corresponding to the specified Eclipse file.
	 * Return null if the file's content is unsupported.
	 */
	JaxbFile buildJaxbFile(JaxbProject jaxbProject, IFile file);


	// ********** Java annotations **********

	/**
	 * Return an annotation provider responsible for determining what Java
	 * annotations are supported and constructing java resource model objects.
	 */
	AnnotationProvider getAnnotationProvider();

	/**
	 * Return a formatter that can clean up the Java annotations added to source
	 * code.
	 */
	AnnotationEditFormatter getAnnotationEditFormatter();

}
