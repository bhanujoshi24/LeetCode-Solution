package com.dsa.learn;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Approach :
//		find the break point
//		swap the break point index element with greatest element in right hand side
//		Reverse the remaining element of array

		int arr[] = { 2, 1, 5, 4, 3, 7, 3 };

		int ind = -1, n = arr.length - 1;

		System.out.println("Orginal Array");
		print(arr);
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				ind = i;
				break;
			}
		}

		if (ind == -1) {
			reverse(arr, 0, n);
		} else {
			for (int i = n - 1; i > ind; i--) {
				if (arr[i] > arr[ind] && arr[i] != 0) {
					swap(arr, i, ind);
					break;
				}
			}
			reverse(arr, ind + 1, n);
		}
		System.out.println();
		System.out.println("Next Permutation");
		print(arr);
	}

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}
}
