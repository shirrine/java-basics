package com.java24.hour9;

import java.util.Arrays;

/**
 * I always loved Wheel of Fortune :-)
 * 
 * @author Shirrine
 *
 */
public class Wheel {
	
	public static void main(String[] args){
	
		String[] phrase = new String[]{
			"SNOW WHITE",
			"PRINCE CHARMING",
			"GRUMPY",
			"CAPTAIN HOOK",
			"EMMA SWAN",
			"REGINA",
			"TINKERBELL",
			"ROBIN HOOD",
			"RUMPLESTILSKIN",
			"BELLE",
			"ARIEL",
			"THE HUNTSMAN",
			"RED RIDING HOOD"};
		
		// All possible letters
		int[] letterCount = new int[26];
		
		// Iterate all phrases
		for(int i = 0; i < phrase.length; i++){
			String current = phrase[i];
			
			// Convert the string to a char array
			char[] letters = current.toCharArray();
			
			// Iterate all characters
			for(int j = 0; j < letters.length; j++){
				char letter = letters[j];
				
				// Letter between A and Z?
				if(letter >= 'A' && letter <= 'Z')
					letterCount[letter - 'A']++; // Increment letter counter
			}
		}
		
		for(char count = 'A'; count <= 'Z'; count++){
			
			// Print current character's count
			System.out.print(count + ": " + letterCount[count - 'A'] + " ");
			
			// Insert new line after half-way point (i.e. M)
			if(count == 'M'){
				System.out.println();
			}
		}
		System.out.println();
	
	}

}
