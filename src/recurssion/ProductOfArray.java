package recurssion;

public class ProductOfArray {
	
	/*
	 * write a function that takes in an array and returns the product of the array
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArray main = new ProductOfArray();
		int [] arr = {2,3,4,5,6,7,8};
		var result = main.productofArray(arr, arr.length);
		System.out.println(result);

	}
	
	public int productofArray(int A[], int N) 
    { 
        if (N <= 0) 
            return 1; 
        return (productofArray(A, N - 1) * A[N - 1]); 
    } 

}
