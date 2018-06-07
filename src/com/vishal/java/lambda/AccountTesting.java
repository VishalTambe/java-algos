package com.vishal.java.lambda;

public class AccountTesting {

	public static void main(String[] args) {
		
		Account account = new Account(900,500d);
		AccountTesting accountTesting = new AccountTesting();
		
		//Till Java 7 Implementation
		Exemptable ex = new Exemptable() {
			
			@Override
			public boolean isExempt(Account acc) {
				if(account.getCreditRating() > 700){
					return true;
				}
				return false;
			}
		};
		
		System.out.println(accountTesting.isBalanceSufficient(account, 1000, ex));
	}
	

	/**
	 * Java 7 Implimentation
	 * @param account
	 * @param amount
	 * @return
	 */
	public Boolean isBalanceSufficient_Type_1(Account account, double amount){
		Boolean isBalanceSufficient = account.getBalance() - amount > 0;
		if(!isBalanceSufficient){
			
			if(account.getCreditRating() > 700){
				isBalanceSufficient = true;
				alertOverDraft();
			}
		}
		return isBalanceSufficient;
	}
	
	/**
	 * Java 7 Implimentation
	 * @param account
	 * @param amount
	 * @param exemptable
	 * @return
	 */
	public Boolean isBalanceSufficient(Account account, double amount, Exemptable exemptable){
		Boolean isBalanceSufficient = account.getBalance() - amount > 0;
		if(!isBalanceSufficient){
			if(exemptable.isExempt(account)){
				isBalanceSufficient = true;
				alertOverDraft();
			}
		}
		return isBalanceSufficient;
	}
	
	
	
	
	
	public void alertOverDraft(){
		System.out.println("You Dont have sufficient balance but you can have overdraft facility");
	}
}
