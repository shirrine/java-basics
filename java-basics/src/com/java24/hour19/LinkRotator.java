package com.java24.hour19;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.*;

/**
 * Display a rotator of awesome links. :-)
 * 
 * @author Shirrine
 *
 */
public class LinkRotator extends JFrame implements Runnable, ActionListener{
	
	public static final long serialVersionUID = 
			ObjectStreamClass.lookupAny(LinkRotator.class.getClass()).getSerialVersionUID();
	
	private String[] pageTitle = new String[6];
	private URI[] pageLink = new URI[6];
	private int current = 0;
	private Thread runner;
	private JLabel siteLabel = new JLabel();
	
	/**
	 * Creates a link rotator.
	 */
	public LinkRotator(){
		super("Link Rotator");
		
		// Container
		setLookAndFeel();
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new FlowLayout());
		
		// Components
		add(siteLabel);
		
		// Web Page Info
		pageTitle = new String[]{"Oracle's Java Site",
				                 "Cafe au Lait",
				                 "JavaWorld",
				                 "Java in 24 Hours",
				                 "Sams Publishing",
				                 "Workbench"};
		pageLink[0] = getURI("http://www.oracle.com/technetwork/java");
		pageLink[1] = getURI("http://www.ibiblio.org/javafaq");
		pageLink[2] = getURI("http://www.javaworld.com");
		pageLink[3] = getURI("http://www.java24hours.com");
		pageLink[4] = getURI("http://www.samspublishing.com");
		pageLink[5] = getURI("http://workbench.cadenhead.org");
		
		// Buttons
		JButton visitButton = new JButton("Visit Site");
		visitButton.addActionListener(this);
		add(visitButton);
		
		// Show frame
		setVisible(true);
		
		// Start rotator
		start();
	}
	
	/**
	 * Sets the look and feel to NimbusLookAndFeel.
	 */
	public static void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Converts the input string to a <code>URI</code> object.
	 * 
	 * @param urlText the URL string
	 * @return the URI object
	 */
	private static URI getURI(String urlText){
		
		URI pageURI = null;
		
		try{
			pageURI = new URI(urlText);
		} catch(URISyntaxException e){
			e.printStackTrace();
		}
			
		return pageURI;
	}

	/**
	 * Starts the rotator (if not already started)
	 */
	private void start(){
		if(runner == null){
			runner = new Thread(this);
			runner.start();
		}
	}
	
	/**
	 * Rotates through web page links.
	 */
	@Override
	public void run(){
		Thread thisThread = Thread.currentThread();
		
		// Loop until the runner value has been changed
		while(runner == thisThread){
			
			// Next page!
			current++;
			
			// Loop repeatedly
			if(current > 5){
				current = 0;
			}
			
			// Update display
			siteLabel.setText(pageTitle[current]);
			repaint();
			
			// Sleep for 2 seconds so viewer can see link
			try{
				Thread.sleep(2000); 
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * Opens a link in the browser.
	 */
	@Override
	public void actionPerformed(ActionEvent event){
		Desktop desktop = Desktop.getDesktop();
		if(pageLink[current] != null){
			try{
				// Open link in browser
				desktop.browse(pageLink[current]);
				
				// Stop the thread
				runner = null;
				
				// Close the GUI
				System.exit(0);
			} catch(IOException e){
				
			}
		}
	}
	
	/**
	 * Creates a LinkRotator.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new LinkRotator();
	}

}
