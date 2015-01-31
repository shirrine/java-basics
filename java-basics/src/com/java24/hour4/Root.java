package com.java24.hour4;

/**
 * Computer Programming 101: Calculate the square root of a number
 * 
 * @author Shirrine
 *
 */
public class Root {

	/**
	 * The JVM looks for a main method to run the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Store the argument into a 4-byte integer (4 byte * 8 bits = 32; range 2^31 leaving one bit for the sign)
		int number = Integer.parseInt(args[0]);
		
		// Calculate and print the square root
		System.out.println("The square root of " + number + " is " + Math.sqrt(number));
	}

}
