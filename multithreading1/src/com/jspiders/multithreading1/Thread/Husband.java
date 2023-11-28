package com.jspiders.multithreading1.Thread;

import com.jspiders.multithreading1.resource.Account;

public class Husband extends Thread{

	Account account;
	
	public Husband(Account account) {
		this.account = account;
	}


	@Override
	public void run() {
		account.deposite(500);
		account.withdraw(50000);
	}
	
	
}
