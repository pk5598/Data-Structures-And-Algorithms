package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiValueMap {

	public static void main(String[] args) {
		Map< String, ArrayList<Integer>> map=new HashMap< String, ArrayList<Integer>>();
		
		ArrayList<Integer> val=new ArrayList<Integer>();
		
		val.add(1);
		map.put("hello", val);
		val=null;
		
		System.out.println(map);
		
		if (map.containsKey("hello")) {
			ArrayList<Integer> val1 ;
			val1=map.get("hello");
			val1.add(2);
			map.put("hello", val1);
			
			
			
		}
		System.out.println(map);
		
		
	}

}
