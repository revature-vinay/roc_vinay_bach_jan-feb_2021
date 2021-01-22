package com.revature.main;

import com.revature.model.Person;

public class Application {

	public static void main(String[] args) {
		Person bill = new Person("Bill", 18, "Student");

		System.out.println("name: " + bill.getName());
		System.out.println("age: " + bill.getAge());
		System.out.println("occupation: " + bill.getOccupation());
		
		bill.setName("william");
		System.out.println(bill.getName());
	}

}
