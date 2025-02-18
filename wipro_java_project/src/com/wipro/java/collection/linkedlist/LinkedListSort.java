package com.wipro.java.collection.linkedlist;

import java.util.*;

//Custom comparator to sort in descending order
class DescendingOrderComparator implements Comparator<Integer> {
 @Override
 public int compare(Integer a, Integer b) {
     return b - a; // Descending order
 }
}

public class LinkedListSort {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     LinkedList<Integer> list = new LinkedList<>();
     
     System.out.println("Enter the number of elements:");
     int n = scanner.nextInt();
     
     System.out.println("Enter the elements:");
     for (int i = 0; i < n; i++) {
         list.add(scanner.nextInt());
     }
     
     // Sorting the linked list using custom comparator
     Collections.sort(list, new DescendingOrderComparator());
     
     System.out.println("Sorted list in descending order:");
     for (int num : list) {
         System.out.print(num + " ");
     }
     
     scanner.close();
 }
}
