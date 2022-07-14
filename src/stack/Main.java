package stack;

public class Main {

	public static void main(String[] args) {
		Stack newStack = new Stack(5);
		
		Boolean isEmpty = newStack.isEmpty();
		System.out.println(isEmpty);
		
		Boolean isFull = newStack.isFull();
		System.out.println(isFull);
		
		newStack.pushStack(6);
		newStack.pushStack(62);
		newStack.pushStack(26);
		newStack.pushStack(36);
		newStack.pushStack(46);
		newStack.pushStack(76);
		
		int value = newStack.pop();
		System.out.println(value);
		
		int peekValue = newStack.peek();
		System.out.println(peekValue);
		
		newStack.deleteStack();

	
		
	}
	
	

}
