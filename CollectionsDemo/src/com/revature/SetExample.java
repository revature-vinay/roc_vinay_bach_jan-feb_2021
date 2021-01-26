package com.revature;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		/*
		 * HashSet example
		 */
		
		// Sets can not have duplicate elements
		// This is the main characteristic of Sets
		Sandwich s1 = new Sandwich("Wheat", "Cheddar", true, "Turkey", 0.25); 
		// These two sandwiches have the same properties
		// but are different objects
		Sandwich s2 = new Sandwich("Wheat", "Cheddar", true, "Turkey", 0.26);
		
		// Here we are using a HashSet, which does not guarantee order
		Set<Sandwich> set1 = new HashSet<>();
		// Whenever Sets check to see if elements are duplicate or not, they rely on the .equals() method
		// Since we are overriding .equals(), we should also ideally override .hashCode() just to be consistent
		System.out.println("s1 added: " + set1.add(s1));
		System.out.println("s2 added: " + set1.add(s2));
		
		for (Sandwich s : set1) {
			System.out.println(s);
		}
		
		/*
		 * TreeSet example
		 */
		
		// Treesets are ordered, based on the natural ordering of elements
		// In the case of strings, this will be in lexicographical (alphabetical) order
		Set<String> set2 = new TreeSet<>();
		
		set2.add("Peaches");
		set2.add("Avocados");
		set2.add("Apples");
		set2.add("Plums");
		set2.add("Oranges");
		set2.add("Kiwis");
		
		System.out.println();
		for (String fruit : set2) {
			System.out.println(fruit);
		}
		
		System.out.println();
	}
	
}
