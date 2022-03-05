package com.kma.implement.streams.lambda_expression.first_lambda;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;

public class StreamEmployee {

	public static void main(String[] args) {
		Collection<Employee> empCol = new LinkedList<>();
		empCol.add(new Employee(1, "Dong", 10));
		empCol.add(new Employee(2, "Hoang", 11));
		empCol.add(new Employee(4, "Bao", 13));
		empCol.add(new Employee(5, "Chien", 20));

		Stream<Employee> empStream = empCol.stream();
		/* Lay va in ra cac emps co luong lon hon >=13 va duong ra mang 1 chieu */

		Employee[] arrEmp = empStream.filter(e -> e.getSalary() >= 13).toArray(Employee[]::new);

		for (Employee e : arrEmp) {
			System.out.println(e);
		}

	}

}
