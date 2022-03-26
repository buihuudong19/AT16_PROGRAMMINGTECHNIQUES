package com.kma.implement.threads.parallelprogramming;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindMaxElement {

	public static void main(String[] args) {
		// 1. create a array (static)
		final int NUM_OF_ELEMENT = 90_000_000;
		int[] list = new int[NUM_OF_ELEMENT];
		for (int i = 0; i < list.length; i++) {
			list[i] = i; // random??
		}
		long startTime = System.currentTimeMillis();
		System.out.println("So max la: " + getMaxNumber(list));
		long endTime = System.currentTimeMillis();
		System.out.println("So luong processors la: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Thoi gian tim max la: " + (endTime - startTime));

	}

	private static int getMaxNumber(int[] list) {
		RecursiveTask<Integer> task = new Max(list, 0, list.length);
		ForkJoinPool pool = new ForkJoinPool();

		return pool.invoke(task);
	}

	private static class Max extends RecursiveTask<Integer> {
		// nguong
		private final static int THRESHOLD = 1000;
		private int[] list;
		private int low;
		private int high;

		public Max(int[] list, int low, int high) {
			this.list = list;
			this.low = low;
			this.high = high;
		}

		@Override
		protected Integer compute() {
			// thuc thi giai thuat de quy de tim max

			if (high - low < THRESHOLD) {
				int max = list[0];
				for (int i = low; i < high; i++) {
					if (list[i] > max)
						max = list[i];
				}
				return max;
			} else {
				int mid = (low + high) / 2;
				RecursiveTask<Integer> left = new Max(list, low, mid);
				RecursiveTask<Integer> right = new Max(list, mid, high);
				right.fork();
				left.fork();
				// join cac fork lai
				return new Integer(Math.max(left.join().intValue(), right.join().intValue()));
			}
		}
	}
}
