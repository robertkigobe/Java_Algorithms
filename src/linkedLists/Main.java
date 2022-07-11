package linkedLists;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList sLL = new SinglyLinkedList();

		// create linked list
		sLL.createSinglyLinkedList(5);
		
		// insert into linked list
		sLL.insertIntoLinkedList(9, 1);		
		sLL.insertIntoLinkedList(13, 2);
		sLL.insertIntoLinkedList(10, 3);		
		sLL.insertIntoLinkedList(8, 4);			
		sLL.insertIntoLinkedList(7, 5);
		sLL.insertIntoLinkedList(17, 6);
		sLL.insertIntoLinkedList(37, 7);
		sLL.insertIntoLinkedList(27, 8);
		sLL.insertIntoLinkedList(57, 9);
		sLL.insertIntoLinkedList(67, 10);
		
		//Traverse linked list
		sLL.traverseSinglyLlinkedList();
		System.out.println("The value in the head node is: " + sLL.head.value);
		System.out.println("The number of nodes is: " + sLL.size);
		
		//Search a linked List
		sLL.searchLinkedList(8);
		
		//delete from a linked list
		sLL.deleteNode(7);
		System.out.println("The number of nodes is: " + sLL.size);
	}

}
