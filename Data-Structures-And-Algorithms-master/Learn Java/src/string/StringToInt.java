package string;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="a1b2c3";
		int position=5;
		String res="";
		for(int i=0;i<s.length();i++) {
			int num=s.charAt(i);
			if(num>=49 && num<=57) {
				String ss=Character.toString(s.charAt(i-1));
				int val=Integer.parseInt(Character.toString(s.charAt(i)));
				for (int j=0;j<val;j++) res=res+ss;
			}
			
		}
		System.out.println(Character.toString(res.charAt(position)));
		

	}

}
