package com.prestonlee.vehicle;

/**
 * Another subclass example.
 * 
 * @author Preston Lee
 *
 */
public class Truck extends Vehicle {
	
	protected int numberDoors = 0;

	public Truck() { 
		setNumberDoors(2);
	}
	
	@Override
	public int getNumberDoors() {
		return numberDoors;
	}

	public void setNumberDoors(int n) {
		if(n >= 1) {
			numberDoors = n;
		}
	}

	@Override
	public String toString() {
		return "TRUCK: " + getYear() + " " + getMake() + " " + getModel();
	}

	
}
