package models;

import java.util.Arrays;

public class Test {
	private int[][] testMatrix;
	
	public Test() {}
	
	public Test(int[][] testMatrix) {
		this.testMatrix = testMatrix;
	}

	public int[][] getTestMatrix() {
		return testMatrix;
	}

	public void setTestMatrix(int[][] testMatrix) {
		this.testMatrix = testMatrix;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Test objTest = (Test) obj;
		
		if (!Arrays.equals(objTest.testMatrix, this.testMatrix))
			return false;
		
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Test clone = new Test();
		
		clone.testMatrix = this.testMatrix.clone();
		
		return clone;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(testMatrix);
	}
	
	
}
