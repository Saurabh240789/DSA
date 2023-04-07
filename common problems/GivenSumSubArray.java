package sample;

import java.util.HashSet;

public class GivenSumSubArray {
	
	 public static void main (String[] args) 
	    {
	        int arr[] = new int[]{-13, 5, 8, 3, -1};
	        int sum=0;
	        int n = arr.length;
	        //System.out.println(isSum(arr, n, sum));
	        
	        int left = 0;
	        int right = 19;
	        int mid = left + (right-left)/2;
	        System.out.println(mid);
	        
	    }
	    
	    static boolean isSum(int arr[], int n, int sum)
	    {
	        int pre_sum = 0;
	        HashSet<Integer> hash = new HashSet<>();
	        
	        for(int i : arr) {
	        	pre_sum = pre_sum + i;
	        	
	        	if(pre_sum == sum) return true;
	        	
	        	if(hash.contains(pre_sum - sum)) return true;
	        	hash.add(pre_sum);
	        	
	        }
	        return false;
	    }
}
