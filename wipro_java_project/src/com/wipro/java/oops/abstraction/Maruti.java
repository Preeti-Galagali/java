/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Maruti extends Car{


	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(" Maruti car has been started");
	}

	@Override
	void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println(" Maruti car has been stoped");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car car1 = new Maruti();
      car1.startEngine();
      car1.stopEngine();
	}


}
