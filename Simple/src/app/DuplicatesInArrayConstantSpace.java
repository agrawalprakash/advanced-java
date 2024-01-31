package app;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArrayConstantSpace {
        public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            
            index = Math.abs( nums[i] ) - 1;
            
            if (nums[index] < 0) {
                result.add(index + 1);
                continue;
            }
            
            nums[index] = -nums[index];
            
        }
        
        return result;
        
        
    }
}
