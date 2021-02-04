package com.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatiing {

	public static void main(String[] args) {
		
		
		Date d=new Date();
		System.out.println(d);
		
		/*Symbols are strictly case sensitive
		 * dd - date
		 * MM - month in 2 digits   MMM - shortname of month   MMMM - full month name
		 * EEE - day in short, EEEE - full day name
		 * yy - last 2 digits of year       yyyy - full year
		 * HH - 24 hr
		 * hh - 12 hr
		 * mm - mins
		 * ss - seconds
		 * z/Z - time zones and GMT
		 * a - am/pm
		 * 
		 */
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy   HH:mm:ss  hh:mm:ss a  z    EEE EEEE   MMM   MMMM");
		System.out.println(sdf.format(d));

	}

}
