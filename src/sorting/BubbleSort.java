package sorting;
/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent 
 * elements if they are in the wrong order. This algorithm is not suitable for large data sets 
 * as its average and worst-case time complexity is quite high.*/
public class BubbleSort {

  void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j =0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
