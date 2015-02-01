package com.java24.hour7;

/**
 * Java conditional expressions
 * 
 * @author Shirrine
 *
 */
public class Game {
	
	public static void main(String[] args){

		int total = 0;
		int score = 7;
		
		switch(score){
			case 3: System.out.println("You kick a field goal"); break;
			case 7: System.out.println("You score a touchdown"); break;
		}
		
		total += score;
		System.out.println("Total score: " + total);

	}
	

}
