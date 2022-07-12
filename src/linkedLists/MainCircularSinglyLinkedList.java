package linkedLists;

public class MainCircularSinglyLinkedList {

	public static void main(String[] args) {

		CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
		cSLL.createCSLL(17);
		System.out.println("\nThe size of the CSLL after create is: " + cSLL.size);
		System.out.println("The value of the next CSLL is: " + cSLL.head.next.value);

		// insert into linked list

		cSLL.insertNodeIntoCSLL(9, 1);
		cSLL.insertNodeIntoCSLL(13, 2);
		cSLL.insertNodeIntoCSLL(20, 3);
		cSLL.insertNodeIntoCSLL(58, 4);
		cSLL.insertNodeIntoCSLL(71, 5);
		cSLL.insertNodeIntoCSLL(7, 6);
		cSLL.insertNodeIntoCSLL(3, 7);
		cSLL.insertNodeIntoCSLL(2, 8);
		cSLL.insertNodeIntoCSLL(47, 9);
		cSLL.insertNodeIntoCSLL(37, 10);

		System.out.println("\nThe size of the CSLL after instert is: " + cSLL.size);

		System.out.println("\nTraversing the CSLL");
		cSLL.traverseCircularSinglyLlinkedList();

		System.out.println("\n\nSearch the CSLL");
		cSLL.searchCircularSinglyLlinkedList(97);

		// delete from a linked list
		cSLL.deleteNode(7);
		System.out.println("\nThe number of nodes after a node delete is: " + cSLL.size);
	}

}
