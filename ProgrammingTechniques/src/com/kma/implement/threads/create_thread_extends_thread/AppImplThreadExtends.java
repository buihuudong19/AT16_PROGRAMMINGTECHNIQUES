package com.kma.implement.threads.create_thread_extends_thread;

class App1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runing thread 01: " + i);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class App2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runing thread 02: " + i);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class AppImplThreadExtends {

	public static void main(String[] args) {
		App1 a = new App1();
		App2 b = new App2();
		App1 c = new App1();

		/**/

		a.start();
		b.start();
		c.start();

		// Lam sao de biet a,b,c da xong chua?
		try {
			a.join();
			b.join();
			c.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("all thread finished!...");
	}

	public static void displayApp() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Main thread is running...." + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
