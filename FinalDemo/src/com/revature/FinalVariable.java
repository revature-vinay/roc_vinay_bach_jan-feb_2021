package com.revature;

import java.util.ArrayList;

public class FinalVariable {

	public static void main(String[] args) {
		final int i;
		i = 10;
		
		final int j = 30;
		
		
		/*
		 * Reference variables
		 * 
		 * Contents of the object can change
		 * but you cannot change the object it is referring to
		 */
		final int[] myFinalArray = { 10, 20, 30 }; // size 3 int array
		myFinalArray[0] = 100;
		// NOT ALLOWED
		// myFinalArray = new int[10]; 
		
		final ArrayList<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hi");
		listOfStrings.add("Hello");
		System.out.println(listOfStrings);
		
		// NOT ALLOWED
		// listOfStrings = new ArrayList<>();
		
	}

}
