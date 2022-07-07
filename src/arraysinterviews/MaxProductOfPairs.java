package arraysinterviews;

public class MaxProductOfPairs {
	
	public  static void  main (String[] args) {
		int[] arr = {10,20,30,45,90,78,67,56,45,34,23,87,65,43};
		MaxProductOfPairs main = new MaxProductOfPairs();
		String v = main.maxProduct(arr);
		System.out.println(v);
		
	}
	
	public String maxProduct(int[] arr) {
		int maxNum = 0;
		String  pairs = "";
		

			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
				
					if(arr[i]*arr[j]>maxNum) 
					{
						maxNum = arr[i]*arr[j];
						pairs = Integer.toString(arr[i])+","+Integer.toString(arr[j]);
					}
					
				}
			} 
		
		return pairs;
		
	}

}
