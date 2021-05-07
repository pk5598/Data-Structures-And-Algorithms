package string;

public class StringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="abcd";
		
		StringBuilder sBuilder=new StringBuilder(string);
		sBuilder.deleteCharAt(0);
		
		System.out.println(sBuilder);
		
		
	
		

	}

}
