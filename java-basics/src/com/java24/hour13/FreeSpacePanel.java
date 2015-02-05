package com.java24.hour13;

import javax.swing.*;
import java.nio.file.*;
import java.io.*;

/**
 * My own panel :-)
 * 
 * @author Shirrine
 *
 */
public class FreeSpacePanel extends JPanel{
	
	private JLabel spaceLabel = new JLabel("Disk space: ");
	private JLabel space = new JLabel();
	
	public FreeSpacePanel(){
		
		super();
		
		add(spaceLabel);
		add(space);
		
		try{
			setValue();
		} catch (IOException e){
			space.setText("Error");
		}
		
	}
	
	private final void setValue() throws IOException{
		
		// Get the current file storage pool
		Path current = Paths.get(""); // Current directory
		FileStore store = Files.getFileStore(current); // Storage pool
		
		// Find the free storage space
		long totalSpace = store.getTotalSpace();
		long freeSpace = store.getUsableSpace();
		
		// Percentage
		double percent = (double) freeSpace / (double) totalSpace * 100;
		percent = (int) (percent * 100) / (double) 100; // Convert to two decimal places
		
		// Set the label's text
		space.setText(freeSpace + " free out of " + totalSpace + " (" + percent + "%)");
		
	}

}
