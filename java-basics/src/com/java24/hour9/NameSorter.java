package com.java24.hour9;

import java.util.*;

/**
 * Things are starting to get interesting ;-)
 * 
 * @author Shirrine
 *
 */
public class NameSorter {
	
	public static void main(String[] args){
		
		// Hunger Games ;-)
		String[] names = new String[]{"Glimmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
		
		System.out.println("The original order: ");
		for(int i = 0; i < names.length; i++){
			System.out.println(i + ": " + names[i]);
		}
		
		// Blank line
		System.out.println();
		
		// Sort the array
		Arrays.sort(names);
		
		System.out.println("The new order: ");
		for(int i = 0; i < names.length; i++){
			System.out.println(i + ": " + names[i]);
		}
		
		// Blank line
		System.out.println();
	}

}
