package app;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        int ans = minCoins(amount, coins, dp);

        return ans;

 
    }

    private int minCoins(int amount, int[] coins, int[] dp) {

        if (amount == 0) return 0;
        
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {

            if (amount - coins[i] >= 0) {
            
            int subSum = 0;

            if (dp[amount - coins[i]] != -1) {

                subSum = dp[amount - coins[i]];

            } else {

                subSum = minCoins(amount-coins[i], coins, dp);
                
            }

            if (subSum + 1 < sum) {
                sum = subSum + 1;
            }
        }

        }

        dp[amount] = sum;

        return sum;

    }
    
}
