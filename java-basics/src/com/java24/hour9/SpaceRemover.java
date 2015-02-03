package com.java24.hour9;

/** 
 * Working with arrays...
 * 
 * @author Shirrine
 *
 */
public class SpaceRemover {
	
	public static void main(String[] args){
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		
		// Convert string to char array
		char[] mfl = mostFamous.toCharArray();
		
		// Iterate the char array
		for(int i = 0; i < mfl.length; i++){
			
			// Current char
			char current = mfl[i];
			
			// If non-blank, print the char
			if(current != ' ')
				System.out.print(current);
			else // If blank, print '.'
				System.out.print('.');
		}
		
		// Print a blank line
		System.out.println();
	}

}
