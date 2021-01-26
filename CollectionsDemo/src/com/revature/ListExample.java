package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<List<String>> twoDimStringList = new ArrayList<>(); // List of List of Strings (2D)
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("Peaches");
		list1.add("Avocados");
		list1.add("Apples");
		list1.add("Plums");
		list1.add("Oranges");
		list1.add("Kiwis");
		list1.add("Kiwis");
		list1.add("Kiwis");
		
		System.out.println("list1: " + list1);
		System.out.println("list1 size: " + list1.size());
		
		list1.add(0, "Pears");
		System.out.println("list1: " + list1);
		System.out.println("list1 size: " + list1.size());
		
		System.out.println(list1.get(4)); // gets the 5th element, since we start at index 0
		list1.remove(new String("Kiwis")); // remove uses the .equals() to see what to remove
		System.out.println("list1: " + list1);
		System.out.println("list1 size: " + list1.size());
		
		list1.remove(5);
		System.out.println("list1: " + list1);
		System.out.println("list1 size: " + list1.size());
		
		// traversing list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
//			if (list1.get(i).contains("Kiwis")) {
//				list1.remove(i);
//				i--;
//			}
		}
		System.out.println("==================");
		
		// For each traversal (enhanced for loop)
		for (String i : list1) {
			System.out.println(i);
//			list1.remove("Kiwis"); // I cannot remove elements when I am inside an enhanced for loop
			// ConcurrentModificationException
		}
		
		// Using iterators
		// Iterators navigate in one direction
		// Once we finish iterating, we must obtain a new iterator
		// Iterators start before the first element, and in order to obtain the first element, we must then invoke the
		// next() method
		System.out.println("=== ITERATOR ===");
		Iterator<String> iter = list1.iterator();
		
		String element;
		while (iter.hasNext()) {
			element = iter.next();
			
			if (element.equals("Kiwis")) {
				iter.remove();
			}
		}
		
		System.out.println("list1: " + list1);
		
		// contains, indexOf
		System.out.println("list1 contains 'Apples': " + list1.contains("Apples"));
		System.out.println("indexOf 'Apples': " + list1.indexOf("Apples"));
		System.out.println("indexOf 'Strawberries': " + list1.indexOf("Strawberries")); // returns -1 if it doesn't exist
		
		System.out.println("=======");
		System.out.println("list1: " + list1);
		// Collections is a class with a bunch of static methods that can be used to perform operations on various
		// Collections
		// This is known as a utility class
		Collections.sort(list1);
		System.out.println("list1: " + list1);
		
		Collections.reverse(list1);
		System.out.println("list1: " + list1);
	}

}
