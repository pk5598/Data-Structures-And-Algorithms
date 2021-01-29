package basics;

import java.util.Scanner;

public class StringUtil1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:\n");
		String s=sc.nextLine();
		
		System.out.println("len of string:"+ s.length());
		
		System.out.println("Reverse of string");
		
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		

	}

}
