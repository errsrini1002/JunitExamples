package com.bt.junitBusinessCode;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class EqualsAndNotEqualsTest {

	@Test
	void testAdd() {
		//set up 
		EqualsAndNotEquals testObj = new EqualsAndNotEquals(); 
		
		//execute
		//Assert
		assertEquals(11, testObj.add(3, 8),"3+8 must be equal to 11");
		
		assertNotEquals(9, testObj.add(6, 4), "6+4 cannot be 9");
	}
	
	
}
