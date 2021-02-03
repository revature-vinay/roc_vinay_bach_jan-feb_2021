package com.app.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunit {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Hello from @BeforeAll - Executed only once before creating instance");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Hello from @BeforeEach I will be executed before every single test case in this class.");
	}

	@Test
	public void testHello1() {
		System.out.println("Hello from testHello1()");
	}

	@Test
	public void testHello2() {
		System.out.println("Hello from testHello2()");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("Hello from @AfterEach I will be executed after every single test case in this class.");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Hello from @AfterAll- Executed only once after destruction of instance");
	}
}
