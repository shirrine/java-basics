package com.java24.hour14;

import javax.swing.*;
import java.awt.*;

/**
 * Layout Managers
 * 
 * @author Shirrine
 *
 */
public class Crisis extends JFrame{
	
	private JButton panicButton;
	private JButton dontPanicButton;
	private JButton blameButton;
	private JButton mediaButton;
	private JButton saveButton;
	
	public Crisis(){
		super();
		
		// Container
		setLookAndFeel();
		setSize(348, 128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		//setLayout(new FlowLayout());
		//setLayout(new GridLayout(3,2));
		setLayout(new BorderLayout());
		
		// Buttons
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		add(panicButton, BorderLayout.NORTH);
		add(dontPanicButton, BorderLayout.SOUTH);
		add(blameButton, BorderLayout.EAST);
		add(mediaButton, BorderLayout.WEST);
		add(saveButton, BorderLayout.CENTER);
		
		// Show Frame
		setVisible(true);
		
	}
	
	/*
	 * Internal use only
	 */
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Crisis crisis = new Crisis();
	}

}
