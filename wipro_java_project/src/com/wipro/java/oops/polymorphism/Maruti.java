/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Maruti extends Car {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car car1 = new Maruti();
      car1.setBrand("Swift");
      car1.setYear(1980);
      
      System.out.println(car1.getBrand());
      System.out.println(car1.getYear());
	}

}
