package sample;

public class LonelyInteger {
	
	public static void main(String args[]) {
		
		int[] input = {9, 1, 2, 3, 9, 2, 1, 7, 7};
		System.out.println(lonelyInteger(input));
		
		//Stack<Integer> stack = new Stack<>();
		//LinkedList<Integer> queue = new LinkedList<>();
		//queue.poll();
		//Arrays.fill
	}
	
	static int lonelyInteger(int[] input) {
		int result = 0;
		for(int i  : input) {
			result = result^i;
		}	
		return  result;
	}

}


