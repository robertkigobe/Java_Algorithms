package arraysinterviews;

public class PermutationOfArrays {
	
	//check if any two arrays are permutations of each other
	public static void main (String[] args) {
		PermutationOfArrays main = new PermutationOfArrays();
		int[] arr1= {1,2,3,4,5,6,7,8};
		int[] arr2 = {8,7,6,5,4,3,2,1};
		
		Boolean value = main.checkForPermutation(arr1,arr2);
		System.out.println(value);
	}
	
	public Boolean checkForPermutation(int[] arr1, int [] arr2) {
		Boolean value = false;
		int sum1=0;
		int sum2=0;
		int product1 = 0;
		int product2=0;
		
		for (int i=0; i<arr1.length; i++) {
			sum1 += arr1[i];
			product1 *= arr1[i];
		}
		
		for (int j=0; j<arr2.length; j++) {
			sum2 += arr2[j];
			product2 *= arr2[j];
		}
		
		if ((sum1==sum2)&&(product1==product2)){
			value = true;
		}
		
		return value;
	}

}
