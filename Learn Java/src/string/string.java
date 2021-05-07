package string;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] s=new String[] {"hello","pk"};//array of string
		
		System.out.println("enter the string");
		String string=scanner.nextLine();
		
		char[] c=string.toCharArray();
		
		for(char ch:c) {
			System.out.print(ch+" ");
		}
		
		System.out.println();
		
		
		
		System.out.println("//////");
		
		System.out.println("enter string");
		
		String s1=scanner.nextLine();
		String[] s2=s1.split(" ");
		
		for(String s3:s2) {
			System.out.print(s3+" ");
		}
		
		System.out.println();
		
		
	

	}

}
