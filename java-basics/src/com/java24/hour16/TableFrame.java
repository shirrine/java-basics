package com.java24.hour16;

import javax.swing.*;

import java.awt.*;
import java.io.ObjectStreamClass;

/** 
 * Working with tables...
 * 
 * @author Shirrine
 *
 */
public class TableFrame extends JFrame{
	
	// Ensure proper serialization (Yep... I got tired of the the compiler warnings ;-)
	private static final long serialVersionUID;
	
	// Static block to generate a serial version UID
	static{
		ObjectStreamClass osc = ObjectStreamClass.lookupAny(TableFrame.class.getClass()); // lookup or lookupAny?
		serialVersionUID = osc.getSerialVersionUID();
	}
	
	/**
	 * Creates a table of names.
	 */
	public TableFrame(){
		super("Table Frame");
		
		// Container
		setLookAndFeel();
		setSize(450,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new FlowLayout());

		// Table Data
		String[] headers = {"First Name", "Last Name", "Job", "Age"};
		Object[][] data = {{"Frankie", "Heck", "Dental Hygienist", 50},
						   {"Mike", "Heck", "Quarry Manager", 51},
						   {"Axl", "Heck", "Slacker", 19},
						   {"Sue", "Heck", "Wrestlerette", 16},
						   {"Brick", "Heck", "Reader", 12}};
		
		
		// JTable
		JTable table = new JTable(data, headers);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		add(scrollPane);
		
		// Show Frame
		setVisible(true);
		
	}
	
	/**
	 * Sets the style to NimbusLookAndFeel.
	 */
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Creates a table frame.
	 * 
	 * @param args	unused
	 */
	public static void main(String[] args){
		TableFrame frame = new TableFrame();
	}

}
