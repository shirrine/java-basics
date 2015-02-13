/*
 * Look who's talking!
 */
package com.java24.hour22;

import java.net.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Create a client to call the <code>SquareRootServer</code>.
 * 
 * @author Shirrine
 *
 */
public class SquareRootClient {
	
	/**
	 * Calls the SquareRootServer to get a square root.
	 * 
	 * @param args unused
	 * @throws Exception if the URL is invalid
	 */
	public static void main(String[] args) throws Exception{
		
		// LocalHost
		URL url = new URL("http://127.0.0.1:2525/squareroot");
		
		// Service name
		QName qualifiedName = new QName("http://hour22.java24.com/", 
				"SquareRootServerImplService");
		
		// Call the service
		Service service = Service.create(url, qualifiedName);
		SquareRootServer server = service.getPort(SquareRootServer.class);
		
		// Print results
		System.out.println(server.getTime());
		System.out.println(server.getSquareRoot(625D));
	}

}
