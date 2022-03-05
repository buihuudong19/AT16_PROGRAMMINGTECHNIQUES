package com.kma.implement.streams.lambda_expression.first_lambda;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOperator {

	public static void main(String[] args) {
		/* Tao va in ra man hinh 10 so nguyen duong khac nhau (distinct) */
		// 1. tao ra mang ngau nhien cac so nguyen
		final Random rand = new Random();
		Stream<Integer> randoms = Stream.generate(rand::nextInt);

		randoms.filter(i -> i > 0).distinct().limit(10).forEach(n -> System.out.println(n));

	}

}
