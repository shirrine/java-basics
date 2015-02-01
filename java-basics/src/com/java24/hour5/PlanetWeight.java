package com.java24.hour5;

/**
 * Basic math expressions in Java
 * 
 * @author Shirrine
 *
 */
public class PlanetWeight {
	
	/**
	 * Maybe I shouldn't use my real weight? ;-)
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		double weight = Double.valueOf(args[0]);
		System.out.println("Your weight on Earth is " + weight);
		
		double mercuryWeight = weight * 0.378;
		System.out.println("Your weight on Mercury is " + mercuryWeight);
		
		double moonWeight = weight * 0.166;
		System.out.println("Your weight on the Moon is " + moonWeight);
		
		double jupiterWeight = weight * 2.364;
		System.out.println("Your weight on Jupiter is " + jupiterWeight);
	}

}
