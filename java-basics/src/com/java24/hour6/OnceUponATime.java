package com.java24.hour6;

/**
 * Playing with Strings
 * 
 * @author Shirrine
 *
 */
public class OnceUponATime {
	
	public static void main(String[] args){
		
		// Guess who's my favorite character/cutie...
		char firstLetter = 'D';
		System.out.println("My favorite OUAT character's name starts with a: " + firstLetter);
		
		// Hints...
		String firstName = "D";
		firstName += "a";
		firstName += "v";
		firstName += "i";
		firstName += "d";
		System.out.println("\t... \"" + firstName + "\" aka Prince Charming!");
		
		// More...
		String charming = "Prince Charming";
		System.out.println("\nThe actor who plays " + charming.toUpperCase() + " also plays in the movie Thor. Woohoo! \nHe's cuter in OUAT though. ;-)");
	}

}
