package com.revature;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "apple"; 
		
		String result = reverseStringInefficient(str);
		System.out.println("Result from String concatenation algo: " + result);
		
		result = reverseStringEfficient(str);
		System.out.println("Result from StringBuilder algo: " + result);
	}
	
	public static String reverseStringEfficient(String str) {
		StringBuilder sb = new StringBuilder();
		
		// Here we are appending new characters to this StringBuilder object in each iteration of the loop
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static String reverseStringInefficient(String str) {
		String result = ""; // we want apple reversed <- elppa
		
		// Here we are creating a new String object each time, which is a waste of resources and processing power
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i); // "" -> "e" -> "el" -> "elp" -> ....
		}
		
		return result;
	}

}
