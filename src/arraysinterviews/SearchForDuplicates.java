package arraysinterviews;

public class SearchForDuplicates {
	
	//check for unique elements in an array
	public static void main(String[] args) {
		
		int[] arr = {10,20,43,45,90,78,67,56,46,34,23,87,65,43};
		SearchForDuplicates main = new SearchForDuplicates();
		Boolean v = main.isUnique(arr);
		System.out.println(v);
		
	}
	
	
	public Boolean isUnique(int[] arr) {
		
		Boolean  value = false;
		

			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
				
					if(arr[i] == arr[j]) 
					{
						value = true;
					}
					
				}
			} 
		
		return value;
		
	}
	
	

}
