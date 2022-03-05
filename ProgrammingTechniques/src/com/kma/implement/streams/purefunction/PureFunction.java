package com.kma.implement.streams.purefunction;

public class PureFunction {

	public static void main(String[] args) {
		/*
		 * + Requirement: Cho một mảng chứa các số int, tính tổng các số nguyên trong
		 * mảng này với điều kiện: - Không sử dụng vòng lặp - Không khai báo thêm biến
		 * 
		 */

		int[] data = { 1, 2, 3, 499, 12, 33, 9 };

		System.out.println("Sum is: " + sum(data));
		System.out.println("===============================");
		System.out.println("Total is: " + total(data, 0));

	}

	/* Code theo cách thông thường */
	public static int sum(int[] data) {
		int sum = 0;
		for (int e : data) {
			sum += e;
		}
		return sum;
	}

	public static int total(int[] data, int start) {
		// body
		if (start >= data.length) { // base on (đk cơ sở - đk dừng)
			return 0;
		} else {
			return data[start] + total(data, start + 1);
		}
	}

}
