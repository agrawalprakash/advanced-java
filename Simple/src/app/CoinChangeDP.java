package app;

import java.util.Arrays;

public class CoinChangeDP {
        public int coinChange(int[] coins, int amount) {
        
        
        int[] dp = new int[amount + 1];
        
        Arrays.fill(dp, amount + 1);
        
        dp[0] = 0;
        
        for (int coin : coins) {
            
            for (int index = coin; index <= amount; index++) {
                
                dp[index] = Math.min(dp[index], dp[index-coin] + 1);
                
            }
            
        }
        
        return dp[amount] <= amount ? dp[amount] : -1;

    }

}
