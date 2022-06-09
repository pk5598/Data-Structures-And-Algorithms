package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		
		// write a programe to reverse an array
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		
		int[] arr=Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int low=0,high=arr.length-1;
		
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low+=1;
			high-=1;
			
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		

	}

}
