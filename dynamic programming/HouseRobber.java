package dp;

public class HouseRobber {
	
	
public static void main(String args[]) {
		
	int[] nums = new int[]{2,7,9,3,1};
		
		int ways = maxRob(nums);
		System.out.println(ways);
		
	}

	private static int maxRob(int[] nums) {
		
		int prevProfit = 0;
		int currProfit = 0;
		
		for(int i=0; i<nums.length; i++) {
			int temp = currProfit;
			currProfit = Math.max(nums[i]+prevProfit, currProfit);
			prevProfit = temp;
		}	
		
		return currProfit;
		
	}

}
