package strings;

import java.util.PriorityQueue;
import java.util.Stack;

public class KthLargest {
	
	public static int kthLargest(int[] input, int k) {
		
		//In java, priorityQueue is Min Heap
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int i : input) {
			p.add(i);
			if(p.size()>k) {
				p.remove();
			}
		}
		return p.remove();
	}
	
	public static void main(String args[]) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		int[] input = {5, 2, 9, 4, 3, 7, 1};
		int k = 2;
		int result = kthLargest(input, k);
		System.out.println(result);
	}

}
