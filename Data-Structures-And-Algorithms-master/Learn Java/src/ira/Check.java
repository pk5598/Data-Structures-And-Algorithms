package ira;
import java.util.*;

public class Check {
	public static List prac() {
		List<Integer> ll=new ArrayList<>();
		ll.add(1);
		ll.add(2);
		return ll;
	}

	public static void main(String[] args) {
		List<Integer> ll=prac();
		
		for(int i:ll) System.out.println(i);
		

	}

}
