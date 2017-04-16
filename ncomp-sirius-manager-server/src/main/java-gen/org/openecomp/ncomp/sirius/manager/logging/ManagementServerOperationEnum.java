
package org.openecomp.ncomp.sirius.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ManagementServerOperationEnum implements EcompOperationEnum {

  MANAGEMENT_SERVER_CREATE_RESOURCE("MANAGEMENT-SERVER-CREATE-RESOURCE"),
  MANAGEMENT_SERVER_UPDATE_RESOURCE("MANAGEMENT-SERVER-UPDATE-RESOURCE"),
  MANAGEMENT_SERVER_LIST_RESOURCE("MANAGEMENT-SERVER-LIST-RESOURCE"),
  MANAGEMENT_SERVER_DELETE_RESOURCE("MANAGEMENT-SERVER-DELETE-RESOURCE"),
  MANAGEMENT_SERVER_UNKNOWN_SERVICE("MANAGEMENT-SERVER-UNKNOWN-SERVICE") ; 


	private String n;
	
	private ManagementServerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
