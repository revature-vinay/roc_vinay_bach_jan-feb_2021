package com.revature;

public class B {

	public static void main(String[] args) {
		A aObj = new A(10, 20, 30, 40);
		
		System.out.println(aObj.w); // this is public in class A
		System.out.println(aObj.x); // this is protected in class A
		System.out.println(aObj.y); // this is default in class A
		// System.out.println(aObj.z); // cannot access because private
		System.out.println(A.a); // public
		System.out.println(A.b); // protected
		System.out.println(A.c); // default
		// System.out.println(A.d); // cannot access because private
	}
	
}
