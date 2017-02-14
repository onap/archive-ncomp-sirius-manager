
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.sirius.gui.tools;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.openecomp.ncomp.gwt.siriusportal.model.*;

public class GuiTableUtil {
	static ModelFactory f = ModelFactory.eINSTANCE;
	GuiTable t;
	GuiTableRow r = null;
	public GuiTableUtil() {
		t = f.createGuiTable();
	}
	public GuiTableColumn addColumn(String name, GuiTableColumnType type) {
		GuiTableColumn c = f.createGuiTableColumn();
		c.setColName(name);
		c.setColumnType(type);
		t.getColumns().add(c);
		return c;
	}
	public void newRow() {
		if (r != null) {
			t.getRows().add(r);
			r = null;
		}
		r = f.createGuiTableRow();
	}
	public void addCell(Object o) {
		if (o instanceof Date) {
			GuiTableCellDate c = f.createGuiTableCellDate();
			c.setValue((Date) o);
			r.getCells().add(c);
			return;
		}
		if (o instanceof Integer) {
			GuiTableCellDouble c = f.createGuiTableCellDouble();
			Integer i = (Integer) o;
			c.setValue(i.doubleValue());
			r.getCells().add(c);
			return;
		}
		GuiTableCellString c = f.createGuiTableCellString();
		c.setValue(o != null ? o.toString() : "NULL");
		r.getCells().add(c);
	}
	public GuiTable getTable() {
		if (r != null) t.getRows().add(r);
		for (GuiTableRow r : t.getRows()) {
			if (t.getColumns().size() != r.getCells().size()) 
				throw new RuntimeException("Wrong number of cells" + t.getColumns().size() + " != " + r.getCells().size());
		}
		return t;
	}
	public GuiTableCellReferences addCellRef(EObject o, String def) {
		GuiTableCellReferences res = f.createGuiTableCellReferences();
		if (o == null) {
			addCell(def);
			return res;
		}
		addCellRef(res,o,def);
		// TODO removed when GUI is updated
		addCell(res.getRefs().get(0).getLabel());
		// r.getCells().add(res);
		return res ;
	}
	@SuppressWarnings("rawtypes")
	public GuiTableCellReferences addCellRefs(EList l, String def) {
		if (l.size() == 0) {
			addCell(def);
			return null;
		}
		StringBuffer buf = new StringBuffer();
		GuiTableCellReferences res = f.createGuiTableCellReferences();
		for (Object o : l) {
			GuiTableCellReference ref = addCellRef(res,(EObject) o,def);
			buf.append(ref.getLabel());
			buf.append(" ");
		}
		// TODO removed when GUI is updated
		addCell(buf.toString());
		// r.getCells().add(res);
		return res ;
	}

	private GuiTableCellReference addCellRef(GuiTableCellReferences refs, EObject o, String def) {
		GuiTableCellReference ref = f.createGuiTableCellReference();
		ref.setLabel(def);
		if (o == null) return ref;
		EStructuralFeature ff = o.eClass().getEStructuralFeature("name");
		if (ff instanceof EAttribute) {
			EAttribute attr = (EAttribute) ff;
			ref.setLabel(o.eGet(attr).toString());
		}
		refs.getRefs().add(ref);
		return ref;
	}
	public void addCellDate(long time) {
		// TODO needed when using strings for dates.
		addCell(String.format("%1$tm/%1$td %1$tH:%1$tM:%1$tS", new Date(time)));
	}
}
