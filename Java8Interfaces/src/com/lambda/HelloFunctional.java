package com.lambda;

@FunctionalInterface //An Interface with only and only one abstract method in it
public interface HelloFunctional {

	void hello();
	
}


@FunctionalInterface
interface MyFunctional{
	String hey(String name);
}

@FunctionalInterface
interface Sum{
	int add(int a,int b, int c);
}