package com.bt.junitBusinessCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrueFalseTest {

	@Test
	void testIsGreater() {
		
		// call the test 
		int first = 10; 
		int second = 5; 
		
		TrueFalse testObj = new TrueFalse(); 
		
		assertTrue(testObj.isGreater(first, second));
		assertFalse(testObj.isGreater(second, first));
		
	}
}
