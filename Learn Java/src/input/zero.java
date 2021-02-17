package input;

import java.util.Scanner;

public class zero {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		//Type in console after running  1 2
		int a=scanner.nextInt();   
		
		System.out.println(a);
		
		int b=scanner.nextInt();
		System.out.println(b);
		scanner.nextLine();
		String string=scanner.nextLine();
		System.out.println(string);
		
		
		scanner.close();

	}

}
