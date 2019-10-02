package com.acumensolutions.bank;

import account.CheckingAccount;
import account.SavingsAccount;

public class AcumenBank {

	public static void main(String[] args) {
		System.out.println("Welcome to Acumen Bank!");
		System.out.println();
		
		/*
		 * Initial testing of transfer from checking account to checking account
		 */
		
		// Create checking accounts for michael and gob
		CheckingAccount michaelsCheckingAccount = new CheckingAccount("Michael", 5000);
		CheckingAccount gobsCheckingAccount = new CheckingAccount("Gob", 2000);
		
		// Output initial checking account details
		System.out.println("Open Checking Accounts:");
		System.out.println();
		michaelsCheckingAccount.printAccountDetails();
		System.out.println();
		gobsCheckingAccount.printAccountDetails();

		// Output transfer message
		System.out.println();
		System.out.println("Making transfer of $1000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		// Transfer 1000 from michael's checking account to gob's checking account
		michaelsCheckingAccount.transfer(gobsCheckingAccount, 1000);
		
		// Output checking account details after transfer
		System.out.println("Updated Checking Account Details:");
		System.out.println();
		michaelsCheckingAccount.printAccountDetails();
		System.out.println();
		gobsCheckingAccount.printAccountDetails();
		System.out.println();

		/*
		 * Testing of transfer from savings account to savings account
		 */
		
		// Create savings accounts for ace and gary
		SavingsAccount acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089);
		SavingsAccount garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056);
		
		// Output initial savings account details
		System.out.println("Open Savings Accounts:");
		System.out.println();
		acesSavingsAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		System.out.println();
		
		// Output transfer message
		System.out.println("Making transfer of $5000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		// Transfer 5000 from ace's savings account to gary's savings account
		acesSavingsAccount.transfer(garysSavingsAccount, 5000);
		
		// Output savings account details after transfer
		System.out.println("Updated Savings Account Details:");
		System.out.println();
		acesSavingsAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		
		/*
		 * Testing that applied interest rate correctly modifies the balance of savings accounts
		 */
		
		// Output interest message
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
		
		// Output savings account details after applying interest
		System.out.println("Updated Savings Account Details:");
		System.out.println();
		
		acesSavingsAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		System.out.println();
		
		/*
		 * Testing of transfer from checking account to savings account
		 */
		
		// Output account details before transfer
		System.out.println("Open Checking & Savings Accounts:");
		System.out.println();
		michaelsCheckingAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		
		// Output transfer message
		System.out.println();
		System.out.println("Making transfer of $2000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		// Transfer 2000 from michael's checking account to gary's savings account
		michaelsCheckingAccount.transfer(garysSavingsAccount, 2000);
		
		// Output account details after transfer
		System.out.println("Updated Checking & Savings Account Details:");
		System.out.println();
		michaelsCheckingAccount.printAccountDetails();
		System.out.println();
		garysSavingsAccount.printAccountDetails();
		System.out.println();
		
	}
}