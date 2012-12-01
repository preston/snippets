package com.prestonlee.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Preston Lee <preston@asu.edu>
 */
public class FileWriter {
	
	public static void main(final String[] args) {
		OutputStream os = null;
		try {
			// Overwrite the existing file!
			os = new FileOutputStream("/tmp/write.txt");
			// Or append to the file instead.
			// os = new FileOutputStream("/tmp/write.txt", true);
			char s[] = "Hello, world!".toCharArray();
			for (int i = 0; i < s.length; i++) {
				char c = s[i];
				os.write(c);
			}
			System.out.println("Wrote to file: '" + new String(s) + "'");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (os != null) {
				try {
					System.out.println("Closing the file...");
					os.close();
					System.out.println("File closed...");
				} catch (IOException ex) {
					// You can usually ignore this.
					System.out
							.println("Could not close the file for some reason. Ah well...");
				}
			}
		}
		System.out.println("Exiting...");
	}

}
