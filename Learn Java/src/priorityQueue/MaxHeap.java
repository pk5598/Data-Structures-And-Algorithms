package priorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> li =new PriorityQueue<Integer>(Collections.reverseOrder());
		li.add(21);
		li.add(100);
		li.add(1);
		li.add(200);
		
		System.out.println(li);
		//priorty queue doesnt makes the list sorted,it only gives sorted form when we retrieve the data
		// below is the example 
		System.out.println(li.remove());
		System.out.println(li.remove());
		System.out.println(li.remove());
		System.out.println(li.remove());


	}

}
