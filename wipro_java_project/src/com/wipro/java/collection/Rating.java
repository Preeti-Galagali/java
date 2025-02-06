/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator to sort movies by rating
public class Rating implements Comparator<Movie1> {

	
public int compare(Movie1 m1, Movie1 m2) {
		
	// sorting in descending order
		return Double.compare(m2.getRating(), m1.getRating());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a list movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens", 8.3, 2015));
		m1.add(new Movie1("Star Wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));
		
		// sorting movies by rating and displaying
		Collections.sort(m1, new Rating());
		System.out.println("Movies sorted by rating");
		for (Movie1 m : m1) {
			System.out.println(m.getRating() + " " + m.getName() + " " + m.getYear());
		}
	}

}
