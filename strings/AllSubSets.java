package strings;

import java.util.ArrayList;
import java.util.List;

class AllSubSets {

    List<List<Integer>> listOfLists = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> values = new ArrayList<>();
        int index = 0;
        int n = nums.length;

        return subSetSum(nums, values, index, n);
    }

    //[[1], [1, 2], [1, 2, 3], []]
    List<List<Integer>> subSetSum(int[] nums, List<Integer> values, int index, int n) {

        if(index >= n) {
        	List<Integer> updated = new ArrayList<>();
        	updated.addAll(values);
        	listOfLists.add(updated);
           return listOfLists; 
        }

        values.add(nums[index]);  
        subSetSum(nums, values, index+1, n);
        
        values.remove(values.size()-1);
        subSetSum(nums, values, index+1, n); 

        return listOfLists;   
    }
    
    public static void main(String args[]) {
    	
    	int[] nums = {1, 2, 3};
    	AllSubSets s=new AllSubSets();
    	s.subsets(nums);
    }
}