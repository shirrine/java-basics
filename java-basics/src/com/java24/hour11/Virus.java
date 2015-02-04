package com.java24.hour11;

/**
 * Constructors and stuff...
 * 
 * @author Shirrine
 *
 */
public class Virus {
	
	private static int virusCount = 0;
	
	private int newSeconds;
	
	public Virus(){
		virusCount++;
	}
	
	public static int getVirusCount(){
		return virusCount;
	}
	
	public void setSeconds(int seconds){
		if(seconds >= 60 && seconds <= 100)
			this.newSeconds = seconds;
	}
	
	public int getSeconds(){
		return this.newSeconds;
	}

}
