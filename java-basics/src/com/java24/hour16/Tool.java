package com.java24.hour16;

import javax.swing.*;
import java.awt.*;

/**
 * Working with toolbars...
 * 
 * @author Shirrine
 *
 */
public class Tool extends JFrame{

	/**
	 * Creates a text input panel with a tool bar.
	 */
	public Tool(){
		super("Tool");
		
		// Container
		setLookAndFeel();
		setSize(370, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new BorderLayout());
		
		// ToolBar Buttons
		ImageIcon image1 = new ImageIcon("newfile.gif");
		JButton button1 = new JButton("New File", image1);
		ImageIcon image2 = new ImageIcon("openfile.gif");
		JButton button2 = new JButton("Open File", image2);
		ImageIcon image3 = new ImageIcon("savefile.gif");
		JButton button3 = new JButton("Save File", image3);
		
		// Toolbar
		JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
		toolbar.add(button1);
		toolbar.add(button2);
		toolbar.add(button3);
		
		// Text Area
		JTextArea text = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(text);
		
		// Update layout
		add("West", toolbar);
		add("Center", scroll);
		
		// Show frame
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
	 * Creates a tool GUI
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		Tool tool = new Tool();
	}

}
