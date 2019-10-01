package account;

public class SavingsAccount implements BankAccount{
	
	private String ownerName;
	private double balance;
	private double interestRate;
	
	public SavingsAccount(String ownerName, double balance, double interestRate) {
		this.ownerName = ownerName;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void applyInterest(int numberOfYears) {
		balance = Math.pow((1 + interestRate / numberOfYears), numberOfYears) * balance;
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

	private void withdraw(double amount) {
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
		System.out.format("Savings Account for %s:\r\n", ownerName);
		System.out.format("Balance: $%.2f\r\n", balance);
		System.out.format("Interest Rate: %.2f%% \n", interestRate*100.0);
	}

}
