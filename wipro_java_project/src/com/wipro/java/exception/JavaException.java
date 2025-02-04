/**
 * 
 */
package com.wipro.java.exception;


public class JavaException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int i = 35;
		int j = 0;
		int result;
		try {
			result = i/j;
			
		}
		
		catch(Exception e) {
			System.out.println(e.toString());		
	   }
	
	finally {
		System.out.println("Code is executed");
	}
		
	}		
}