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

}
