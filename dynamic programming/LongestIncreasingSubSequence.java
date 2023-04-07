package dp;

public class LongestIncreasingSubSequence {
	
	    public static int lengthOfLIS(int[] nums) {
	        
	        int n = nums.length;
	        int maxLength = 0;
	        int LIS[] = new int[n+1];
	        
	        for(int i=0; i<n; i++) {
	        	LIS[i] = 1;
	        }
	        
	        for(int i=1; i<n; i++){
	            for(int j=0; j<i; j++){
	                if(nums[i]>nums[j] && LIS[i] < LIS[j]+1){
	                    LIS[i] = LIS[j]+1;
	                }
	            }
	        }
	        
	        for(int i=0; i<n; i++){
	            if(maxLength < LIS[i]){
	                maxLength = LIS[i];
	            }
	        }
	        return maxLength;
	    }
	    
	    public static void main(String args[]) {
			int[] coins = {10,9,2,5,3,7,101,18};
			System.out.println(lengthOfLIS(coins));
		}

}
