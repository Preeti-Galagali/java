package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	public CalculatorTest() {
		// TODO Auto-generated constructor stub
	}
	
	private final Calculator calculator = new Calculator();
	
	// to test add method
	@Test
	public void testAdd() {
		int result = calculator.add(3, 2);
		assertEquals(5, result);
		
	}
	// to test subtract
	@Test
	public void testSubstract() {
		int result = calculator.substract(5, 3);
		assertEquals(2, result);
		}
	
	// to test add with negative numbers
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.add(-3, -2);
		assertEquals(-5, result);
		}
	
	// to test subtract with negative numbers
	@Test
	public void testSubstractWithNegativeNumbers() {
		int result = calculator.add(-3, -2);
		assertEquals(-1, result);
		}
	
	
	
	
	
	
	

}
