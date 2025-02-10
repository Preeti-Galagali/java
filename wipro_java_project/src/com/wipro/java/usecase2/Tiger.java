package com.wipro.java.usecase2;

public class Tiger extends Animal {
	
	private String adaptability;

	public Tiger(String name, int age, double weight) {
		super(name, age, weight);
		this.adaptability = adaptability;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void display() {
		super.display();
		System.out.println("Animal Adaptability: " + adaptability);
	}

}
