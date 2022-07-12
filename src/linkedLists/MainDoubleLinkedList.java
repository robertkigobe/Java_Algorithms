package linkedLists;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList dLL = new DoubleLinkedList();
		
		System.out.println("Creatig a Double linked List\n");
		dLL.createDLL(35);
		System.out.println("Double linked List created succesfully with size: " + dLL.size);

	}

}
