package com.java24.hour8;

/**
 * Playing with loops...
 * 
 * @author Shirrine
 *
 */
public class Benchmark {
	
	public static void main(String[] args){
		
		// Current time in milliseconds
		long startTime = System.currentTimeMillis();
		
		// 60,000 ms = 60 s
		long endTime = startTime + 60000;
		
		long count = 0;
		while(true){
			
			// Math operation to count
			double x = Math.sqrt(count);
			
			// Current time
			long now = System.currentTimeMillis();
			
			// Break the loop after the set amount of time
			if (now > endTime)
				break;
			
			// Increment the counter
			count++;
		}
		System.out.println(count + " loops in one minute.");
	}

}
