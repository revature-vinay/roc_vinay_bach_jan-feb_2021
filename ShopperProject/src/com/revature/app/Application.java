package com.revature.app;

import com.revature.model.Shopper;

public class Application {

	public static void main(String[] args) {
		
		// declaring a reference variable of the type Shopper
		Shopper bob;
		bob = new Shopper();
		
		
		bob.name = "Bob";
		bob.setPurchaseTotal(50.67);
		
		bob.calculateTax();
		
		bob.printDetails();
		
		Shopper bill = new Shopper();

	}

}
