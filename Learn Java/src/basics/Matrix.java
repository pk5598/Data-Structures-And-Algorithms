package basics;
import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row:");
		int row=sc.nextInt();
		System.out.println("Enter the no of col:");
		int col=sc.nextInt();
		int[][] arr=new int [row][col];
		
		
		System.out.println("Enter values of matrix:");
		for (int i=0;i<row;i++) {
			
			for (int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("print matrix:");
		System.out.print("[");
        for (int i=0;i<row;i++) {
        	System.out.print("[");
			for (int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("]");
			System.out.println();
		}
        System.out.print("]");
		
		

	}

}
