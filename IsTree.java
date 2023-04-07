package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class IsTree {
	
	static boolean isTree(ArrayList<ArrayList<Integer>> adj, int V) {
		
		boolean[] visited = new boolean[V];
		
		if(isCyclic(adj, 0, visited, V, -1) == true) {
			return false;
		}
		
		for(int i=0; i<V; i++) {
			if(visited[i] == false) {
				return false;
			}
		}		
		
		return true;
	}
	
	static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int currVertices, boolean[] visited, int V, int parent){
		
		visited[currVertices] = true;
		
		for(int adjNode : adj.get(currVertices)) {
            if(visited[adjNode]==false){
                if(isCyclic(adj, adjNode, visited, V, currVertices)==true) return true;
            }
            else if(adjNode != parent) {
                return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {

		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,0, 2); 
            addEdge(adj,1, 3); 
            addEdge(adj,2, 4); 
          //addEdge(adj,3, 4); 
            

		if (isTree(adj, V))
			System.out.println("True");
		else {
			System.out.println("False");
		}
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
	}

}
