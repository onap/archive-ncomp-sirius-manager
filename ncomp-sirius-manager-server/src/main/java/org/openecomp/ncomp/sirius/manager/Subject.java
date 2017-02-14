
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
	
package org.openecomp.ncomp.sirius.manager;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class Subject {
	@Override
	public String toString() {
		return "Subject [o=" + o + ", ref=" + ref + ", attr=" + attr + "]";
	}
	public Subject(EObject o, EReference ref) {
		this.o = o;
		this.ref = ref;
	}
	public Subject(EObject o, String refName) {
		this.o = o;
		ref = (EReference) o.eClass().getEStructuralFeature(refName);
		if (ref == null) {
			throw new RuntimeException("No such ref " + refName + " in type " + o.eClass().getName());
		}
	}

	public Subject(EObject o) {
		this.o = o;
	}

	public Subject(EObject o, EAttribute attr) {
		this.o = o;
		this.attr = attr;
	}

	public EObject o;
	public EReference ref = null;
	public EAttribute attr = null;
}
