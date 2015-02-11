package com.java24.hour21;

import java.io.*;

/**
 * Reading from the console!
 * 
 * @author Shirrine
 *
 */
public class Console {
	
	/**
	 * Reads a line from the console.
	 * 
	 * @return the String representation of the input
	 */
	public static String readLine(){
		
		StringBuilder response = new StringBuilder();
		
		try(BufferedInputStream buffer = new BufferedInputStream(System.in)){
			int in = 0;
			char inChar;
			do{
				// Read a byte from the buffer
				in = buffer.read();
				
				// Change the byte to a char
				inChar = (char) in;
				
				// Add the char to the String
				if(in != -1){
					response.append(inChar);
				}
			} while (in != -1 & inChar != '\n');
			
			buffer.close();
			return response.toString();
			
		} catch(IOException e){
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Displays text and requests user input.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		
		System.out.print("You are standing at the end of the road ");
		System.out.print("before a small brick building. Around you ");
		System.out.print("is a forest. A small stream flows out of ");
		System.out.println("the building and down a gully.\n");
		System.out.print("> ");
		Console.readLine();
		System.out.println("That's not a verb I recognize.");
	}

}
