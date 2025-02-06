/**
 * 
 */
package com.wipro.java.java8;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	
	// Function to check time and date
	
	public static void checkingAdjusters() {
		
		LocalDate date = LocalDate.now();
		System.out.println("The current date is " + date);
		
		// to get first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		
		System.out.println("FirstDayOfNextMonth: " + dayOfNextMonth);
		
		// get next saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println("Next saturday from now is " + nextSaturday);
		
		//first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		
		System.out.println("FirstDayOfMonth : " + firstDay);
		
		// last day of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("LastDayOfMonth: " + lastDay);
	}
	
	// driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkingAdjusters();
		
	}

}
