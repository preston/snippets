package com.prestonlee.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class for demonstratng the basics of {@link InputStream}s and
 * {@link OutputStream}s.
 * 
 * @author Preston Lee <preston@asu.edu>
 */
public class IODemo {

	public static void main(String[] args) {
		// Create a string and write it to a new file.
		try {
			FileOutputStream os = new FileOutputStream("/tmp/write.txt", true);
			String s = "This is a first line.\nThis is a second line!!!";
			os.write(s.getBytes());
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not open OutputStream! Exiting...");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
