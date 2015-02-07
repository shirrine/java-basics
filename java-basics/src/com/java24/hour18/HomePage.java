package com.java24.hour18;

import java.net.*;

/**
 * Throwing exceptions... Kinda like softball but not really :-P
 * @author Shirrine
 *
 */
public class HomePage {
	
	String owner; 				// Allow accessibility to classes within package
	URL address;  				// Allow accessibility to classes within package
	String category = "none"; 	// Allow accessibility to classes within package
	
	/**
	 * Creates a home page with an owner and a web address.
	 * @param owner the owner of the web page
	 * @param address the web address
	 * @throws MalformedURLException if the address is malformed
	 */
	public HomePage(String owner, String address) throws MalformedURLException{
		this.owner = owner;
		this.address = new URL(address);
	}
	
	/**
	 * Creates a home page with an owner, web address and category.
	 * @param owner the owner of the web page
	 * @param address the web address
	 * @param category the type of web page
	 * @throws MalformedURLException if the address is malformed
	 */
	public HomePage(String owner, String address, String category) throws MalformedURLException{
		this.owner = owner;
		this.address = new URL(address);
		this.category = category;
	}

}
