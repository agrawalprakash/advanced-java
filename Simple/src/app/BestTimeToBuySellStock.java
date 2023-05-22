package app;

public class BestTimeToBuySellStock {


    public int maxProfit(int[] prices) {

        int maxProfit = 0, minStockPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            maxProfit = Math.max(maxProfit, prices[i]- minStockPrice);

            minStockPrice = Math.min(prices[i] , minStockPrice);

        }

        return maxProfit;

    }

    
}
