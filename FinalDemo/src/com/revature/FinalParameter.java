package com.revature;

public class FinalParameter {

	public static void main(String[] args) {
		printNumberFinalParam(100);
		printNumber(100);
	}
	
	public static void printNumberFinalParam(final double i) {
		// cannot reassign the value of i to something else
		// i = 1000000000;
		System.out.println(i);
	}
	
	public static void printNumber(double i) {
		i = 10000.0;
		System.out.println(i);
	}

}
