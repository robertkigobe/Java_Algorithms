package recurssion;

	
	/*
	 * calculate the factorial of a number
	 * 
	 * */
	public class Factorial {
	
	public static void main(String[] args) {
		
	Factorial main = new Factorial();
	int result = main.factorial(4);
	System.out.println(result);
	
}
	
	public int factorial(int num) {
	    if (num<=1) {
	      return 1;
	    }
	    return num * factorial(num-1);
	  }
	

}
