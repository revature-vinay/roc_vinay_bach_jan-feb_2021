package com.revature.demo;

public class VarargsDriver {

	// Var args are defined by the data type folowed by ...
	// the parameter is implicitly an array of that data type
	// Here I can actually change String[] args to String ... args
	public static void main(String... args) {
		
		int[] myIntArray = {9, 8, 7, 6, 5 };

		display("John", 1, 2, 3, 4, 5, 10, 20, 50, 708, 20, 3, 10);
		display("Mary", new int[] {1, 2, 3});
		
		display("Bill"); // the int part of the varargs parameter is optional
		
		display("Bob", myIntArray);
		
		// Precedence
		// If we have a more specific non-varargs method, it will be used over the varargs
		sayHi("Bill", "Bob");
		sayHi("Bill");
		sayHi("Bill", "Bob", "Jane");
		
		System.out.println(add(10, 20, 30, 40, 1232, 3343));
		System.out.println(add(1, 2, 1, 3));
	}
	// The ... refers to varargs (aka variable arguments)
	// the varargs parameter should go last
	public static void display(String strValue, int ... numbers) {
		System.out.println("numbers is an int array: " + (numbers instanceof int[]));
		
		System.out.println(strValue);
		
		// enhanced for loop
		for (int val : numbers) {
			System.out.println(val);
		}
	}
	
	// Two overloaded methods
	public static void sayHi(String name, String name2) {
		System.out.println("2 parameter method called");
		System.out.println("Hi, " + name);
		System.out.println("Hi, " + name2);
	}
	
	public static void sayHi(String ... names) {
		System.out.println("Varargs method called!");
		for (String name : names) {
			System.out.println("Hi, " + name);
		}
	}
	
	public static int add(int ... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		
		return sum;
	}

}
