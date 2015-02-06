package com.java24.hour15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Shhhhh.... They're listening! ;-)
 * 
 * @author Shirrine
 *
 */
public class KeyViewer extends JFrame implements KeyListener{
	
	private JTextField keyText = new JTextField(80);
	private JLabel keyLabel = new JLabel("Press and key in the text field.");
	
	public KeyViewer(){
		super("KeyViewer");
		
		// Container
		setLookAndFeel();
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new BorderLayout());
		
		// Listeners
		keyText.addKeyListener(this);
		
		// Components
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.CENTER);
		
		// Make visible
		setVisible(true);
	}
	
	public void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent input){
		char key = input.getKeyChar();
		keyLabel.setText("You pressed " + key);
	}
	
	public void keyPressed(KeyEvent input){
		
	}
	
	public void keyReleased(KeyEvent input){
		
	}
	
	public static void main(String[] args){
		KeyViewer viewer = new KeyViewer();
	}

}
