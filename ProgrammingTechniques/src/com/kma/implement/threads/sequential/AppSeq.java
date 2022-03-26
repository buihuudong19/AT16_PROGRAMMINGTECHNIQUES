package com.kma.implement.threads.sequential;

class App1 {
	public void startRunning() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runing App01: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class App2 {
	public void startRunning() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runing App02: " + i);
		}
	}
}

public class AppSeq {

	public static void main(String[] args) {
		App1 a1 = new App1();
		App2 a2 = new App2();
		a1.startRunning();
		a2.startRunning();
	}

}
