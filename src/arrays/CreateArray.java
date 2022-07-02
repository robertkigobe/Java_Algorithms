package arrays;

import java.util.Arrays;
public class CreateArray {
	
	public static void main (String [] args) {
		//declaration of the array
		int [] intArray;       //.......................O(1)
		//instantiation of the array
		intArray = new int[3]; //.......................O(1)
		
		//initialization of the array
		intArray[0] = 1; //.......................O(1)
		intArray[1] = 2; //.......................O(1)
		intArray[2] = 3; //.......................O(1) many steps is equivalent to O(n)
		
		System.out.println(Arrays.toString(intArray));
		
		
		// creating all the steps in one line
		String [] stringArray = {"a","b","c","d"}; //.......................O(1)
		System.out.println(Arrays.toString(stringArray));
		
		
		
	}

}
