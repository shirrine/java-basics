package com.java24.hour10;

/**
 * Working with Objects
 * 
 * @author Shirrine
 *
 */
public class Modem {
	
	private int speed;
	
	public Modem(){}
	
	public Modem(int speed){
		this.speed = speed;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void printSpeed(){
		System.out.println("Speed: " + this.speed);
	}

}
