package com.revature;

public class ScopeDriver {

	static int a; // static scoped variable, which can be accessed directly from a static method
	
	int b; // instance scoped variable, can not be accessed directly from a static method
	
	int c; // same as b
		
	public static void main(String[] args) {
		a = 20;
		System.out.println(a); // can access a directly since they are both static
		System.out.println(ScopeDriver.a); // if you're in a different class, do it this way
		
		ScopeDriver driver = new ScopeDriver();
		driver.b = 10;
		driver.c = 1000;
		
		driver.instanceMethod();
		
		staticMethod();
		
		int[] myInts = { 10, 20, 30, 40 };
		int sum = calculateArrSum(myInts);
		System.out.println("sum of myInts: " + sum);
	}
	
	public static int calculateArrSum(int[] arr) { // arr is also method scoped
		int sum = 0; // sum here is method scoped
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public void instanceMethod() {
		System.out.println("Inside instanceMethod()");
		
		sayHi(); // instance methods can access static methods directly, but not the other way around
		
		System.out.println("a (static): " + a); // I can access my static variable
		
		System.out.println("b: " + b); // accessing instance variables
		System.out.println("c: " + c);
		
		int c = 100; // variable shadowing
		System.out.println("c (method scoped): " + c); // it will access the local c
		
		System.out.println("c (instance scoped): " + this.c);
		
		System.out.println("End of instanceMethod()");
	}
	
	public static void sayHi() {
		System.out.println("Hi there!");
		
		// cannot do instanceMethod() here without creating an object first
	}
	
	public static void staticMethod() {
		int a = 100;
		System.out.println("a (local): " + a);
		
		System.out.println("a (static): " + ScopeDriver.a);
		
		// Block scope can occur in both a static method and instance method
		// Block scope will refer to blocks of code within a method (for loops, conditional blocks, while loops, etc.)
		{
			int b = 100;
			System.out.println("b (block scoped): " + b);
			System.out.println("a (local): " + a);
			System.out.println("a (static): " + ScopeDriver.a);
		}
		
		// System.out.println(b); // cannot access b because it is block scoped, while this print here is method scoped
		
		// BLOCK SCOPED
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// System.out.println(i); // DOES NOT WORK! i is only scoped to the for loop block
		
		// j is METHOD SCOPED
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}
		System.out.println("final value of j: " + j);
		
		// Conditionals (block scoped)
		if (j == 10) {
			int k = 899;
			System.out.println(k);
		}
		
		// System.out.println(k); // cannot be accessed from here
	}

}
