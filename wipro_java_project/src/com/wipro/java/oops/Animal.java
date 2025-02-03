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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAdaptability() {
		return adaptability;
	}
	
	public void setAdaptability(String adaptability) {
		this.adaptability = adaptability;
	}

}
