package com.acumensolutions.bank;

import account.CheckingAccount;
import account.SavingsAccount;

public class AcumenBank {

	public static void main(String[] args) {
		System.out.println("Welcome to Acumen Bank!");
		System.out.println();

		CheckingAccount michaelsAccount = new CheckingAccount("Michael", 5000);
		CheckingAccount gobsAccount = new CheckingAccount("Gob", 2000);

		System.out.println("Open Checking Accounts:");
		System.out.println();
		michaelsAccount.printAccountDetails();
		System.out.println();
		gobsAccount.printAccountDetails();

		System.out.println();
		System.out.println("Making transfer of $1000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}

		michaelsAccount.transfer(gobsAccount, 1000);

		System.out.println("Updated Checking Account Details:");
		System.out.println();
		michaelsAccount.printAccountDetails();
		System.out.println();
		gobsAccount.printAccountDetails();

		// sample code for savings account implementation
		
		// Initialize new savings account with initial balance of $30,000 and 0.89% interest
		SavingsAccount acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089);
		
		SavingsAccount garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056);
		
		System.out.println("Open Savings Accounts:");
		System.out.println();
		acesSavingsAccount.printAccountDetails();
		garysSavingsAccount.printAccountDetails();
		
		System.out.println();
		System.out.println("Making transfer of $5000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		acesSavingsAccount.transfer(garysSavingsAccount, 5000);
		
		acesSavingsAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		
		System.out.println();
		System.out.println("Applying interest rates for 2 years...");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		// apply 2 years of interest to the savings accounts
		acesSavingsAccount.applyInterest(2);
		garysSavingsAccount.applyInterest(2);
		
		System.out.println("Updated Savings Account Details:");
		System.out.println();
		
		acesSavingsAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		
	}
}