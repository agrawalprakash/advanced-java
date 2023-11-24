package app;

public class DPMinCostTicket {
    
        Integer[] dp;
        
        public int mincostTickets(int[] days, int[] costs) {
            
            dp = new Integer[days.length];
            
            return helper(days, costs, 0);
            
        }
        
        public int helper(int[] days, int[] costs, int d) {
            
            
            if (d >= days.length) return 0;
            
            if (dp[d] != null) return dp[d];
            
            int onePassDay = helper(days, costs, d + 1) + costs[0];
            
            int i;
            
            for (i = d; i < days.length; i++)
                if (days[i] >= days[d] + 7)
                    break;
            
            int sevenPassDay = helper(days, costs, i) + costs[1];
            
            for (i = d; i < days.length; i++)
                if (days[i] >= days[d] + 30)
                    break;
            
            int thirtyPassDay = helper(days, costs, i) + costs[2];
            
            return dp[d] = Math.min( onePassDay , Math.min(sevenPassDay, thirtyPassDay));
                  
            
        }
    
}
