package app;

public class JumpGameDP1 {
    public boolean canJump(int[] nums) {

        int n = nums.length;

        if ( n == 1) return true;

        int max = 0;

        for ( int i = 0; i < n && max >= i; i++ ) {

            if (max < i + nums[i]) {

                max = i + nums[i];

            }

            if ( max >= n-1) {

                return true;

            }

        }
        
        return false;
    }
}
