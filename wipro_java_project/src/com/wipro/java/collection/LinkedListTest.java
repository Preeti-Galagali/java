/**
 * 
 */
package com.wipro.java.collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//size of LinkedList
		int n = 5;
		
		//Declaring the list
		List<Integer> l1 = new LinkedList<Integer>();
		
		// appending the new elements at end of list
		for(int i =1; i <= n; i++) 
			l1.add(i);
		
		System.out.println(l1);
		
		// remove element at index 3
		l1.remove(3);
		
		System.out.println(l1);
		
		// printing one next to another
		for(int i = 0; i < l1.size(); i++) 
			System.out.print(l1.get(i) + " ");
		
		}

}
