package com.bt.junitBusinessCode;

public class LifeCycleMethods {
	
	public int add(int a, int b) {
		return a+b; 
	}
	
	public Object checkNull(Object obj) {
		if( obj !=null ) {
			return obj; 
		}
			return null; 
	}

}
