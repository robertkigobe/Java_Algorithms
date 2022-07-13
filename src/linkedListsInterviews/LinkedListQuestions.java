package linkedListsInterviews;

import java.util.HashSet;
public class LinkedListQuestions {
	
	public void removeDuplicates(LinkedList ll) {
		HashSet<Integer> hs = new HashSet<>();
		Node current = ll.head;
		Node previous = null;
		while(current != null){
			int curVal = current.value;
			if(hs.contains(curVal)) {
				current.previous = current.next;
				ll.size--;
			} else {
				hs.add(curVal);
				previous = current;
			}
			current = current.next;
		}
		
	}

}
