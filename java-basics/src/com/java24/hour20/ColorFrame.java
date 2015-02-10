package com.java24.hour20;

import java.io.ObjectStreamClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Inner classes and *drum roll* closures AKA lambda expressions!!!
 * 
 * @author Shirrine
 *
 */
public class ColorFrame extends JFrame{
	
	public static final long serialVersionUID =
			ObjectStreamClass.lookupAny(ColorFrame.class.getClass()).getSerialVersionUID();
	
	private JButton red, green, blue;
	
	/**
	 * Constructs a color frame.
	 */
	public ColorFrame(){
		super("Color Frame");
		
		// Container
		setLookAndFeel();
		setSize(322, 122);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new FlowLayout());
		
		// Buttons
		red = new JButton("Red");
		add(red);
		green = new JButton("Green");
		add(green);
		blue = new JButton("Blue");
		add(blue);
		
		// ActionListener (Anonymous Inner Class in order to implement the interface)
		ActionListener act = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == red){
					getContentPane().setBackground(Color.RED);
				} 
				if(event.getSource() == green){
					getContentPane().setBackground(Color.GREEN);
				}
				if(event.getSource() == blue){
					getContentPane().setBackground(Color.BLUE);
				}
			}
		};
		
		// Add ActionListeners
		red.addActionListener(act);
		green.addActionListener(act);
		blue.addActionListener(act);
		
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
	 * Creates a color frame.
	 * @param args
	 */
	public static void main(String[] args){
		new ColorFrame();
	}
	
}
