package com.java24.hour7;

/**
 * Switch statements and conditional expressions
 * 
 * @author Shirrine
 *
 */
public class Commodity {
	
	/**
	 * JVM... Start here!
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		String command = "BUY";
		int balance = 550;
		int quantity = 42;
		
		switch(command){
			case "BUY": 
				quantity += 5;
				balance -= 20;
				break;
			case "SELL":
				quantity -= 5;
				balance += 15;
				break;
		}
		
		System.out.println("Balance: " + balance + "\n" + "Quantity: " + quantity);
		
	}

}
