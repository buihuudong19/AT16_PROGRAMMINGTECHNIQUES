package com.kma.implement.streams.operation_stream;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;

import com.kma.implement.streams.lambda_expression.first_lambda.Employee;

public class _1_CreateStream {

	public static void main(String[] args) {
		// 1. Tao Stream thong qua phuong thuc tinh cua Stream class
		Stream<Integer> seqNumbers = Stream.of(1, 2, 4, 9, 44, 33, 22, 66, 99);
		// 2. printer
		// seqNumbers.forEach(i -> System.out.println(i));
		seqNumbers.forEach(System.out::println);

		// 3. Tao Stream tu 1 mang tinh
		Employee[] emps = { new Employee(1, "Dong", 10), new Employee(2, "Hoang", 11), new Employee(3, "Dung", 12),
				new Employee(4, "Bao", 13), new Employee(5, "Khanh", 14), new Employee(6, "Kiem", 15),

		};

		Stream<Employee> empStream = Stream.of(emps);

		System.out.println("================");
		empStream.forEach(System.out::println);

		// 4. create Stream from collections (List, Set, Map...)
		Collection<Employee> empCol = new LinkedList<>();
		empCol.add(new Employee(1, "Dong", 10));
		empCol.add(new Employee(2, "Hoang", 11));
		empCol.add(new Employee(4, "Bao", 13));

		Stream<Employee> empColStr = empCol.stream();

		// Operations
	}

}
