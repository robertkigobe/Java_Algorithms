package recurssion;

public class ReverseString {

	/*
	 * write a function that takes a string and returns the reverse of the string
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString main = new ReverseString();
		String arr = "Kigobe";
		
		var result = main.reverse(arr);
		System.out.println(result);

	}
	
	public String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
