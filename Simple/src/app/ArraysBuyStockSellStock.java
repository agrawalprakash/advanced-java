package app;

public class ArraysBuyStockSellStock {
  
        public int maxProfit(int[] prices) {
            
            int maxProfit = 0;
            int minStockPrice = Integer.MAX_VALUE;
            
            for (int i = 0; i < prices.length; i++) {
                
                maxProfit = Math.max(maxProfit, prices[i] - minStockPrice);
                
                minStockPrice = Math.min(minStockPrice, prices[i]);
                
            }
            
            return maxProfit;
    
        }
    
}
