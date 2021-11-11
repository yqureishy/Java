package com.dollarsbank.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
	
	public static enum Type {
		CHECKINGS, SAVINGS
	}
	
	
			
			
	
	
	
	
	
	
	private double balance;
	
	private Type type;
	
	private Customer customer;
	
	private static final AtomicInteger count = new AtomicInteger(0);
	
	
	
	

	public Account(int accountNumber, double balance, Type type, Customer customer) {
		super();
		accountNumber = count.incrementAndGet();
		this.balance = balance;
		this.type = type;
		this.customer = customer;
	}
	
	public Account(double balance, Type type, Customer customer) {
		super();
		this.balance = balance;
		this.type = type;
		this.customer = customer;
	}
	
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
