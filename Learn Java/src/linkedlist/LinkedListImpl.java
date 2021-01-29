package linkedlist;

import java.awt.print.Printable;

public class LinkedListImpl {
	Node head;
	
	
	private void append(int i) {
		if (head==null) {
			head=new Node(i);
		}
		else {
			Node lasNode=head;
			while (lasNode.next!=null) {
				lasNode=lasNode.next;
		    }
			
			Node newNode=new Node(i);
			lasNode.next=newNode;
		}
		
	}
	
	private void print() {
		Node tempNode=head;
		System.out.println("printing node values");
		while (tempNode!=null) {
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
			
		}
		
	}

	public static void main(String[] args) {
		LinkedListImpl list =new LinkedListImpl();
		list.append(1);
		list.append(2);
		list.print();

	}



	




	

}
