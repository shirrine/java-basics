package com.java24.hour13;

import javax.swing.*;
import java.awt.*;

/**
 * Put my panel to use!
 * 
 * @author Shirrine
 *
 */
public class FreeSpaceFrame extends JFrame{
	
	public FreeSpaceFrame(){
		super("Disk Free Space");
		
		// Container
		setLookAndFeel();
		setSize(500, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout (must be set before adding components!)
		setLayout(new FlowLayout());

		// Panel
		FreeSpacePanel panel = new FreeSpacePanel();
		add(panel);
		
		// Button
		JButton button = new JButton("Push Me!");
		add(button);
		
		// Show frame
		setVisible(true);
	}
	
	/*
	 * Guess who?
	 */
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		FreeSpaceFrame frame = new FreeSpaceFrame();
	}
}
