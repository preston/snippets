package com.prestonlee.vehicle.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prestonlee.vehicle.Truck;

public class TruckTest {

	public Truck t = null;
	
	@Before
	public void setUp() {
		t = new Truck();
	}
		
	@After
	public void tearDown() {
		t = null;
	}
	
	@Test
	public void testToString() {
		assertNotNull("toString() should never return null!", t.toString());
		
	}	
	
	@Test
	public void testNumberDoors() {
		assertTrue("Trucks should have at least one door!", t.getNumberDoors() > 0);
		t.setNumberDoors(0);
		assertTrue("Trucks should have at least one door!", t.getNumberDoors() > 0);
		t.setNumberDoors(-7);	
		assertTrue("Trucks should have at least one door!", t.getNumberDoors() > 0);
	}

	@Test
	public void testMake() {
		assertNotNull("Make should never be null.", t.getMake());
		t.setMake("Ford");
		assertEquals("Ford", t.getMake());
		t.setMake(null);
		assertEquals("Ford", t.getMake());
	}


//	@Test
//	public void testGetModel() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetModel() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetYear() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetYear() {
//		fail("Not yet implemented");
//	}

}
