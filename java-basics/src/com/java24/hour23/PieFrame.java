package com.java24.hour23;

import java.io.ObjectStreamClass;
import javax.swing.*;
import java.awt.*;

/**
 * A frame containing a pie chart.
 * 
 * @author Shirrine
 *
 */
public class PieFrame extends JFrame{
	
	public static final long serialVersionUID = ObjectStreamClass.lookupAny(PieFrame.class.getClass()).getSerialVersionUID();
	
	// So... These are some ugly colors :-P
	public static Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
	public static Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
	public static Color zootSuit = new Color(0x66, 0x66, 0x99);
	public static Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
	public static Color shrinkingViolet = new Color(0x66, 0x66, 0x99);
	public static Color miamiNice = new Color(0x33, 0xFF, 0xFF);
	public static Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
	public static Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
	public static Color purpleRain = new Color(0x66, 0x33, 0x99);
	public static Color freckle = new Color(0x99, 0x66, 0x33);
		
	/**
	 * Instantiates a pie frame.
	 */
	public PieFrame(){
		super("Pie Frame");
		
		// Container
		setLookAndFeel();
		setSize(320,290);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Show Frame
		setVisible(true);
		
		// Draw Pie
		PiePanel pie = new PiePanel(10);
		pie.addSlice(uneasyBeingGreen, 1350);
		pie.addSlice(zuzusPetals, 1221);
		pie.addSlice(zootSuit, 316);
		pie.addSlice(sweetHomeAvocado, 251);
		pie.addSlice(shrinkingViolet, 201);
		pie.addSlice(miamiNice, 193);
		pie.addSlice(inBetweenGreen, 173);
		pie.addSlice(norwegianBlue, 164);
		pie.addSlice(purpleRain, 143);
		pie.addSlice(freckle, 127);
		add(pie);
		
		// Show Frame
		setVisible(true);
		
	}
	
	/**
	 * Sets the look and feel to Nimbus.
	 */
	public void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates a pie frame.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new PieFrame();
	}

}
