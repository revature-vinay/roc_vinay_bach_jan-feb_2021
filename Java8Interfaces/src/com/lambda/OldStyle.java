package com.lambda;

public class OldStyle implements HelloFunctional {

	public static void main(String[] args) {
		
		
		HelloFunctional h=new OldStyle();
		h.hello();
		
		
		HelloFunctional h1=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello from Annoymous class");
			}
		};
		h1.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from old style");
	}

}
