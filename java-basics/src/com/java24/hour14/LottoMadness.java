package com.java24.hour14;

import javax.swing.*;
import java.awt.*;

/**
 * Frames and panels; playing with layouts
 * 
 * @author Shirrine
 *
 */
public class LottoMadness extends JFrame{
	
	// Row 1
	private JPanel row1 = new JPanel();
	private ButtonGroup option = new ButtonGroup();
	private JCheckBox quickpick = new JCheckBox("Quick Pick", false);
	private JCheckBox personal = new JCheckBox("Personal", true);
	
	// Row 2
	private JPanel row2 = new JPanel();
	private JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
	private JTextField[] numbers = new JTextField[6];
	private JLabel winnersLabel = new JLabel("Winners: ", JLabel.RIGHT);
	private JTextField[] winners = new JTextField[6];
	
	// Row 3
	private JPanel row3 = new JPanel();
	private JButton stop = new JButton("Stop");
	private JButton play = new JButton("Play");
	private JButton reset = new JButton("Reset");
	
	// Row 4
	private JPanel row4 = new JPanel();
	private JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
	private JTextField got3 = new JTextField("0");
	private JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
	private JTextField got4 = new JTextField("0");
	private JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
	private JTextField got5 = new JTextField("0");
	private JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
	private JTextField got6 = new JTextField("0",10);
	private JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
	private JTextField drawings = new JTextField("0");
	private JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
	private JTextField years = new JTextField();
	
	public LottoMadness(){
		super("Lotto Madness");
		
		// Container
		setSize(550,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Layout
		setLayout(new GridLayout(5, 1, 10, 10));
		
		// Row 1
		option.add(quickpick); // Add button to group
		option.add(personal);  // Add button to group
		row1.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10)); // Set panel layout
		row1.add(quickpick);   // Add button to panel
		row1.add(personal);    // Add button to panel
		add(row1);             // Add panel to JFrame
		
		// Row 2
		row2.setLayout(new GridLayout(2, 7, 10, 10)); // Set panel layout
		row2.add(numbersLabel);		// Add numbers label to panel
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = new JTextField();
			row2.add(numbers[i]);	// Add textfield to panel
		}	
		row2.add(winnersLabel);		// Add winners label to panel
		for(int i = 0; i < winners.length; i++){
			winners[i] = new JTextField();
			row2.add(winners[i]);	// Add textfield to panel
		}
		add(row2);					// Add panel to JFrame
		
		// Row 3
		row3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Set panel layout
		stop.setEnabled(false);
		row3.add(stop);		// Add button to panel
		row3.add(play);		// Add button to panel
		row3.add(reset);	// Add button to panel
		add(row3);			// Add panel to JFrame
		
		// Row 4
		row4.setLayout(new GridLayout(2, 3, 20, 10));
		row4.add(got3Label);
		got3.setEditable(false);
		row4.add(got3);
		row4.add(got4Label);
		got4.setEditable(false);
		row4.add(got4);
		row4.add(got5Label);
		got5.setEditable(false);
		row4.add(got5);
		row4.add(got6Label);
		got6.setEditable(false);
		row4.add(got6);
		row4.add(drawingsLabel);
		drawings.setEditable(false);
		row4.add(drawings);
		row4.add(yearsLabel);
		years.setEditable(false);
		row4.add(years);
		add(row4);		// Add panel to JFrame
		
		// Show frame
		setVisible(true);
		
	}
	
	public static void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		LottoMadness.setLookAndFeel();
		LottoMadness game = new LottoMadness();
		
	}

}
