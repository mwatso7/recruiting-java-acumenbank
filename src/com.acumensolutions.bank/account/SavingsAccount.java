package account;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount(String ownerName, double balance, double interestRate) {
		this.ownerName = ownerName;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void applyInterest(int numberOfYears) {
		balance = Math.pow((1 + interestRate), numberOfYears) * balance;
	}
	
	public void applyInterest(int numberOfYears, int numberOfTimesCompounded) {
		balance = Math.pow((1 + interestRate / numberOfTimesCompounded), (numberOfTimesCompounded * numberOfYears)) * balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void printAccountDetails() {
		System.out.print("Savings ");
		super.printAccountDetails();
		System.out.format("Interest Rate: %.2f%% \n", interestRate*100.0);
	}

}
