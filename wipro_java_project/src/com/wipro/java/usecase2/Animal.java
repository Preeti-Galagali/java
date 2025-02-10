package com.wipro.java.usecase2;

public class Animal {

	private String name;
	private int age;
	private double weight;
	
	
	public Animal(String name, int age, double weight) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
		this.weight = weight;
			
		}
	
	// Getter methods to get name, age and weight
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	
	// display method to display animal properties 
	public void display() {
		System.out.println("Animal Name:" +name + " Animal Age: " + age + " Animal Weight: " + weight);
	}
}
