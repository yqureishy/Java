package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class DollarsBankController {
	

		public static void runnable() throws Exception {
			


int number = 0;
Scanner sc = new Scanner(System.in);

			
		do{
			try {
				
				ConsolePrinterUtility.mainMenu();
				System.out.println("Enter a number: ");
				number = sc.nextInt();
			
			
			switch(number) {
			case 1: ConsolePrinterUtility.newAccount();
					break;
			case 2: ConsolePrinterUtility.loginPage();
					ConsolePrinterUtility.userAccountPage(ConsolePrinterUtility.loggedInUser[0]);
					break;
			case 3: System.out.println("Goodbye!");
					ConsolePrinterUtility.printAccounts();
					break;		
			}
				
			} catch(Exception e) {
				e.printStackTrace();
			} 
			
			
			
		
		System.out.println("\n\n"); 
		
		
		
		}while(number != 3);
		
		sc.close();
		
		
		

		
		
		

	
	
		}
	
	
}
