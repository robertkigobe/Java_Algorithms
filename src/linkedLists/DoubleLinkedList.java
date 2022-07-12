package linkedLists;

public class DoubleLinkedList {
	
	public int nodeValue;
	public int size;
	public DoubleLLNode head;
	public DoubleLLNode tail;
	
	//Create a double linked list
	public DoubleLLNode createDLL(int nodeValue) {
		
		DoubleLLNode node = new DoubleLLNode();
		node.next = null;
		node.previous = null;
		
		head = node;
		tail = node;
		
	
		System.out.println("Double Linked List has been created");
		node.value = nodeValue;
		size++;
		
		return node;
		
	}

}
