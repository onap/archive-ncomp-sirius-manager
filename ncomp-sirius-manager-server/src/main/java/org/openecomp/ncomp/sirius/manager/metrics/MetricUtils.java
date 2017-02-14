
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
	
package org.openecomp.ncomp.sirius.manager.metrics;

import java.util.Date;
import java.util.List;

import org.openecomp.ncomp.core.types.metrics.DoubleMetricMeasurement;
import org.openecomp.ncomp.core.types.metrics.MetricAttribute;
import org.openecomp.ncomp.webservice.utils.DateUtils;

public class MetricUtils {

	public static double getAverage(MetricAttribute aa, String duration) {
		Date now = new Date();
		Date past = new Date(now.getTime()-DateUtils.stringToDuration(duration));
		List<DoubleMetricMeasurement> l = aa.getValuesDouble(past, now);
		if (l.size() == 0) return 0.0;
		double sum = 0.0;
		for (DoubleMetricMeasurement m : l) {
			sum += m.v;
		}
		return sum/l.size();
	}

}
