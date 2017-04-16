
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum SouthBoundApiOperationEnum implements EcompOperationEnum {

  SouthBoundApi_logs("SouthBoundApi@logs"),
  SouthBoundApi_metrics("SouthBoundApi@metrics"),
  SouthBoundApi_properties("SouthBoundApi@properties") ; 


	private String n;
	
	private SouthBoundApiOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
