/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CheckedAndUncheckedException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = null;
          
          System.out.println("Checked Exception");
		try {
			File file = new File("Wrong path");
			FileReader reader = new FileReader(file);
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
			System.out.println("File does not exists");
		}
		
		 System.out.println("Unchecked Exception");
		try {
			
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("String is null");
		}
		System.out.println("Program continues");
	}

}
