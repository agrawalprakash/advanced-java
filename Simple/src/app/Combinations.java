package app;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        generateSubSets(1, n, new ArrayList(), result, k);
        
        return result;
        
    }
    
    private void generateSubSets(int start, int n, List<Integer> current, List<List<Integer>> result, int k) {
        
        
        if (current.size() == k) {
            
            result.add(new ArrayList(current));
         
            return;
        }
        
        for (int i = start; i <= n; i++) {
            
            current.add(i);
            
            generateSubSets(i+1, n, current, result, k);
            
            current.remove(current.size()-1);
        }
        
    }
}
