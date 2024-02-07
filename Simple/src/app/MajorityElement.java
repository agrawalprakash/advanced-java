package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
        public List<Integer> majorityElement(int[] nums) {
        
        
        int length = nums.length;
        
        List<Integer> result = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            
            map.put(num, map.getOrDefault(num, 0) + 1);
            
        }
        
        for (int key : map.keySet()) {
                                      
            if (map.get(key) > length/3)
                
                result.add(key);
                
        }
        
            return result;
        
    }

}
