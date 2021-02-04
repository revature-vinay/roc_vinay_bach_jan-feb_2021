package com.app;

public interface InterfaceJava8 {

	
	public default void helloDefault() {
		System.out.println("Default methods from Java8");
	}
	
	public static void hiStatic() {
		System.out.println("Hi static method with interface from Java8");
	}
}
