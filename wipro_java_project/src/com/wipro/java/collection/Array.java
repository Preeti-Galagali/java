/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
public class Array {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring an array for 5 integers
		int[] arr;
		arr = new int[5];
		
		// initialization of array elements
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// printing array elements
		System.out.println("Array elements");
		
		// using for loop printing array elements
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
