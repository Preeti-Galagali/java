/**
 * 
 */
package com.wipro.java.oops.library;


	// Book class extends LibraryMaterial
	public class Book extends LibraryMaterial {

	    private int pageCount;

	    // Constructor for Book
	    public Book(String title, String author, int pageCount) {
	        super(title, author);  // Calling parent constructor
	        this.pageCount = pageCount;
	    }

	    // Getter and Setter methods for pageCount
	    public int getPageCount() {
	        return pageCount;
	    }

	    public void setPageCount(int pageCount) {
	        this.pageCount = pageCount;
	    }

	    // Implementing getDetails() for polymorphism
	    @Override
	    public void getDetails() {
	        System.out.println("Book Title: " + getTitle() + ", Author: " + getAuthorOrPublisher() + ", Pages: " + pageCount);
	    }
	}


