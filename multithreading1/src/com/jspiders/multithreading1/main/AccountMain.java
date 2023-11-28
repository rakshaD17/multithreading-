package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.Thread.Husband;
import com.jspiders.multithreading1.Thread.Wife;
import com.jspiders.multithreading1.resource.Account;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account(1000);
		
		Husband husband = new Husband(account);
		
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
	}

}
