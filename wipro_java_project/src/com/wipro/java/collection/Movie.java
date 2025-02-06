/**
 * 
 */
package com.wipro.java.collection;

// use of comparable sorting
import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

	private String n; // MovieName
	private double r; // Movie Rating
	private int y; //Release Year
	
	// Constructor
	public Movie(String n, double r, int y) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.r = r;
		this.y = y;
	}

	// implementation of comapreTo method
	// sorting by rating
	public int compareTo(Movie m) {
		return Double.compare(this.r, m.r);
	}
	
	// Getter and Setter method
	public String getName() {
		return n;
	}
	
	public double getRating() {
		return r;
	}
	public int getYear() {
		return y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a list of movies
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie("Star Wars", 8.7, 1977));
		l.add(new Movie("Empire Strikes Back", 8.8, 1980));
		l.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		// sort movies
		// compareTo method by ratings
		Collections.sort(l);
		
		// display sorted list of movies
		System.out.println("Movies after sorting by ratings:");
		for(Movie m : l) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}

}
