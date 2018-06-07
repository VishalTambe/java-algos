package com.vishal.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListWithLambda {

	public static void main(String[] args) {
		
		List<String> testList = new ArrayList<>();
		testList.add("Vishal");testList.add("Vishal_1");
		testList.add("Vishal_2");testList.add("Vishal_3");
		
		
		IntStream.range(1,10).forEach(System.out::println);
		
		//testList.forEach(ListWithLambda::check);
		List<String> result = testList.stream().filter(l -> l.equals("Vishal")).collect(Collectors.toList());
		
		
		
		//List<String> result = testList.stream().
		result.forEach(ListWithLambda::check);
	}
	
	public static void check(String name){
		
		System.out.println("Check : "+name);
		
	}
}
