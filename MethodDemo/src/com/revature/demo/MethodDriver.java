package com.revature.demo;

public class MethodDriver {
	
	public double purchaseAmount;
	public double tax;
	
	public static void main(String[] args) {
//		int x = add(10, 20);
//		System.out.println(x);
		
		double y = add(10, 20.815);
		System.out.println(y);
		
		int z = add(10, 20, 30);
		System.out.println(z);
		
		int w = MethodDriver.doSomething(10, 20); // Including the reference to MethodDriver to access add is optional because I am in the same class
		System.out.println("w: " + w);
		
		MethodDriver shopper = new MethodDriver();
//		shopper.purchaseAmount = 100;
		shopper.calculateTax(100);
		
		MethodDriver shopper2 = new MethodDriver();
//		shopper2.purchaseAmount = 34.5;
		shopper2.calculateTax(34.5);
		
		System.out.println(shopper.tax);
		System.out.println(shopper2.tax);
	}
	
	public void calculateTax(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
		tax = multiply(0.15, this.purchaseAmount);
	}
	
	/*
	 * These are static methods
	 * 
	 * We are 
	 */
	public static double multiply(double x, double y) {
		return x * y;
	}
	
	public static int doSomething(int x, int y) {
		System.out.println("Invoking add method with 2 int parameters");
		int result = x + y;
		return result;
	}
	
	public static double add(int x, double y) {
		System.out.println("Invoking add method with int and double parameter");
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		System.out.println("Invoking add method with 3 int parameters");
		return x + y + z;
	}

}
