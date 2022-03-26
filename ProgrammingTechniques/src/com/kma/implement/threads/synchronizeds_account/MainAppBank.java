package com.kma.implement.threads.synchronizeds_account;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainAppBank {
	private static Account account = new Account();

	public static void main(String[] args) {

		// create 1000 threads
		ExecutorService excutor = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			excutor.execute(new AddAmount());
		}

		excutor.shutdown();
		// cho xem cac thread xong chua?
		while (!excutor.isTerminated()) {
			//
		}
		System.out.println("The balance is: " + account.getBalance());

	}

	// inner class
	private static class AddAmount implements Runnable {

		@Override
		public void run() {
			// synchronized (account) {
			account.deposit(1);
			// }

		}

	}

}
