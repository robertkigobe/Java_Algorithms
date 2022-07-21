package sorting;

/*
 * 
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) from unsorted part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.

The subarray which is already sorted. 
Remaining subarray which is unsorted.
 * 
 * 
 * */

public class SelectionSort {

  static void selectionSort(int[] a) {
    for (int j = 0; j < a.length; j++) {
      int minimumIndex = j;
      for (int i = j+1; i<a.length; i++) {
        if (a[i] < a[minimumIndex]) {
          minimumIndex = i;
        }
      }
      if (minimumIndex != j) {
        int temp = a[j];
        a[j] = a[minimumIndex];
        a[minimumIndex] = temp;
      }
    }
  }


	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
