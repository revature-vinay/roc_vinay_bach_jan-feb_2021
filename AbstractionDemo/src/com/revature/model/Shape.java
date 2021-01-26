package com.revature.model;

public abstract class Shape implements Drawable, Calculable {

	protected double area;
	protected int edges;
	protected String name;
	
	public Shape() {
		super();
	}
	
	public Shape(int edges, String name) {
		this.edges = edges;
		this.name = name;
	}
	
	public void printShapeName() {
		System.out.println(this.name);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing shape...");
	}

	public double getArea() {
		return area;
	}

	public int getEdges() {
		return edges;
	}

	public String getName() {
		return name;
	}
	
}
