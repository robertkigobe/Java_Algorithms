package recurssion;


/*
 * calculate the power of a number
 * 
 * */
class PowerOfInt {
	  public static void main(String[] args) {
		  PowerOfInt main = new PowerOfInt();
	    var result = main.power(3,3);
	    System.out.println(result);


	  }

	  // Question 2 - Power

	  public int power(int base, int exp) {
	    if (exp<0) {
	      return -1;
	    }
	    if (exp==0 || exp==1) {
	      return base;
	    }
	    return base * power(base, exp-1);
	  }


	}