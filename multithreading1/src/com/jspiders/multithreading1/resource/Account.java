package com.jspiders.multithreading1.resource;

public class Account {

	double accountBalance;
	
	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double checkBalance() {
		return this.accountBalance;
	}
	
	public synchronized void deposite(double amount) {
		 
		System.out.println("Depositing " + amount + "in the account");
		accountBalance += amount;
		System.out.println("current balance:" + checkBalance());
	}
	
	public synchronized void withdraw(double amount) {
		
		System.out.println("withdrawing "+ amount + "in the account");
		accountBalance -= amount;
		System.out.println("current balance:"+ checkBalance());
	}

}
