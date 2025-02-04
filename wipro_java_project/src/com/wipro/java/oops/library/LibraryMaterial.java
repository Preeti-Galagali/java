/**
 * 
 */
package com.wipro.java.oops.library;


//Abstract class representing a general LibraryMaterial
public abstract class LibraryMaterial {

	    // Private instance variables for encapsulation
	    private String title;
	    private String authorOrPublisher;

	    // Constructor
	    public LibraryMaterial(String title, String authorOrPublisher) {
	        this.title = title;
	        this.authorOrPublisher = authorOrPublisher;
	    }

	    // Getter and Setter methods for encapsulation
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthorOrPublisher() {
	        return authorOrPublisher;
	    }

	    public void setAuthorOrPublisher(String authorOrPublisher) {
	        this.authorOrPublisher = authorOrPublisher;
	    }

	    // Abstract method to be implemented by subclasses (polymorphism)
	    public abstract void getDetails();
	}


