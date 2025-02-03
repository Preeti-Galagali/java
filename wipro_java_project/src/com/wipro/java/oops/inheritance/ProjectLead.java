/**
 * 
 */
package com.wipro.java.oops.inheritance;

/** parent class = Employee
 * child class = ProjectLead
 * extends is a keyword
 * 
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
		
		Employee employee = new ProjectLead();
		employee.setEmpId(1234);
		employee.setEmpName("Preeti");
		employee.setEmpSalary(34000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		
	}

}
