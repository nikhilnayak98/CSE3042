/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Sparse Matrix 
 */
package ProgrammingProjects;

public class SparseMatrix {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(7,10);
		matrix.display();
		matrix.insert(14.99, 0, 1);
		matrix.insert(1, 2, 2);
		matrix.insert(2050, 1, 3);
		matrix.insert(99, 4, 4);
		matrix.insert(377, 3, 2);
		matrix.insert(100, 1, 5);
		matrix.insert(200, 1, 1);
		matrix.insert(2, 0, 0);
		matrix.insert(7, 1, 2);
		matrix.insert(5, 3, 3);
		matrix.display(3, 3);
		matrix.display();
	}
}

class MLink {
	public double dData;
	public MLink nextRow;
	public MLink nextCol;

	public MLink(double value){
		dData = value;
	}

	public void displayLink() {
		System.out.print(dData + "   ");
	}
}

class Matrix {
	private int nRows;
	private int nCols;

	private MLink first;
	private MLink current;

	public Matrix(int rows, int cols) {
		nRows = rows;
		nCols = cols;

		first = new MLink(0);
		current = first;
		MLink temp;
		for(int i = 0; i < nRows; i++) {
			temp = current;
			for(int j = 1; j < nCols; j++) {
				temp.nextCol = new MLink(0);
				temp = temp.nextCol;
			}
			if(i < nRows - 1) {
				current.nextRow = new MLink(0);
				current = current.nextRow;
			}
		}
	}

	public boolean insert(double value, int row, int col) {
		if(row > nRows || col > nCols || row <= 0 || col <= 0) {
			System.out.println("\nRange (0,0) to (" + nRows + "," + nCols + ")");
			return false;
		} else {
			current = first;
			for(int i = 1; i < row; i++)
				current = current.nextRow;
			for(int j = 1; j < col; j++)
				current = current.nextCol;

			current.dData = value;
			System.out.println("\nInserted " + value + " at (" + row + "," + col + ")");
			return true;
		}
	}

	public void display() {
		System.out.println();
		current = first;
		MLink temp;
		while(current != null) {
			temp = current;
			while(temp != null) {
				temp.displayLink();
				temp = temp.nextCol;
			}
			System.out.println();
			current = current.nextRow;
		}
	}

	public void display(int row, int col) {
		System.out.println();
		MLink temp = first;
		for(int i = 1; i < row; i++)
			temp = temp.nextRow;
		for(int j = 1; j < col; j++)
			temp = temp.nextCol;

		System.out.println("Value at (" + row + ", " + col + ") = " + temp.dData);
	}
}