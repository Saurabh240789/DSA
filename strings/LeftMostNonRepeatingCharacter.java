package strings;

//First Unique character
public class LeftMostNonRepeatingCharacter {

	public static int lmnrc(String s) {

		int[] count=new int[256];
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(count[s.charAt(i)]==1) {
				return i;
			}
		}	
		return -1;
	}

	public static void main(String args[]) {
		String input = "geeksforgeeks";
		int value = lmnrc(input);
		System.out.println("index of leftmost non repeated character : "+value);
	}
}
