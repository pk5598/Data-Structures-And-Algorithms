package stack;

import java.util.Stack;

public class StackStl {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.add(2);
		stack.add(3);
		stack.add(6);
		
		System.out.println("top element "+stack.peek());
		System.out.println("popped element "+stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
