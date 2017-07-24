package com.vish.algorithm;

import java.lang.reflect.Field;

public class StringPoolTest {
	
	public String getName(){
		String abc = "ABC";
		return abc;
	}

	
	public String getNames(){
		String pqr = "ABC";
		return pqr;
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		StringPoolTest test =  new StringPoolTest();
		
		System.out.println(test.showInternalCharArrayHashCode(test.getName()));
		System.out.println(test.showInternalCharArrayHashCode(test.getNames()));
		
		
		
		if(test.getName()==test.getNames()){
			System.out.println("We are equal");
		}else{
			System.out.println("No Equal");
		}
		
		System.out.println(test.getName());
		System.out.println(test.getNames());
	}
	
	private int showInternalCharArrayHashCode(String s) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	    final Field value = String.class.getDeclaredField("value");
	    value.setAccessible(true);
	    return value.get(s).hashCode();
	}

}
