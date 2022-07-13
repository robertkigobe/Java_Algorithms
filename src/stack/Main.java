package stack;

public class Main {

	public static void main(String[] args) {
		Stack newStack = new Stack(5);
		
		Boolean isEmpty = newStack.isEmpty();
		System.out.println(isEmpty);
		
		Boolean isFull = newStack.isFull();
		System.out.println(isFull);

	}
	
	

}
