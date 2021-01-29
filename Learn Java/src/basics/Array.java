package basics;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Len of Array:\n");
		int len=sc.nextInt();
		
		int[] arr= new int[len];
		System.out.println("Enter the values for the array");
		for (int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are:");
		for(int val:arr)
			System.out.print(val+" ");
		
		System.out.println();
		sc.close();

	}

}
