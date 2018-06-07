package com.vishal.java.lambda;

public class AccountUtility {
	
	public static Boolean isBalanceSufficient(Account account, double amount, Exemptable exemptable){
		Boolean isBalanceSufficient = account.getBalance() - amount > 0;
		if(!isBalanceSufficient){
			if(exemptable.isExempt(account)){
				isBalanceSufficient = true;
				alertOverDraft();
			}
		}
		return isBalanceSufficient;
	}
	
	public static void alertOverDraft(){
		System.out.println("You Dont have sufficient balance but you can have overdraft facility");
	}
	
	
	public static Boolean isBalanceSufficient(Account account, double amount, 
			Exemptable exemptable, AccountExemptionHandler accountExemptionHandler){
		Boolean isBalanceSufficient = account.getBalance() - amount > 0;
		if(!isBalanceSufficient){
			if(exemptable.isExempt(account)){
				isBalanceSufficient = true;
				accountExemptionHandler.onAccountExempted(account);
				alertOverDraft();
			}
		}
		return isBalanceSufficient;
	}

}
