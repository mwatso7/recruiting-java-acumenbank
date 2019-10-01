package account;

public class CheckingAccount implements BankAccount{

	private String ownerName;
	private double balance;
	
	public CheckingAccount(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public void transfer(BankAccount destinationAccount, double amount) {
		withdraw(amount);
		destinationAccount.deposit(amount);
	}

	@Override
	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		this.balance -= amount;
	}

	@Override
	public String getOwnerName() {
		return this.ownerName;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
	
	@Override
	public void printAccountDetails() {
		System.out.format("Checking Account for %s:\r\n", ownerName);
		System.out.format("Balance: $%.2f\r\n", balance);
	}
}