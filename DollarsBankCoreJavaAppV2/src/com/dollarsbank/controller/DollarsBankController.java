package com.dollarsbank.controller;

import java.util.Scanner;

public class DollarsBankController {
	
	public static void mainMenu() {
		System.out.print("Please choose from the following menu: \n" 
				+ "\n 1. Create New Account"
				+ "\n 2. Login"
				+ "\n 3. Exit \n\n");
		
		System.out.print("Enter Choice (1,2 or 3): ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number == 1) {
		
	}
	
		sc.close();
	
	}
}
