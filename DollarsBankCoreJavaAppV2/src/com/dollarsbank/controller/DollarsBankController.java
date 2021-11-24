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



			
while(number != 3) {
			try {
				
//				ConsolePrinterUtility.mainMenu();

				System.out.print("Please choose from the following menu: \n" 
						+ "\n 1. Create New Account"
						+ "\n 2. Login"
						+ "\n 3. Exit \n\n");


				System.out.println("Enter Choice (1,2 or 3): ");
				
				number = sc.nextInt();
				
				sc.nextLine();
				
//				sc.next();
				
			
			
			switch(number) {
			case 1: ConsolePrinterUtility.newAccount();
					break;
			case 2: ConsolePrinterUtility.loginPage();
					ConsolePrinterUtility.userAccountPage(ConsolePrinterUtility.loggedInUser[0]);
					break;
			case 3: System.out.println("Goodbye!");
					break;		
			}
				
			} catch(Exception e) {
				e.printStackTrace();
			} 
			
			
			
		
		System.out.println("\n\n"); 
		
		
		
		};
		
		sc.close();
		
		
		

		
		
		

	
	
		}
	
	
}
