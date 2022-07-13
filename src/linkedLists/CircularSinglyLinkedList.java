package linkedLists;

public class CircularSinglyLinkedList {

	public SinglyLLNode head;
	public SinglyLLNode node;
	public SinglyLLNode tail;
	public int size;

	// create circular singly linked list
	public SinglyLLNode createCSLL(int nodeValue) {
		head = new SinglyLLNode();
		node = new SinglyLLNode();
		node.next = node;
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;
		return node;
	}

	// insert into circular singly linked list
	public void insertNodeIntoCSLL(int nodeValue, int location) {

		// create new node and assign value
		SinglyLLNode node = new SinglyLLNode();
		node.value = nodeValue;

		// check if head is null so as to insert at the beginig of the linked list and
		// return
		if (head == null) {
			createCSLL(nodeValue);
			
			return;

			// insert at the begining
		} else if (location == 0) {

			node.next = head;
			head = node;
			tail.next = head;
			// insert at the end
		} else if (location >= size) {

			tail.next = node;
			tail = node;
			node.next = head;
			// inset at a location
		} else {
			SinglyLLNode tempNode = new SinglyLLNode();
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
			// System.out.println("Node succesfully inserted");

		}
		System.out.println("Node succesfully inserted");
		size++;

	}

	// Traversing a circular singly Linked list
	public void traverseCircularSinglyLlinkedList() {

		SinglyLLNode tempNode = head;

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

	// Search a circular singly Linked list
	public boolean searchCircularSinglyLlinkedList(int nodeValue) {

		SinglyLLNode tempNode = head;

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

			head = head.next;
			tail.next = head;
			size--;
			// if there is only one node
			if (size == 0) {
				head = null;
				tail = null;
				head.next = null; // removes the circular relationship
			}

		} else if (location >= size) {

			// find node before first node
			SinglyLLNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				head.next = null;
				head = null;
				size--;
				return;

			}

			tempNode.next = head;
			tail = tempNode;
			size--;

		} else {

			// find node at location
			SinglyLLNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}

			tempNode = tempNode.next.next;
			size--;

		}

	}
	
	// delete entire Circular Singly linked list
		public void deleteLinkedList() {
			// this is done by setting tail and head reference to null
			head = null;
			tail.next = null;
			tail = null;
			size = 0;
			System.out.println("The CSLL deleted successfully");
		}

}
