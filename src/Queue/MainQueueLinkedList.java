package Queue;

public class MainQueueLinkedList {

	public static void main(String[] args) {

		QueueLinkedList ql = new QueueLinkedList();
		
		Boolean isEmpty = ql.isEmpty();
		Boolean isFull = ql.isFull();
		System.out.println(isEmpty);
		System.out.println(isFull);

		ql.enqueue(18);
		ql.enqueue(52);
		ql.enqueue(36);
		ql.enqueue(42);
		ql.enqueue(50);
		ql.enqueue(67);
		isFull = ql.isFull();
		System.out.println(isFull);

		int resultDeQueue = ql.deQueue();
		System.out.println(resultDeQueue + " on first Dequeue");
		
		int resultDeQueue1 = ql.deQueue();
		System.out.println(resultDeQueue1 + " on second Dequeue");
		

		int resultPeek = ql.peek();
		System.out.println(resultPeek + " on first peek");

		int resultPeek2 = ql.peek();
		System.out.println(resultPeek2 + " on second peek");
		
		ql.deleteQueue();
		

	}

}
