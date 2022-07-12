package linkedLists;

public class CircularSinglyLinkedList {
	
	public Node head;
	public Node node;
	public Node tail;
	public int size;
	
	//create circular singly linked list
	public Node createCSLL(int nodeValue) {
		head = new Node();
		node = new Node();
		node.next = node;
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;
		return node;
	}
	
	//insert into circular singly linked list
	public void insertNodeIntoCSLL(int nodeValue, int location) {
		
		//create new node and assign value
		Node node = new Node();
		node.value = nodeValue;
		
		// check if head is null so as to insert at the beginig of the linked list and return
		if(head == null) {
			createCSLL(nodeValue);
			return;
			
			//insert at the begining
		} else if(location == 0) {
			
			node.next = head;
			head = node;
			tail.next = head;
			//insert at the end
		} else if(location >= size) {
			
			
			tail.next = node;
			tail =  node;
			node.next = head;
			//inset at a location
		} else {
			Node tempNode = new Node();
			int index =0;
			while(index <location-1) {
				tempNode = tempNode.next;
				index ++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
			
		}
		size++;
		
	}
	
	

}
