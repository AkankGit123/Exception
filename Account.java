package com.rays.Exception;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(int amountD) {
	double b = getBalance();
	double db = b+amountD;
	setBalance(db);
	}
	
	public void withdrawal(int amountW ) throws InsufficientFundException {
		double bW = getBalance();
		double dbW = bW-amountW;
		setBalance(dbW);
	
		if (balance < 500) {
			InsufficientFundException i = new InsufficientFundException();
			throw i;
		}
	}
	public void fundTransferF(int amountF)
	{
		double bF = getBalance();
		double dbF = bF-amountF;
		setBalance(dbF);		
	}
	
	public void fundTransferT(int amountF)
	{
		double bF = getBalance();
		double dbF = bF+amountF;
		setBalance(dbF);		
	}

}
