/**
 * 
 */
package com.wipro.java.oops.library;


	// DVD class extends LibraryMaterial
	public class DVD extends LibraryMaterial {

	    private String duration;

	    // Constructor for DVD
	    public DVD(String title, String director, String duration) {
	        super(title, director);  // Calling parent constructor
	        this.duration = duration;
	    }

	    // Getter and Setter methods for duration
	    public String getDuration() {
	        return duration;
	    }

	    public void setDuration(String duration) {
	        this.duration = duration;
	    }

	    // Implementing getDetails() for polymorphism
	    @Override
	    public void getDetails() {
	        System.out.println("DVD Title: " + getTitle() + ", Director: " + getAuthorOrPublisher() + ", Duration: " + duration);
	    }
	}


