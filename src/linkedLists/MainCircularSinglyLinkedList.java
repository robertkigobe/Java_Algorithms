package linkedLists;

public class MainCircularSinglyLinkedList {
	
	public static void main(String[] args) {
		
		CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
		cSLL.createCSLL(17);
		System.out.println("The size of the CSLL is: "+ cSLL.size);
		System.out.println("The value of the next CSLL is: "+ cSLL.head.next.value);
	}

}
