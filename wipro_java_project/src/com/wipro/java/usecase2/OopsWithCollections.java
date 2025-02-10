
package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class OopsWithCollections {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating an List
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Animal("Cat", 6, 12));
		animalList.add(new Tiger("Bengal Tiger", 25, 220));
		animalList.add(new Animal("Dog" , 10, 25));
		
		// creating a Set
		Set<Animal> animalSet = new HashSet<>(animalList);
		
		// creating Map
		Map<Integer, Animal> animalMap = animalList.stream()
				.collect(Collectors.toMap(Animal :: getAge, animal -> animal)); 
		
		// displaying list
		System.out.println("Animal List:");
		animalList.forEach(Animal:: display);
		
		// displaying set
		System.out.println("Animal Set:");
		animalSet.forEach(Animal:: display);
		
		// displaying map
		System.out.println("Animal Map:");
		animalMap.forEach((key, value) -> {
			System.out.println("Key: " + key);
			value.display();
		});
	}

}
