package linkedLists;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList sLL = new SinglyLinkedList();

		// create linked list
		sLL.createSinglyLinkedList(5);

		System.out.println("The value in the head node is: " + sLL.head.value);
		System.out.println("The number of nodes is: " + sLL.size);

		// insert into linked list
		sLL.insertIntoLinkedList(7, 0);
		System.out.println("The value in the head node is: " + sLL.head.value);
		System.out.println("The number of nodes is: " + sLL.size);

		// insert into linked list
		sLL.insertIntoLinkedList(9, 1);
		System.out.println("The number of nodes is: " + sLL.size);
	}

}
