package com.dollarsbank.application.model;

import java.util.List;

public class Customer {
	
	private String name;
	
	private String pin;
	
	private List<Account> accounts;
	
	
	
	
	

	public Customer(String name, String pin, List<Account> accounts) {
		super();
		this.name = name;
		this.pin = pin;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", pin=" + pin + ", accounts=" + accounts + "]";
	}
	
	
	
	
	

}
