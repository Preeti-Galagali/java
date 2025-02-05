/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Monkey extends Animal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal monkey = new Monkey();
	      monkey.setName("Gibbon");
	      monkey.setWeight(25);
	      
	      System.out.println(monkey.getName());
	      System.out.println(monkey.getWeight());
	}

}
