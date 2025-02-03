/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Mahindra extends Car {

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(" Mahindra car has been started");
	}

	@Override
	void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println(" Mahindra car has been stoped");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car2 = new Maruti();
	      car2.startEngine();
	      car2.stopEngine();
	}

}
