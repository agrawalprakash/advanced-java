package app;

public class BinarySearchFindRange {

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            
            int low = findIndex(nums, target, true);
            
            int high = findIndex(nums, target, false);
            
            int[] result = new int[2];
            
            result[0] = low;
            
            result[1] = high;
            
            
            return result;
            
        }
        
        private int findIndex ( int[] nums, int target, boolean isFirstIndex ) {
            
            int result = -1;
            
            int s = 0;
            
            int e = nums.length-1;
            
            while (s <= e) {
                
                int m = s + (e-s)/2;
                
                if (nums[m] == target) {
                    result = m;
                    
                    if (isFirstIndex) {
                        e = m - 1;
                    } else {
                        s = m + 1;
                    }
                    
                } else if (nums[m] < target) {
                    
                    s = m + 1;
                    
                } else {
                    
                    e = m - 1;
                    
                }
                
            }
            
            return result;
            
        }
        
    }
    
}
