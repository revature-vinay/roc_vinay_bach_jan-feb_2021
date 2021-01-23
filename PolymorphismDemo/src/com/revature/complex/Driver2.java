package com.revature.complex;

public class Driver2 {

	public static void main(String[] args) {
		
		// Static methods are not overriding, in fact they're not even part of inheritance
//		Movie movie = new TitanicMovie();
//		movie.sayHi();
//
//		TitanicMovie titanicMovie = new TitanicMovie();
//		titanicMovie.sayHi();
		
		TitanicMovie.sayHi();
		Movie.sayHi();
	}

}
