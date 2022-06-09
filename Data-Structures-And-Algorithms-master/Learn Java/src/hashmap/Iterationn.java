package hashmap;
import java.util.*;

public class Iterationn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map =new HashMap<>();
		
		map.put(1, 100);
		map.put(2, 200);
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(int key:map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
		

	}

}
