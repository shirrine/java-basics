package com.java24.hour20;

import java.net.*;

/**
 * Inner classes...
 * 
 * @author Shirrine
 *
 */
public class Catalog {
	
	/**
	 * A home page with an owner and web address.
	 * 
	 * @author Shirrine
	 *
	 */
	private class HomePage{
		
		private String owner;
		private URL address;
		private String category = "none";
		
		/**
		 * Creates a home page with an owner and a web address.
		 * 
		 * @param owner the owner of the web page
		 * @param address the web address
		 * @throws MalformedURLException if the address is malformed
		 */
		private HomePage(String owner, String address) throws MalformedURLException{
			this.owner = owner;
			this.address = new URL(address);
		}
		
		/**
		 * Creates a home page with an owner, web address and category.
		 * 
		 * @param owner the owner of the web page
		 * @param address the web address
		 * @param category the type of web page
		 * @throws MalformedURLException if the address is malformed
		 */
		private HomePage(String owner, String address, String category) throws MalformedURLException{
			this(owner, address);
			this.category = category;
		}
	}
	
	/**
	 * Creates a catalog of web pages.
	 */
	public Catalog(){
		
		// Catalog of web pages
		Catalog.HomePage[] catalog = new Catalog.HomePage[5];
				
		try{
			catalog[0] = new Catalog.HomePage("Mark Evanier", "http://www.newsfromme.com", "comic books");
			catalog[1] = new Catalog.HomePage("Jeff Rients", "http://jrients.blogspot.com", "gaming");
			catalog[2] = new Catalog.HomePage("Rogers Cadenhead", "http://workbench.cadenhead.org", "programming");
			catalog[3] = new Catalog.HomePage("Juan Cole", "http://juancole.com", "politics");
			catalog[4] = new Catalog.HomePage("Rafe Colburn", "http://www.rc3.org");

			for(Catalog.HomePage current : catalog){
				System.out.println(current.owner + ": " + current.address + " (" + current.category + ")");
			}
			
		} catch(MalformedURLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	/**
	 * Adds web pages to a catalog.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new Catalog();
	}

}
