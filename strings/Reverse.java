package strings;

public class Reverse {
	
	//can also be done using 2 pointers
	static String reverse(String input) {
		StringBuilder reverse = new StringBuilder();
		for(int i=input.length()-1; i>=0; i--) {
			reverse.append(input.charAt(i));
		}	
		return reverse.toString();
	}
	
	public static void main(String args[]) {
		System.out.println(reverse("sample test"));
		
	}

}
