package app;

public class MaxProductSubarrayDynamicProgramming {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int curr_max = nums[0];
        int curr_min = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < n; i++) {
            
            int prev_curr_max = curr_max;
            
            curr_max = Math.max(nums[i], 
                                Math.max(curr_max * nums[i], curr_min * nums[i]));
                
                
            curr_min = Math.min(nums[i], 
                                Math.min(prev_curr_max * nums[i], curr_min * nums[i]));
                
                
            result = Math.max(result, curr_max);
            
            
        }
        
        return result;
        
    }
}
