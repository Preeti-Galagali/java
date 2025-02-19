package com.wipro.java.collection.hashmap;

import java.util.*;
public class Student {

	String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name;
    }
}

