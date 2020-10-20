package day2q3;

public class CurrentAccount extends Account{

	private int tradeLicenseNumber;
	private final double MIN_BALANCE = 500.00;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentAccount [tradeLicenseNumber=" + tradeLicenseNumber + "]";
	}
	public double getBalance() {
		return getAccountBalance();
	}
	public void withdraw(double amount) {
		if((getAccountBalance()-amount>MIN_BALANCE)){
			
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}	
		
	}
}
