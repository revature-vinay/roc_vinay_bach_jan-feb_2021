package com.revature.app;

import com.revature.mysecondsubpackage.Test;

public class CastingDriver {

	public static void main(String[] args) {
		/*
		 * Implicit casting example
		 * 
		 * Widening conversion from int to long,
		 * since ints can fit inside longs
		 */
		long myLong; // declaration only
		int myInt = 1000; // declaration and initialization
		
		// initialization step
		myLong = myInt; // myInt is being implicitly casted from an int type to a long type
		System.out.println(myLong);
		
		/*
		 * Explicit casting example
		 * 
		 * Narrowing conversion from double to int
		 */
		double myDouble = 13.9999999;
		int myInt2;
		myInt2 = (int) myDouble; // explicit cast
		System.out.println(myInt2);
		
		// Narrowing conversion 
		long myLong2 = 100; // implicit casting from integer literal to long
		myLong2 = 100000;
		byte myByte = (byte) myLong2;
		System.out.println(myByte);
		
		/*
		 * Reference type casting
		 * 
		 * We have 
		 * 	1. upcasting: from more specific to less specific
		 * 	2. downcasting: from less specific to more specific
		 * 
		 * Strings in Java are not primitives, they are objects
		 * so we can assign a string object to a String reference variable
		 * The reference variable does not contain the String object itself, instead it is an address to the object
		 */
		String myStr = "Hello There!"; // I am essentially creating a String object with an internal value of Hello There! (behind the scenes it is actually
		// an array of char values
		// myStr is not storing the value "Hello There!", it is only storing an address to the object
		// unlike primitive data types, which do store the value
		
		// There is a special Object class that every other class either directly or indirectly extends from. So I can 
		// actually refer to my string object using a reference variable of the type Object
		Object myObj = myStr; // implicit casting, because we are upcasting from the more specific String class to a less
		// specific Object class that the String class extends from
		
		// Downcasting is unsafe
		String myStr2 = (String) myObj;
		System.out.println(myStr2);
		
		// Why unsafe?
		// A String is an Object, therefore I can downcast
		// But it is unsafe, because myObj is not necessarily pointing to a String object
		// So here I get an error when I do (String) myObj
//		myObj = new CastingDriver();
//		String myStr3 = (String) myObj; 
//		System.out.println(myStr3);
	}

}
