package searching;

class Main {
  public static void main(String[] args) {
    int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
    
    Searching s = new Searching();
    
    s.linearSearch(arr, 12);
    s.binarySearch(arr, 20);
    
  }
}