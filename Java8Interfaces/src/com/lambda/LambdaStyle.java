package com.lambda;

public class LambdaStyle {

	public static void main(String[] args) {
		HelloFunctional h=()->System.out.println("Hello from Lambda");
		h.hello();
		
		HelloFunctional h2=()->System.out.println("Hello from Lambda Again");
		h2.hello();
		
		MyFunctional m=(n)->{
			return "Helloooo ..... "+n;
		};
		System.out.println(m.hey("VINAY"));
		System.out.println(m.hey("RAJJJ"));
		
		Sum s=(x,y,z)->{
			
			return x+y+z;
		};
		System.out.println("Result is "+s.add(100, 99,22222));
		

	}

}
