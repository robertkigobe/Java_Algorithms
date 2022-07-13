package linkedLists;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList dLL = new DoubleLinkedList();
		
		System.out.println("Creatig a Double linked List\n");
		dLL.createDLL(35);
		System.out.println("Double linked List created succesfully with size: " + dLL.size);
		
		// insert into linked list
		dLL.insertInDLL(9, 1);		
		dLL.insertInDLL(13, 2);
		dLL.insertInDLL(10, 3);		
		dLL.insertInDLL(8, 4);			
		dLL.insertInDLL(7, 5);
		dLL.insertInDLL(17, 6);
		dLL.insertInDLL(37, 7);
		dLL.insertInDLL(27, 8);
		dLL.insertInDLL(57, 9);
		dLL.insertInDLL(67, 10);
		
		System.out.println("Double linked List created succesfully with size: " + dLL.size);

	}

}
