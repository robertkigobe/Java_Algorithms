package stack;

public class MainLL {

	public static void main(String[] args) {
		
		
		StackLL newStack = new StackLL();
		Boolean isEmpty = newStack.isEmpty();
		System.out.println(isEmpty);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		isEmpty = newStack.isEmpty();
		System.out.println(isEmpty);
		int resultPop = newStack.pop();
		System.out.println(resultPop);
		
		int resultPeek = newStack.peek();
		System.out.println(resultPeek);
		
		int resultPeek2 = newStack.peek();
		System.out.println(resultPeek2);
		
		newStack.deleteStack();
		
		
	}

}
