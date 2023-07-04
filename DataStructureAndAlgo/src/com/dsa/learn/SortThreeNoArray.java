package com.dsa.learn;

public class SortThreeNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 2, 1, 2, 0, 0, 1 };
		int n = arr.length;
//		better Approach
		sortBetterApproach(arr);
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
	}

	public static void sortBetterApproach(int[] arr) {
		int count_0 = 0, count_1 = 0, count_2 = 0;
		for (int ele : arr) {
			if (ele == 0)
				count_0++;
			else if (ele == 1) {
				count_1++;
			} else {
				count_2++;
			}
		}
		int k = 0;
		while (count_0-- > 0)
			arr[k++] = 0;
		while (count_1-- > 0)
			arr[k++] = 1;
		while (count_2-- > 0)
			arr[k++] = 2;
	}

}
