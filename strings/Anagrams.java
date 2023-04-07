package strings;

public class Anagrams {
	
	//Better solution
	// O(n) - TC
	static boolean isAnagram(String s1, String s2) {
		int[] count=new int[256];
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i=0; i<s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		System.out.println(isAnagram("samples", "PLESMSA"));
		
	}
	

}
