package com.kma.implement.threads.create_thread_impl_runable;

class App1 implements Runnable {
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

class App2 implements Runnable {
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

public class AppRunableThread {

	public static void main(String[] args) {
		// 1. create task
		App1 a = new App1();
		App2 b = new App2();

		// 2. create multi-threading
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		// 3. run
		t2.start();
		t1.start();

	}

}
