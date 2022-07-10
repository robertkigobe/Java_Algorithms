package linkedLists;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	//create a linked singly list
	
	public Node createSinglyLinkedList(int nodeValue) {
		
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		
		return node;
	}
	
	//insert a node in a singly list
	public void insertIntoLinkedList(int nodeValue, int location) {
		//create node that takes the node value
		Node node = new Node();
		node.value = nodeValue;
		//check if linked list is already created
		if(head == null) {
			createSinglyLinkedList(nodeValue);
			return;
			//check if inserting at first value
		} else if (location == 0) {
			node.next = head;
			head = node;
			
			//if location is greater than size then insert node at tail of the Linked list
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
			
			//else insert at a given location
		} else {
			Node tempNode = head;
			int index = 0;
			while (index <location -1) {
				tempNode = tempNode.next;
				index ++;
			}
			Node nextNode = tempNode;
			tempNode.next = node;
			node.next = tempNode;
					
		}
		size ++;
		
	}
}
