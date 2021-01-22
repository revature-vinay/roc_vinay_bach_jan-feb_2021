package com.revature.model;

public class Shopper {

	// Properties (fields)
	public String name; // fields have default values. For reference type fields, it will be null
	public double purchaseTotal; // for numeric primitives it will be 0.0 or 0 depending on if it is a floating point or integral value
	public double tax;
	
	// Behaviors (methods)
	public void calculateTax() {
		this.tax = 0.1 * purchaseTotal;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Purchase Total: " + purchaseTotal);
		System.out.println("Tax: " + tax);
	}
	
	public void setPurchaseTotal(double purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}
}
