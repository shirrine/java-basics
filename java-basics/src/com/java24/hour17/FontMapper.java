package com.java24.hour17;

import java.awt.Font;
import java.util.*;

/**
 * HashMaps...
 * 
 * @author Shirrine
 *
 */
public class FontMapper {
	
	/**
	 * Creates a HashMap of fonts.
	 */
	public FontMapper(){
		
		// Create fonts
		Font courier = new Font("Courier New", Font.PLAIN, 6);
		Font times = new Font("Times New Roman", Font.BOLD, 12);
		Font verdana = new Font("Verdana", Font.ITALIC, 25);
		
		// Create a hashmap
		HashMap<String, Font> fonts = new HashMap<>();
		fonts.put("smallprint", courier);
		fonts.put("body", times);
		fonts.put("headline", verdana);
		
		// Iterate all fonts
		for(Map.Entry<String, Font> entry : fonts.entrySet()){
			String key = entry.getKey();
			Font value = entry.getValue();
			System.out.println(key + ": " + value.getSize() + "-pt " + value.getFontName());
		}
	}
	
	/**
	 * Prints various fonts.
	 * 			
	 * @param args unused
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args){
		FontMapper fontMap = new FontMapper();
	}

}
