package strings;

public class IsSubsequence {
	
	public static boolean isSubsequence(String s1, String s2) {
		int i=0; 
		int j=0;

		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)==(s2.charAt(j))) {
				i++;
				j++;
			}
			else {
				i++;
			}
		}

		if(j==s2.length()) {
			return true;
		}
		else {
			return false;
		}
    }
	
	public static void main(String args[]) {
		String input1 = "geeksforgeeks";
		String input2 = "gkfy";
		
		Boolean result = isSubsequence(input1, input2);
		
		System.out.println(result);
	}

}
