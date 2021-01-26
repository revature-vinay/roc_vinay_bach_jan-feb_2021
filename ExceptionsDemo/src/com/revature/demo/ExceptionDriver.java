package com.revature.demo;

import java.util.Scanner;

import com.revature.exceptions.DenominatorIsZeroException;

public class ExceptionDriver {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(NumberFormatException e) {
			System.out.println("Please enter a valid int number");
		} catch(RuntimeException e) {
			System.out.println("A RuntimeException, " + e.getClass() + " has occured");
		} catch (DenominatorIsZeroException e) {
			
			System.out.println("I'm now in the catch block for DenominatorIsZeroException");
			
			System.out.println(e.getMessage());
			
		} finally {
			// Finally will always execute, whether an exception was caught or not, or even if the method returns
			// in either the try or catch block
			// Only in extreme conditions does finally not execute, such as if the JVM exits early
			// Or if we are caught in an infinite loop
			
			System.out.println("This will always run!");
			
			// Generally, the finally block is used to release resources from memory
			// for example, here I am closing my scanner once I am done using it
			sc.close();
		}
		
		System.out.println("Program execution continued normally!");
		
		// This runs into the debate over whether custom exceptions should be checked or unchecked
		// checked exceptions are clearly made visible to a developer who is using some methods that were coded by
		// someone else
		// However, they will need to handle the exception
		
		// In the case of RuntimeExceptions, this forces you to go through and read documentation about what exceptions
		// might be thrown
		
		// So it really is a matter of your own preference
		
	}
	
	public static void method1() throws DenominatorIsZeroException {
		System.out.println("Enter an int numerator: ");
		int numerator = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter an int denominator: ");
		int denominator = Integer.parseInt(sc.nextLine());
		if (denominator == 0) {
			throw new DenominatorIsZeroException("You cannot have a denominator of zero!");
		}
		
		// ArithmeticException is extending RuntimeException, so therefore it is an unchecked exception
		// unchecked exceptions are not required to be caught
		System.out.println("The result of divison is: " + numerator / (double) denominator);
	}

}
