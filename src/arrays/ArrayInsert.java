package arrays;

public class ArrayInsert {

	public static void main(String[] args) {

		SingleDimensionalArray sda = new SingleDimensionalArray(10);
		sda.insertValue(0, 1);
		sda.insertValue(1, 2);
		sda.insertValue(2, 3);
		sda.insertValue(3, 4);
		sda.insertValue(4, 5);
		sda.insertValue(9, 6);
		sda.insertValue(11, 1);
		sda.insertValue(2, 8);
		sda.insertValue(6, 9);
		sda.insertValue(7, 100);

		System.out.println("\n\nArray Traversal");
		sda.arrayTraversal();
		System.out.println("\n\nArray Search");
		sda.searchInArray(9);
	}

}

class SingleDimensionalArray {

	int[] arr = null;

	public SingleDimensionalArray(int sizeOfArray) {

		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertValue(int location, int valueToBeInserted) {

		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Value succesfully inserted");
			} else {
				System.out.println("Index already has a value");

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You may not be able to insert a value outside the bounds of the array");
		}

	}

	/////// Array traversal
	public void arrayTraversal() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array doesn't exist");
		}
	}

	////// Search value in array //// {Linear Search }
	public void searchInArray(int valueToSearch) {

		for (int i = 0; i < arr.length; i++) {	//......................................................o(N)													
			if (arr[i] == valueToSearch) {//............................................................o(1)
				System.out.println("The value of: " + valueToSearch + " is found at index " + i);//.....o(1)
				return;//...............................................................................o(1)
			}
		}
		System.out.println("The value: " + valueToSearch + " doesnt exist in the array");//...............o(1)
	}
}
