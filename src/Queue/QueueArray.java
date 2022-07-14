package Queue;

public class QueueArray {

	int[] arr;
	int topOfQueue;
	int beginingOfQueue;

	public QueueArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginingOfQueue = -1;
		System.out.println("Queue has been succesfully created with size " + size);
	}

	public Boolean isFull() {
		if (topOfQueue == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isEmpty() {
		if ((beginingOfQueue == -1) || (beginingOfQueue == arr.length)) {
			return true;
		} else {
			return false;
		}

	}
	
	public void enqueue(int value) {
		
		//check if queue is full
		if(isFull()) {
			System.out.println("Queue is already full");
			return;
		} else 
			// check if empty initialize beginning index
		if (isEmpty()){
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Value "+ value +" succefully inserted at begining of Queue");
		} else 
			//else insert 
		{
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Value "+ value +" succefully inserted in the Queue");
			
		}
		
		
	}

}
