package arrays;

import java.util.Arrays;

public class Array2Dimensions {

	public static void main(String[] args) {
		
		TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
		
		sda.insertIn2DArray(0, 0, 11);
		sda.insertIn2DArray(0, 1, 12);
		sda.insertIn2DArray(0, 2, 13);
		sda.insertIn2DArray(1, 0, 31);
		sda.insertIn2DArray(1, 1, 32);
		sda.insertIn2DArray(1, 2, 33);
		sda.insertIn2DArray(2, 0, 51);
		sda.insertIn2DArray(2, 1, 52);
		sda.insertIn2DArray(2, 2, 53);
		
		System.out.println(Arrays.deepToString(sda.arr));

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
				System.out.println("Value " + value + " succesfully insterted at position " + arr[row] + arr[col]);
			} else {
				System.out.println("The cell is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array index is not accesible");
		}
	}

}
