package app;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

        public int distributeCandies(int[] candyType) {
        
        int len = candyType.length;
        
        Set<Integer> set = new HashSet<>();
        
        for (int ca : candyType){
            set.add(ca);
        }
        
        return Math.min(len/2, set.size());
        
    }
}
    
}
