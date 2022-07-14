package stack;


public class LinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {

		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;

		return node;
	}

	// insert a node in a singly list
	public void insertIntoLinkedList(int nodeValue, int location) {
		// create node that takes the node value
		Node node = new Node();
		node.value = nodeValue;
		// check if linked list is already created
		if (head == null) {
			createSinglyLinkedList(nodeValue);
			return;
			// check if inserting at first value
		} else if (location == 0) {
			node.next = head;
			head = node;

			// if location is greater than size then insert node at tail of the Linked list
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;

			// else insert at a given location
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode;
			tempNode.next = node;
			node.next = tempNode;

		}
		size++;

	}



	

	// Delete a node from a singly Linked List
	public void deleteNode(int location) {

		// check if head exists otherwise return

		if (head == null) {
			System.out.println("Linked List does not exist");
		} else
		// delete if it is only one node i.e head
		if (location == 0) {

			head = head.next;
			size--;
			if (size == 0) {
				head = null; // head already null
				tail = null;
			}

		} else if (location >= size) {

			// find node before first node
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;

		} else {

			// find node before first node
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}

			tempNode = tempNode.next.next;
			;
			size--;

		}

	}



}
