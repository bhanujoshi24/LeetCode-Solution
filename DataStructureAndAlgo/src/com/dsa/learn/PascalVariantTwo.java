package com.dsa.learn;

import java.util.Scanner;

public class PascalVariantTwo {
// Print Given row of Pascal Triangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rowNumber = sc.nextInt();
		for(int i=0; i<rowNumber; i++) {
			System.out.print(combination(rowNumber-1, i)+" ");
		}
	}
	
	public static int combination(int n, int r) {
		int numerator = 1, denominator = 1;
		while(r>=1) {
			numerator = n * numerator;
			denominator = r * denominator;
			n--;
			r--;
		}
		return numerator/denominator;
	}

}
