package strings;

import java.util.HashSet;
import java.util.Set;

//find all the duplicates in an array having values 1<=x<=len without using any extra space.
//we should use 2 pointers
public class FindDuplicatesInInteger {

	public static Set<Integer> findAllDuplicates(int[] arr){
		Set<Integer> resultSet = new HashSet<>();

		for(int i=0; i<arr.length; i++){
			int index = Math.abs(arr[i]) - 1;
			if(arr[index] < 0){
				resultSet.add(Math.abs(arr[index]));
			}
			else{
				arr[index] = - arr[index];
			}
		}

		return resultSet;

	}
	
	public static void main(String args[]) {
		int[] arr = {2, 1, 2, 1};
		Set<Integer> result = findAllDuplicates(arr);
		for(int i : result) {
			System.out.println(i);
		}
	}

}
