/*
 * With ice-cream please! :-D
 */
package com.java24.hour23;

import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import javax.swing.*;

/**
 * A panel to display a pie chart.
 * 
 * @author Shirrine
 *
 */
public class PiePanel extends JPanel{
	
	public static final long serialVersionUID = ObjectStreamClass.lookupAny(PiePanel.class.getClass()).getSerialVersionUID();
	
	private PieSlice[] slice;
	
	private int current = 0;
	private float totalSize = 0;
	private Color background;
	
	/**
	 * Creates a pie chart panel.
	 * 
	 * @param sliceCount the maximum number of slices
	 */
	public PiePanel(int sliceCount){
		slice = new PieSlice[sliceCount];
		background = getBackground();
	}
	
	/**
	 * Adds a slice to the panel.
	 * 
	 * @param color the slice color
	 * @param size the slice size
	 */
	public void addSlice(Color color, float size){
		if(current <= slice.length){
			slice[current] = new PieSlice(color, size);
			totalSize += size;
			current++;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override 
	public void paintComponent(Graphics comp){
		
		Graphics2D comp2D = (Graphics2D) comp;
		
		int width = getSize().width - 10;
		int height = getSize().height - 10;
		int xInset = 5;
		int yInset = 5;
		
		// Stay in bounds
		if(width < 5){
			xInset = width;
		}
		if(height < 5){
			yInset = height;
		}
		
		// Set Background
		comp2D.setColor(background);
		comp2D.fillRect(0,  0,  getSize().width, getSize().height);
		
		// Create Circle
		comp2D.setColor(Color.lightGray);
		Ellipse2D.Float pie = new Ellipse2D.Float(xInset, yInset, width, height);
		comp2D.fill(pie);
		
		// Add Slices
		float start = 0;
		for(int i = 0; i < slice.length; i++){
			float extent = slice[i].getSize() * 360F / totalSize;
			comp2D.setColor(slice[i].getColor());
			Arc2D.Float drawSlice = new Arc2D.Float(xInset, yInset, width, height, start, extent, Arc2D.Float.PIE);
			start += extent;
			comp2D.fill(drawSlice);
		}
	}

}

/**
 * A colored pie slice.
 * 
 * @author Shirrine
 *
 */
class PieSlice {
	
	private Color color;
	private float size;
	
	/**
	 * Creates a pie slice with the given color and size. The size should be
	 * out of 360F.
	 * 
	 * @param color the color of the slice
	 * @param size the size of the slice 
	 */
	public PieSlice(Color color, float size){
		this.color = color;
		this.size = size;
	}
	
	/**
	 * Gets the color of the slice
	 * 
	 * @return the slice color
	 */
	public Color getColor(){
		return this.color;
	}

	/**
	 * Gets the size of the slice.
	 * 
	 * @return the slice size
	 */
	public float getSize(){
		return this.size;
	}
}