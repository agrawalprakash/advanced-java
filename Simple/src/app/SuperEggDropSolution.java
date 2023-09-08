package app;

public class SuperEggDropSolution {

    public int superEggDrop(int k, int n) {

        int dp[][] = new int[k+1][n+1];
        int result;
        int i, j, x;

        for (i = 1; i <= k; i++) {

            dp[i][0] = 0;
            dp[i][1] = 1;

        }

        for (i = 1; i <= n; i++) {

            dp[1][i] = i;

        }

        for (i = 2; i <= k; i++) {
            for (j = 2; j <= n; j++) {


                dp[i][j] = Integer.MAX_VALUE;

                for (x=1; x <= j; x++) {                
                    result = 1 + Math.max(dp[i-1][x-1] , dp[i][j-x]);
                    if (result < dp[i][j]) {
                        dp[i][j] = result;
                    }
                }

            }
        }

        return dp[k][n];



        
    }
    
}
