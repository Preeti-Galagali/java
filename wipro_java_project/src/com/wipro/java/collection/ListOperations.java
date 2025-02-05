/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an list object
		List<Integer> l1 = new ArrayList<Integer>();
		
		//adding elements
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,2);
		
		
		System.out.println(l1);
		
		//creating another list object
        List<Integer> l2 = new ArrayList<Integer>();
		
		//adding elements
		l2.add(1);
		l2.add(2);
		l2.add(2);
		
		//will add list l2 from index 1
		l1.addAll(1, l2);
		
		System.out.println(l1);
		
		// removes element from index 1
		l1.remove(1);
		
		System.out.println(l1);
		
		// getting an element at index 3 in l1
		System.out.println(l1.get(3));
		
		// set method
		l1.set(0,  5);
		System.out.println(l1);
	}
	
	

}
