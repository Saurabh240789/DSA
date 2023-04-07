package strings;

import java.util.Stack;

//Return a string of the words in reverse order concatenated by a single space.
public class ReverseWords {
	
	    public static String reverseWords(String s) {
	        Stack<String> stack = new Stack<>();
	        //using regex to truncate any number of spaces
	        String[] temp = s.split(" +");
	        StringBuilder sb = new StringBuilder();
	        
	        for(String str : temp) {
	            stack.push(str);
	        }
	        while(!stack.isEmpty()) {
	            sb.append(stack.pop());
	            sb.append(" ");
	        }
	        return sb.toString().trim();
	    }
	    
	    public static void main(String args[]) {
	    	String input = " the sky is blue "; 		//"a good   evening " 
	    	String result = reverseWords(input);
	    	System.out.println("reversed string : "+result);
	    }
	

}
