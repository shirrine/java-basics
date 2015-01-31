package com.java24.hour5;

/**
 * Learning about data types and storage
 * 
 * @author Shirrine
 *
 */
public class Variable {
	
	/**
	 * What will it do???
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		//--------------------------------
		// Primitive Data Types - Integer
		//--------------------------------
		
		// Allocate 2 bytes of storage (16 bits, range -2^15 to 2^15)
		short buildingNumber = 707;
		
		// Allocate 4 bytes of storage (32 bits, range -2^31 to 2^31)
		int tops;
		
		// Allocate 8 bytes of storage (64 bits, range -2^63 to 2^63)
		long creditCardNumber = 1234_5678_9012_3456L;
		
		//--------------------------------------
		// Primitive Data Types - Floating Point
		//--------------------------------------

		// Allocate 4 bytes of storage (32 bits, 38 decimal places)
		float gradePointAverage;
		
		// Allocate 8 bytes of storage (64 bits, 300 decimal places)
		double doubleValue = 0.0D;

		//---------------------------------------
		// Primitive Data Types - Chars & Strings
		//---------------------------------------

		// Allocate and initialize 2 bytes of storage (16 bits)
		char key = 'E';
		
		// Allocate and initialize a String (var length)
		String productName = "Rubik's Cube";
		
		//-------------------------------
		// Primitive Data Types - Misc
		//-------------------------------

		// Allocate 1 bit of storage
		boolean isSleepy = true;
		
		// Allocate 1 byte of storage (8 bits, range -128 to 127)
		byte age = 34;
		
	}

}
