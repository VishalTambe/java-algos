package com.vishal.java.lambda;

public class Account {

	private Integer creditRating;
	private Double balance;

	public Account(Integer creditRating, Double balance) {
		super();
		this.creditRating = creditRating;
		this.balance = balance;
	}

	public Integer getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(Integer creditRating) {
		this.creditRating = creditRating;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [creditRating=");
		builder.append(creditRating);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
}
