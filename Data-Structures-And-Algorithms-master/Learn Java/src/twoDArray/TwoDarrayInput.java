package twoDArray;

import java.util.Scanner;

public class TwoDarrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		
		String[] string= scanner.nextLine().split(" ");//"a b c d"
		
		// [['a','b'],['c,'d]]
		
		String[][] s=new String[2][2];
		
		int string_index=0;
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				s[i][j]=string[string_index];
				string_index+=1;
			}
		}
		
		for (String[] strings : s) {
			System.out.println(strings[0]+" "+strings[1]);
			
		}

	}

}
