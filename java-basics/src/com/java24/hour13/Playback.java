package com.java24.hour13;

import javax.swing.*;
import java.awt.*;

/**
 * More GUI stuff...
 * 
 * @author Shirrine
 *
 */
public class Playback extends JFrame{
	
	public Playback(){
		super("Playback");
		
		// Build container
		setLookAndFeel();
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create layout
		setLayout(new FlowLayout());
		
		// Add buttons
		JButton playButton = new JButton("Play");
		JButton stopButton = new JButton("Stop");
		JButton pauseButton = new JButton("Pause");
		add(playButton);
		add(stopButton);
		add(pauseButton);
		
		// Make everything visible
		setVisible(true);
	}
	
	/*
	 * My favorite look and feel ;-)
	 */
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Playback playback = new Playback();
	}

}
