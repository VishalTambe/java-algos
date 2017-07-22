package com.vish.algorithm;

import org.apache.commons.lang3.StringUtils;

public class TestMain {

	public String doSomething(String input){
		
		StringBuilder s = new StringBuilder();
		if(null != input){
		
		char [] strArray = input.toCharArray();
		
		StringUtils.reverse(input);
		
		System.out.println("Length Of array"+strArray.length);
		
		for(int i = strArray.length-1 ; i>=0; i--){
			s.append(strArray[i]);
		}
		}else{
			System.out.println("NULL Input String not allowed");
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		System.out.println("Revers String "+ testMain.doSomething("AKUNER"));
	}
	
	
}
