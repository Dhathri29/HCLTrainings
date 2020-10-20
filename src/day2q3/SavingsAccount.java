package day2q3;

public class SavingsAccount extends Account{
	private int interest=5;
	private final double MAX_WITHDRAW_LIMIT = 5000.00;
	private final double MIN_BALANCE = 500.0;
	
	
	public int getInterest() {
		return interest;
	}



	public void setInterest(int interest) {
		this.interest = interest;
	}



	public double getMAX_WITHDRAW_LIMIT() {
		return MAX_WITHDRAW_LIMIT;
	}



	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}



	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		// TODO Auto-generated constructor stub
	}



	public double getBalance() {
		double rateOfInterest;
		if(getAccountBalance() >= MIN_BALANCE) {
			rateOfInterest = getAccountBalance() * interest;
			setAccountBalance(rateOfInterest+getAccountBalance());
		}
		else {
			rateOfInterest = 0.0;
		}
		return rateOfInterest;
		//setAccountBalance(interest+getAccountBalance()); TO add interest to account balance.
	}
	
	public void withdraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE && (amount<MAX_WITHDRAW_LIMIT)) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
		
	}
}
