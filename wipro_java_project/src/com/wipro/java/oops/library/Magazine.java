/**
 * 
 */
package com.wipro.java.oops.library;

	// Magazine class extends LibraryMaterial
	public class Magazine extends LibraryMaterial {

	    private String issueMonth;

	    // Constructor for Magazine
	    public Magazine(String title, String publisher, String issueMonth) {
	        super(title, publisher);  // Calling parent constructor
	        this.issueMonth = issueMonth;
	    }

	    // Getter and Setter methods for issueMonth
	    public String getIssueMonth() {
	        return issueMonth;
	    }

	    public void setIssueMonth(String issueMonth) {
	        this.issueMonth = issueMonth;
	    }

	    // Implementing getDetails() for polymorphism
	    @Override
	    public void getDetails() {
	        System.out.println("Magazine Title: " + getTitle() + ", Publisher: " + getAuthorOrPublisher() + ", Issue: " + issueMonth);
	    }
	}


