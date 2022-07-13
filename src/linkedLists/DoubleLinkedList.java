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
	
	//Insert into a double linked list
	public void insertInDLL(int nodeValue, int location) {
		DoubleLLNode node = new DoubleLLNode();
		
		if(head == null) {
			createDLL(nodeValue);
			return;
			//Inserting at the begining of the DLL
		} else if(location == 0) {
			
			
			node.next = head;
			node.previous = null;
			head.previous = node;
			head = node;
			
			
		} else if (location >=size) {
			node.next = null;
			tail.next = node;
			node.previous = tail;
			tail = node;
		} else {
			DoubleLLNode tempNode = new DoubleLLNode();
			int index = 0;
			
			while (index <location-1) {
				tempNode = tempNode.next;
				index++;
			}
			
			node.previous = tempNode;
			node.next = tempNode.next;
			tempNode.next = node;
			node.next.previous = node;
		}
		
		size++;
		
		
	}

}
