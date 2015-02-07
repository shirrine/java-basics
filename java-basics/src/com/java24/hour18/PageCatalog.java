package com.java24.hour18;

import java.net.*;

/**
 * Making use of the HomePage class
 * 
 * @author Shirrine
 *
 */
public class PageCatalog {

	/**
	 * Adds web pages to a catalog.
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		HomePage[] catalog = new HomePage[5];
		try{
			catalog[0] = new HomePage("Mark Evanier", "http://www.newsfromme.com", "comic books");
			catalog[1] = new HomePage("Jeff Rients", "http://jrients.blogspot.com", "gaming");
			catalog[2] = new HomePage("Rogers Cadenhead", "http://workbench.cadenhead.org", "programming");
			catalog[3] = new HomePage("Juan Cole", "http://juancole.com", "politics");
			catalog[4] = new HomePage("Rafe Colburn", "http://www.rc3.org");
			
			for(HomePage page : catalog){
				System.out.println(page.owner + ": " + page.address + " (" + page.category + ")");
			}
			
		} catch(MalformedURLException e){
			System.out.println("Error: " + e.getMessage());
		}
	
	}
	
}
