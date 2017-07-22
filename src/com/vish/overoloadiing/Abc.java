package com.vish.overoloadiing;

import java.util.HashMap;

public class Abc implements IAbc{

	int a = 10;
	
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}
	
	public void setName(){
		
	}
	
	public static void main(String[] args) {
		IAbc abc = new Abc();
		System.out.println(abc.a);
		HashMap<String, String> map =new HashMap<>();
		map.put("Key", "value");
		map.put(new String("Key"),"Value1");
		map.put(new String("Key"),"Value2");
		System.out.println(map.get("Key"));
		
		
		
		
	}

}
