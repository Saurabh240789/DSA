package arrays;

import java.util.HashMap;
import java.util.Map;

public class Duplicate2 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<=k){       // 1-0, 0-1, 1-2, 1-3 
                    return true;         
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
	
	public static void main(String args[]) {
		int[] nums = {1, 0, 1, 1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
}
