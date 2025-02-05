/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating HashMap where integer is key and string is value
		Map<Integer, String> map = new HashMap<>();
		
		// adding key-value pairs to map
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Apple");
		
		//accessing values by key
		System.out.println("Key 1:" + map.get(1));
		System.out.println("Key 2:" + map.get(2));
		
		// checking if key exists in a map
		if(map.containsKey(3)) {
			System.out.println("Key 3 exists with value:" + map.get(3));
			
		}
		
		// iterating over the map using for-each loop
		System.out.println("Iterating through the map:");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// removing key-value pair
		map.remove(2);
		
		// iterating over the map using for-each loop
		System.out.println("Map after removal of key 2:");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
	}

}