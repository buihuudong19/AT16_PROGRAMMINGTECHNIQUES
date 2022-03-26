package com.kma.implement.threads.synchronizeds_account;

public class Account {
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		synchronized (this) {
			this.balance += amount;
		}

	}

}
