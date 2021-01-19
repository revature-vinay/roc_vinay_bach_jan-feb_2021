
// Naming conventions of classes: have every single first letter of a word capitalized
// HelloWorld, TheClass, etc...
public class Driver {

	public static void main(String[] args) {
		
		/*
		 * Declaration: is where you actually declare a particular variable
		 * Initialization: where you assign some value to that variable for the first time
		 */
		
		// Integral Types
		byte myByte; // declaration
		myByte = 10; // initialization
		
		byte mySecondByte = 20; // declaration and initialization on the same line
		
		System.out.println("myByte: " + myByte);
		System.out.println("mySecondByte: " + mySecondByte);
		
		myByte = 30;
		
		System.out.println("myByte: " + myByte);
		
		short myShort = 25_767;
		int myInt = 1_000_000_567; // _ is for readability, you cannot use , to separate digits
		long myLong = 4534342108L;
		long mySecondLong = 1000000; // implicitly casted from int to long
		
		// type sysout and ctrl + space as a shortcut
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println("Brockton: " + mySecondLong);
		
		char c = 1000; // technically also an integral type
		
		// Floating Types
		float myFloat = 3.14159F;
		double myDouble = 31.454;
		System.out.println(myFloat);
		System.out.println(myDouble);
		
		// Character Type
		c = 'A'; // note here, that char literals are enclosed by single-quotes ' '. Different than double-quotes " ", which are for String literals
		System.out.println(c);
		
		// Boolean Type
		boolean b = true;
		System.out.println(b);
		b = false;
		b = true;
		b = true;
		b = false;
		System.out.println(b);
		// b will be boolean forever.. forever meaning within this method where the variables reside (the main method)
		
		boolean d = 10 == 10;
		System.out.println(d);
		
		boolean isAlive = true;
		// Naming conventions of variables..
		// don't do really ambiguous names like a, b, or c
		// Have something descriptive
		// and do camelCase, have the first word's letter in lowercase, and any subsequent first letters of a word in uppercase
		// numOfTires, numOfAnimals
		
		// Strings are not primitives, they are actually objects. Therefore there is a String class that is used as the "object reference type"
		// So since the String class follows the naming convention, it is uppercase
	}

}
