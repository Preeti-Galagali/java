/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Tiger extends Animal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Animal tiger = new Tiger();
	      tiger.setName("Bengal tiger");
	      tiger.setWeight(250);
	      
	      System.out.println(tiger.getName());
	      System.out.println(tiger.getWeight());
	}

}
