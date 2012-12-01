package com.prestonlee.vehicle;

/**
 * Another subclass example.
 * 
 * @author Preston Lee
 *
 */
public class Truck extends Vehicle {
	
	@Override
	public int getNumberDoors() {
		return 2;
	}

	@Override
	public String toString() {
		return "TRUCK: " + getYear() + " " + getMake() + " " + getModel();
	}

	
}
