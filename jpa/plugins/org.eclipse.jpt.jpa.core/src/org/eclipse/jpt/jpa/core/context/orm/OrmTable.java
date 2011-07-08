/*******************************************************************************
 * Copyright (c) 2008, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.context.orm;

import java.util.ListIterator;
import org.eclipse.jpt.jpa.core.context.Table;

/**
 * <code>orm.xml</code> table
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.2
 * @since 2.0
 */
public interface OrmTable
	extends Table, OrmReadOnlyTable
{
	ListIterator<OrmUniqueConstraint> uniqueConstraints();
	OrmUniqueConstraint getUniqueConstraint(int index);
	OrmUniqueConstraint addUniqueConstraint();
	OrmUniqueConstraint addUniqueConstraint(int index);
}
