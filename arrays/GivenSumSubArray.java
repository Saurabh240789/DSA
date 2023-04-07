package arrays;

// GivenSumSubArray or Zero Sum Subarray
public class GivenSumSubArray {
	
	static int[] findSubArrayWthGivenSum(int[] input, int s) {
		
		// {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8}, 15
		// {1, 2, -5, 1, 2, -1}, 0
		
		int[] result = new int[]{-1};
		int sum = 0;
		int left = 0;
		int right = 0;
		
		while(right < input.length) {
			sum+=input[right];
			
			while(left < right && sum > s) {
				sum-=input[left++];
			}
			
			if(sum == s && (result.length ==1 || result[1]-result[0] < right-left)) {
				result = new int[] {left, right};
			}
			right++;
		}
		return result;
	}
	
	public static void main(String args[]) {
		int[] input = {1, 2, -5, 1, 2, -1};
		int[] result = findSubArrayWthGivenSum(input, 0);
		
		for(int i=result[0]; i<=result[1]; i++) {
			System.out.print(input[i]+" ");
		}
	}
	

}
