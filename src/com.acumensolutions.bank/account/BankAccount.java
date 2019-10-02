package account;

public abstract class BankAccount{

	protected String ownerName;
	protected double balance;
	
	public void transfer(BankAccount destinationAccount, double amount) {
		withdrawal(amount);
		destinationAccount.deposit(amount);
	}

	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	protected void withdrawal(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		this.balance -= amount;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void printAccountDetails() {
		System.out.format("Account for %s:\r\n", ownerName);
		System.out.format("Balance: $%.2f\r\n", balance);
	}
}
