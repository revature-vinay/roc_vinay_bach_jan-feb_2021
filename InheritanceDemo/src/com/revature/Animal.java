package com.revature;

// Animal will extend implicitly from the Object class
// e.g. public class Animal extends Object
public class Animal {
	
	public int numOfLegs;
	
	// This is automatically inserted by the compiler if we don't have any constructor defined in our class
	public Animal() {
		super();
		System.out.println("Animal() constructor invoked");
	}
	
	public Animal(int numOfLegs) {
		// super();
		this.numOfLegs = numOfLegs;
		System.out.println("Animal(int numOfLegs) constructor invoked");
	}
	
	public void makeNoises() {
		System.out.println("animal making generic animal noises");
	}
	
}
