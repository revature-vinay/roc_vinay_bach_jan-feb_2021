package com.revature;

public class Person {
	
	public int weight;
	
	public static int numOfInstances = 0;
	
	public Person() {
		numOfInstances++;
	}
	
}
