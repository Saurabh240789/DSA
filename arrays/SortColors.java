package arrays;

public class SortColors {

	public static void main(String[] args) {
		SortColors nrc = new SortColors();
		int[] nums = {2,0,2,1,1,0};
		nrc.sortColors(nums);
		System.out.println(nums);
	}
	
	public void sortColors(int[] nums) {
        int rc = 0;
        int wc = 0;
        int bc = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) rc++;
            if(nums[i]==1) wc++;
            if(nums[i]==2) bc++;
        }

        for(int i=0; i<rc; i++) {
                nums[i] = 0;
        }
        for(int i=rc; i<rc+wc; i++) {
                nums[i] = 1;
        }
        for(int i=rc+wc; i<nums.length; i++) {
                nums[i] = 2;
        }
    }
	
}
