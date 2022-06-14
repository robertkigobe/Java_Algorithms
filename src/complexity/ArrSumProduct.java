package complexity;

public class ArrSumProduct {
	
	public static void main(String [] args) { //...................O(1)
	ArrSumProduct main = new ArrSumProduct();//....................O(1)
	int [] array = {2,3,4,5,6,7,8,9};//............................O(1)
	main.spofArray(array);
		
	}
	
	void spofArray(int [] array) { //...............................O(1)
		//initialize the variables //...............................O(1)
		int sum = 0; //to cater for all numbers //..................O(1)
		int product = 1; //to avoid multiplying by 0 //.............O(1)
		
		for(int i=0; i<array.length; i++) { //......................O(n)
			sum += array[i]; //.....................................O(1)
		}
		
		for(int i=0; i<array.length; i++) { //......................O(n)
			product  *= array[i]; //................................O(1)
		}
		//print out the sum and product
		System.out.println(sum+  " "+product);//.....................O(1)
	}

}
