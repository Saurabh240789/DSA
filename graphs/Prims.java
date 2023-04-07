package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Prims {
	
	static //Prims algorithm is used to find the MST from a graph
	
	//find the length on minimum spanning tree
	int findMinSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
		
		int result = 0;
		int[] weight = new int[n];
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		weight[0] = 0;
		
		for(int i=0; i<n-1; i++) {
			int minVertex = findMinVertex(weight, visited, n);
			visited[minVertex] = true;
			
			for(int j=0; j<n; j++) {
				if(edges.get(minVertex).get(j) !=0 && !visited[j]) {
					if(edges.get(minVertex).get(j) < weight[j]) {
						weight[j] = edges.get(minVertex).get(j);
					}
				}
			}
			
		}
		
		
		return result;
	}
	
	static int findMinVertex(int[] weight, boolean[] visited, int n) {
		
		int minVertex = -1;
		
		for(int i =0; i<n; i++) {
			if(!visited[i] && (minVertex == -1 || weight[i]< weight[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}
	
	
	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		// adjacency list
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			adj.add(list);
		}

		// add edges to list
		for (int i = 0; i < E; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			adj.get(x).add(y);
			adj.get(y).add(x);
		}

		int result = findMinSpanningTree(adj, V);
			System.out.println(result);
		
	}

}
