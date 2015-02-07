package com.java24.hour18;

/**
 * Exception handling
 * 
 * @author Shirrine
 *
 */
public class Calculator {
	
	/**
	 * Calculates the sum of the arguments.
	 * 
	 * @param args the values to sum
	 */
	public static void main(String[] args){
		float sum = 0;
		for (String argument : args){
			sum = sum + Float.parseFloat(argument);
		}
		System.out.println("Those numbers add up to " + sum);
	}

}
