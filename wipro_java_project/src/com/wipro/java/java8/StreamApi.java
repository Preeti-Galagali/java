/**
 * 
 */
package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	
	public StreamApi() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating list of String type
		List<String> list = Arrays.asList("Preeti", "Harsha", "Prema");
		List<String> stream = list.stream().filter(name -> name.startsWith("P")).collect(Collectors.toList());
		// display the value which starts with p letter
		System.out.println(stream);
		
		// Creating another list of String type
		List<String> stream1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);
		
		// Creating list of Integer type
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		//displaying sorted numbers
		System.out.println(sortedNumbers);
		
		// Creating another list of Integer type
		List<Integer> numbers1 = Arrays.asList(10, 20, 5, 25, 30);
		int min = numbers1.stream().min(Integer::compare).get();
		int max = numbers1.stream().max(Integer::compare).get();
		// displaying minimum and maximum value
		System.out.println(min);
		System.out.println(max);
		
		}

}
