package com.revature.simple;

public class Main {

	public static void main(String[] args) {
		
		Animal someAnimal = new Animal();
		someAnimal.makeNoise();

		Animal anotherAnimal = new Dog();
		anotherAnimal.makeNoise();
		((Dog) anotherAnimal).playFetch();
		Dog dog = (Dog) anotherAnimal;
		
		Animal yetAnotherAnimal = new Cat();
		yetAnotherAnimal.makeNoise();
		
		someAnimal.makeNoise();
		
		Cat cat = new Cat();
		cat.makeNoise();
	}

}
