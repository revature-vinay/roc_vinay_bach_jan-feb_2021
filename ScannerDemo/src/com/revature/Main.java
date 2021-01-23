package com.revature;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		String shouldContinue;
		do {
			System.out.println("Enter your firstname, lastname, age, salary, and favorite color: ");
			
			// String input
			String firstName = scanner.nextLine();
			String lastName = scanner.nextLine();
			
			int age = Integer.parseInt(scanner.nextLine()); // scanner.nextInt();
			double salary = Double.parseDouble(scanner.nextLine()); // scanner.nextDouble();
			// If you're transitioning from a number input to like a String input,
			// you will want some sort of extra .nextLine()
			
			String color = scanner.nextLine();
			
			System.out.println("firstName: " + firstName);
			System.out.println("lastName: " + lastName);
			System.out.println("age: " + age);
			System.out.println("salary: " + salary);
			System.out.println("color: " + color);
			
			Person person = new Person(firstName, lastName, age, salary, color);
			people.add(person);
			
			System.out.println("Should we keep going? (y/Y/yes/YES)");
			shouldContinue = scanner.nextLine();
		} while (shouldContinue.equals("y") || shouldContinue.equals("Y") || shouldContinue.equals("yes") || shouldContinue.equals("YES"));
		
		System.out.println(people);
		
		Object myObj = new Person("Bach", "Tran", 100, 100, "Blue");
		Person myPerson = new Person("Bach", "Tran", 100, 100, "Blue");
		System.out.println(myObj == myPerson);
		System.out.println(myObj.equals(myPerson));
		System.out.println(myObj.hashCode());
		System.out.println(myPerson.hashCode());
		System.out.println(myObj);
		System.out.println(myPerson);
		
		// hashing intuition
		// really simple hash function such as %
		// number 10
		// number 10 equals number 10
		// number 10 % 2 == 0
		// number 11 % 2 == 1
		// number 12 % 2 == 0
		
		// number 12 has the same hashcode as number 10 with this hash function
		// but they are not equal, obviously
		// however 10 is equal to 10 , and they of course also have the same hash of 0
		
		// mypassword123
	}

}
