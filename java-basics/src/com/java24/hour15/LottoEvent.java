package com.java24.hour15;

import java.awt.event.*;
import javax.swing.*;

public class LottoEvent implements ItemListener, ActionListener, Runnable{
	
	LottoMadness gui;
	Thread playing;
	
	public LottoEvent(LottoMadness gui){
		this.gui = gui;
	}
	
	/*
	 * ActionListener implementation
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent action){
		String command = action.getActionCommand();
		switch(command){
		case "Play": startPlaying(); break;
		case "Stop": stopPlaying(); break;
		case "Reset": clearAllFields(); break;
		}
	}
	
	private void startPlaying(){
		
		// Run the game in its own thread
		playing = new Thread(this);
		playing.start();
		
		// Update the GUI
		gui.play.setEnabled(false);
		gui.stop.setEnabled(true);
		gui.reset.setEnabled(false);
		gui.quickpick.setEnabled(false);
		gui.personal.setEnabled(false);
	}
	
	private void stopPlaying(){
		
		// Update the GUI
		gui.play.setEnabled(true);
		gui.stop.setEnabled(false);
		gui.reset.setEnabled(true);
		gui.quickpick.setEnabled(true);
		gui.personal.setEnabled(true);
		
		// Stop the thread
		playing = null;
		
	}
	
	private void clearAllFields(){
		
		// Clear all numbers
		for(int i = 0; i < 6; i++){
			gui.winners[i].setText(null);
			gui.numbers[i].setText(null);
		}
		
		// Clear other fields
		gui.got3.setText("0");
		gui.got4.setText("0");
		gui.got5.setText("0");
		gui.got6.setText("0");
		gui.drawings.setText("0");
		gui.years.setText("0");
	}
	
	/*
	 * ItemListener implementation
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	public void itemStateChanged(ItemEvent event){
		
		Object item = event.getItem();
		if(item == gui.quickpick){ // Generate picks
			
			for(int i = 0; i < gui.numbers.length; i++){
				int pick;
				do{
					pick = (int) Math.floor(Math.random() * 50 + 1);
				} while(numberGone(pick, gui.numbers, i));
				
				gui.numbers[i].setText(String.valueOf(pick));
			}
		} else{ // Clear other fields
			clearAllFields();
		}
		
	}
	
	/*
	 * Ensure the pick is not already included in the array of numbers
	 */
	private boolean numberGone(int pick, JTextField[] pastNums, int count){
		
		for(int i = 0; i < count; i++){
			if(Integer.parseInt("0" + pastNums[i].getText()) == pick)
				return true;
		}
		return false;
	}
		
	/* 
	 * Runnable implementation
	 * 
	 * The cool stuff happens here ;-)
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	public void run(){
		
		Thread thisThread = Thread.currentThread();
		
		while(playing == thisThread){
			
			// Total number of drawings
			incrementField(gui.drawings);
			
			// Current draw
			int draw = Integer.parseInt(gui.drawings.getText());
			
			// ???
			float numYears = (float) draw / 104;
			gui.years.setText("" + numYears);
			
			// Look for matches
			int matches = 0;
			
			// Iterate all possible picks
			for(int i = 0; i < gui.numbers.length; i++){
				
				// The current ball (i.e. winning number)
				int ball;
				do{
					ball = (int) Math.floor(Math.random() * 50 + 1);
				} while(numberGone(ball, gui.winners, i));
				gui.winners[i].setText("" + ball);
				
				// Does it match any of the user's picks?
				if(matchedOne(gui.winners[i], gui.numbers))
					matches++;	// Woohoo!!!
				
				switch(matches){
				case 3: incrementField(gui.got3); break;
				case 4: incrementField(gui.got4); break;
				case 5: incrementField(gui.got5); break;
				case 6: 
					incrementField(gui.got6); 
					gui.stop.setEnabled(true);
					gui.play.setEnabled(true);
					playing = null;
					break;
				}
				try{
					Thread.sleep(100);
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
	}

	/**
	 * Increment field by one
	 * 
	 * @param field
	 */
	private void incrementField(JTextField field){
		int num = Integer.parseInt("0" + field.getText()); // Clever way to handle null value
		num++;
		field.setText("" + num); // Clever way to convert int to String
	}
	
	/*
	 * Did we match a pick?
	 */
	private boolean matchedOne(JTextField win, JTextField[] allPicks){
		
		for(int i = 0; i < allPicks.length; i++){
			String winText = win.getText();
			if(winText.equals(allPicks[i].getText()))
				return true;
		}
		return false;
	}

}
