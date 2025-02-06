/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
public class DefaultUseCase implements TestInterface, TestInterface2 {

	public void show() {
		 
		 // use super keyword to call the show
		 // method of 
		 TestInterface.super.show();
		 // use super keyword to call the show
		 // method of 
		 TestInterface2.super.show();
	 }
	 
	// implementation of a code
	 public static void main (String args[]) {
		 DefaultUseCase dm = new DefaultUseCase();
		 dm.show();
		 
	 }
}
