package com.wipro.java.java8;

// single abstract method
// @Functional interface
// default and static 

@FunctionalInterface
  public interface Shapes {
 
	// abstract method
	public void cube(int a);
	
	//default method
	default String show(int a) {
		return "Default method 1 executed with value: " + a;
	}
	//default method
	default String cube1 (int a) {
		
		return "Default method 2 executed with value: " + (a *a *a);
	}
	
	//static method
		static String show()
		{
			return "Static Method 1 Executed";
		}
		
		//static method
				static String show1()
				{
					return "Static Method 2 Executed";
				}
      }


   



