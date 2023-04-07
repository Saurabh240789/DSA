package arrays;

public class MaxSumSubArray {

	// Implementation of KADANE's algorithm - Very easy

	public static void main(String args[]) {

		int[] nums = new int[] { -2, 2, 5, -11, 6 };

		int ways = maxSum(nums);
		System.out.println(ways);

	}

	private static int maxSum(int[] nums) {

		int curr_sum = nums[0];
		int max_sum = curr_sum;
		
		for(int i=1; i<nums.length; i++) {
			curr_sum = Math.max(nums[i], nums[i]+curr_sum);
			max_sum = Math.max(curr_sum, max_sum);
		}
		return max_sum;
	}
}
