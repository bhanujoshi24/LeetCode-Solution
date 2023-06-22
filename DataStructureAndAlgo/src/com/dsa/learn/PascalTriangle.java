package com.dsa.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		List<List<Integer>> lis = getPascalTriangle(n);
		printPascal(lis);
	}

	private static List<List<Integer>> getPascalTriangle(int n) {
		// TODO Auto-generated method stub
		List<List<Integer>> finalAns = new ArrayList<>();

		finalAns.add(new ArrayList<>(Arrays.asList(1)));
		finalAns.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
		List<Integer> temp = null;
		
		int row = 3;
		while (row <= n) {
			temp = new ArrayList<>();
			for (int i = 1; i <= row; i++) {
				if(i == 1 || i == row) {
					temp.add(1);
				}else {
					temp.add(finalAns.get(row-2).get(i-2)+finalAns.get(row-2).get(i-1));
				}
			}
			finalAns.add(temp);
			row++;
		}

		return finalAns;
	}

	private static void printPascal(List<List<Integer>> lis) {
		// TODO Auto-generated method stub
		lis.forEach(l -> System.out.println(l));
	}

}
