package strings;

// find the index of leftmost character which gets repeated, does not matter if repetition happens afterwards
public class LeftMostRepeatingCharacter {

	public static int lmrc(String s) {

		boolean[] visited=new boolean[256];
		int result = -1;
		
		for(int i=s.length()-1; i>=0; i--) {
			if(visited[s.charAt(i)]) {
				result = i;
			}
			else {
				visited[s.charAt(i)] = true;
			}
		}
		return result;		
	}

	public static void main(String args[]) {
		String input = "abbccd";
		int value = lmrc(input);
		System.out.println("index of leftmost repeated character : "+value);
	}

}
