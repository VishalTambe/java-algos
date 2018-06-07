package com.vishal.java.lambda;

@FunctionalInterface
public interface Exemptable {

	boolean isExempt(Account account);
	
	default Boolean defaultExempt(Account account){
		return account.getCreditRating() > 700;
	}
}
