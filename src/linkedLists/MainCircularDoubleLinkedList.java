package linkedLists;

public class MainCircularDoubleLinkedList {

	public static void main(String[] args) {

		CircularDoubleLinkedList cDLL = new CircularDoubleLinkedList();

		System.out.println("Creatig a Double linked List\n");
		cDLL.createcDLL(35);
		System.out.println("Double linked List created succesfully with size: " + cDLL.size);
		

		// insert into linked list
		cDLL.insertIncDLL(9, 0);
		cDLL.insertIncDLL(13, 2);
		cDLL.insertIncDLL(10, 3);
		cDLL.insertIncDLL(8, 4);
		cDLL.insertIncDLL(7, 5);
		cDLL.insertIncDLL(17, 6);
		cDLL.insertIncDLL(37, 7);
		cDLL.insertIncDLL(27, 8);
		cDLL.insertIncDLL(57, 9);
		cDLL.insertIncDLL(67, 10);
		System.out.println("Double linked Node 2 is : " + cDLL.head.next.value);

		System.out.println("Double linked List created succesfully with size: " + cDLL.size);

		// Traverse Double linked list
		System.out.println("Traverse a Double linked List\n");
		cDLL.traverseCircularDoubleLinkedList();

		/**
		// Reverse Traverse Double linked list
		System.out.println("\nTraverse a Double linked List");
		cDLL.reverseTraverseDoubleLinkedList();

		System.out.println("\n\nSearch the CSLL");
		cDLL.searchDoublelinkedList(37);

		// delete from a linked list
		cDLL.deleteNode(9);
		System.out.println("\nThe number of nodes after a node delete is: " + cDLL.size);

		System.out.println("\nDelete the cDLL");
		cDLL.deleteLinkedList();
		cDLL.traverseDoubleLinkedList(); */

	}

}
