package com.jspiders.multithreading1.Thread;

import com.jspiders.multithreading1.resource.Account;

public class Wife extends Thread{

	Account account;
	
	public Wife(Account account) {
		this.account = account;
		
	}

	@Override 
	public void run() {
		account.deposite(10000);
		account.withdraw(500);
	}
}
