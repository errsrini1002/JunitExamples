package com.bt.junitBusinessCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LifeCycleMethodsTest {
	
	LifeCycleMethods testObj ; 
	
	@BeforeAll
	static void beforeSetup() {
		System.out.println("This is first one to invoke");
	}
	
	
	@BeforeEach
	void setUpObject() {
		testObj = new LifeCycleMethods();
		System.out.println("Before Each Executed "); 
		
	}
	
	

	@Test
	@DisplayName("Checking equals and not equals case")
	void testAdd() {
	   assertEquals(11, testObj.add(3, 8), "3+8 must be equal to 11");
		assertNotEquals(9, testObj.add(6, 4), "6+4 cannot be 9");
		// ctrl + Shift + F

	}

	@Test
	@DisplayName("Checking Null and Not Null case")
	void testNullAndNotNull() {
		String str1 = "Krishna";
		String str2 = null;

		assertNotNull(testObj.checkNull(str1));
		assertNull(testObj.checkNull(str2));

	}
	
	@AfterEach
	void tearDownAfterEach() {
		
		System.out.println("After each method completed I am called ");
		
	}
	
	@AfterAll
	static void lastMethod() {
		System.out.println("This is last one to invoke");
	}
	

}
