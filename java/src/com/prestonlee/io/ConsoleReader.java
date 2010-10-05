package com.prestonlee.io;

import java.io.IOException;
import java.io.InputStream;


/**
 * Demo of reading raw data from the console!
 * 
 * @author Preston Lee <preston@asu.edu>
 */
public class ConsoleReader {
	
	public static void main(final String[] args) {
		// final InputStream is = new BufferedInputStream(System.in);
		final InputStream is = System.in;
		System.out.println("Input some stuff, yo!");
		try {
			int data = 0;
			boolean keepGoing = true;
			do {
				data = is.read();
				if (data == -1) {
					keepGoing = false;
				} else {
					System.out.println("Data: '" + data + "'");
				}
			} while (keepGoing);
		} catch (final IOException e) {
			System.err.println("Failed to read data from console!");
			e.printStackTrace();
		}
	}
}
