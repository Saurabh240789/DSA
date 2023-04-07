package strings;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInString {

	static boolean hasDuplicate(String input) {
		Set<Character> inputSet = new HashSet<>();
			
		for(char i : input.toCharArray()) {
			if(!inputSet.contains(i)) {
				inputSet.add(i);
			}
			else {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main (String args[]) {
		String value = "testing";
		System.out.println(hasDuplicate(value));
	}
}
