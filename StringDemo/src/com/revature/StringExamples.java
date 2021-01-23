package com.revature;

public class StringExamples {

	public static void main(String[] args) {
		
		// Declare and initialize Strings using String literals
		// "hi" goes into the string pool
		String str1 = "hi";
		String str2 = "hi";
		
		// This will go in the normal part of the heap
		String str3 = new String(); // At this point, we have two String objects
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str3));
		
		// concat
		String concatExample = "h".concat("i"); 
		// "h" and "i" go to the string pool, but the result of concat is in the 
		// normal heap
		System.out.println(concatExample);
		System.out.println(str1 == concatExample);
		System.out.println(str1.equals(concatExample));
		System.out.println(str3 == concatExample);
		
		// contains
		String str4 = "Hello, my name is Roger";
		System.out.println("str4 contains 'name is': " + str4.contains("name is"));
		
		// startsWith
		System.out.println(str4.startsWith("Hello"));
		System.out.println(str4.startsWith(", my", 5));
		
		// endsWith
		System.out.println(str4.endsWith("Roger"));
		
		// try to see if a string has only alphabetical characters
		String str5 = "abcde34343fgABCDEFG-";
		// REGULAR EXPRESSION or regex
		System.out.println(str5.matches("[a-zA-Z]+")); // If the string has one or more characters from a-z or A-Z, return true
	
		System.out.println("apple".compareTo("apricot"));
	}

}
