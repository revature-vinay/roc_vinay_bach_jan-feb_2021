package com.revature.demo;

import java.util.Arrays;

public class ArrayDriver {

	public static void main(String[] args) {
		// Array declarations
		int myIntArray[];
		int[] myOtherIntArray;
		// This one is more popular
		
		// Array instantiation
		myIntArray = new int[5]; // default value
		// for int elements is 0
		System.out.println(myIntArray);
		System.out.println(Arrays.toString(myIntArray));
		
		// Instantiating an int array of size 5, which cannot
		// change
		myOtherIntArray = new int[] { 100, 2, 10, 25, 60 };
		System.out.println(Arrays.toString(myOtherIntArray));
		myOtherIntArray[3] = 1000;
		// Use the static method toString inside the Arrays class
		// to view the actual values stored inside the array
		System.out.println(Arrays.toString(myOtherIntArray));
		System.out.println(myOtherIntArray.length);
		
		char[] myCharArray = {'a', 'b', 'c'};
		
		// for loop iteration
		for (int i = 0; i < myCharArray.length; i++) {
			System.out.println("value at index " + i + " : " + myCharArray[i]);
		}
		
		// enhanced for loop
		for (char c : myCharArray) {
			System.out.println(c);
		}
		
		// we can also have arrays that contain objects, for example Strings
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bill";
		names[2] = "Pedro";
		System.out.println(Arrays.toString(names));
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// multi-dimensional arrays
		int[][] the2DArray = new int[3][3]; // default value of 0
		
		int[][] my2DArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		System.out.println(my2DArray[2][1]);
		
		// Nested for loop to tranverse through it
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				System.out.println(my2DArray[i][j]);
			}
		}
		
		// enhanced for loop
		for (int[] myArray : my2DArray) {
			for (int number : myArray) {
				System.out.println(number);
			}
		}
	}

}
