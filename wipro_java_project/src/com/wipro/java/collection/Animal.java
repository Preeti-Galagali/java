/**
 * 
 */
package com.wipro.java.collection;

//use of comparable sorting
import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {

	private String name; // Animal name
	private int age; //Animal age
	
	// Constructor
	public Animal(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		}

	// implementation of compareTo method
	// sorting by age
	public int compareTo(Animal a) {
		return Double.compare(this.age, a.age);
	}
	
	// Getter and Setter method
	public String getName() {
		return name;
	}
	
	public double getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a list of animals
				ArrayList<Animal> animal = new ArrayList<>();
				animal.add(new Animal("Dog", 12));
				animal.add(new Animal("Cat", 5));
				animal.add(new Animal("Rabbit",8 ));
				
				// sort animals
				// compareTo method by age
				Collections.sort(animal);
				
				// display sorted list of animals
				System.out.println("Animals after sorting by age:");
				for(Animal a : animal) {
					System.out.println(a.getName() + " " + a.getAge());
				}
	}

}
