package arrays;

import java.util.Arrays;

public class Sort2DArray {

	public static void main(String[] args) {
		int[][] arr= {{3,2},{1,4},{5,6}};
		Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
		
		for(int[] i: arr) {
			System.out.println(i[0]+" "+i[1]);
		}

	}

}
