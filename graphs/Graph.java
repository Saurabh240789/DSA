package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
	
	class Edge{
		int v, w;
		Edge(int v, int w){
			this.v = v;
			this.w	= w;
		}
		@Override
		public String toString() {
			return "Edge [v=" + v + ", w=" + w + "]";
		}
		
	}
	
	List<Edge> l[];
	
	Graph(int n){
		
		l = new LinkedList[n];
		
		for(int i=0; i<n; i++) {
			l[i] = new LinkedList<Edge>();
		}
		l[0].add(0, new Edge(1, 10));
		l[3].add(0, new Edge(4, 20));
		l[7].add(0, new Edge(5,30));
		l[3].add(0, new Edge(2,40));
		l[8].add(0, new Edge(7,50));
		
		for(int i=0; i<n; i++) {
			System.out.println(i+"===>"+l[i]);
		}
		
	}
	
	boolean isConnected(int u, int v) {
		for(Edge i: l[u]) {
			if(i.v == v) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		Graph g = new Graph(10);
		System.out.println(g.isConnected(8, 7));
	}

	@Override
	public String toString() {
		return "Graph [l=" + Arrays.toString(l) + "]";
	}
	
	

}
