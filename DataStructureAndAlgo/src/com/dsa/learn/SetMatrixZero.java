package com.dsa.learn;

public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 1 } };
		System.out.println("Before Solving Set Matrix Zero");
		printMatrix(matrix);

		solveZero(matrix);
		System.out.println("After Solving Set Matrix Zero");
		printMatrix(matrix);

	}
//	Optimal Approach
	private static void solveZero(int[][] matrix) {
		// TODO Auto-generated method stub
//		matrix[i][0] --> row
//		matrix[0][j] --> column
		int col0 = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					if (j == 0) {
						col0 = 0;
					} else {
						matrix[0][j] = 0;
					}
				}
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		if (matrix[0][0] == 0) {
			for (int j = 0; j < matrix[0].length; j++)
				matrix[0][j] = 0;
		}

		if (col0 == 0) {
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
		}
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
