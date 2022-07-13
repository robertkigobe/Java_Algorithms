package linkedLists;

public class CircularDoubleLinkedList {

	public int nodeValue;
	public int size;
	public DoubleLLNode head;
	public DoubleLLNode tail;

	// Create a double linked list
	public DoubleLLNode createDLL(int nodeValue) {

		DoubleLLNode node = new DoubleLLNode();
		node.next = null;
		node.previous = null;

		head = node;
		tail = node;
		
		node.next = node;
		node.previous = node;

		System.out.println("Circular Double Linked List has been created");
		node.value = nodeValue;
		size++;

		return node;

	}

	// Insert into a double linked list
	public void insertInDLL(int nodeValue, int location) {
		DoubleLLNode node = new DoubleLLNode();
		node.value = nodeValue;

		if (head == null) {
			createDLL(nodeValue);
			return;
			// Inserting at the begining of the DLL
		} else if (location == 0) {

			node.next = head;
			node.previous = null;
			head.previous = node;
			head = node;

		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			node.previous = tail;
			tail = node;
		} else {
			DoubleLLNode tempNode = head;
			int index = 0;

			while (index < location - 1) {
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

	// Traversing a double Linked list
	public void traverseDoubleLinkedList() {

		DoubleLLNode tempNode = head;

		if (head == null) {
			System.out.println("Linked does not exist");
		} else {

			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;

			}

		}
	}

	// Reverse Traversing a double Linked list
	public void reverseTraverseDoubleLinkedList() {

		DoubleLLNode tempNode = tail;

		if (head == null) {
			System.out.println("Linked does not exist");
		} else {

			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.previous;

			}

		}
	}

	// Search a Double Linked list
	public boolean searchDoublelinkedList(int nodeValue) {

		DoubleLLNode tempNode = head;

		if (head != null) {

			for (int i = 0; i < size; i++) {

				if (tempNode.value == nodeValue) {

					System.out.println("Searched value  exists at location: " + i);
					return true;
				}

				tempNode = tempNode.next;

			}

		}
		System.out.println("Node does not exist");
		return false;
	}

	// Delete a node from a circular singly Linked List
	public void deleteNode(int location) {

		// check if head exists otherwise return

		if (head == null) {
			System.out.println("Linked List does not exist");
		} else
		// delete if it is only one node i.e head

		if (location == 0) {

			if (size == 1) {
				head = tail = null;
				size--;
				return;
				// deleting firt element in a size more than 1
			} else {
				head = head.next;
				head.previous = null;
				size--;
			}
			// deleting at end of DLL
		} else if (location >= size) {

			// find node before last node
			DoubleLLNode tempNode = tail.previous;

			if (size == 1) {
				head = tail = null;
				size--;
				return;
				// deleting first element in a size more than 1
			} else {
				tempNode.next = null;
				tail = tempNode;
				size--;
			}

		} else {

			// find node at location
			DoubleLLNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}

			tempNode.next = tempNode.next.next;
			tempNode.next.previous = tempNode;
			size--;

		}

	}

	// delete entire Double linked list
	public void deleteLinkedList() {
		// this is done by setting tail and head reference to null

		DoubleLLNode tempNode = head;

		for (int i = 0; i < size; i++) {

			tempNode.previous = null;

			tempNode = tempNode.next;
		}

		head = null;
		tail = null;
		size = 0;
		System.out.println("The CSLL deleted successfully");
	}

}
