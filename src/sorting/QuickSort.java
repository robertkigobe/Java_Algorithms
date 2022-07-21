package sorting;

/*
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. 
 * It picks an element as a pivot and partitions the given array around the picked pivot. 
 * There are many different versions of quickSort that pick pivot in different ways. 

Always pick the first element as a pivot.
Always pick the last element as a pivot (implemented below)
Pick a random element as a pivot.
Pick median as the pivot.
 * 
 * 
 * 
 * */

public class QuickSort {

  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j= start; j<=end; j++) {
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i;
  }

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot -1);
      quickSort(array, pivot + 1, end);
    }
  }





	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
