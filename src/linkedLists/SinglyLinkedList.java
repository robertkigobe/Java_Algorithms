package linkedLists;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
		
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		
		return node;
	}
}
