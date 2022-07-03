package arrays;

import java.util.Arrays;

public class Array2Dimensions {

	public static void main(String[] args) {

		TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);

		sda.insertIn2DArray(0, 0, 11);
		sda.insertIn2DArray(0, 1, 12);
		sda.insertIn2DArray(0, 2, 13);
		sda.insertIn2DArray(1, 0, 31);
		sda.insertIn2DArray(1, 1, 32);
		sda.insertIn2DArray(1, 2, 33);
		sda.insertIn2DArray(2, 0, 51);
		sda.insertIn2DArray(2, 1, 52);
		sda.insertIn2DArray(2, 2, 53);

		System.out.println("\nPrint a 2D array");
		System.out.println(Arrays.deepToString(sda.arr));

		System.out.println("\nReading from a 2D array cell");
		sda.readFrom2DArray(2, 2);

		System.out.println("\nTraversing a 2D array");
		sda.traverse2DArray();

		System.out.println("\nSearching a 2D array");
		sda.search2DArray(33);

	}

}

class TwoDimensionalArray {

	int[][] arr;

	// constructor to create an array[][]

	public TwoDimensionalArray(int row, int col) {
		this.arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}

	}

	// insert values in an array
	public void insertIn2DArray(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Value " + value + " succesfully insterted at position " + row + "," + col);
			} else {
				System.out.println("The cell is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array index is not accesible");
		}
	}

	// Accessing a cell in a 2D array
	public void readFrom2DArray(int row, int col) {
		System.out.println("\nReading from row " + row + ", and column " + col);
		try {
			System.out.println("The cell value is: " + arr[row][col]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2D Array index not available");
		}
	}

	// Traversing a 2D Array
	public void traverse2DArray() {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	// Searching for a value in a 2D Array
	public void search2DArray(int value) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {

				if (arr[row][col] == value) {
					System.out.println("Value: " + value + " found at row: " + row + " column: " + col);
					return;
				}

			}
		}
		System.out.println("Value not found in the 2D Array");
	}

}
