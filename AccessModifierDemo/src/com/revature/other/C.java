package com.revature.other;

import com.revature.A;

public class C extends A {

	public C(int w, int x, int y, int z) {
		super(w, x, y, z);
	}
	
	public static void main(String[] args) {
		C cObj = new C(10, 20, 30, 40);
		
		System.out.println(cObj.w); // public
		System.out.println(cObj.x); // protected
		
		System.out.println(A.a); // public
		System.out.println(A.b); // protected
	}
	
}
