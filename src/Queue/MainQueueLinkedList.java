package Queue;

public class MainQueueLinkedList {

	public static void main(String[] args) {

		QueueLinkedList ql = new QueueLinkedList();
		
		Boolean isEmpty = ql.isEmpty();
		Boolean isFull = ql.isFull();
		System.out.println(isEmpty);
		System.out.println(isFull);

		ql.enqueue(1);
		ql.enqueue(2);
		ql.enqueue(3);
		ql.enqueue(4);
		ql.enqueue(5);
		ql.enqueue(6);
		isFull = ql.isFull();
		System.out.println(isFull);

		/*
		int resultDeQueue = qa.deQueue();
		System.out.println(resultDeQueue + " on first Dequeue");
		
		int resultDeQueue1 = qa.deQueue();
		System.out.println(resultDeQueue1 + " on second Dequeue");
		

		int resultPeek = qa.peek();
		System.out.println(resultPeek + " on first peek");

		int resultPeek2 = qa.peek();
		System.out.println(resultPeek2 + " on second peek");
		
		qa.deleteQueue();
		*/

	}

}
