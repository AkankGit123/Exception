package com.rays.Exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientFundException {
		Account a = new Account();
		
		a.setAccountType("Current");
		a.setBalance(500);
		a.setNumber("84567898765");
		
		System.out.println("Type of Account is: " +a.getAccountType());
		System.out.println("Balance in Account is: " + a.getBalance());
		System.out.println("Account Number is: " +a.getNumber());
		a.deposit(20);
		System.out.println("Balance After Deposite in Account is: " + a.getBalance());
		a.withdrawal(300);
		System.out.println("Balance After Withdrawl in Account is: " + a.getBalance());
		
	}

	

}
