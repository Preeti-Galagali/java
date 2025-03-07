package com.wipro.java.java8.usecase.junit;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.wipro.java.java8.usecase.Employee;

/**
	 * Test class for Employee.
	 */
	public class EmployeeTest {

	    private Employee employee;

	    @Before
	    public void setUp() {
	        employee = new Employee(1, "John Doe", "IT", 75000.0, LocalDate.of(2020, 5, 15));
	    }

	    @Test
	    public void testGetters() {
	        assertEquals(1, employee.getId());
	        assertEquals("John Doe", employee.getName());
	        assertEquals("IT", employee.getDepartment());
	        assertEquals(75000.0, employee.getSalary(), 0.001);
	        assertEquals(LocalDate.of(2020, 5, 15), employee.getJoiningDate());
	    }

	    @Test
	    public void testSetters() {
	        employee.setId(2);
	        employee.setName("Jane Doe");
	        employee.setDepartment("HR");
	        employee.setSalary(80000.0);
	        employee.setJoiningDate(LocalDate.of(2021, 6, 20));

	        assertEquals(2, employee.getId());
	        assertEquals("Jane Doe", employee.getName());
	        assertEquals("HR", employee.getDepartment());
	        assertEquals(80000.0, employee.getSalary(), 0.001);
	        assertEquals(LocalDate.of(2021, 6, 20), employee.getJoiningDate());
	    }

	    @Test
	    public void testToString() {
	        String expected = "Employee { ID=1, Name='John Doe', Department='IT', Salary=75000.0, Joining Date=2020-05-15 }";
	        assertEquals(expected, employee.toString());
	    }
	}