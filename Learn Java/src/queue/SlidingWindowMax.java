package queue;

import java.util.Deque;
import java.util.LinkedList;

import javax.xml.ws.AsyncHandler;

import linkedlist.LinkedListImpl;

public class SlidingWindowMax {

	public static void main(String[] args) {
		
		int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);

	}

	private static void printMax(int[] arr, int length, int k) {
		Deque<Integer> Qi =new LinkedList<Integer>();	
		int i;
		for( i=0;i<k;i++) {
			while (!Qi.isEmpty() && arr[Qi.peekLast()]<=arr[i]) Qi.removeLast();
				
			
			Qi.addLast(i);
		}
		
		for (;i<length;i++) {
			
			System.out.println(arr[Qi.peek()]);
			
			while(!Qi.isEmpty() && Qi.peek()<=i-k) Qi.removeFirst();
				
			
			
			while (!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]) Qi.removeLast();
			
			Qi.addLast(i);
			
		}
		System.out.println(arr[Qi.peek()]);
		
	}

}
