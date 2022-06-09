package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImpl {

	public static void main(String[] args) {
		
		Deque<Integer> dq =new ArrayDeque<Integer>();
		dq.offerFirst(1);
		dq.offerLast(2);
		System.out.println(dq);
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		

	}

}
