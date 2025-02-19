package com.wipro.java.collection.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapWithDuplicates {

	public static void main(String[] args) {
        // HashMap to store students with duplicate names and roll numbers
        Map<String, List<Student>> studentMap = new HashMap<>();

        // Sample student data
        List<Student> students = Arrays.asList(
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Alice", 103),
            new Student("Charlie", 104),
            new Student("David", 105),
            new Student("Bob", 106),
            new Student("Eve", 107),
            new Student("Alice", 101),  // Duplicate roll number
            new Student("Charlie", 108),
            new Student("David", 109)
        );

        // Adding students to the HashMap
        for (Student student : students) {
            studentMap.computeIfAbsent(student.name, k -> new ArrayList<>()).add(student);
        }

        // Display the HashMap contents
        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
