package com.revature;

public class A {
	
	// instance fields
	public int w;
	protected int x;
	int y; // this is the "default" access modifier
	private int z;
	
	// static fields
	public static int a;
	protected static int b;
	static int c; // default
	private static int d;
	
	public A() {
		super();
	}
	
	public A(int w, int x, int y, int z) {
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		A aObj = new A(10, 15, 20, 25);
		aObj.printInstanceFields();
		
		A aObj2 = new A(100, 200, 300, 400);
		aObj2.printInstanceFields();
		
		aObj.a = 10;
		aObj.b = 20;
		aObj.c= -100;
		aObj.d = 100;
		
		aObj.printStaticFields();
		aObj2.printStaticFields();
	}
	
	public void printInstanceFields() {
		System.out.println("=== Instance Fields of Object ===");
		System.out.println("w: " + w);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
	
	public void printStaticFields() {
		System.out.println("=== Static Fields ===");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
	
}
