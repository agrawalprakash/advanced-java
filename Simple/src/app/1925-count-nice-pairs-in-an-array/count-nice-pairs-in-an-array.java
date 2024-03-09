class Solution {
    public int countNicePairs(int[] nums) {
        
        int n = nums.length;
        
        int M = 1000000007;
        
        for (int i = 0; i < n; i++) {
            
            nums[i] = nums[i] - rev ( nums[i] );
            
        }
        
        int ans = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            
            if (map.containsKey(num)) {
                
                ans += map.get(num);
                
                ans = ans % M;
                
            }
            
            map.put( num, map.getOrDefault(num, 0) + 1);
            
        }
        
        return ans;
        
    }
    
    private int rev(int n) {
        
        int ans = 0;
        
        while ( n > 0) {
            
            ans = ans*10 + n % 10;
            
            n = n / 10;
            
        }
        
        return ans;
        
    }
}