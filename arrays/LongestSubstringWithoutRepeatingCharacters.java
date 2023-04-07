package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters nrc = new LongestSubstringWithoutRepeatingCharacters();
		String input = "pwwkew";
		int output = nrc.lengthOfLongestSubstring(input);
		
		System.out.println(output);
	}
	
	public int lengthOfLongestSubstring(String s) {
        int a_ptr = 0;
        int b_ptr = 0;
        int max = 0;
        Set<Character> hash = new HashSet<>();

        while(b_ptr < s.length()) {
            if(!hash.contains(s.charAt(b_ptr))) {
                hash.add(s.charAt(b_ptr));
                max = Math.max(max, hash.size());
                b_ptr++;
            }
            else {
                hash.remove(s.charAt(a_ptr));
                a_ptr++;
            }
        }
        return max;
    }
	
}
