/**
 * 
 */
package com.wipro.java.oops;

/**
 * Employee class representing an employee's details
 */

public class Employee {

	//Private fields
	private int empId;
	private String empName;
	private float empSalary;

	//Getter and Setter for getId
	public int getEmpId() {
		return empId;
	}
	
	//Getter and Setter for setId
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//Getter and Setter for getName
	public String getEmpName() {
		return empName;
	}
	
	//Getter and Setter for setName
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//Getter and Setter for getSalary
	public double getEmpSalary() {
		return empSalary;
	}
	
	//Getter and Setter for setSalary
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Employee Id:" + empId +  " , Name:" + empName + ", Salary: " + empSalary + "]";
	}
	
}
