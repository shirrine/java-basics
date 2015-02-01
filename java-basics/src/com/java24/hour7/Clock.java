package com.java24.hour7;

import java.time.*;

import static java.time.temporal.ChronoField.*;

/**
 * Conditionals at work!
 * 
 * @author Shirrine
 *
 */
public class Clock {
	
	public static void main(String[] args){
		
		// Get current date and time
		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(HOUR_OF_DAY);
		int minute = now.get(MINUTE_OF_HOUR);
		int month = now.get(MONTH_OF_YEAR);
		int day = now.get(DAY_OF_MONTH);
		int year = now .get(YEAR);
		
		// Display greeting
		String greeting;
		if (hour < 12){
			greeting = "Good morning!";
		} else if(hour < 17){
			greeting = "Good afternoon!";
		} else{
			greeting = "Good evening!";
		}
		System.out.println(greeting);
		
		// Begin time message
		System.out.print("It's");
		
		// Display minutes
		if(minute != 0){
			String timeMessage = " " + minute + " ";
			timeMessage += (minute != 1) ? "minutes" : "minute";
			timeMessage += " past";
			System.out.print(timeMessage);
		}
		
		// Display hour
		String hourMessage = " ";
		hourMessage += (hour > 12) ? (hour - 12) : hour;
		hourMessage += " o'clock on ";
		System.out.print(hourMessage);
		
		// Display month
		String monthMessage = "";
		switch(month){
			case 1: monthMessage = "January"; break;
			case 2: monthMessage = "February"; break;
			case 3: monthMessage = "March"; break;
			case 4: monthMessage = "April"; break;
			case 5: monthMessage = "May"; break;
			case 6: monthMessage = "June"; break;
			case 7: monthMessage = "July"; break;
			case 8: monthMessage = "August"; break;
			case 9: monthMessage = "September"; break;
			case 10: monthMessage = "October"; break;
			case 11: monthMessage = "November"; break;
			case 12: monthMessage = "December"; break;
		}
		System.out.print(monthMessage);
		
		// Display date and year
		System.out.println(" " + day + ", " + year + ".");
	}

}
