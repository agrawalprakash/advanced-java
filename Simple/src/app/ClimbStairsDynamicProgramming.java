package app;

public class ClimbStairsDynamicProgramming {
    
    public int climbStairs(int n) {
        
        int stair0 = 0;
        int stair1 = 1;
        int stairN = 1;
        int count = 1;
        
        if (n == 0) return 0;
        
        if (n == 1) return 1;
        
        while (count <= n) {
            
            stairN = stair0 + stair1;
            
            stair0 = stair1;
            
            stair1 = stairN;
            
            count++;
            
        }
        
        return stairN;
        
    }

}
