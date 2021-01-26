package com.revature.main;

import com.revature.model.Calculable;
import com.revature.model.Drawable;
import com.revature.model.Rectangle;
import com.revature.model.Shape;
import com.revature.model.Triangle;

public class Driver {

	public static void main(String[] args) {
//		Shape shape = new Triangle(5, 10);
//		shape.calculateArea();
//		System.out.println(shape);
//		shape.draw();
//		System.out.println(shape.getArea());
		
//		shape = new Rectangle(10.5, 20);
//		shape.calculateArea();
//		System.out.println(shape);
//		shape.draw();
//		System.out.println(shape.getArea());
		
		Drawable d = new Triangle(2.5, 5.5);
		d.draw();
		// printing out here, the area is 0
		System.out.println(d);
		Drawable.myStaticMethod();
		// variable c and d referring to the SAME object
		Calculable c = (Calculable) d;
		c.calculateArea();
		
		// updated area to 6.875
		System.out.println(d);
		
	}

}
