package com.prestonlee.vehicle;

public class Car extends Vehicle {

	protected boolean hatchback;


	public boolean isHatchback() {
		return hatchback;
	}

	public void setHatchback(boolean pHatchback) {
		hatchback = pHatchback;
	}


	@Override
	public String toString() {
		return "CAR: " + super.toString();
	}
	
}
