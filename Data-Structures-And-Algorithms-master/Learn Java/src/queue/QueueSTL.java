package queue;

import java.util.Queue;

import linkedlist.LinkedListImpl;

public class QueueSTL {

	public static void main(String[] args) {
		Queue<Integer> q = new java.util.LinkedList<Integer>();
		q.add(1);
	    q.add(2);
	    q.add(3);
	    q.add(4);
	    
	    System.out.println(q.peek());
	    
	    System.out.println(q);
	    
	    q.remove();
	    
	    System.out.println(q);
		
		
		
		

	}

}
