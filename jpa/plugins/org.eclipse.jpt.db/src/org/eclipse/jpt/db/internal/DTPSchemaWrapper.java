/*******************************************************************************
 * Copyright (c) 2006, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.db.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;

import org.eclipse.jpt.db.Schema;
import org.eclipse.jpt.db.Sequence;
import org.eclipse.jpt.db.Table;
import org.eclipse.jpt.utility.internal.ArrayTools;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;
import org.eclipse.jpt.utility.internal.iterators.TransformationIterator;

import com.ibm.icu.text.Collator;

/**
 *  Wrap a DTP Schema
 */
final class DTPSchemaWrapper
	extends DTPDatabaseObjectWrapper
	implements Schema
{
	// the wrapped DTP schema
	private final org.eclipse.datatools.modelbase.sql.schema.Schema dtpSchema;

	// lazy-initialized
	private DTPTableWrapper[] tables;

	// lazy-initialized
	private DTPSequenceWrapper[] sequences;

	
	// ********** constants **********
	
	//used for adopter product customization
	private static final String PERSISTENT_AND_VIEW_TABLES_ONLY = "supportPersistentAndViewTablesOnly";


	// ********** constructor **********

	DTPSchemaWrapper(DTPSchemaContainerWrapper container, org.eclipse.datatools.modelbase.sql.schema.Schema dtpSchema) {
		super(container, dtpSchema);
		this.dtpSchema = dtpSchema;
	}


	// ********** DTPWrapper implementation **********

	@Override
	synchronized void catalogObjectChanged() {
		super.catalogObjectChanged();
		this.getConnectionProfile().schemaChanged(this);
	}


	// ********** Schema implementation **********

	public String getName() {
		return this.dtpSchema.getName();
	}

	public DTPSchemaContainerWrapper getContainer() {
		return (DTPSchemaContainerWrapper) this.getParent();
	}

	// ***** tables

	public Iterator<Table> tables() {
		return new ArrayIterator<Table>(this.getTables());
	}

	private Iterator<DTPTableWrapper> tableWrappers() {
		return new ArrayIterator<DTPTableWrapper>(this.getTables());
	}

	private synchronized DTPTableWrapper[] getTables() {
		if (this.tables == null) {
			this.tables = this.buildTables();
		}
		return this.tables;
	}

	private DTPTableWrapper[] buildTables() {
		List<org.eclipse.datatools.modelbase.sql.tables.Table> dtpTables = this.getDTPTables();
		DTPTableWrapper[] result = new DTPTableWrapper[dtpTables.size()];
		for (int i = result.length; i-- > 0;) {
			result[i] = new DTPTableWrapper(this, dtpTables.get(i));
		}
		return ArrayTools.sort(result, this.buildTableComparator());
	}

	private Comparator<Table> buildTableComparator() {
		return new Comparator<Table>() {
			public int compare(Table table1, Table table2) {
				return Collator.getInstance().compare(table1.getName(), table2.getName());
			}
		};
	}

	// minimize scope of suppressed warnings
	@SuppressWarnings("unchecked")
	private List<org.eclipse.datatools.modelbase.sql.tables.Table> getDTPTables() {

		//if product customization flag is set to true return only persistent and view tables.
		//this will filter out synonyms where they are not fully supported and potentially other 
		//problematic table types - see bug 269057
		String supportPersistentAndViewTablesOnly = Platform.getProduct().getProperty(PERSISTENT_AND_VIEW_TABLES_ONLY);
		if ( supportPersistentAndViewTablesOnly != null && supportPersistentAndViewTablesOnly.equals("true") ) {
            List<org.eclipse.datatools.modelbase.sql.tables.Table> result =
            	new ArrayList<org.eclipse.datatools.modelbase.sql.tables.Table>();
            for (Iterator iterT = this.dtpSchema.getTables().iterator();iterT.hasNext();) {
                    org.eclipse.datatools.modelbase.sql.tables.Table table
                    	= (org.eclipse.datatools.modelbase.sql.tables.Table) iterT.next();
                    if (SQLTablesPackage.eINSTANCE.getPersistentTable().isSuperTypeOf(table.eClass()) ||
                    	 SQLTablesPackage.eINSTANCE.getViewTable().isSuperTypeOf(table.eClass()) ) {
                            result.add(table);
                    }
            }
            return result;
		}
		else {
			return this.dtpSchema.getTables();
		}
	}

	public int tablesSize() {
		return this.getTables().length;
	}

	/**
	 * return the table for the specified DTP table
	 */
	DTPTableWrapper getTable(org.eclipse.datatools.modelbase.sql.tables.Table dtpTable) {
		// try to short-circuit the search
		return this.wraps(dtpTable.getSchema()) ?
						this.getTable_(dtpTable)
					:
						this.getContainer().getTable(dtpTable);
	}

	/**
	 * assume the schema contains the specified table
	 */
	DTPTableWrapper getTable_(org.eclipse.datatools.modelbase.sql.tables.Table dtpTable) {
		for (DTPTableWrapper table : this.getTables()) {
			if (table.wraps(dtpTable)) {
				return table;
			}
		}
		throw new IllegalArgumentException("invalid DTP table: " + dtpTable);  //$NON-NLS-1$
	}

	public DTPTableWrapper getTableNamed(String name) {
		return this.selectDatabaseObjectNamed(this.getTables(), name);
	}

	public Iterator<String> sortedTableIdentifiers() {
		// the tables are already sorted
		return new TransformationIterator<DTPTableWrapper, String>(this.tableWrappers()) {
			@Override
			protected String transform(DTPTableWrapper table) {
				 return table.getIdentifier();
			}
		};
	}

	public DTPTableWrapper getTableForIdentifier(String identifier) {
		return this.selectDatabaseObjectForIdentifier(this.getTables(), identifier);
	}

	// ***** sequences

	public Iterator<Sequence> sequences() {
		return new ArrayIterator<Sequence>(this.getSequences());
	}

	private Iterator<DTPSequenceWrapper> sequenceWrappers() {
		return new ArrayIterator<DTPSequenceWrapper>(this.getSequences());
	}

	private synchronized DTPSequenceWrapper[] getSequences() {
		if (this.sequences == null) {
			this.sequences = this.buildSequences();
		}
		return this.sequences;
	}

	private DTPSequenceWrapper[] buildSequences() {
		List<org.eclipse.datatools.modelbase.sql.schema.Sequence> dtpSequences = this.getDTPSequences();
		DTPSequenceWrapper[] result = new DTPSequenceWrapper[dtpSequences.size()];
		for (int i = result.length; i-- > 0;) {
			result[i] = new DTPSequenceWrapper(this, dtpSequences.get(i));
		}
		return ArrayTools.sort(result, this.buildSequenceComparator());
	}

	private Comparator<Sequence> buildSequenceComparator() {
		return new Comparator<Sequence>() {
			public int compare(Sequence sequence1, Sequence sequence2) {
				return Collator.getInstance().compare(sequence1.getName(), sequence2.getName());
			}
		};
	}

	// minimize scope of suppressed warnings
	@SuppressWarnings("unchecked")
	private List<org.eclipse.datatools.modelbase.sql.schema.Sequence> getDTPSequences() {
		return this.dtpSchema.getSequences();
	}

	public int sequencesSize() {
		return this.getSequences().length;
	}

	public DTPSequenceWrapper getSequenceNamed(String name) {
		return this.selectDatabaseObjectNamed(this.getSequences(), name);
	}

	public Iterator<String> sortedSequenceIdentifiers() {
		// the sequences are already sorted
		return new TransformationIterator<DTPSequenceWrapper, String>(this.sequenceWrappers()) {
			@Override
			protected String transform(DTPSequenceWrapper sequence) {
				 return sequence.getIdentifier();
			}
		};
	}

	public DTPSequenceWrapper getSequenceForIdentifier(String identifier) {
		return this.selectDatabaseObjectForIdentifier(this.getSequences(), identifier);
	}


	// ********** internal methods **********

	boolean wraps(org.eclipse.datatools.modelbase.sql.schema.Schema schema) {
		return this.dtpSchema == schema;
	}

	/**
	 * return the column for the specified DTP column
	 */
	DTPColumnWrapper getColumn(org.eclipse.datatools.modelbase.sql.tables.Column dtpColumn) {
		// try to short-circuit the search
		return this.wraps(dtpColumn.getTable().getSchema()) ?
						this.getColumn_(dtpColumn)
					:
						this.getContainer().getColumn(dtpColumn);
	}

	/**
	 * assume the schema contains the specified column
	 */
	DTPColumnWrapper getColumn_(org.eclipse.datatools.modelbase.sql.tables.Column dtpColumn) {
		return this.getTable_(dtpColumn.getTable()).getColumn_(dtpColumn);
	}


	// ********** listening **********

	@Override
	synchronized void startListening() {
		if (this.sequences != null) {
			this.startSequences();
		}
		if (this.tables != null) {
			this.startTables();
		}
		super.startListening();
	}

	private void startSequences() {
		for (DTPSequenceWrapper sequence : this.sequences) {
			sequence.startListening();
		}
	}

	private void startTables() {
		for (DTPTableWrapper table : this.tables) {
			table.startListening();
		}
	}

	@Override
	synchronized void stopListening() {
		if (this.sequences != null) {
			this.stopSequences();
		}
		if (this.tables != null) {
			this.stopTables();
		}
		super.stopListening();
	}

	private void stopSequences() {
		for (DTPSequenceWrapper sequence : this.sequences) {
			sequence.stopListening();
		}
	}

	private void stopTables() {
		for (DTPTableWrapper table : this.tables) {
			table.stopListening();
		}
	}


	// ********** clear **********

	@Override
	synchronized void clear() {
		if (this.sequences != null) {
			this.clearSequences();
		}
		if (this.tables != null) {
			this.clearTables();
		}
	}

	private void clearSequences() {
		this.stopSequences();
		for (DTPSequenceWrapper sequence : this.sequences) {
			sequence.clear();
		}
		this.sequences = null;
	}

	private void clearTables() {
		this.stopTables();
		for (DTPTableWrapper table : this.tables) {
			table.clear();
		}
		this.tables = null;
	}
}
