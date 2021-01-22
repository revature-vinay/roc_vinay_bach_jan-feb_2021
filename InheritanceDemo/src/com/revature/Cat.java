package com.revature;

public class Cat extends Animal {

	public String name;
	public String eyeColor;
	public String favoriteFood;
	
	public Cat(int numOfLegs) {
		super(numOfLegs);
		System.out.println("Cat() constructor invoked");
	}
	
	public Cat(String name, int numOfLegs) {
		this(numOfLegs);
		this.name = name;
		System.out.println("Cat(String name) constructor invoked");
	}
	
	public Cat(String name, String eyeColor, int numOfLegs) {
		this(name, numOfLegs); // Constructor chaining, (chaining together overloaded constructors)
		this.eyeColor = eyeColor;
		System.out.println("Cat(String name, String eyeColor) constructor invoked");
	}
	
	public Cat(String name, String eyeColor, String favoriteFood, int numOfLegs) {
		this(name, eyeColor, numOfLegs);
		this.favoriteFood = favoriteFood;
		System.out.println("Cat(String name, String eyeColor, String favoriteFood) constructor invoked");
	}
	
	public void catchMice() {
		System.out.println(name + " is catching mice!");
	}
	
	public int getNumOfLegs() {
		return super.numOfLegs;
	}
	
}
