/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Age implements Comparator<Animal2> {

public int compare(Animal2 a1, Animal2 a2) {
		
		// sorting age in descending order
		return Double.compare(a2.getAge(), a1.getAge());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating list of animals
		ArrayList<Animal2> a1 = new ArrayList<>();
		a1.add(new Animal2("Tiger", 25));
		a1.add(new Animal2("Lion", 29));
		a1.add(new Animal2("Leopard", 18));
		
		// sorting animals by age
		Collections.sort(a1, new Age());
		System.out.println("Animals sorted by age");
		for (Animal2 a : a1) {
			System.out.println(a.getName() + " " + a.getAge());
		}
	}


}
