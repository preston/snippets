package com.prestonlee.vehicle;

/**
 * Superclass example. (Look at it in the "Type Hierarchy" view within Eclipse.)
 * 
 * @author Preston Lee
 * 
 */
public abstract class Vehicle {

	protected String make = "";

	protected String model = "";

	protected int year;
	
//	public Vehicle(String _make, String _model, int _year) {
//		setMake(_make);
//		setModel(_model);
//		setYear(_year);
//	}

	
	public abstract int getNumberDoors();
	
	public String getMake() {
		return make;
	}

	public void setMake(String pMake) {
		if(pMake != null) {
			make = pMake;
		}
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

}
