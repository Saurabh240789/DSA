package dp;

import java.util.Arrays;

public class CoinChange {

	// count number of ways
	public static int change(int amount, int[] coins) {

		int n = coins.length;
		int[][] dp = new int[n][amount + 1];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}

		return changeUtil(amount, coins, n - 1, dp);
	}

	static int changeUtil(int amount, int[] coins, int ind, int[][] dp) {

		// base case
		if (ind == 0) {

			if (amount % coins[0] == 0) {
				return 1;
			} else {
				return 0;
			}
		}

		if (dp[ind][amount] != -1) {
			return dp[ind][amount];
		}

		int notTaken = changeUtil(amount, coins, ind - 1, dp);

		int taken = 0;

		if (coins[ind] <= amount) {
			taken = changeUtil(amount - coins[ind], coins, ind, dp); // since infinite supply of coins
		}

		dp[ind][amount] = taken + notTaken;

		return dp[ind][amount];

	}

	public static void main(String args[]) {
		int[] coins = { 1, 2, 5 };
		int money = 5;
		System.out.println(change(money, coins));
	}

}
