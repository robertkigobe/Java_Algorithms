package Queue;

public class MainQueueArray {

	public static void main(String[] args) {

		QueueArray qa = new QueueArray(5);
		Boolean isEmpty = qa.isEmpty();
		Boolean isFull = qa.isFull();
		System.out.println(isEmpty);
		System.out.println(isFull);

		qa.enqueue(1);
		qa.enqueue(2);
		qa.enqueue(3);
		qa.enqueue(4);
		qa.enqueue(5);
		qa.enqueue(6);
		isFull = qa.isFull();
		System.out.println(isFull);

		int resultDeQueue = qa.deQueue();
		System.out.println(resultDeQueue + " on first Dequeue");
		
		int resultDeQueue1 = qa.deQueue();
		System.out.println(resultDeQueue1 + " on second Dequeue");
		

		int resultPeek = qa.peek();
		System.out.println(resultPeek + " on first peek");

		int resultPeek2 = qa.peek();
		System.out.println(resultPeek2 + " on second peek");
		
		qa.deleteQueue();

	}

}
