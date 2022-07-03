package arraysinterviews;

import java.util.Arrays;

public class PairsTwoSum {
	
	//find all pairs of integers whose sum is equal to a given integer
	
	public static void main(String[] args) {
		PairsTwoSum main = new PairsTwoSum();
		int [] intArray = {3,7,11,15};
		int [] result = main.pairSum(intArray,18);
		System.out.println(Arrays.toString(result));
	}
	
	public int [] pairSum(int [] intArray, int target) {
		
		for(int i=0; i<intArray.length; i++) {
			for (int j=i+1; j<intArray.length; j++) {
				if(intArray[i]+intArray[j] == target) {
					return new int [] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No values can sum up");
	}
	

}
