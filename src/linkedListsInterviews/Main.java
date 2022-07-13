package linkedListsInterviews;

public class Main {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		LinkedListQuestions llq = new LinkedListQuestions();
		
		ll.createLinkedList(67);

	
		System.out.println("Double linked List created succesfully with size: " + ll.size);
		
		ll.insertNode(19);
		ll.insertNode(29);
		ll.insertNode(39);
		ll.insertNode(49);
		ll.insertNode(59);
		ll.insertNode(39);
		ll.insertNode(79);
		ll.insertNode(89);
		System.out.println("Double linked has size: " + ll.size);
		// Traverse Double linked list
		System.out.println("Traverse a Double linked List");
		ll.TraverseLinkedList();
		
		llq.removeDuplicates(ll);
		ll.TraverseLinkedList();
		System.out.println("Double linked after removal has size: " + ll.size);

	}

}
