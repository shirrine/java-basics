package com.java24.hour10;

/**
 * Playing with numbers and casting
 * 
 * @author Shirrine
 *
 */
public class NewRoot {
	
	public static void main(String[] args){
		
		int number = 1000000;
		
		// Parameter validation... finally!!!
		if(args.length > 0){
			number = Integer.parseInt(args[0]); // Returns a primitive int
			number = Integer.valueOf(args[0]);  // Returns an Integer object but using it as a primitive int (i.e. unboxing)
		}
		
		// Casting
		System.out.println("The square root of " + number + " is " + Math.sqrt(number)); // returns double
		System.out.println("The square root of " + number + " is " + (int) Math.sqrt(number)); // Downward cast
		System.out.println("The square root of " + number + " is " + (byte) Math.sqrt(number)); // Downward cast
		
		// Autoboxing
		Integer newNumber = 25; // Ha! You couldn't do this before ;-)
		int sum = newNumber + 10; // Couldn't do this either!
		System.out.println("Autoboxing stuff... " + sum);
		
	}

}
