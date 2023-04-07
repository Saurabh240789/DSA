package sample;

import java.util.HashSet;
import java.util.Set;

public class SumPair {
	
	public static void main(String args[]) {
		int[] data = {1, 2, 5, 3};
		int sum = 8;
		if(hasPairWithSum(data, sum)) {
			System.out.println("array contains pair");
		}
		else {
			System.out.println("array does not contain pair");
		}
		 
	}

	private static boolean hasPairWithSum(int[] data, int sum) {
		Set<Integer> complement = new HashSet<>();
		
		for(int value : data) {
			if(complement.contains(value))
				return true;
			complement.add(sum-value);
		}
		return false;
		
	}

	

}
