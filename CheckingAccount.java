
public class CheckingAccount extends BankAccount{
	
	private final double FEE = 0.15;
	private String accountNumber = getAccountNumber() + "-10";
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(accountNumber);		
	}
	
	public boolean withdraw(double amount) {
		double totalAmount = amount + FEE;
		super.withdraw(totalAmount);
		return true;
	}

}
