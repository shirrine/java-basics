package com.java24.hour11;

/**
 * Create viruses! :-P
 * 
 * @author Shirrine
 *
 */
public class VirusLab {
	
	public static void main(String[] args){
		
		// Added validation... couldn't take it anymore!
		if(args.length < 1)
			throw new IllegalArgumentException("Try again! How many viruses do you need?");
		
		int numViruses = Integer.parseInt(args[0]);
		if(numViruses > 0){
			Virus[] virii = new Virus[numViruses];
			for(int i = 0; i < virii.length; i++){
				virii[i] = new Virus();
			}
			System.out.println("There are " + Virus.getVirusCount() + " viruses.");
		}
		
		// Using setters to validate values
		Virus virus = new Virus();
		virus.setSeconds(10);
		System.out.println("Virus time: " + virus.getSeconds() + " seconds."); // Default = 0
		virus.setSeconds(60);
		System.out.println("Virus time: " + virus.getSeconds() + " seconds."); // Set to 60
	}

}
