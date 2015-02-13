/*
 * The contract! Mwahahaha! Okay... it's not really that scary. ;-)
 */
package com.java24.hour22;

import javax.jws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;

/*
 *  Service Endpoint Interface
 */
@WebService
@SOAPBinding(style = Style.RPC)

/**
 * Define web server interface for calculating the square root of a number.
 * 
 * @author Shirrine
 *
 */
public interface SquareRootServer {
	
	/**
	 * Gets the square root of a number.
	 * 
	 * @param input the number
	 * @return the square root
	 */
	@WebMethod double getSquareRoot(double input);
	
	/**
	 * Gets the current date and time as String.
	 * 
	 * @return the date and time
	 */
	@WebMethod String getTime();

}
