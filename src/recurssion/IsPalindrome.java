package recurssion;

/*
 * write a function that checks if a string is a palindrome
 * 
 */
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsPalindrome main = new IsPalindrome();
		String arr = "kayak";

		Boolean result = main.isPalindrome(arr);
		System.out.println(result);

	}

	public boolean isPalindrome(String s) { // if length is 0 or 1 then String is palindrome
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
		return false;
	}

}
