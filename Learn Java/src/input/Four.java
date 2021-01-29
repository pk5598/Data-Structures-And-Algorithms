package input;

import java.util.Arrays;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        //input------> 3 4
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        //input "2 3 4 5 6"
        int[] arr=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        
        System.out.println(n+" "+k);
        for (int i : arr) {
        	System.out.print(i+" ");
        }

	

     }
}
