package app;

public class JumpGame {
    public boolean canJump(int[] nums) {
        
        int length = nums.length;
        
        if (length == 1)
            return true;
        
        int max = 0;
        
        for (int index = 0; index < length-1 && max >= index; index++) {
            
            if ( max < index + nums[index]) {
                max = index + nums[index];
            }
            
            if (max >= length - 1)
                return true;
            
        }
        
        return false;
        
    }
}
