package recurssion;

public class Fibbonacci {

	/*
	 * write a function that takes a value and returns next fibonacci value
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibbonacci main = new Fibbonacci();
		
		var result = main.fibbonacci(6);
		System.out.println(result);

	}
	
	 public int fibbonacci(int n) {
		    if (n<0) {
		      return -1;
		    }
		    if (n==0 || n==1) {
		      return n;
		    }
		    return fibbonacci(n-1) + fibbonacci(n-2);
		  }

}
