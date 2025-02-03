/**
 * 
 */
package com.wipro.java.oops.polymorphism;


public class Mahindra extends Car {

	
	public Mahindra() {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Car car2 = new Mahindra();
	      car2.setBrand("Thar");
	      car2.setYear(1945);
	      
	      System.out.println(car2.getBrand());
	      System.out.println(car2.getYear());
		}
	}


