package strings;

public class Parenthesis {
	
	public static void main(String args[]) {
		String input = "(abc)(def)";
		String result = test(input);
		System.out.println(result);
		
	}

	private static String test(String input) {
		String output = "";
		
		if(input.charAt(0)=='('  &&  input.charAt(input.length()-1)==')') {
			output = input.substring(1, input.length()-1);
			if(isBalanced(output)) {
				output = test(output);
				return output;
			}						
		}
		return input;
	}

	private static boolean isBalanced(String output) {
		int count = 0;
		char[] c = output.toCharArray();
		for(int i =0;  i<output.length();  i++) {
			if(count >= 0) {
				if(c[i]=='(') {
					count++;
				}
				if(c[i]==')') {
					count--;
				}
			}
		}
		
		if(count == 0) {
			return true;
		}
		return false;
	}

}