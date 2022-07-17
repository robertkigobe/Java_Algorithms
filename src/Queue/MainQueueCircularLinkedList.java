package Queue;

public class MainQueueCircularLinkedList {

	public static void main(String[] args) {

		QueueCircularLinkedList cql = new QueueCircularLinkedList(5);
		Boolean isEmpty = cql.isEmpty();
		Boolean isFull = cql.isFull();
		System.out.println(isEmpty);
		System.out.println(isFull);

		cql.enQueue(18);
		cql.enQueue(52);
		cql.enQueue(36);
		cql.enQueue(42);
		cql.enQueue(50);
		cql.enQueue(67);
		isFull = cql.isFull();
		System.out.println(isFull);

		int resultDeQueue = cql.deQueue();
		System.out.println(resultDeQueue + " on first Dequeue");
		
		int resultDeQueue1 = cql.deQueue();
		System.out.println(resultDeQueue1 + " on second Dequeue");
		
		/*

		int resultPeek = ql.peek();
		System.out.println(resultPeek + " on first peek");

		int resultPeek2 = ql.peek();
		System.out.println(resultPeek2 + " on second peek");
		
		ql.deleteQueue();
		
*/
	}

}
