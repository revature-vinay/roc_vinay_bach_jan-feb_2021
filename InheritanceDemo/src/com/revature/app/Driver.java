package com.revature.app;

import com.revature.Animal;
import com.revature.Dog;
import com.revature.Person;
import com.revature.Cat;

public class Driver {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Fido"); // Dog() is a constructor that basically instantiates a Dog object
		dog.numOfLegs = 4; // numOfLegs is defined in the Animal class, but Dog inherits from Animal, so it has this property as well

		Dog dog2 = new Dog("Sparky");
		dog2.numOfLegs = 3;
		
		Dog[] dogs = new Dog[] { dog, dog2 };
		
		dog.makeNoises();
		System.out.println(dog2.numOfLegs);
		System.out.println(dog.numOfLegs);
		
		dog.playFetch();
		dog2.playFetch();
		
		Object myObj = dog; // These all refer to the same dog
		Animal myAnimal = dog; // They are not 3 separate dogs
		Dog myDog = dog;
		
		Animal animal = dog2; // animal is pointing to the Dog object with the name Fido
		System.out.println(animal.numOfLegs);
		
		((Dog) animal).playFetch();
		System.out.println(animal instanceof Dog);
		
		animal = new Cat("Fluffy", 4);
		System.out.println(animal.numOfLegs);
		
		Cat whiskers = new Cat("Whiskers", "Yellow", "Tuna", 5);
		System.out.println(whiskers.eyeColor);
		System.out.println(whiskers.favoriteFood);
		System.out.println(whiskers.name);
		System.out.println(whiskers.getNumOfLegs());
		
		Person person1 = new Person();
		System.out.println("Number of instances of Person: " + Person.numOfInstances);
		Person person2 = new Person();
		System.out.println("Number of instances of Person: " + Person.numOfInstances);
		
		person1.weight = 100;
		person2.weight = 200;
		
		System.out.println(person1.weight);
		System.out.println(person2.weight);
	}

}
