package com.kma.implement.streams.lambda_expression.first_lambda;

import java.util.function.Consumer;

public class LambdaPerformance {

	public static void main(String[] args) {
		/* Using Anonymous class */
		System.out.println("\n Anonymous class");
		for (int i = 0; i < 5; i++) {
			Consumer<String> myPrinter1 = new Consumer<String>() {
				@Override
				public void accept(String t) {
					System.out.println("Consuming..." + t);
				}
			};
			myPrinter1.accept(myPrinter1.toString());
		}
		/* Using lambda */
		System.out.println("\nUsing lambda, one instance");
		for (int i = 0; i < 5; i++) {
			Consumer<String> myPrinter2 = m -> System.out.println("Consumer..." + m);
			myPrinter2.accept(myPrinter2.toString());
		}

	}

}
