package com.java24.hour12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayLists
 * 
 * @author Shirrine
 *
 */
public class StringLister {
	
	String[] names = new String[]{"Thor", "Iron Man", "Captain America", "Black Widow", "Hulk"};
	
	public StringLister(String[] moreNames){
		ArrayList<String> list = new ArrayList<String>();

		// Add original list of names
		for(int i = 0; i < names.length; i++){
			list.add(names[i]);
		}
		
		// Add more names
		for(int i = 0; i < moreNames.length; i++){
			list.add(moreNames[i]);
		}
		
		// Sort the list
		Collections.sort(list);
		
		// Iterate the ArrayList where
		// 		"String name" = the element to reference
		// 		"list" = the ArrayList to iterate
		for(String name : list){
			System.out.println(name);
		}
	}
	
	public static void main(String[] args){
		StringLister lister = new StringLister(args);
	}

}
