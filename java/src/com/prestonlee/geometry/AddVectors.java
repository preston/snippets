package com.prestonlee.geometry;

public class AddVectors {

	public static void main(String[] args) {
		
		// Create our first instance of Position.
		Position p1 = new Position();
		p1.x = 7;
		p1.y = 9;
		p1.z = 11;
		
		String s1 = p1.toString();
		System.out.println("Position 1:\t" + s1);
		
		// Create another instance of Position.
		Position p2 = new Position();
		p2.x = 2;
		p2.y = 2;
		p2.z = 2;
		
		String s2 = p2.toString();
		System.out.println("Position 2:\t" + s2);
		
		// What is the sum?
		Position sum = p1.sum(p2);
		System.out.println("----------------------------");
		System.out.println("Sum:\t\t" + sum.toString());
	}
	
}

/*



*/