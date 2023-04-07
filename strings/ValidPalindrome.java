package strings;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
        List<Character> input = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                input.add(s.charAt(i));
            }
        }

        for(int i=0; i<input.size(); i++) {
            if(input.get(i) != input.get(input.size()-i-1)) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String args[]) {
		String input = "A man, a plan, a canal: Panama";
		
		Boolean result = isPalindrome(input);
		
		System.out.println(result);
	}

}
