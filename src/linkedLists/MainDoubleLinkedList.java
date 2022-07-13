package linkedLists;

public class MainDoubleLinkedList {

	public static void main(String[] args) {

		DoubleLinkedList dLL = new DoubleLinkedList();

		System.out.println("Creatig a Double linked List\n");
		dLL.createDLL(35);
		System.out.println("Double linked List created succesfully with size: " + dLL.size);

		// insert into linked list
		dLL.insertInDLL(9, 0);
		dLL.insertInDLL(13, 2);
		dLL.insertInDLL(10, 3);
		dLL.insertInDLL(8, 4);
		dLL.insertInDLL(7, 5);
		dLL.insertInDLL(17, 6);
		dLL.insertInDLL(37, 7);
		dLL.insertInDLL(27, 8);
		dLL.insertInDLL(57, 9);
		dLL.insertInDLL(67, 10);
		System.out.println("Double linked Node 2 is : " + dLL.head.next.value);

		System.out.println("Double linked List created succesfully with size: " + dLL.size);

		// Traverse Double linked list
		System.out.println("Traverse a Double linked List\n");
		dLL.traverseDoubleLinkedList();

		// Reverse Traverse Double linked list
		System.out.println("\nTraverse a Double linked List");
		dLL.reverseTraverseDoubleLinkedList();

		System.out.println("\n\nSearch the CSLL");
		dLL.searchDoublelinkedList(37);

		// delete from a linked list
		dLL.deleteNode(9);
		System.out.println("\nThe number of nodes after a node delete is: " + dLL.size);

		System.out.println("\nDelete the DLL");
		dLL.deleteLinkedList();
		dLL.traverseDoubleLinkedList();

	}

}
