package Stacks;

import java.util.Stack;

public class ReversePolishNotation {
	
	//Also known as post fix processing
	public static void main(String[] args) {
		ReversePolishNotation nrc = new ReversePolishNotation();
		String[] nums = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		int result = nrc.evalRPN(nums);
		System.out.println(result);
	}

	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        if(tokens==null || tokens.length==0){
            return -1;
        }
        for(int i=0; i<tokens.length; i++) {
            if(tokens[i]=="+") {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res = Integer.valueOf(val1) + Integer.valueOf(val2);
                stack.push(res);
            }
            else if(tokens[i]=="*") {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res = Integer.valueOf(val1) * Integer.valueOf(val2);
                stack.push(res);
            }
            else if(tokens[i]=="-") {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res = Integer.valueOf(val2) - Integer.valueOf(val1);
                stack.push(res);
            }
            else if(tokens[i]=="/") {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int res = Integer.valueOf(val2) / Integer.valueOf(val1);
                stack.push(res);
            }
            else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
