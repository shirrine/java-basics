package com.java24.hour16;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * Pretty colors ;-)
 * 
 * @author Shirrine
 *
 */
public class ColorSliders extends JFrame implements ChangeListener{
	
	private ColorPanel canvas;
	private JSlider red;
	private JSlider green;
	private JSlider blue;
	
	/**
	 * Creates a color slider panel featuring a red, green and blue slider.
	 */
	public ColorSliders(){
		super("Color Sliders");
		
		// Container
		setLookAndFeel();
		setSize(270,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Show display
		setVisible(true);
				
		// Panel
		canvas = new ColorPanel();
		
		// Sliders - Start at blue :-)
		red = new JSlider(0, 255, 0);
		green = new JSlider(0, 255, 0);
		blue = new JSlider(0, 255, 255);
		
		// Red Slider
		red.setMajorTickSpacing(50);
		red.setMinorTickSpacing(10);
		red.setPaintTicks(true);
		red.setPaintLabels(true);
		red.addChangeListener(this);
		
		// Green Slider
		green.setMajorTickSpacing(50);
		green.setMinorTickSpacing(10);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		green.addChangeListener(this);
		
		// Blue Slider
		blue.setMajorTickSpacing(50);
		blue.setMinorTickSpacing(10);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		blue.addChangeListener(this);
		
		// Labels
		JLabel redLabel = new JLabel("Red: ");
		JLabel greenLabel = new JLabel("Green: ");
		JLabel blueLabel = new JLabel("Blue: ");
		
		// Layout (JFrame)
		setLayout(new GridLayout(4, 1));
		
		// Layout (Colored panels)
		FlowLayout colorLayout = new FlowLayout(FlowLayout.RIGHT);
		
		// Red Panel
		JPanel redPanel = new JPanel();
		redPanel.setLayout(colorLayout);
		redPanel.add(redLabel);
		redPanel.add(red);
		add(redPanel); 		// Add to JFrame

		// Green Panel
		JPanel greenPanel = new JPanel();
		greenPanel.setLayout(colorLayout);
		greenPanel.add(greenLabel);
		greenPanel.add(green);
		add(greenPanel); 	// Add to JFrame

		// Blue Panel
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(colorLayout);
		bluePanel.add(blueLabel);
		bluePanel.add(blue);
		add(bluePanel); 	// Add to JFrame
		
		// Canvas
		add(canvas);	// Add to JFrame
		
		// Show display
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
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent)
	 */
	public void stateChanged(ChangeEvent event){
		JSlider source = (JSlider) event.getSource();
		
		// After the user has set and released the slider
		if(!source.getValueIsAdjusting()){
			Color current = new Color(red.getValue(), 
									  green.getValue(), 
									  blue.getValue());
			canvas.changeColor(current);
			canvas.repaint(); // Calls paintComponent(Graphics)
		}
	}
	
	/** 
	 * Creates a ColorSlider
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		ColorSliders sliders = new ColorSliders();
	}

}

/**
 * A panel whose color can be updated.
 * 
 * @author Shirrine
 *
 */
class ColorPanel extends JPanel{
	
	private Color background;
	
	/**
	 * Creates a panel with the default blue color.
	 */
	public ColorPanel(){
		super();
		background = Color.blue; // My favorite color ;-)
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		Graphics2D comp2D = (Graphics2D) g;
		comp2D.setColor(background);
		comp2D.fillRect(0, 0, getSize().width, getSize().height);
	}
	
	/**
	 * Changes the background color.
	 * 
	 * @param newBackground the new color
	 */
	public void changeColor(Color newBackground){
		background = newBackground;
	}
	
}
