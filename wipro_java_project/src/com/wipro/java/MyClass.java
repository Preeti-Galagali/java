/**
 * 
 */
package com.wipro.java;


public class MyClass {

	int num = 5;
	
	public void changeValue(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	
		}
	public MyClass(){
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.changeValue(10);
		System.out.println(obj.num);

	}

}
