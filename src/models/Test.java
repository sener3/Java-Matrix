package models;

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
	public Object clone() throws CloneNotSupportedException {
		Test clone = new Test();
		
		clone.testMatrix = this.testMatrix.clone();
		
		return clone;
	}
}
