package com.revature;

// Animal will extend implicitly from the Object class
// e.g. public class Animal extends Object
public class Animal {
	
	public int numOfLegs;
	
	// This is automatically inserted by the compiler if we don't have any constructor defined in our class
	public Animal() {
		super();
	}
	
	public void makeNoises() {
		System.out.println("animal making generic animal noises");
	}
	
}
