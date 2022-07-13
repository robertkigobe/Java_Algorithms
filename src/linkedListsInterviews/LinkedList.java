package linkedListsInterviews;

public class LinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	//create linked lists
	public Node createLinkedList(int nodeValue) {
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;

		return node;
	}
	
	
	// insert into circular singly linked list
		public void insertNode(int nodeValue) {

			// create new node and assign value
			Node node = new Node();
			node.value = nodeValue;

		
			if (head == null) {
				createLinkedList(nodeValue);
				System.out.println("Linked list is empty so a new node is created");
				return;

			} else {//if (location >= size) {

				tail.next = node;
				tail = node;
				node.next = null;
				
				size++;
				
		
				

			}

		}
	
	//Traverse Linked list
	public void TraverseLinkedList() {
		Node tempNode = head;

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
			System.out.println();
		}
	}

}
