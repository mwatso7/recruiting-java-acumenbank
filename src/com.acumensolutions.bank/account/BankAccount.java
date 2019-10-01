package account;

public interface BankAccount {

	void transfer(BankAccount destinationAccount, double amount);

	void deposit(double amount);

	String getOwnerName();

	double getBalance();

	void printAccountDetails();

}