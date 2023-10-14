package com.bt.junitBusinessCode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test; 

public class NullAndNotNullTest {
	
	@Test
	void testNullAndNotNull() {
		
		// create an object 
		NullAndNotNull obj = new NullAndNotNull(); 
		
		// call the method and validate
		//first time we will pass not null object
		//second we will pass null object 
		
		String str1 = "Krishna";
		String str2 = null; 
	 
	    assertNotNull(obj.checkNull(str1) );
	    assertNull(obj.checkNull(str2) );
	    
	    // to remove unwanted import statements ctrl + shift + O 
		
	}

}
