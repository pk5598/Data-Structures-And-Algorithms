package string;

public class LongestPolindromicSubstring {
    private static void longestPalSubstr(String st) {
		int n=st.length();
		int start=0,maxlen=0,k=0;
		boolean[][] dp=new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			dp[i][i]=true;
		}
		
		for (int i = 0; i < n-1; i++) {
			if (st.charAt(i)==st.charAt(i+1)) {
				dp[i][i+1]=true;
				start=i;
				maxlen=2;
			}
		}
		
		k=3;
		
		while (k<=n) {
			int i=0; // row
			  
			int j=k-1;  // col
			while (i<n-k+1) {
				
				if (st.charAt(i)==st.charAt(j) && dp[i+1][j-1]) {
					dp[i][j]=true;
					if (maxlen<k) {
					start=i;
					maxlen=k;
					}
				}
				j+=1;
				i+=1;
			}
			
			k+=1;
		}
		
		int l=start;
		for (; l < start+maxlen; l++) {
			System.out.print(st.charAt(l));
		}
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		String st = "aaaabbaa";
		longestPalSubstr(st);

	}

	

}
