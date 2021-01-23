package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Challenge {

	public static void main(String[] args) {
		/*
		 * Problem setup
		 */
		List<Integer> row1 = new ArrayList<>();
		row1.add(11);
		row1.add(2);
		row1.add(4);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(10);
		row3.add(8);
		row3.add(-12);
		
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);

		/*
		 * Problem implementation
		 */
		int leftright = 0;
		int rightleft = 0;
		for (int i = 0, j = arr.size() - 1; 
				i < arr.size() && j >= 0; 
					i++, j--) {
			leftright += arr.get(i).get(i);
			rightleft += arr.get(i).get(j);
		}

		System.out.println("Input matrix: " + arr);
		
		if ((leftright - rightleft < 0)) {
			System.out.println((leftright - rightleft) * -1);
		} else {
			System.out.println(leftright - rightleft);
		}
	}
	
	// Assignment:
	// Come up with an example of inheritance and polymorphism
	// and how you might accomplish that
	// Have constructors
	// Have getters and setters
	// have different methods
	// Method overriding in the child class, and show inheritance

}
