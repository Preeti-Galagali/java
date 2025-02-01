/**
 * 
 */
package com.wipro.java;

public class Flowers {

	String flowerName;
	String flowerColor;
	
	public Flowers(String name, String color) {
		// TODO Auto-generated constructor stub
		this.flowerName = name;
		this.flowerColor = color;
	}
	
	void display() {
		
		System.out.println("Flower Name: " +flowerName);
		System.out.println("Flower Color: " +flowerColor);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Flowers flower1 = new Flowers("Lotus", "Pink");  
		Flowers flower2 = new Flowers("Lily", "White");
		flower1.display();
		flower2.display();
	}

}
