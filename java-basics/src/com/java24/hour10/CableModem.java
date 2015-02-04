package com.java24.hour10;

/**
 * Playing with subclasses
 * 
 * @author Shirrine
 *
 */
public class CableModem extends Modem{
	
	private String connectionType = "Cable";
	
	public CableModem(){
		super();
	}
	
	public CableModem(int speed){
		super(speed);
	}
	
	public void connect(){
		System.out.println("Connecting to the Internet");
		System.out.println("Using a " + this.connectionType + " connection.");
	}

}
