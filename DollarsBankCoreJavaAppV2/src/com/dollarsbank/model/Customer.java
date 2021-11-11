package com.dollarsbank.model;


public class Customer {
	
	
private String name;

private String username;
	
	private String pin;
	
	
	
	
	
	

	public Customer(String name, String username, String pin) {
		super();
		this.name = name;
		this.username = username;
		this.pin = pin;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}






	public String getPin() {
		return pin;
	}






	public void setPin(String pin) {
		this.pin = pin;
	}







	@Override
	public String toString() {
		return "Customer [name=" + name + ", username=" + username + ", pin=" + pin + "]";
	}


	
	
	

}
