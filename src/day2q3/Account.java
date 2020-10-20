package day2q3;

import java.util.Random;

public class Account {

	private String memberName;
	private int accountNumber;
	private double accountBalance;

	Random rand = new Random();
	String num = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);

	public Account() {

	}

	public Account(String memberName, double accountBalance) {
		super();
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double d) {
		this.accountBalance = d;
	}

	public void deposit(double amount) {
		setAccountBalance(getAccountBalance()+amount);	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [memberName=");
		builder.append(memberName);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", accountBalance=");
		builder.append(accountBalance);
		builder.append(", rand=");
		builder.append(rand);
		builder.append(", num=");
		builder.append(num);
		builder.append("]");
		return builder.toString();
	}

	

}
