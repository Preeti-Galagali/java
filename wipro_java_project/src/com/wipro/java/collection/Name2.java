/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Name2 implements Comparator<Animal2> {

public int compare(Animal2 a1, Animal2 a2) {
		
		// sorting name by Alphabetical order
		return a1.getName().compareTo(a2.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating list of animals
		ArrayList<Animal2> animals = new ArrayList<>();
		animals.add(new Animal2("Tiger", 25));
		animals.add(new Animal2("Lion", 29));
		animals.add(new Animal2("Cheetah", 18));
		
		// sorting animals by name and displaying
		Collections.sort(animals, new Name2());
		System.out.println("Animals sorted by name");
		for (Animal2 a : animals) {
			System.out.println(a.getName() + " " + a.getAge());
		}
	}

}
