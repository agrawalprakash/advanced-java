class Solution {
    public int missingNumber(int[] nums) {
        
        int len = nums.length;
        
        int sum = 0;
        
        for (int num : nums) {
            
            sum += num;
        }
        
        int total = (len*(len+1))/2;
        
        if (total == sum) return 0;
        
        
        return total - sum;
        
        
    }
}