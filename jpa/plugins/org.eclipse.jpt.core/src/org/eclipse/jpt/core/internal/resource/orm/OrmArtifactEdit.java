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
package org.eclipse.jpt.core.internal.resource.orm;

import java.io.IOException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jpt.core.internal.JptCorePlugin;
import org.eclipse.jpt.core.internal.resource.common.JpaArtifactEdit;

public class OrmArtifactEdit extends JpaArtifactEdit
{
	/**
	 * @param aProject
	 * @return an orm artifact for the project aProject.
	 * Opened only for read access (no write)
	 */
	public static OrmArtifactEdit getArtifactEditForRead(IProject aProject) {
		OrmArtifactEdit artifactEdit = null;
		try {
			artifactEdit = new OrmArtifactEdit(aProject, true);
		} 
		catch (IllegalArgumentException iae) {
            // suppress illegal argument exception
            JptCorePlugin.log(iae);
		}
		return artifactEdit;
	}
	
    /**
	 * @param aProject
	 * @return an orm artifact for the project aProject.
     * Opened for both write and read access
     */	
	public static OrmArtifactEdit getArtifactEditForWrite(IProject aProject) {
		OrmArtifactEdit artifactEdit = null;
		try {
			artifactEdit = new OrmArtifactEdit(aProject, false);
		} 
		catch (IllegalArgumentException iae) {
            // suppress illegal argument exception
            JptCorePlugin.log(iae);
		}
		return artifactEdit;
	}
	
    
	public OrmArtifactEdit(IProject aProject, boolean toAccessAsReadOnly) 
			throws IllegalArgumentException {
		super(aProject, toAccessAsReadOnly);
	}
	
	
	@Override
	public OrmResource getResource(IFile file) {
		// This *seems* to do the same basic thing as below, but circumvents the
		// URI munging that ArtifactEditModel does (see bug 209093)
		try {
			OrmResource resource = 
					(OrmResource) getArtifactEditModel().createResource(URI.createPlatformResourceURI(file.getFullPath().toString()));
			if (! resource.isLoaded()) {
				resource.load(getArtifactEditModel().getResourceSet().getLoadOptions());
			}
			return resource;
		}
		catch (ClassCastException cce) {
			return null;
		}
		catch (IOException ioe) {
			JptCorePlugin.log(ioe);
			return null;
		}
	}
	
	@Override
	public OrmResource getResource(String fileURI) {
		try {
			return (OrmResource) getArtifactEditModel().getResource(URI.createURI(fileURI));
		}
		catch (ClassCastException cce) {
			return null;
		}
	}
}
