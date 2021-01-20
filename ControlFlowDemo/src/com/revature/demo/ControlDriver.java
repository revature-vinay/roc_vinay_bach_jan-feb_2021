package com.revature.demo;

public class ControlDriver {

	public static void main(String[] args) {
		
		/*
		 * If statement
		 */
		int num = 100;
		if (num < 200) {
			System.out.println("The variable num is less than 200. It is " + num);
		}
		
		/*
		 * If-else statement
		 */
		if (num < 100) {
			System.out.println("The variable num is less than 100. It is " + num);
		} else {
			System.out.println("The variable num is greater than or equal to 100. It is " + num);
		}
		
		/*
		 * Chaining if-else statements
		 * (else if) structure
		 * 
		 * The first condition that is true will be the block that executes, and only that block
		 */
		int age = 70;
		if (age < 18) {
			System.out.println("You are a minor!");
		} else if (age < 40) {
			System.out.println("You are a young adult");
		} else if (age < 65) {
			System.out.println("You are a middle aged adult");
		} else {
			System.out.println("You are 65 or older");
		}
		
		/*
		 * Nested if statements
		 */
		num = 99;
		if (num < 101) {
			System.out.println("The variable num is less than 101");
			
			if (num % 2 == 0) {
				System.out.println("The variable num is even and less than 101");
			} else {
				System.out.println("The variable num is odd and less than 101");
			}
		}
		
		/*
		 * Switch statements
		 * Work with byte, short, char, int, enum, String, and "primitive Wrapper classes"
		 */
		int month = 1;
		switch (month) {
		case 1:
			System.out.println("It is the first month of the year");
			System.out.println("It is January");
			break;
		case 2:
			System.out.println("It is February");
			break;
		case 3:
			System.out.println("It is March");
			break;
		case 4:
			System.out.println("It is April");
			break;
			// without including break at the end of each case block, then you will experience something
			// called "fall-through"
		default:
			System.out.println("It is not January, February, March, or April");
		}
		
		/*
		 * Loops (or looping statements)
		 * 
		 * - for
		 * - while
		 * - do-while
		 */
		for (int i = 0; i < 1000; i++) {
			System.out.println("The value of i: " + i);
		}
		
		System.out.println("Done with the loop");
		
		for (int i = 5; i > 0; i--) {
			System.out.println("The value of i: " + i);
		}
		
		for (int i = 0; i < 100; i = i + 3) {
			System.out.println("The value of i: " + i);
		}
		
		/*
		 * While loop
		 */
		int number = 100;
		while (number > 0) {
			System.out.println(number);
			number--;
		}
		
		/*
		 * Do-while loop
		 */
		System.out.println("=======================");
		number = 0;
		do {
			System.out.println(number);
			number--;
		} while (number > 0);
		
		System.out.println(number);
		
		/*
		 * break, continue keywords
		 */
		
		// break
		for (int i = 1; i < 10; i++) {
			if (i % 5 == 0) {
				break;
			}
			
			System.out.println("i: " + i);
		}
		
		// continue
		for (int i = 1; i < 10; i++) {
			if (i % 5 == 0) {
				continue;
			}
			
			System.out.println("i: " + i);
		}
		
		// print out all even numbers from between 1 - 100
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			
			System.out.println("i: " + i);
		}
		
		// labels
		exampleLabel:
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (j == 5) {
						break exampleLabel;
					}
					
					System.out.println("i: " + i + ", " + "j: " + j);
				}
			}
		
		System.out.println("exited nested for loop");
	}
	
}
