package heapsort;




//Building max heap


public class HeapSort {

	public static void heapify(int[] arr,int i,int n) {
		int largest=i;
		
		int l=2*i+1;
		int r=2*i+2;
		
		if (l<n && arr[largest]<arr[l]) {
			largest=l;
		}
		
		if (r<n && arr[largest]<arr[r]) {
			largest=r;
		}
		
		if (largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr, largest,n);
		}
		
		
	}
	public static void sort(int[] arr) {
		int n=arr.length;
		
		for (int i=n/2-1;i>=0;i-- ) {
			heapify(arr,i,n);
		}
		
		for (int i = n-1; i>0; i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapify(arr, 0,i);
		}
	}
	public static void main(String[] args) {
		int[] arr= {9,6,5,0,8,2,1,3};
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		sort(arr);
		
		System.out.println("After Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
