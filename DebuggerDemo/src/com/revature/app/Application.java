package com.revature.app;

public class Application {

	public static void main(String[] args) {
		// Print out all prime numbers from the range of 1 to 100
		for (int i = 0; i <= 1000; i++) {
			if (MathUtility.isPrime(i)) {
				System.out.println(i);
			}
		}

	}

}
