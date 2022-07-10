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
		
		//Traverse linked list
		sLL.traverseSinglyLlinkedList();
		System.out.println("The value in the head node is: " + sLL.head.value);
		System.out.println("The number of nodes is: " + sLL.size);
	}

}
