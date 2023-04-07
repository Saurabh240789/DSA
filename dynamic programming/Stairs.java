package dp;

public class Stairs {
	
	public static void main(String args[]) {
		
		int n = 7;
		
		int ways = climbStairs(n);
		System.out.println(ways);
		
	}

	private static int climbStairs(int A) {
		
		int cache[] = new int[A+1];
		
		if(A<2) {
			return A;
		}
		
		//base cases
		cache[1] = 1;
		cache[2] = 2;
		
		for(int i=3; i<=A; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[A];
	}

	

}
