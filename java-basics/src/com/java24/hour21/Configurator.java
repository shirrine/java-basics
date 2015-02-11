package com.java24.hour21;

import java.io.*;
import java.util.*;

/**
 * Configuration files...
 * 
 * @author Shirrine
 *
 */
public class Configurator {
	
	/**
	 * Constructs a Configurator to update configuration properties.
	 */
	public Configurator(){
		
		File configFile = new File("program.properties");
		
		// Try-with-resources
		// Note: I can use a semi-colon to add additional resources but 
		//       the behavior is weird with getting an input stream
		//       and output stream on the same file at the same time. :-/
		try(FileInputStream inputStream = new FileInputStream(configFile)){
			
			// Load config properties
			Properties config = new Properties();
			config.load(inputStream);
			
			// Add a property
			Date current = new Date();
			config.setProperty("runtime", current.toString());
			
			// Store updated properties
			FileOutputStream outputStream = new FileOutputStream(configFile);
			config.store(outputStream, "Properties settings");
			
			// Close the input stream
			inputStream.close();
			
			// List the properties
			config.list(System.out);
			
			// Close the output stream
			outputStream.close();
			
		} catch(IOException e){
			System.out.println("Error: " + e);
		}
	}
	
	/**
	 * Updates configuration properties.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new Configurator();
	}

}
