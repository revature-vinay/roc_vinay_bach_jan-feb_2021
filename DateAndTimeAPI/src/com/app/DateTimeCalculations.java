package com.app;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//This is Java 8 Date and Time API
public class DateTimeCalculations {

	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		ld=ld.plusYears(7);
		System.out.println(ld);
		ld=ld.plusMonths(11);
		System.out.println(ld);
		
		
		LocalDate dob=LocalDate.parse("30/11/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("dob : "+dob);
		LocalDate curr=LocalDate.now();
		System.out.println("curr : "+curr);
		
		
		Period p=Period.between(dob, curr);
	//	System.out.println(p);
		System.out.println("Your age is "+p.getYears());
		System.out.println("You are  "+p.getYears()+" year/s "+p.getMonths()+" month/s "+p.getDays()+" days old");
		
		
		System.out.println(ChronoUnit.DAYS.between(dob, curr));
		System.out.println(ChronoUnit.MONTHS.between(dob, curr));
		System.out.println(ChronoUnit.YEARS.between(dob, curr));
	}
	//LocalTime    LocalDateTime

}
