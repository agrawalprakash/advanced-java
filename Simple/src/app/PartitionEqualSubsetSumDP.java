package app;

public class PartitionEqualSubsetSumDP {
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            
            sum = sum + nums[i];
            
        }
        
        if (sum % 2 != 0) {
            return false;
        }
        
        sum = sum / 2;
        
        boolean[] dp = new boolean[sum+1];
        
        dp[0] = true;
        
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = sum; j >= nums[i]; j--) {
                
                dp[j] = dp[j] | dp[j - nums[i]];
            }
            
        }
        
        return dp[sum];
        
    }
}
