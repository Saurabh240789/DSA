package dp;

import java.util.Arrays;

public class CoinChange2 {
	
	//min number of coins
	public static int minCoins(int coins[], int amount) 
	{ 	    
		Arrays.sort(coins);
		int dp[] = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		
		for(int i=0; i<=amount; i++) {
			for(int j=0; j<coins.length; j++){
				if(coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}
				else{
					break;
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	} 
	
	public static void main(String args[]) {
		int[] coins = {1,5,6,9};
		int money = 24;
		System.out.println(minCoins(coins, money));
	}

}
