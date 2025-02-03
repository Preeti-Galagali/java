/**
 * 
 */
package com.wipro.java.oops.inheritance;

/** parent class = Employee
 * child class = Manager
 * extends is a keyword
 * 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
		
		Employee employee = new Developer();
		employee.setEmpId(124);
		employee.setEmpName("Raju");
		employee.setEmpSalary(35000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		
	}


}
