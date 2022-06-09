package arraylist;

import java.util.List;
import java.util.ArrayList;

public class ListOfList {

	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		list.add(l);
		
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(3);
		l1.add(4);
		list.add(l1);
		
		
		
		
		// created ds will be [[1,2],[3,4]]
		
        System.out.println(list.get(0));
        System.out.println(list.get(1));
	}

}
