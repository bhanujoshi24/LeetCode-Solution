package com.dsa.learn;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		// Brute Force Appraoch
		int max = getMaxPrice(prices);
		System.out.println("Max Profit from Brute Force Approach " + max);
		// Optimized Approach
		max = getMaxPriceOptimized(prices);
		System.out.println("Max Profit from Optimized Approach " + max);
	}

	public static int getMaxPrice(int[] arr) {
		int max = 0, n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				max = Math.max(max, arr[j] - arr[i]);
			}
		}
		return max;
	}

	public static int getMaxPriceOptimized(int[] arr) {
		int max = 0, n = arr.length, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			} else {
				max = Math.max(max, arr[i] - min);
			}
		}
		return max;
	}

}
