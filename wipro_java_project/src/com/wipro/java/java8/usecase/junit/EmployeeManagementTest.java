package com.wipro.java.java8.usecase.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;

/**
 * Test class for EmployeeManagement.
 */
public class EmployeeManagementTest {

	private EmployeeService employeeService;
	private ByteArrayOutputStream outputStream;

	@Before
	public void setUp() {
		employeeService = new EmployeeService();
		outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream, true)); // Auto-flush enabled
	}

	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now());
		employeeService.addEmployee(emp);

		String output = outputStream.toString();
		System.out.println("Captured Output: " + output); // Debugging

		assertTrue(output.contains("Employee Added") || output.contains("added successfully"));
	}

	@Test
	public void testRemoveEmployee() {
		employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
		employeeService.removeEmployee(1);

		String output = outputStream.toString();
		System.out.println("Captured Output: " + output); // Debugging

		assertTrue(output.contains("removed") || output.contains("Employee with ID 1 removed"));
	}

	@Test
	public void testUpdateSalary() {
		employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
		employeeService.updateSalary(1, 85000.0);

		Employee updatedEmployee = employeeService.getEmployees().stream().filter(e -> e.getId() == 1).findFirst()
				.orElseThrow(() -> new AssertionError("Employee not found"));

		assertEquals(85000.0, updatedEmployee.getSalary(), 0.001);
	}

	@Test
	public void testSearchByEmployeeID() {
		employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
		employeeService.searchByEmployeeID(1);

		String output = outputStream.toString();
		System.out.println("Captured Output: " + output); // Debugging

		assertTrue(output.contains("John Doe") || output.contains("Employee { ID=1"));
	}

//    @Test
//    void testInvalidChoiceHandling() {
//        String input = "9\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//
//        String output = outputStream.toString();
//        System.out.println("Captured Output: " + output); // Debugging
//
//        assertTrue(output.contains("Invalid Choice") || output.contains("Please enter a valid option"));
//    }
}