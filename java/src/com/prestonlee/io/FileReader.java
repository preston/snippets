package com.prestonlee.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Demo of how to write data to a file on disk.
 * 
 * @author Preston Lee
 */
public class FileReader {

	public static void main(String[] args) {
		InputStream in = null;
		try {
			in = new FileInputStream("/tmp/data.txt");
			int data = 0;
			boolean keepGoing = true;
			do {
				data = in.read();
				if (data == -1) {
					keepGoing = false;
				} else {
					// System.out.println("Data: '" + data + "'");
					 System.out.println("Data: '" + (char)data + "'");
				}
			} while (keepGoing);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					// You can usually ignore this.
				}
			}
		}
	}

}
