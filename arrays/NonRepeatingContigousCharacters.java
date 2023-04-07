package arrays;

public class NonRepeatingContigousCharacters {
	
	public static void main(String[] args) {
		NonRepeatingContigousCharacters nrc = new NonRepeatingContigousCharacters();
		String input = "aabbbccccddddabcd";
		String output = nrc.getdistinctCharacters(input);
		
		System.out.println(output);
	}

	private String getdistinctCharacters(String input) {
		
		String output = String.valueOf(input.charAt(0));
		
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i-1) != input.charAt(i)) {
				output = output + String.valueOf(input.charAt(i));
			}
		}
		return output;
	}

}
