package com.dollarsbank.utility;

import java.util.Scanner;

import com.dollarsbank.model.Account;

public class ConsolePrinterUtility {
	
	// MAIN MENU
	
	public static void mainMenu() {
	
	System.out.print("Please choose from the following menu: \n" 
			+ "\n 1. Create New Account"
			+ "\n 2. Login"
			+ "\n 3. Exit \n\n");

}	

	// NEW ACCOUNT REGISTRATION
	
public static void newAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Customer Name: \n");
		
		String name = sc.next();
		
		System.out.println("Customer Address: \n");
		
		String address = sc.next();
		
		System.out.println("Customer Contact Number: \n");
		
		String phoneNumber = sc.next();
		
		System.out.println("User Id: \n");
		
		String userId = sc.next();
		
		System.out.println("Password: \n");
		
		String password = sc.next();
		
		
		System.out.println("Please select the amount you would like to deposit into this account ($): ");
		
		double deposit = sc.nextDouble();
		

		
		Account account = new Account(name, address, phoneNumber, userId, password, deposit);
		
		
}



}
