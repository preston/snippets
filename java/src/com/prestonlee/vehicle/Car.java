package com.prestonlee.vehicle;

/**
 * Subclass example.
 * 
 * @author Preston Lee
 *
 */
public class Car extends Vehicle {

	protected boolean hatchback;
	
	public boolean isHatchback() {
		return hatchback;
	}

	public void setHatchback(boolean pHatchback) {
		hatchback = pHatchback;
	}
	
	@Override
	public int getNumberDoors() {
		return 4;
	}

	@Override
	public String toString() {
		return "CAR: " + getYear() + " " + getMake() + " " + getModel();
	}
	
}
