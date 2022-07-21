package recurssion;

import arraysinterviews.SearchForDuplicates;

public class FirstCaseUpper {
	
	//check for unique elements in an array
		public static void main(String[] args) {
			
			
			FirstCaseUpper main = new FirstCaseUpper();
			char v = main.first("aogeFsas");
			System.out.println(v);
			
		}
	
	public static char first(String str) {
	    if(str.isEmpty()) {
	        return ' ';
	    }
	    if (Character.isUpperCase(str.charAt(0))) {
	        return str.charAt(0);
	    }else {
	        return first(str.substring(1, str.length()));
	    }
	}

}
