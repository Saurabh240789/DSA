package dp;

public class BuyStocks {
	
	public static void main(String args[]) {
		
		int price[] = new int[]{8,1,2,4,6,3};
		
		System.out.println(maxProfit(price));
		
	}

	private static int maxProfit(int[] price) {
		
		int profit = 0;
		int min_until = Integer.MAX_VALUE;
		int max_profit = Integer.MIN_VALUE;

		for(int i=0; i<price.length; i++) {
			min_until = Math.min(min_until, price[i]);
			profit = price[i] - min_until;
			max_profit = Math.max(profit, max_profit);
		}
		return max_profit;
	}

}
