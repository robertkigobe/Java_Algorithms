package stack;

public class Stack {

	int[] arr;
	int topOfStack;
	int valueTop;

	public Stack(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The Stack has been created with size: " + size);
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (topOfStack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void pushStack(int value) {
		if (isFull()) {
			System.out.println("The Stack is already filled");
		} else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println(value + " has been pushed to the stack");
		}
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return -1;
		} else {

			valueTop = arr[topOfStack];
			topOfStack--;
			return valueTop;
		}
	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return -1;
		} else {
			
			valueTop = arr[topOfStack];
			return valueTop;
		}
	}
	
	public void deleteStack() {
		arr = null;
		System.out.println("Stack succesfully dleted from the memory");
	}

}
