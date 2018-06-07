package com.vishal.java.lambda;

public class FunctionalAccountTesting extends FunctionalAccount{
	
	public static void main(String[] args) {
		basicFunctional();
		FunctionalAccountTesting functionalAccountTesting = new FunctionalAccountTesting();
		functionalAccountTesting.basicFunctional_super();
	}
	
	private static void basicLambda() {
		Account account = new Account(900,500d);
		Exemptable exemptable = (Account acc) -> {return acc.getCreditRating() > 700;};
		AccountUtility.isBalanceSufficient(account, 1000, exemptable,new AccountExemptionHandler() {
			
			@Override
			public void onAccountExempted(Account account) {
				System.out.println(account);
				
			}
		});
	}
	
	private static void basicLambda_1() {
		Account account = new Account(900,500d);
		AccountUtility.isBalanceSufficient(account, 1000, acc ->  acc.getCreditRating() > 700, 
				System.out::println);
	}
	
	private static void basicLambda_2() {
		Account account = new Account(900,500d);
		AccountUtility.isBalanceSufficient(account, 1000, FunctionalAccountTesting::defaulfExemption, 
				System.out::println);
	}
	
	private static void basicFunctional() {
		Account account = new Account(900,500d);
		FunctionalAccountTesting functionalAccountTesting = new FunctionalAccountTesting();
		AccountUtility.isBalanceSufficient(account, 1000, FunctionalAccountTesting::defaulfExemption, 
				functionalAccountTesting :: checkInstanceMethod);
	}
	
	private void basicFunctional_super() {
		Account account = new Account(900,500d);
		FunctionalAccountTesting functionalAccountTesting = new FunctionalAccountTesting();
		AccountUtility.isBalanceSufficient(account, 1000, FunctionalAccountTesting::defaulfExemption, 
				super :: superMethodaReference);
	}
	
	public static boolean defaulfExemption(Account account){
		return account.getCreditRating() > 700;
	}
	
	public void  checkInstanceMethod(Account account){
		
		System.out.println("Instace Method"+account);
	}
	
}
