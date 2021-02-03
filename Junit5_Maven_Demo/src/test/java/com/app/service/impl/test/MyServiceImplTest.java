package com.app.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyService;
import com.app.service.impl.MyServiceImpl;

class MyServiceImplTest {

	
	private static MyService service;
	
	@BeforeAll
	public static void setUpMyService() {
		service=new MyServiceImpl();
	}
	@Test
	void testIsValidEvenNumberForTrue() {
		boolean result=service.isValidEvenNumber(10);
		assertTrue(result);
	}
	
	@Test
	void testIsValidEvenNumberForFalse() {
		boolean result=service.isValidEvenNumber(101);
		assertFalse(result);
	}
	
	@Test
	void testIsValidPrimeNumberForTrue() {
		assertTrue(service.isValidPrimeNumber(3));
	}
	
	@Test
	void testIsValidPrimeNumberForFalse() {
		assertFalse(service.isValidPrimeNumber(6));
	}
	@Test
	void testIsValidPrimeNumberForNegativeValue() {
		assertFalse(service.isValidPrimeNumber(-3));
	}
	
	
	@Test
	void testisValidMobileNumberForNull() {
		//assertNull(service.isValidMobileNumber(null));
		//assertFalse(service.isValidMobileNumber(null));
		
		assertEquals(false, service.isValidMobileNumber(null));
	}
	
	

	@Test
	void testisValidMobileNumberForValid() {
		//assertNull(service.isValidMobileNumber(null));
		//assertFalse(service.isValidMobileNumber(null));
		
		assertEquals(true, service.isValidMobileNumber("+1-1234567890"));
	}
	
	@Test
	void testisValidMobileNumberForInvalid() {
		//assertNull(service.isValidMobileNumber(null));
		//assertFalse(service.isValidMobileNumber(null));
		
		assertEquals(false, service.isValidMobileNumber("+1-123456790"));
	}
	
	

}
