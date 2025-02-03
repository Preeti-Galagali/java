/**
 * 
 */
package com.wipro.java.oops;

/** no constructor
 * getter have return value
 * setter have no return value
 * properties are determined using private fields
 * value or behaviors determined via setter
 * 
 */
public class Animal {

	private String name;
	private int age;
	private String adaptability;
	

	/**
	 * @param args
	 */
	
	// Getter for getName
	public String getName() {
		return name;
	}
	
	// Setter for setName
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for getAge
	public int getAge() {
		return age;
	}
	
	// Setter for setAge
	public void setAge(int age) {
		this.age = age;
	}
	
	// Getter for getAdaptability
	public String getAdaptability() {
		return adaptability;
	}
	
	// Setter for setAdaptability
	public void setAdaptability(String adaptability) {
		this.adaptability = adaptability;
	}

	@Override
	public String toString() {
		return "Animal [Animal Name:" + name +  " , Animal Age:" + age + ", Animal Adaptability: " + adaptability + "]";
	}
}
