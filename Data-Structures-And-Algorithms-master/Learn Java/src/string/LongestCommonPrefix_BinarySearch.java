package string;

public class LongestCommonPrefix_BinarySearch {
	
	private static int findSmallString(String[] s1) {
		
		int maxi=Integer.MAX_VALUE;
		for (int i=0;i<s1.length;i++) {
			if (s1[i].length()<maxi) {
				maxi=s1[i].length();
			}
		}
		return maxi;
	}
	
	private static boolean allCommonPrefix(String[] s1, int low, int mid) {
		String s=s1[0];
		for (int i=1;i<s1.length;i++) {
			String s2=s1[0];
			for (int j = low; j <= mid; j++) {
				if (s.charAt(j)!=s2.charAt(j)) return false;
			}
		}
		return true;
	}
	
	private static String lcsUtil(String[] s1) {
		String res_str="";
		int small_string_length=findSmallString(s1);
		
		int low=0,high=small_string_length-1;
		
		while (low<=high) {
			int mid=(low+high)/2;
			
			if (allCommonPrefix(s1,low,mid)) {
				res_str=res_str+s1[0].substring(low, mid+1);
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
			
			
		}
		
		return res_str;
	}

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks geeks geek geezer";
		String[] s1=s.split(" ");
		
		String res=lcsUtil(s1);
		System.out.println(res);

	}

	

}
