/**
 * 
 */
package com.prestonlee;

/**
 * @author preston
 *
 */
public class MyProgram {
	
	public static void main(String[] args) {
		final int i = 1;
		if (circumference(i) > 1) {
			System.out.println("Hello, world!");
		} else {
			System.out.println("Goodbye, cruel world!");
		}
	}
	
	public static double circumference(final double radius) {
		final double c = 2 * Math.PI * radius;
		return c;
	}

}
