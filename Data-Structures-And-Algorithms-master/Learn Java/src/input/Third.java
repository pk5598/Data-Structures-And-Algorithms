package input;

import java.*;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();   // 23\n  cursor stops before \n
	    scanner.next();            // doesn't move to nextline
		String b=scanner.nextLine();  // \n of nextInt() input is taken and moves to nextline
		System.out.println(a+"----"+b);
		
		   

	}

}
