package com.java24.hour10;

/**
 * Second subclass
 * 
 * @author Shirrine
 *
 */
public class DslModem extends Modem{
	
	private String connectionType = "DSL";
	
	public DslModem(){
		super();
	}
	
	public DslModem(int speed){
		super(speed);
	}
	
	public void connect(){
		System.out.println("Connecting to the Internet ...");
		System.out.println("Using a " + this.connectionType + " connection.");
	}
	
	public String getType(){
		return this.connectionType;
	}

}
