
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

import java.io.File;
import java.util.List;

import junit.framework.TestCase;

import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricMeasurement;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricMeasurement;
import org.openecomp.ncomp.webservice.utils.DateUtils;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class MetricTest extends TestCase {
	
	public void test_case1() {
		String dir = "data/metrics/test1";
    	File f = new File(dir);
    	if (f.exists()) FileUtils.deleteDirectory(f);
		MetricStore store = new MetricStore(dir,null,null);
		DoubleMetricAttribute d = new DoubleMetricAttribute();
		d.setup(store, "foobar");
		d.add(DateUtils.dateFromString("-10min"), 1.0);
		d.add(DateUtils.dateFromString("-8min"), 13.0);
		d.add(DateUtils.dateFromString("-6min"), 12.0);
		d.add(DateUtils.dateFromString("-13min"), 11.0);
		assertEquals(12.0,d.getValue());
		List<DoubleMetricMeasurement> l = d.getValues(DateUtils.dateFromString("-1hour"),DateUtils.dateFromString("-0min"));
		assertEquals(11.0,l.get(0).v);
		assertEquals(1.0,l.get(1).v);
		assertEquals(12.0,l.get(3).v);
	}
	
	public void test_case_Long() {
		String dir = "data/metrics/test2";
    	File f = new File(dir);
    	if (f.exists()) FileUtils.deleteDirectory(f);
		MetricStore store = new MetricStore(dir,null,null);
		LongMetricAttribute d = new LongMetricAttribute();
		d.setup(store, "foobar");
		d.add(DateUtils.dateFromString("-10min"), 1L);
		d.add(DateUtils.dateFromString("-8min"), 13L);
		d.add(DateUtils.dateFromString("-6min"), 12L);
		d.add(DateUtils.dateFromString("-13min"), 11L);
		assertEquals((Long) 12L,d.getValue());
		List<LongMetricMeasurement> l = d.getValues(DateUtils.dateFromString("-1hour"),DateUtils.dateFromString("-0min"));
		assertEquals(11L,l.get(0).v);
		assertEquals(1L,l.get(1).v);
		assertEquals(12L,l.get(3).v);
	}
	public void test_case_IncreasingULong() {
		String dir = "data/metrics/test3";
    	File f = new File(dir);
    	if (f.exists()) FileUtils.deleteDirectory(f);
		MetricStore store = new MetricStore(dir,null,null);
		IncreasingULongMetricAttribute d = new IncreasingULongMetricAttribute();
		d.setup(store, "foobar");
		d.add(DateUtils.dateFromString("-10min"), 1L);
		d.add(DateUtils.dateFromString("-8min"), 13L);
		d.add(DateUtils.dateFromString("-6min"), 12L);
		d.add(DateUtils.dateFromString("-13min"), 11L);
		List<LongMetricMeasurement> l = d.getDeltaValues(DateUtils.dateFromString("-1hour"),DateUtils.dateFromString("-0min"));
		assertEquals(-10L,l.get(0).v);
		assertEquals(12L,l.get(1).v);
		assertEquals(-1L,l.get(2).v);
		assertEquals((-1L),d.getValue());
	}
	
	public void test_case_IncreasingULong2() {
		String dir = "data/metrics/test4";
    	File f = new File(dir);
    	if (f.exists()) FileUtils.deleteDirectory(f);
		MetricStore store = new MetricStore(dir,null,null);
		IncreasingULongMetricAttribute d = new IncreasingULongMetricAttribute();
		d.setup(store, "foobar");
		d.add(DateUtils.dateFromString("-13min"), Long.MAX_VALUE - 11L);
		d.add(DateUtils.dateFromString("-10min"), Long.MAX_VALUE);
		d.add(DateUtils.dateFromString("-8min"), Long.MIN_VALUE);
		d.add(DateUtils.dateFromString("-6min"), Long.MIN_VALUE + 12L);
		List<LongMetricMeasurement> l = d.getDeltaValues(DateUtils.dateFromString("-1hour"),DateUtils.dateFromString("-0min"));
		assertEquals(11L,l.get(0).v);
		assertEquals(1L,l.get(1).v);
		assertEquals(12L,l.get(2).v);
		assertEquals(3, l.size());
		assertEquals((12L),d.getValue());
		store.close();
		MetricStore store2 = new MetricStore(dir,null,null);
		IncreasingULongMetricAttribute d2 = new IncreasingULongMetricAttribute();
		d2.setup(store2, "foobar");
		assertEquals((12L),d2.getValue());
	}

}
