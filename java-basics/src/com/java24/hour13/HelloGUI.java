package com.java24.hour13;

import javax.swing.*;

/**
 * Creating a GUI
 * 
 * @author Shirrine
 *
 */
public class HelloGUI extends JFrame {
	
	// Default constructor
	public HelloGUI(){
		
		// Inherited constructors/methods
		super("Hello World!");
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// Instance methods for this class
		setLookAndFeel();
	}
	
	/*
	 * Internal use only
	 */
	private void setLookAndFeel(){
		try{
			// So.... The Nimbus look and feel is kinda hot!!!
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		HelloGUI helloWorld = new HelloGUI();
	}

}
