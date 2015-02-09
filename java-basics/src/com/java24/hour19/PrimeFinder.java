package com.java24.hour19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Generate prime numbers.
 * <p>
 * A prime number (or a prime) is a natural number greater than 1 
 * that has no positive divisors other than 1 and itself.
 * 
 * @author Shirrine
 *
 */
public class PrimeFinder extends JFrame implements Runnable, ActionListener{
	
	// Ensure proper serialization
	public static final long serialVersionUID = 
			ObjectStreamClass.lookupAny(PrimeFinder.class.getClass()).getSerialVersionUID();
	
	// Instance Variables
	private Thread go;
	private JLabel howManyLabel;
	private JTextField howMany;
	private JButton display;
	private JTextArea primes;
	
	public PrimeFinder(){
		super("Prime Finder");
		
		// Container
		setLookAndFeel();
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new BorderLayout());
		
		// Components
		howManyLabel = new JLabel("Quantity: ");
		howMany = new JTextField("400", 10);
		display = new JButton("Display primes");
		primes = new JTextArea(8, 40);
		
		// Panel
		display.addActionListener(this);
		JPanel topPanel = new JPanel();
		topPanel.add(howManyLabel);
		topPanel.add(howMany);
		topPanel.add(display);
		add(topPanel, BorderLayout.NORTH);
		
		// Format panel
		primes.setLineWrap(true);
		JScrollPane textPane = new JScrollPane(primes);
		add(textPane, BorderLayout.CENTER);
		
		// Show panel
		setVisible(true);
		
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
	 * Starts a thread to generate prime numbers.
	 */
	@Override
	public void actionPerformed(ActionEvent event){
		
		// Disable the button while running
		display.setEnabled(false);
		
		// Start the thread (if not already started)
		if(go == null){
			go = new Thread(this);
			go.start();
		}
		
	}
	
	/**
	 * Generates prime numbers.
	 */
	@Override
	public void run(){
		
		// Desired number of primes
		int quantity = Integer.parseInt(howMany.getText());
		
		// Initialize count
		int numPrimes = 0;
		
		// First value to check
		// Note: Prime numbers must be greater than 1
		int candidate = 2; 
		primes.append("First " + quantity + " primes:");
		
		// Iterate until desired number of primes is generated
		while(numPrimes < quantity){
			
			// Check if the current candidate is a prime
			if(isPrime(candidate)){
				primes.append(candidate + " ");
				numPrimes++;
			}
			candidate++;
		}
		
	}
	
	/**
	 * Determines if the specified value is a prime number.
	 * 
	 * @param checkNumber the number to check
	 * @return true if the argument is a prime number, false otherwise
	 */
	public boolean isPrime(int checkNumber){
		
		// This is a pretty cool way to find a prime number!!!!
		double root = Math.sqrt(checkNumber);
		for(int i = 2; i <= root; i++){
			if(checkNumber % i == 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Creates a GUI for generating prime numbers.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new PrimeFinder();
	}

}
