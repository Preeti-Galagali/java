/**
 * 
 */
package com.wipro.java.oops.library;

	
	public class LibrarySystem {

	    public static void main(String[] args) {

	        // Using polymorphism to create different materials
	        LibraryMaterial book = new Book("The Java Programming Language", "James Gosling", 300);
	        LibraryMaterial magazine = new Magazine("Tech Today", "Tech Media", "January 2025");
	        LibraryMaterial dvd = new DVD("Java Basics", "John Doe", "2 hours");

	        // Accessing each object using the LibraryMaterial reference
	        book.getDetails();   // Output: Book details
	        magazine.getDetails(); // Output: Magazine details
	        dvd.getDetails();    // Output: DVD details
	    }
	}


