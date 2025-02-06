/**
 * 
 */
package com.wipro.java.java8;


public class DefaultMethod implements Shapes {

	// implementation of square abstract method
	public void cube(int a) {
		  System.out.println("Cube: " + (a*a*a));
	  }
	  
	  public static void main(String[] args) {
		  
		  DefaultMethod dm = new DefaultMethod();
		  dm.cube(4);
		  
		  // default method executed
		  System.out.println(dm.show(4));
		  System.out.println(dm.cube1(5));
		  
		  // static method executed
		  System.out.println(Shapes.show());
		  System.out.println(Shapes.show1());
		  
		  
	  }

}
