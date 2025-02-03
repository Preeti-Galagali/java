/**
 * 
 */
package com.wipro.java.oops.encapsulation;


public class Animal {

	
	public Animal(String name, int weight) {
		// TODO Auto-generated constructor stub
		super();
		this.setName(name);
		this.setWeight(weight);
	}
	
	private String name;
	private int weight;

	/**
	 * @param args
	 */
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		
		if (weight>0) {
		this.weight = weight;
	}
		else {
			System.out.println("Weight should be in positive");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Animal animal = new Animal("Tiger", 250);
		System.out.println(animal.getName());
		System.out.println(animal.getWeight());
		
		animal.setWeight(300);
		System.out.println(animal.getWeight());
		
		animal.setWeight(-250);
	}

}
