package stack;

public class Stackimpl {
	int size=5;
	int[] arr=new int[size];
	int top=-1;
	public void append(int val) {
		top+=1;
		if (isFull()) {
			
			return;
		}
		arr[top]=val;
		
	}
	
	public void pop() {
		if(isEmpty()) {
			return;
		}
		System.out.println("Popped element: "+arr[top]);
		top-=1;
		
	}
	
	public void peek() {
		if (top==-1) {
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("peek element: "+arr[top]);
		}
		
		
	}
		
	
				
				
	
	private boolean isEmpty() {
		if (top==-1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top==size) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Stackimpl st=new Stackimpl();
		st.append(1);
		
		st.append(2);
		st.pop();
		st.peek();
		
		st.pop();
		st.peek();
		
		
		
		

	}

}
