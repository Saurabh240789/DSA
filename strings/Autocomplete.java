package strings;

import java.util.ArrayList;
import java.util.List;

//can be done better using TRIE
public class Autocomplete {
	
	public static void main(String args[]){
		String[] dict = { "abc", "acd", "bcd", "def", "aba", "a"};
		char prefix = 'b'; 
		autoComplete(dict, prefix);
		
	}

	static List<String> autoComplete(String[] dict, char prefix){
		List<String> result = new ArrayList<>();
		for(String i : dict){
			if(prefix == i.charAt(0)){
				result.add(i);
			}
		}
		
		for(String s : result) {
			System.out.println(s);
		}

		return result;
	}


}