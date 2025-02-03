/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**parent class = Employee
 * child class = Developer
 * extends is a keyword
 * 
 */
public class Developer extends Employee {

	/**
	 *  
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
		
		Employee employee = new Developer();
		employee.setEmpId(123);
		employee.setEmpName("Pranvi");
		employee.setEmpSalary(32000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		
	}

}
