package recurssion;

public class RecursiveRange {

	/*
	 * write a function that takes a value and returns the sum of all numbers in the range from 0
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveRange main = new RecursiveRange();
		
		var result = main.recursiveRange(10);
		System.out.println(result);

	}
	
	public int recursiveRange(int num) {
	     if (num<=0) {
	       return 0;
	     }
	     return num + recursiveRange(num - 1);
	   } 

}
