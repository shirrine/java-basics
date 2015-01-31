package com.java24.hour4;

import java.util.Random;

/**
 * Wanna play?
 * 
 * @author Shirrine
 *
 */
public class Dice {
	
	public static void main(String[] args){
		
		// Create a Random object 
		// Note: Objects both hold data and perform tasks (Aren't they special!?!)
		Random random = new Random();
		
		// Store my value in a variable
		int roll = random.nextInt(6) + 1;
		
		// Display the value
		System.out.println("The dice roll is: " + "...drum roll... " + roll);
		
	}

}
