package com.prestonlee;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.prestonlee.vehicle.Truck;

public class TruckTestBackup {

	protected Truck truck;

	@Before
	public void setUp() throws Exception {
		truck = new Truck();
	}

	@After
	public void tearDown() throws Exception {
		truck = null;
	}

	@Test
	public void testGetNumberDoors() {
		assertTrue("Doors must always be greater than zero!", truck.getNumberDoors() > 0);
	}

	@Test
	public void testToString() {
		assertNotNull(truck.toString());
	}

	@Test
	public void testGetMake() {
		assertNotNull("Make should never be null!", truck.getMake());
	}

}
