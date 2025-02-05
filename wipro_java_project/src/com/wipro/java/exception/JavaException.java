/**
 * 
 */
package com.wipro.java.exception;


public class JavaException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num1 = 35;
		int num2 = 0;
		int result;
		try {
			result = num1/num2;
			System.out.println(result);
		}
		
		catch(Exception e) {
			System.out.println(e.toString());		
	   }
	
	finally {
		System.out.println("Code is executed");
	}
		
	}		
}