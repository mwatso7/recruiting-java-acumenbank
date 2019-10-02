package account;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		withdrawal(amount);
	}
	
	@Override
	public void printAccountDetails() {
		System.out.print("Checking ");
		super.printAccountDetails();
	}
}