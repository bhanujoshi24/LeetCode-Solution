package com.dsa.learn;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// Brute Force Approach
		System.out.println("Brute Force Approach = "+getMaxSumBrute(arr));
		// Optimal Approach
		System.out.println("Better Approach = "+getMaxSumBetter(arr));
		// Optimal Approach
		System.out.println("Optimal Approach = "+getMaxOptimal(arr));
	}

	public static int getMaxOptimal(int[] arr) {
		int max_sum = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max_sum = Math.max(max_sum, sum);
			if (sum < 0)
				sum = 0;
			
		}

		return max_sum;
	}

	public static int getMaxSumBrute(int[] arr) {
		int max_sum = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}

	public static int getMaxSumBetter(int[] arr) {
		int max_sum = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
				max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}
	
}
