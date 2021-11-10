package com.dollarsbank.model;



public class Account {
	
	public static enum AccountType {
		CHECKINGS, SAVINGS
	}
	
	
	
	
	private int accountNumber;
	
	private double balance;
	
	private AccountType type;
	
	private Customer customer;
	
	
	
	

	public Account(int accountNumber, double balance, AccountType type, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		this.customer = customer;
	}
	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
