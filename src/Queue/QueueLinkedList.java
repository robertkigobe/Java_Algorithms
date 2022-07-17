package Queue;

public class QueueLinkedList {

	LinkedList list;

	public QueueLinkedList() {
		list = new LinkedList();
		System.out.print("Queue succesfully created");

	}

	public Boolean isFull() {
		if (list.head == null) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}

	}

	// Enqueue
	public void enqueue(int value) {

		list.insertIntoLinkedList(value, list.size);

	}

	// Dequeue
	public int deQueue() {
		
		int valueQueue = -1;
		
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			valueQueue = list.head.value;
			list.deleteNode(0);
			return valueQueue;
		}
		

	}
	
	// Dequeue
	public int peek() {
		
		int valueQueue = -1;
		
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			valueQueue = list.head.value;
			return valueQueue;
		}
		

	}
	
	//Delete
	public void deleteQueue(){
		
		list.head=null;
		list.tail=null;
		System.out.println("Queue succesfully deleted");
		
	}

}
