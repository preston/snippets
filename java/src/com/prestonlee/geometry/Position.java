package com.prestonlee.geometry;

public class Position {

	public int x;
	public int y;
	public int z;

	public Position() {
		// Intentionally do nothing. :)
	}

	public Position(int pX, int pY, int pZ) {
		this.x = pX;
		this.y = pY;
		this.z = pZ;
	}

	@Override
	public String toString() {
		String s = "[" + x + ", " + y + ", " + z + "]";
		return s;
	}

	/**
	 * Adds the given Position to @this and returns a new instance representing
	 * the summation of the two.
	 */
	public Position sum(Position other) {
		Position p = new Position();
		p.x = this.x + other.x;
		p.y = this.y + other.y;
		p.z = this.z + other.z;
		return p;
	}

	public void whatIsThis() {
		System.out.println(this.getClass().getName());
	}

}
