/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
public class DefaultMethod implements Shapes {

	public void cube(int a) {
		  System.out.println("Cube: " + (a*a*a));
	  }
	  
	  public static void main(String[] args) {
		  
		  DefaultMethod dm = new DefaultMethod();
		  dm.cube(4);
		  
		  System.out.println(dm.show(4));
		  System.out.println(dm.cube1(5));
		  
		  System.out.println(Shapes.show());
		  System.out.println(Shapes.show1());
		  
		  
	  }

}
