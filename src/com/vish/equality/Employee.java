package com.vish.equality;

public class Employee {

	public static void main(String[] args) {
		System.out.println(checkEquality(null,null));
	}

	private static boolean checkEquality(String a, String b) {
		
		if(null != a || null != b){
			char [] aArray = a.toCharArray();
			char[] bArray = b.toCharArray();
			
			if(aArray.length != b.length())
				return false;
			
			int i = 0;
			int n = aArray.length;
					
			while(n-- != 0){
				
				if(aArray[i]!=bArray[i]){
					return false;
					
				}
				i++;
			}
			
			/*for (int i = 0; i < bArray.length; i++) {
				 if(aArray[i]==bArray[i]){
					 continue;
				 }else{
					 return false;
				 }
			}*/
			return true;
		}
		return false;
		
		
	}
}
