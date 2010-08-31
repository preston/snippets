package com.prestonlee.vehicle;

public class Vehicle {

	protected String make;
	
	protected String model;
	
	protected int year;


	public String getMake() {
		return make;
	}




	public void setMake(String pMake) {
		make = pMake;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String pModel) {
		model = pModel;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int pYear) {
		year = pYear;
	}




	@Override
	public String toString() {
		return getYear() + " " + getMake() + " " + getModel();
	}
	
	
}
