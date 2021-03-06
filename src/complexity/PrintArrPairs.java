package complexity;

public class PrintArrPairs {

	public static void main(String[] args) { //.............................O(1)
		int[] arr = { 1, 2, 3, 4 }; //......................................O(1)
		PrintArrPairs main = new PrintArrPairs(); //........................O(1)
		main.pairsPrint(arr); //............................................O(1)
	}

	void pairsPrint(int[] array) { //.......................................O(1)
		for (int i = 0; i < array.length; i++) { //.........................O(n)
			for (int j = i+1; j < array.length; j++) {//....................O(n/2)
				System.out.println(array[i] + "," + array[j]); //...........O(1)
			}
		}
														//....n*n/2 .........O(n^2)
	}

}
