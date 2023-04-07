package strings;

import java.io.*;
import java.util.*;

class Subsets {

	
	static void printSub(String str, String curr, int index)
	{
	    
	if(index >= str.length()) {
		System.out.print(curr+ " ");
		return;
	}

	curr = curr + str.charAt(index);
	printSub(str, curr, index+1);
	//curr = StringUtils.chop(curr);
	curr = curr.substring(0, curr.length() - 1);
	printSub(str, curr, index+1);
}
	
	public static void main(String args[]) {
		printSub("ABC", "", 0);
	}
}