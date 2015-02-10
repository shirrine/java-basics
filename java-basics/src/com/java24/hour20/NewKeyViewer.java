package com.java24.hour20;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.io.ObjectStreamClass;

/**
 * Anonymous inner classes...
 * 
 * @author Shirrine
 *
 */
public class NewKeyViewer extends JFrame{
	
	public static final long serialVersionUID = 
			ObjectStreamClass.lookupAny(NewKeyViewer.class.getClass()).getSerialVersionUID();
	
	private JTextField keyText = new JTextField(80);
	private JLabel keyLabel = new JLabel("Press any key in the text field.");
	
	/**
	 * Constructs a key viewer.
	 */
	public NewKeyViewer(){
		super("New Key Viewer");
		
		// Container
		setLookAndFeel();
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new BorderLayout());
		
		// Key Listener (Anonymous Class)
		keyText.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent input){
				char key = input.getKeyChar();
				keyLabel.setText("You pressed " + key);
			}
		});
		
		// Components
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.CENTER);
		
		// Show frame
		setVisible(true);
	}
	
	/**
	 * Sets the look and feel to NimbusLookAndFeel.
	 */
	public void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates a key viewer.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new NewKeyViewer();
	}


}
