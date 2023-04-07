package sample;

import java.util.ArrayList;

//[[1,3],[2,3]]
public class TownJudge {
	
	public static int findJudge(int N, ArrayList<ArrayList<Integer>> trust) {
		
		int[] count=new int[N+1];
		for(int t=0; t<trust.size(); t++) {
			ArrayList<Integer> result=trust.get(t);
			count[result.get(0)]--;
			count[result.get(1)]++;
			
		}
		
		for(int i=1; i<=N; i++) {
			if(count[i]==N-1) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(3);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(3);
		ArrayList<ArrayList<Integer>> main=new ArrayList<>();
		main.add(list1);
		main.add(list2);
		
		System.out.println(findJudge(3, main));
	}

}
