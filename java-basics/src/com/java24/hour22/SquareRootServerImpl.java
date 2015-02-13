/*
 * Are you talking to me?
 */
package com.java24.hour22;

import javax.jws.*;
import java.util.*;

/*
 *  Service Implementation Bean
 */
@WebService(endpointInterface = "com.java24.hour22.SquareRootServer")

/**
 * Implementation of the <code>SquareRootServer</code>.
 * 
 * @author Shirrine
 *
 */
public class SquareRootServerImpl implements SquareRootServer {

	/*
	 * (non-Javadoc)
	 * @see com.java24.hour22.SquareRootServer#getSquareRoot(double)
	 */
	@Override public double getSquareRoot(double input) {
		return Math.sqrt(input);
	}

	/*
	 * (non-Javadoc)
	 * @see com.java24.hour22.SquareRootServer#getTime()
	 */
	@Override public String getTime() {
		return (new Date()).toString();
	}

}
