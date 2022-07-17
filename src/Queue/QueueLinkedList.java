package Queue;

public class QueueLinkedList {
	
	
	LinkedList list;
	
	public QueueLinkedList() {
		list = new LinkedList();
		System.out.print("Queue succesfully created");
		
	}
	

	public Boolean isFull() {
		if (list.head==null) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isEmpty() {
		if (list.head==null) {
			return true;
		} else {
			return false;
		}

	}
	
	// Enqueue
		public void enqueue(int value) {

			list.insertIntoLinkedList(value, list.size);

		}
		
		


}
