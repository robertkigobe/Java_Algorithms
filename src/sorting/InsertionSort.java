package sorting;


/*
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort 
 * playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part 
 * are picked and placed at the correct position in the sorted part.
 * */
public class InsertionSort {

	// InsertionSort
  static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i], j = i;
      while ( j> 0 && arr[j-1]>temp) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
  }


	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
