package recurssion;


/*
 * calculate the power of a number
 * 
 * */


public class PowerCalculator {
	
	public static void main(String[] args) {
		PowerCalculator main = new PowerCalculator();
		var result = main.power(3, 4);
		System.out.println(result);
		
	}
	
	
	
	
	public int power(int base, int exponent) {
	    if (exponent == 0) {
	      return 1;
	    }
	    return base * power(base,exponent-1);
	  }

}
