package app;

public class FindTheOneTwoThreePattern {
    public boolean find132pattern(int[] nums) {
        
        int n = nums.length;
        int leftMin = nums[0];

        for (int j = 1; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {

                if (nums[k] > leftMin && nums[j] > nums[k]) {
                    return true;
                }

                
            }
            leftMin = Math.min(leftMin, nums[j]);
        }

        return false;

    }
} 
