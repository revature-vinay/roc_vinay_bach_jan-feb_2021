package com.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadAndValidateDate {

	public static void main(String[] args) {
		
		String s="32.13.2000"; //dd.MM.yyyy
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
		//sdf.setLenient(false);
		Date d=null;
		
		try {
			d=sdf.parse(s);  //-> parse takes String and converts/parses it to date object
			System.out.println("Date object is "+d);
		} catch (ParseException e) {
			System.out.println("Invalid Date");
		}
	}

}
