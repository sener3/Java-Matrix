package main;

import models.Test;

public class MainTest {
	public static void main(String[] args) {
		Test test = new Test();
		
		int[][] matrixFromClass = new int[2][3];
		int[][] matrix = {{1, 2, 3}, {2, 3, 4}};
		
		test.setTestMatrix(matrix);
		
		matrixFromClass = test.getTestMatrix();
	
		printMatrix(matrixFromClass);
		
		try {
			Test testClone = (Test) test.clone();
			int[][] testCloneMatrix = testClone.getTestMatrix();
			
			printMatrix(testCloneMatrix);
			
			
			boolean equalityResult = test.equals(testClone);

			System.out.println(equalityResult);

			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(test.toString());
		
		System.out.println(test.hashCode());

	}
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("Matrix values: ");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}

