package stack;

public class StackLL {

	LinkedList linkedList;

	public StackLL() {
		linkedList = new LinkedList();
		System.out.println("Created a Stack");
	}

	public void push(int value) {
		linkedList.insertIntoLinkedList(value, 0);
		System.out.println("Insert " + value + " into Stack");
	}

	public Boolean isEmpty() {

		if (linkedList.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		int result = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return result;
		} else {
			result = linkedList.head.value;
			linkedList.deleteNode(0);
			return result;
		}

	}
	
	public int peek() {
		int result = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return result;
		} else {
			result = linkedList.head.value;
			return result;
		}

	}
	
	public void deleteStack() {
		linkedList.head = null;
		System.out.println("The stack is deleted");
	}

}
