package com.vish.equality;

import java.util.Arrays;
import java.util.List;

public class StreamsVSList {
	
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "Vishal");
		
		String[] results =  lines.stream().filter(line -> "Vishal".equals(line)).toArray(String[] :: new);
		
		System.out.println(results[0]);
		
		Person p = new Person("Vishal", "28");
		Person p2 = new Person("Ankit", "25");
		Person p3 = new Person("ROhit", "24");
		
		List<Person> persons = Arrays.asList(p,p2,p3);
		
		Person  person = persons.stream().filter(x -> "Vishals".equals(x.getName())).findAny().orElse(null);
		if(null  != person){
			System.out.println("NAME : "+person.getName()+" AGE: "+person.getAge());
		}else{
			System.out.println("No Data Found");
		}
		
		
		//results.forEach(System.out::print);
	
	}

}
