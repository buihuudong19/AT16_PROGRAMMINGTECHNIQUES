package com.kma.implement.streams.lambda_expression.first_lambda;

import java.util.Comparator;

public class LambdaExpression {

	public static void main(String[] args) {
		/* 1. Muốn so sánh 2 đối tượng Employee theo name */
		Comparator<Employee> byName = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Employee e1 = new Employee(1, "Tong", 1000);
		Employee e2 = new Employee(2, "Dong", 2000);

		// System.out.println(byName.compare(e1, e2));
		// using lambda remove name of the compartor

		Comparator<Employee> byNameLambda1 = (Employee a, Employee b) -> {
			return a.getName().compareTo(b.getName());
		};

		// bỏ luôn kiểu dữ liệu ở tham số
		Comparator<Employee> byNameLambda2 = (a, b) -> {
			return a.getName().compareTo(b.getName());
		};
		// bỏ luôn return + {}
		Comparator<Employee> byNameLambda3 = (a, b) -> a.getName().compareTo(b.getName());

	}

}
