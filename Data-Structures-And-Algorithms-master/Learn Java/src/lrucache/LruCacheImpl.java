package lrucache;

import java.util.HashMap;
import java.util.Set;

public class LruCacheImpl {
	int capacity;
	HashMap<Integer, Node> map=new HashMap<Integer, Node>();
	Node head=null;
	Node end=null;
	
	public LruCacheImpl(int capacity) {
		this.capacity=capacity;
	}

	public String get(int val) {
		if(map.containsKey(val)){
            Node n = map.get(val);
            delete(n);
            setHead(n);
            return "In Cache";
        }
		
		return "Not In Cache";
		
	}
	
	public void setHead(Node oldnode) {
		
		oldnode.next=head;
		oldnode.prev=null;
		
		if (head!=null) {
			head.prev=oldnode;
		}
		head=oldnode;
		if(end==null) {
			end=head;
		}
		
		
	
	}
	
	public void delete(Node oldNode) {
		//remember we have to handle previous address and next address 
		
		if (oldNode.prev!=null) {
			oldNode.prev.next=oldNode.next;
		}
		else {
			head=oldNode.next;
		}
		
		if (oldNode.next!=null) {
			oldNode.next.prev=oldNode.prev;
		}
		else {
			//oldNode.next==null
			end=oldNode.prev;
		}
	}
	
	public void set(int val) {
		
		if(map.containsKey(val)) {
			Node oldNode=map.get(val);
			delete(oldNode);
			setHead(oldNode);
			
		}
		else {
			
			Node newNode=new Node(val);
			if (map.size()>=capacity) {
				map.remove(end.data);
				delete(end);
				setHead(newNode);
				
			}
			else {
				setHead(newNode);
			}
			map.put(val, newNode);
			
		}
		
		
	
	}
	

	public static void main(String[] args) {
		
		LruCacheImpl lrucache=new LruCacheImpl(4);
		
		lrucache.set(1);
		lrucache.set(10);
        lrucache.set(15);
        lrucache.set(10);
        lrucache.set(12);
        lrucache.set(18);
        lrucache.set(1);
        System.out.println("1 "+ lrucache.get(1));
        System.out.println("10 "+ lrucache.get(10));
        System.out.println("15 "+ lrucache.get(15));

	}

	

}
