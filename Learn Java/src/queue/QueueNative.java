package queue;

public class QueueNative {
	int size=5;
	int[] arr=new int[size];
	int front,rear=0;
	int capacity;
	
	
	public void enqueue(int data) {
		if(isFull()) {
			return;
		}
		arr[rear%size]=data;
		rear=(rear+1)%size;
		capacity+=1;
	}
	
	private boolean isFull() {
		if(capacity==size) {
			return true;
		}
		return false;
	}

	public void dequeue() {
		if (isEmpty()) {
			return;
		}
		
		arr[this.front%size]=0;
		this.front=(this.front+1)%size;
		capacity-=1;
		
	}
	
	
	public boolean isEmpty() {
		if (capacity==0) {
			return true;
			
		}
		
		return false;
	}

	public void print() {
		int i=(this.front)%size;
		
		for(int k=0;k<size;k++) {
			System.out.print((arr[i%size])+" ");
			i+=1;
		}
		System.out.println();
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		
		QueueNative queue=new QueueNative();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		queue.print();
		
		queue.dequeue();
		
		queue.print();
		
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		queue.print();
		
		queue.dequeue();
		queue.print();
		
		
		
		
		

	}

}
