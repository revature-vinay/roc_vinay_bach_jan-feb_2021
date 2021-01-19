package com.revature.app;

public class Calculator {
	
	// Classes are blueprints for objects
	// inside blueprints you can define 2 things:
	// 1. state: instance variables
	// 2. behavior: methods
	
	// This is an example of an instance variable that will belong to an object on the heap
	public String name = "TI-84";
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
}
