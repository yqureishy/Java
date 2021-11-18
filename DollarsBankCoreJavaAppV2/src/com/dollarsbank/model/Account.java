package com.dollarsbank.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
private String name;

private String address;

private String phoneNumber;

private String userId;

private String password;

private double deposit;

private List<Transaction> transactions;



public Account(String name, String address, String phoneNumber, String userId, String password, double deposit, List<Transaction> transactions ) {
	super();
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.userId = userId;
	this.password = password;
	this.deposit = deposit;
	this.transactions = transactions;
}

public Account() {
	this("N/A","N/A", "N/A", "N/A", "N/A", 0, new ArrayList<>());
}






public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getAddress() {
	return address;
}



public void setAddress(String address) {
	this.address = address;
}



public String getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public String getUserId() {
	return userId;
}



public void setUserId(String userId) {
	this.userId = userId;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public double getDeposit() {
	return deposit;
}



public void setDeposit(double deposit) {
	this.deposit = deposit;
}


public List<Transaction> getTransactions() {
	return transactions;
}

public void setTransactions(List<Transaction> transactions) {
	this.transactions = transactions;
}





@Override
public String toString() {
	return "Account [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", userId=" + userId
			+ ", password=" + password + ", deposit=" + deposit + "]";
}







	

}
