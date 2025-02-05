/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class UncheckedException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of boundaries");
		}
	}

}
