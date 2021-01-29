package string;
import java.util.*;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"a", "b", "c", "d", "e"};
		List <String> l1=new ArrayList<String>();
		Collections.addAll(l1, array);
		System.out.println("print"+l1);//print
		
		System.out.println(l1.get(1));
		
		l1.add("k");
		System.out.println("print"+l1);
		
		l1.set(1, "w");
		System.out.println("print"+l1);
		
		
		
		

	}

}
