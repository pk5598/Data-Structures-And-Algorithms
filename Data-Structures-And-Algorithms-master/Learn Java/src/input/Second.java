package input;
import java.*;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();   // 23\n  cursor stops before \n
       scanner.nextLine();// nextLine() moves to next line when \n is seen 
	   String b=scanner.nextLine();
	   System.out.println(a+"----"+b);
	   
	}

}
