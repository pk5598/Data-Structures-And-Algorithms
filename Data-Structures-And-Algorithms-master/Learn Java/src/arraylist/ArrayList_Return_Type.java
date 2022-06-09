package arraylist;

import java.util.ArrayList;

public class ArrayList_Return_Type {
	
	
	private static ArrayList<Integer> arrayListMethod() {
		ArrayList<Integer> s= new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		return s;
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> s=arrayListMethod();
		
		for(int num:s) {
			System.out.println(num);		
		}

	}

	

}
