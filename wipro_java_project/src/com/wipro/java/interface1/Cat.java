/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Cat implements Animal {

	public void makeSound() {
		System.out.println("Cat is meowing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Animal cat = new Cat();
		cat.makeSound();
	}

}
