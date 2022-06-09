package basics;
import java.lang.*;

import java.util.*;

import java.util.*;
import java.lang.*;
public class Input {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		//String[] s = br.readLine().trim().split("\\s"); // "3 4" len of a,b array
		String[] s = sc.nextLine().split(" ");  // "3 4" len of a,b array
		
	    int n = Integer.parseInt(s[0]);  //n=3
	    int m = Integer.parseInt(s[1]); //n=4
	    
	    int a[] = new int[n];
	    int b[] = new int[m];
	    
	    String[] s1 = sc.nextLine().split(" ");  //"2 3 4"
	    String[] s2 = sc.nextLine().split(" ");  // "3 4 5 6"
	    
	    
	    
	    for(int i=0;i<n;i++)
	        a[i] = Integer.parseInt(s1[i]);
	    for(int i=0;i<m;i++)
	        b[i] = Integer.parseInt(s2[i]);
	    
	    
		
	    System.out.println("printing arraya");
	    for (int val:a) {
	    	System.out.print(val);
	    }
	    System.out.println();
	    for (int val:b) {
	    	System.out.print(val);
	    }
	    
	}
}
