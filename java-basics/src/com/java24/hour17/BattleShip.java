package com.java24.hour17;

import java.util.*;
import java.awt.*;

/**
 * You sunk my battleship!!!
 * 
 * @author Shirrine
 *
 */
public class BattleShip {
	
	private ArrayList<Point> targets = new ArrayList<>();

	/**
	 * Creates a battle ship game.
	 */
	public BattleShip(){
		
		// Create targets to shoot at
		createTargets();
		
		// Display the game map
		showMap();
		
		// Shoot at three points
		shoot(7,4);
		shoot(3,3);
		shoot(9,2);
		
		// Display the game map again
		showMap();
		
	}
	
	/**
	 * Creates three targets on the 10 x 10 board.
	 */
	private void createTargets(){
		
		// Random targets :-D
		Random random = new Random();
		
		Point p1 = new Point(random.nextInt(9) + 1, random.nextInt(9) + 1);
		targets.add(p1);
		Point p2 = new Point(random.nextInt(9) + 1, random.nextInt(9) + 1);
		targets.add(p2);
		Point p3 = new Point(9, 2); // Just so one always works ;-)
		targets.add(p3);
	}
	
	/**
	 * Displays the 10 x 10 board.
	 */
	public void showMap(){
		System.out.println("\n   1  2  3  4  5  6  7  8  9");
		for(int column = 1; column < 10; column++){
			for(int row = 1; row < 10; row++){
				if(row == 1){
					System.out.print(column + " ");
				}
				System.out.print(" ");
				Point cell = new Point(row, column);
				if(targets.indexOf(cell) > -1){
					System.out.print("X");
				} else{
					System.out.print(".");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Fires a cannon at the given x, y point.
	 * 
	 * @param x the x coordinate
	 * @param y	the y coordinate
	 */
	private void shoot(int x, int y){
		Point shot = new Point(x, y);
		System.out.println("Firing at (" + x + ", " + y + ") ... ");
		if(targets.indexOf(shot) > -1){
			System.out.println("You sank my battleship!");
			targets.remove(shot);
		} else{
			System.out.println("You missed! :-P");
		}
	}
	
	/**
	 * Starts a game of BattleShip
	 * 
	 * @param args unused
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args){
		BattleShip battleShip = new BattleShip();
	}
	
}
