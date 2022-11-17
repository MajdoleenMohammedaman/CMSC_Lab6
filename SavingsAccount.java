
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber = super.getAccountNumber();
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = accountNumber + "-" + Integer.toString(savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = oldAccount.accountNumber + Integer.toString(savingsNumber);
	}
	
	public void postInterest() {
		double finalAmount = getBalance() + (getBalance() * rate/12);
		setBalance(finalAmount);
		
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}

}
