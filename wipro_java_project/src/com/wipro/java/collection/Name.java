/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator to sort movies by Name
public class Name implements Comparator<Movie1> {

	
	public int compare(Movie1 m1, Movie1 m2) {
		
		// sorting name by Alphabetical order
		return m1.getName().compareTo(m2.getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens", 8.3, 2015));
		m1.add(new Movie1("Star Wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));
		
		// sorting movies by name and displaying
		Collections.sort(m1, new Name());
		System.out.println("Movies sorted by name");
		for (Movie1 m : m1) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}

}
