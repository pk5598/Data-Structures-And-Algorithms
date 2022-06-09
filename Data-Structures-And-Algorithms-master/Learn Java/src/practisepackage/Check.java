package practisepackage;

import java.util.Scanner;

public class Check {
	
	public void name() {
	  Scanner scanner=new Scanner(System.in);
	  char[] ch=new char[4];
	  
	  for (int i=0;i<4;i++) {
		  ch[i]=scanner.next().charAt(0);
	  }
	  
	  for (char c : ch) {
		System.out.println(c);
	}
	  
	  
	}

}
