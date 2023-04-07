package dp;

import java.util.Arrays;

public class EggDropping {
	
	// incomplete solution

	public int superEggDrop(int k, int n) {
        int[][] dp = new int[n+1][k+1];
        for(int[] i : dp) {
            Arrays.fill(i, -1);
        }    
        return eggRec(n-1, k, dp);
    }

    int eggRec(int ind, int k, int[][] dp) {  
        if(k==0 || ind==0) {
            return 0;
        }
        
        
        if(dp[ind][k] != -1) {
            return dp[ind][k];
        }

        int notBreak = eggRec(ind-1, k, dp);
        int broke = 0;
        if(k>0) {
        	broke = eggRec(ind-1, k-1, dp);
        }
        dp[ind][k] = Math.min(broke, notBreak);

        return dp[ind][k];
    }
	    
	    public static void main(String args[]) {
	    	int k = 1;
	    	int n = 2;
	    	
	    	EggDropping ed = new EggDropping();
	    	int result = ed.superEggDrop(k, n);
	    	
	    	System.out.println(result);
	    	
	    }
}
