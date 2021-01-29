package tree;

public class Tree {
	Node root;
	
	public Tree() {
		root=null;
	}
	
	public static void main(String[] args) {
		
		Tree s=new Tree();
		
		s.root=new Node(2);
		s.root.left=new Node(1);
		s.root.right=new Node(3);
		
		System.out.println(s.root.data);
		System.out.println(s.root.left.data);
		System.out.println(s.root.right.data);
        
	
	
	
	}
}
