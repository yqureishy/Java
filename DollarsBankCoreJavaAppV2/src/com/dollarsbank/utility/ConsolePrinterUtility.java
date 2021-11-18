package com.dollarsbank.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.PasswordValidator;
import com.dollarsbank.model.Transaction;

public class ConsolePrinterUtility {
	
	
	public static Scanner sc = new Scanner(System.in);
	
	public static Account[]loggedInUser = new Account [1];
	
	// MAIN MENU
	
	public static void mainMenu() {
	
	System.out.print("Please choose from the following menu: \n" 
			+ "\n 1. Create New Account"
			+ "\n 2. Login"
			+ "\n 3. Exit \n\n");


	System.out.print("Enter Choice (1,2 or 3): ");
	
	

}

	// NEW ACCOUNT REGISTRATION
	
	public static ArrayList<Account> accountList = new ArrayList <>();	

	
public static void newAccount() {
	
		ArrayList<Transaction> transactionList = new ArrayList<>();
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.println("Customer Name: ");
		
		String name = sc.nextLine();
		
		System.out.println("Customer Address: ");
		
		String address = sc.nextLine();
		
		System.out.println("Customer Contact Number: ");
		
		String phoneNumber = sc.nextLine();
		
		System.out.println("User Id: ");
		
		String userId = sc.nextLine();
		
		Boolean correctPattern = false;
		
		
		
		
		String password = "N/A";
		
		while(!correctPattern) {
			System.out.println("Password: ");
			
			
			password = sc.nextLine();
		
		if(!PasswordValidator.isValid(password)) {
			System.out.println("Your password must contain at least one capital"
					+ " letter, \none lowercase letter, one special character and one number. \n\n");
		} else {
			correctPattern = true;
		}
		}
		
		
		
		
		System.out.println("Please select the amount you would like to deposit into this account($): ");
		
		double deposit = sc.nextDouble();
		
		
		Transaction transaction = new Transaction(new Date(), 0.0, deposit);
		transactionList.add(transaction);
		
		Account account = new Account(name, address, phoneNumber, userId, password, deposit, transactionList );
		
		accountList.add(account);
		
}

public static void printAccounts() {
	
	for(int i = 0; i < accountList.size(); i++) {
		System.out.println(accountList.get(i));
	}
	
}

public static void loginPage() {
	
boolean correct = false;
	
	while(!correct) {
	
	// Scanner sc = new Scanner(System.in);
	
	System.out.println("User Id: ");
	String userId = sc.next();
	
	System.out.println("Password: ");
	String password = sc.next();
	
	try {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getUserId().matches(userId)) {
				if(accountList.get(i).getPassword().matches(password)) {
					System.out.println("Welcome to your login page!");
					loggedInUser[0] = accountList.get(i);
					correct = true;
					break;
				}System.out.println("Credentials are incorrect, please try again");
				break;
			} continue;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}

public static void userAccountPage(Account account) {
	
	 account = loggedInUser[0];
	
	System.out.println(account.toString());
	
	int option = 0;
	
	while(option != 6) {
	
	System.out.print(
			  "1. Deposit Amount \n"
			+ "2. Withdraw Amount \n"
			+ "3. Funds Transfer \n"
			+ "4. View 5 recent Transactions \n"
			+ "5. Display Customer Information \n"
			+ "6. Sign Out \n\n");
	
	System.out.println("Please enter a number from above: ");
	
	option = sc.nextInt();
	
	switch(option) {
	case 1: deposit();
			break;
	case 2: withdraw();
			break;
	case 3: fundsTransfer();
			break;
	}
	}
	
	
}


public static void deposit() {
	System.out.println("Enter the amount you would like to deposit($): ");
	
	double depositAmount = sc.nextDouble();
	
	double initialAmount = loggedInUser[0].getDeposit();
	
	loggedInUser[0].setDeposit(initialAmount + depositAmount);
	
	System.out.println("Your current account balance is: $" + loggedInUser[0].getDeposit() + "\n\n");
	
	
}

public static void withdraw() {
	
System.out.println("Your current account balance is: $" + loggedInUser[0].getDeposit() + "\nEnter the amount you would like to withdraw($): ");
	
	double withdrawAmount = sc.nextDouble();
	
	double initialAmount = loggedInUser[0].getDeposit();
	
	loggedInUser[0].setDeposit(initialAmount - withdrawAmount);
	
	System.out.println("You withdrew: $" + withdrawAmount + "\n");
	
	System.out.println("Your current account balance is: $" + loggedInUser[0].getDeposit() + "\n\n");
	
}

public static void fundsTransfer() {
	
	
	
}





}
