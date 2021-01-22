package com.revature.demo;

import java.util.ArrayList;

public class WrapperDriver {

	public static void main(String[] args) {
		System.out.println("Max value an integer can have: " + Integer.MAX_VALUE);
		System.out.println("Min value an integer can have: " + Integer.MIN_VALUE);
		
		int primitiveInt = 5;
		Integer wrapperInteger1 = new Integer("5");
		Integer wrapperInteger2 = new Integer(5);
		
		// This one is a lot better
		Integer wrapperIntAutoboxing = 5; // Conversion from primitive int 5 to Integer wrapper object
		
		Integer result = 50 + wrapperIntAutoboxing; // it will unbox automatically the value inside the Integer wrapper object
		// and add it to 50
		System.out.println(result);
		int unboxingExample = wrapperIntAutoboxing; // unboxing
		
		// I cannot use primitives in these data structures, so I need to use an Object
		// The main difference between an Array is ArrayList is that Array is a fixed size
		// ArrayList can have a changing size
		ArrayList<Double> arrayList = new ArrayList<>();
		arrayList.add(10.0); // 0
		arrayList.add(20.0); // 1
		arrayList.add(-15.0); // 2
		
		Double myDouble = arrayList.get(2);
		System.out.println(myDouble);
		
		System.out.println(wrapperInteger1 == wrapperInteger2); // They are not the same object in memory, so 
		// returns false
		System.out.println(wrapperInteger1.equals(wrapperInteger2));
		
		System.out.println("wrapperInteger1 == 5: " + (wrapperInteger1 == 5)); // wrapperInteger1 is being unboxed into int
		
		int x = 5;
		int y = 5;
		boolean result2 = x == y;
		
		String s = "Hello";
		String s1 = new String("hello"); // This object, because of the new keyword, is not stored in the String pool
		// it is stored in the regular part of the heap
		System.out.println(s == s1); // == compares where they are stored, (if they are the same object)
		System.out.println(s.equals(s1)); 
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		MyOwnIntegerWrapperClass customWrapper = new MyOwnIntegerWrapperClass(50);
		int myValue = customWrapper.intValue();
		System.out.println(myValue);
	}
	
	public static void parsing() {
		int parsedInt = Integer.parseInt("5");
		System.out.println(parsedInt);
		
		Integer parsedWrapperInt = Integer.valueOf("5");
		System.out.println(parsedWrapperInt);
	}
	
}
