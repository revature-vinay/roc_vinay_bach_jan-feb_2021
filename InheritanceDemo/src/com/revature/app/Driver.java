package com.revature.app;

import com.revature.Animal;
import com.revature.Dog;

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
	}

}
