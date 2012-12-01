package com.prestonlee.vehicle;

import java.util.Vector;

/**
 * Driver/Test class for Vehicle (and subclasses thereof).
 * 
 * @author Preston Lee
 *
 */
public class VehicleTest {

	public static void main(String[] args) {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
				
		Vehicle c1 = new Car();
		c1.setMake("Ford");
		c1.setModel("Escort");
		c1.setYear(1989);
		
		Vehicle c2 = new Car();
		c2.setMake("Dodge");
		c2.setModel("Viper");
		c2.setYear(2007);
		

		Truck t1 = new Truck();
		t1.setMake("Ford");
		t1.setModel("Ranger");
		t1.setYear(2003);
		
		vehicles.add(c1);
		vehicles.add(c2);
		vehicles.add(t1);
		
		for (Vehicle o : vehicles) {
			System.out.println(o.toString());
		}
	}
	
//	public static void main(String[] args) {
//		
//		Vector vehicles = new Vector();
//		         
//		Car c1 = new Car();
//		c1.setMake("Ford");
//		c1.setModel("Escort");
//		c1.setYear(1989);
//
//		Car c2 = new Car();
//		c2.setMake("Dodge");
//		c2.setModel("Viper");
//		c2.setYear(2007);
//
//		vehicles.add(c1);
//		vehicles.add(c2);
//
//		for (Object o : vehicles) {
//			Car c = (Car) o;
//			System.out.println(c);
//		}
//	}
	
//	public static void main(String[] args) {
//		List vehicles = new Vector();
//		
//		Car c1 = new Car();
//		c1.setMake("Ford");
//		c1.setModel("Escort");
//		c1.setYear(1989);
//		
//		Car c2 = new Car();
//		c2.setMake("Dodge");
//		c2.setModel("Viper");
//		c2.setYear(2007);
//		
//		vehicles.add(c1);
//		vehicles.add(c2);
//		
//		for (Object o : vehicles) {
//			Car c = (Car)o;
//			System.out.println(c);
//		}
//	}



}
