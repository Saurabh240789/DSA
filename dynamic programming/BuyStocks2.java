package dp;

public class BuyStocks2 {

	public static int maxProfit(int[] prices) {

		int max_profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				max_profit = max_profit + (prices[i] - prices[i - 1]);
			}
		}
		return max_profit;
	}

	public static void main(String args[]) {

		int price[] = new int[] {7,1,5,3,6,4};

		System.out.println(maxProfit(price));

	}

}
