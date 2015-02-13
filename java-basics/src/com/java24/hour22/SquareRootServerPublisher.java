/*
 * My own web server???
 */
package com.java24.hour22;

import javax.xml.ws.Endpoint;

/**
 * Create a publisher for <code>SquareRootServer</code>.
 * 
 * @author Shirrine
 *
 */
public class SquareRootServerPublisher {
	
	/**
	 * Publishes a web server.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		SquareRootServerImpl impl = new  SquareRootServerImpl();
		Endpoint.publish("http://127.0.0.1:2525/squareroot", impl);
	}

}
