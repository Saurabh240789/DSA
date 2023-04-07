package strings;

//Print the frequencies of characters in sorted order in a string of lower case alphabets
//Trick is to use characters as indexes
public class Frequency {

	public static void printFrequency(String s) {

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " " + count[i]);
			}
		}

	}

	public static void main(String args[]) {
		String input = "geeksforgeeks";
		printFrequency(input);
	}

}
