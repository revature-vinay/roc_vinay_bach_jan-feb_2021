package com.revature.app;

public class CalculatorMain {

	public static void main(String[] args) {
		// Here I instantiate a Calculator object and the address to that object is stored in the calculator variable
		Calculator calculator = new Calculator();
		
		// Objects have state and behavior, which I can utilize
		System.out.println(calculator.name);
		
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.subtract(20, 10));
	}

}
