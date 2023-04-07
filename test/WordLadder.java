package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//Classic BFS problem
public class WordLadder {
	
	static int ladderLength(String beginWord, String endWord, List<String> wordList){

		Set<String> wordSet = new HashSet<>(wordList);
		if(!wordSet.contains(endWord)){
			return 0;
		}

		Queue<String> q=new LinkedList<>();
		q.offer(beginWord);
		int result = 0;

		while(!q.isEmpty()){
			for(int k=q.size(); k>0; k--){
				String word = q.poll();
				if(word.equals(endWord)){
					return result +1;
				}
				for(int i=0; i<word.length(); i++){
					char[] ch = word.toCharArray();
					for(char c='a'; c<='z'; c++){
						ch[i] = c;
						String newWord = new String(ch);
						if(wordList.contains(newWord) && !newWord.equals(word)){
							q.offer(newWord);
							wordSet.remove(newWord);
						}
					}
				}
			}
			result++;
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		String beginWord = "hit";
		String endWord = "lot";
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dog");
		wordList.add("dot");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		int length = ladderLength(beginWord, endWord, wordList);
		System.out.println(length);
	}

}
