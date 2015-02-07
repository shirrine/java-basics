package com.java24.hour18;

/**
 * Exception Handling... Part Two!
 * 
 * @author Shirrine
 *
 */
public class NewCalculator {
	
	/**
	 * Calculates the sum of the arguments.
	 * 
	 * @param args the values to sum
	 */
	public static void main(String[] args){
		
		float sum = 0;
		for(String arg : args){
			try{
				sum = sum + Float.parseFloat(arg);
			} catch(NumberFormatException e){
				System.out.println(arg + " is not a number.");
			}
		}
		System.out.println("Those numbers add up to " + sum);
	}

}
