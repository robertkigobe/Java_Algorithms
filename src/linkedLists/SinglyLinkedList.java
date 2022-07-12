package linkedLists;

public class SinglyLinkedList {

	public SinglyLLNode head;
	public SinglyLLNode tail;
	public int size;

	// create a linked singly list

	public SinglyLLNode createSinglyLinkedList(int nodeValue) {

		head = new SinglyLLNode();
		SinglyLLNode node = new SinglyLLNode();
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;

		return node;
	}

	// insert a node in a singly list
	public void insertIntoLinkedList(int nodeValue, int location) {
		// create node that takes the node value
		SinglyLLNode node = new SinglyLLNode();
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
			SinglyLLNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			SinglyLLNode nextNode = tempNode;
			tempNode.next = node;
			node.next = tempNode;

		}
		size++;

	}

//Traversing a singly Linked list
	public void traverseSinglyLlinkedList() {
		// check if head exists
		if (head == null) {
			System.out.println("Linked List doesnt exist");
		} else {
			SinglyLLNode tempNode = head;

			// loop all nodes
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);

				if (i != size - 1) {
					System.out.print("->");
				}

				tempNode = tempNode.next;
			}
		}
		System.out.println();
	}

	// Search for a value in a Linked List
	public boolean searchLinkedList(int searchValue) {

		// check if there is a head node otherwise terminate
		if (head != null) {
			// create a temporary node to traverse the linked list
			SinglyLLNode tempNode = head;
			// loop through until you get the value and return the node location
			for (int i = 0; i < size; i++) {
				// get value to be searched
				if (tempNode.value == searchValue) {
					System.out.println("Value located in location: " + i + "\n");
					return true;
				}
				tempNode = tempNode.next;
			}

		}
		// otherwise value doesnt exist
		System.out.println("Node not found");
		return false;

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
			SinglyLLNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;

		} else {

			// find node before first node
			SinglyLLNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}

			tempNode = tempNode.next.next;
			;
			size--;

		}

	}

	// delete entire Singly linked list
	public void deleteLinkedList() {
		// this is done by setting tail and head reference to null
		head = null;
		tail = null;
		size = 0;
		System.out.println("The SLL deleted successfully");
	}

}
