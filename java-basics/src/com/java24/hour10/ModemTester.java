package com.java24.hour10;

/**
 * Simple Modem object testing
 * 
 * @author Shirrine
 *
 */
public class ModemTester {
	
	public static void main(String[] args){
		CableModem cable = new CableModem();
		DslModem dsl = new DslModem();
		
		cable.setSpeed(500000);
		dsl.setSpeed(400000);
		
		System.out.println("Trying the cable modem: ");
		cable.printSpeed();
		cable.connect();
		
		System.out.println("Trying the dsl modem: ");
		dsl.printSpeed();
		dsl.connect();
	}

}
