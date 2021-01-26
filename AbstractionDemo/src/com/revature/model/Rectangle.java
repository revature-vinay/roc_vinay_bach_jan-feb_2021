package com.revature.model;

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	public Rectangle() {
		super(4, "Rectangle");
	}
	
	public Rectangle(double width, double length) {
		super(4, "Rectangle");
		this.width = width;
		this.length = length;
	}
	
	@Override
	public void calculateArea() {
		super.area = width * length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + area + ", edges=" + edges + ", name="
				+ name + "]";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}
