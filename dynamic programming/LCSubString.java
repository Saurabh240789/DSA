package dp;

public class LCSubString {

	public static void main(String args[]) {

		  String s1= "ADSF";
		  String s2= "ADSFBB";
		                                 
		  System.out.println("The Length of Longest Common Substring is "+lcs(s1,s2));
		}

	static int lcs(String s1, String s2){
	    
	    int n = s1.length();
	    int m = s2.length();
	    
	    int[][] dp=new int[n+1][m+1];
	    int ans = 0;
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=m;j++){
	            if(s1.charAt(i-1)==s2.charAt(j-1)){
	            	dp[i][j] = 1 + dp[i-1][j-1];                 
	                ans = Math.max(ans,dp[i][j]);
	            }
	            else
	                dp[i][j] = 0;
	        }
	    }
	    
	    return ans;
	    
	}
}
