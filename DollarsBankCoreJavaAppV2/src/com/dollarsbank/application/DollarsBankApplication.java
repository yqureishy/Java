package com.dollarsbank.application;

import java.util.Scanner;

import com.dollarsbank.controller.DollarsBankController;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class DollarsBankApplication {

	public static void main(String[] args) {
		
		try {
			DollarsBankController.runnable();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


