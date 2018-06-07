package com.vishal.java.lambda;

public class AccountTestingJava8 {
	
	public static void main(String[] args) {
		AccountTestingJava8 accountTestingJava8 = new AccountTestingJava8();

		basicLambda_3();
	}

	private static void basicLambda() {
		Account account = new Account(900,500d);
		Exemptable exemptable = (Account acc) -> {return acc.getCreditRating() > 700;};
		AccountUtility.isBalanceSufficient(account, 1000, exemptable);
	}
		
	private static void basicLambda_1() {
		Account account = new Account(900,500d);
		Exemptable exemptable = (Account acc) ->  acc.getCreditRating() > 700 ;
		AccountUtility.isBalanceSufficient(account, 1000, exemptable);
	}
	
	private static void basicLambda_2() {
		Account account = new Account(900,500d);
		Exemptable exemptable = acc ->  acc.getCreditRating() > 700 ;
		AccountUtility.isBalanceSufficient(account, 1000, exemptable);
	}
	
	private static void basicLambda_3() {
		Account account = new Account(900,500d);
		AccountUtility.isBalanceSufficient(account, 1000, acc ->  acc.getCreditRating() > 700);
	}
}
