package com.dollarsbank.controller;

import java.awt.Window.Type;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;

public class NewAccountDetails {
	
	public static void newAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String name = sc.next();
		
		System.out.println("Please enter a 4 digit pin for your password: ");
		
		String pin = sc.next();
		
		System.out.println("Please enter a username you would like to use for login: ");
		
		String username = sc.next();
		
		System.out.println("Please select the type of account you would like to create (CHECKINGS or SAVINGS): ");
		
		String type = sc.next();
		
		Type newType = Type.valueOf(type);	
		
		System.out.println("Please select the amount you would like to deposit into this account ($): ");
		
		double balance = sc.nextDouble();
		

		Customer customer = new Customer(name, username, pin);
		
//		Account account = new Account(balance, newType, customer);
		
		
		
		
		
	}
	
	

}
