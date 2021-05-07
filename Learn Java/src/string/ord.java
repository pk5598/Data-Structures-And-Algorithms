package string;

public class ord {

	public static void main(String[] args) {
		
		int[] arr=new int[26];
		String s="aabbxxrgwweeee";
		for (int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']+=1;
		}
		for (int i=0;i<26;i++) {
			int k=97+i;
			char c=(char) k ;
			System.out.println(c +"--->"+arr[i]);
		}
		

	}

}
