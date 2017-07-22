package com.vish.algorithm;

import java.util.Arrays;

/**
 * 
 * @author Vishal Tambe
 *
 */
public class ReverseArray {
	
	public String[] reverseArray(String[] input){
		
		String[] output = new String[input.length];
		
		for(int i =0; i<input.length/2;i++){
			String temp = input[i];
			output[i] = input[input.length -i -1];
			output[input.length -i -1] = temp;
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseArray r = new ReverseArray();
		String [] inputArray = {"Vishal","Renuka","Tambe","HI","Test"};
		System.out.println(Arrays.toString(r.reverseArray(inputArray)));
	}
}
