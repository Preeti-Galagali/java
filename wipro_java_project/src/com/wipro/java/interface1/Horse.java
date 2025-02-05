/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Horse implements Animal {

	
	public void makeSound() {
			System.out.println("Horse is neighing");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			Animal horse = new Horse();
			horse.makeSound();
		}
	}

