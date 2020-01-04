package com.intercom;

import static org.junit.Assert.*;

import org.junit.Test;

import com.intercom.helper.DistanceHelper;

public class DistanceHelperTest {
	
	DistanceHelper helper = new DistanceHelper();

	@Test
	public void testDistancePass() {
		assertNotEquals(helper.distance(50, 100), -1.0, 0.000001);
	}
	
	@Test
	public void testDistanceFailLat() {
		assertEquals(helper.distance(-91, 100), -1.0, 0.00000000001);
	}

	@Test
	public void testDistanceFailLon() {
		assertEquals(helper.distance(-50, 185), -1.0, 0.00000000001);
	}
}
