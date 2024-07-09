package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams2 {
        public List<List<String>> groupAnagrams(String[] strs) {
        
        
        List<List<String>> res = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        
        for (int i = 0; i < strs.length; i++) {
            
            
            char[] str = strs[i].toCharArray();
            
            Arrays.sort(str);
            
            String s = String.valueOf(str);
            
            
            if (map.get(s) != null) {
                
                List<String> aa = map.get(s);
                
                aa.add(strs[i]);
                
                map.put(s, aa);
                
            } else {
                
                List<String> aa = new ArrayList();
                
                aa.add(strs[i]);
                
                map.put(s, aa);
                
            }
            
        }
        
        for (Map.Entry<String, List<String>> entry : map.entrySet() ) {
            
            res.add(entry.getValue());
        }
        
        
        return res;
        
    }
}
