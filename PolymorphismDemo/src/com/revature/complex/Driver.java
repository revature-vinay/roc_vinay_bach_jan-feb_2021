package com.revature.complex;

import java.util.Scanner;

public class Driver {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		System.out.println(movie.getMovieDescription());
		
		Movie movie2 = new AWhiskerAwayMovie();
		System.out.println(movie2.getMovieDescription());

		Movie movie3 = new SupermanMovie();
		System.out.println(movie3.getMovieDescription());
		
		Movie movie4 = new TitanicMovie();
		System.out.println(movie4.getMovieDescription());
		
		// Runtime polymorphism? 
		// How do we know that Java is figuring out at runtime which method implementation to use? (as opposed to compile time)
		
		// Understanding runtime polymorphism
		// Introduce user input, which of course, means that we would then be making decisions at runtime (dynamic behavior)
		String choice;
		do {
			System.out.println();
			System.out.println("Enter a movie you would like to obtain a description from: ");
			System.out.println("0.) Exit");
			System.out.println("1.) Movie");
			System.out.println("2.) Titanic");
			System.out.println("3.) Superman");
			System.out.println("4.) A Whisker Away");
			
			choice = sc.nextLine();
			
			Movie movieChoice = null;
			
			switch (choice) {
			case "1": 
				movieChoice = new Movie();
				break;
			case "2":
				movieChoice = new TitanicMovie();
				break;
			case "3":
				movieChoice = new SupermanMovie();
				break;
			case "4":
				movieChoice = new AWhiskerAwayMovie();
				break;
			}
			
			if (movieChoice != null) {
				System.out.println(movieChoice.getMovieDescription());
			} else if (!choice.equals("0")) {
				System.out.println("Invalid movie choice, please try again");
			}
			
		} while (!choice.equals("0"));
		
		System.out.println("Outside do-while");
	}

}
